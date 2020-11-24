package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TIcu extends js.Object {
  
  /**
    * Index in `LView` where the anchor node is stored. `<!-- ICU 0:0 -->`
    */
  var anchorIdx: Double = js.native
  
  /**
    * A list of case values which the current ICU will try to match.
    *
    * The last value is `other`
    */
  var cases: js.Array[_] = js.native
  
  /**
    * A set of OpCodes to apply in order to build up the DOM render tree for the ICU
    */
  var create: js.Array[IcuCreateOpCodes] = js.native
  
  /**
    * Currently selected ICU case pointer.
    *
    * `lView[currentCaseLViewIndex]` stores the currently selected case. This is needed to know how
    * to clean up the current case when transitioning no the new case.
    *
    * If the value stored is:
    * `null`: No current case selected.
    *   `<0`: A flag which means that the ICU just switched and that `icuUpdate` must be executed
    *         regardless of the `mask`. (After the execution the flag is cleared)
    *   `>=0` A currently selected case index.
    */
  var currentCaseLViewIndex: Double = js.native
  
  /**
    * A set of OpCodes to apply in order to destroy the DOM render tree for the ICU.
    */
  var remove: js.Array[I18nRemoveOpCodes] = js.native
  
  /**
    * Defines the ICU type of `select` or `plural`
    */
  var `type`: IcuType = js.native
  
  /**
    * A set of OpCodes to apply in order to update the DOM render tree for the ICU bindings.
    */
  var update: js.Array[I18nUpdateOpCodes] = js.native
}
object TIcu {
  
  @scala.inline
  def apply(
    anchorIdx: Double,
    cases: js.Array[_],
    create: js.Array[IcuCreateOpCodes],
    currentCaseLViewIndex: Double,
    remove: js.Array[I18nRemoveOpCodes],
    `type`: IcuType,
    update: js.Array[I18nUpdateOpCodes]
  ): TIcu = {
    val __obj = js.Dynamic.literal(anchorIdx = anchorIdx.asInstanceOf[js.Any], cases = cases.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], currentCaseLViewIndex = currentCaseLViewIndex.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TIcu]
  }
  
  @scala.inline
  implicit class TIcuOps[Self <: TIcu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnchorIdx(value: Double): Self = this.set("anchorIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCasesVarargs(value: js.Any*): Self = this.set("cases", js.Array(value :_*))
    
    @scala.inline
    def setCases(value: js.Array[_]): Self = this.set("cases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateVarargs(value: IcuCreateOpCodes*): Self = this.set("create", js.Array(value :_*))
    
    @scala.inline
    def setCreate(value: js.Array[IcuCreateOpCodes]): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentCaseLViewIndex(value: Double): Self = this.set("currentCaseLViewIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveVarargs(value: I18nRemoveOpCodes*): Self = this.set("remove", js.Array(value :_*))
    
    @scala.inline
    def setRemove(value: js.Array[I18nRemoveOpCodes]): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IcuType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateVarargs(value: I18nUpdateOpCodes*): Self = this.set("update", js.Array(value :_*))
    
    @scala.inline
    def setUpdate(value: js.Array[I18nUpdateOpCodes]): Self = this.set("update", value.asInstanceOf[js.Any])
  }
}
