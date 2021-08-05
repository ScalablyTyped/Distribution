package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TIcu extends StObject {
  
  /**
    * Index in `LView` where the anchor node is stored. `<!-- ICU 0:0 -->`
    */
  var anchorIdx: Double
  
  /**
    * A list of case values which the current ICU will try to match.
    *
    * The last value is `other`
    */
  var cases: js.Array[js.Any]
  
  /**
    * A set of OpCodes to apply in order to build up the DOM render tree for the ICU
    */
  var create: js.Array[IcuCreateOpCodes]
  
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
  var currentCaseLViewIndex: Double
  
  /**
    * A set of OpCodes to apply in order to destroy the DOM render tree for the ICU.
    */
  var remove: js.Array[I18nRemoveOpCodes]
  
  /**
    * Defines the ICU type of `select` or `plural`
    */
  var `type`: IcuType
  
  /**
    * A set of OpCodes to apply in order to update the DOM render tree for the ICU bindings.
    */
  var update: js.Array[I18nUpdateOpCodes]
}
object TIcu {
  
  inline def apply(
    anchorIdx: Double,
    cases: js.Array[js.Any],
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
  
  extension [Self <: TIcu](x: Self) {
    
    inline def setAnchorIdx(value: Double): Self = StObject.set(x, "anchorIdx", value.asInstanceOf[js.Any])
    
    inline def setCases(value: js.Array[js.Any]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesVarargs(value: js.Any*): Self = StObject.set(x, "cases", js.Array(value :_*))
    
    inline def setCreate(value: js.Array[IcuCreateOpCodes]): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateVarargs(value: IcuCreateOpCodes*): Self = StObject.set(x, "create", js.Array(value :_*))
    
    inline def setCurrentCaseLViewIndex(value: Double): Self = StObject.set(x, "currentCaseLViewIndex", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: js.Array[I18nRemoveOpCodes]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveVarargs(value: I18nRemoveOpCodes*): Self = StObject.set(x, "remove", js.Array(value :_*))
    
    inline def setType(value: IcuType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: js.Array[I18nUpdateOpCodes]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateVarargs(value: I18nUpdateOpCodes*): Self = StObject.set(x, "update", js.Array(value :_*))
  }
}
