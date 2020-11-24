package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMSymbolLayerBase extends js.Object {
  
  /**
    * A value indicating whether the color set at the basic properties level is applied to the symbol layer. If the symbol layer is color locked then changes made to the color in the basic properties will not be applied to the symbol layer.
    */
  var colorLocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the geometric effects that are applied to the symbol layer. Effects dynamically alter the feature geometry when the symbology is applied. Multiple effects applied to a symbol layer are rendered sequentially.
    */
  var effects: js.UndefOr[js.Array[CIMGeometricEffectType]] = js.native
  
  /**
    * A value indicating whether the symbol layer is visible. The symbol layer draws only when enabled. Currently, an invisible layer is not considered in any transformations when in a 3D context.
    */
  var enable: js.UndefOr[Boolean] = js.native
  
  /**
    * The internal name of the symbol layer used for symbol level drawing.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A value indicating whether or not the symbol layer should overprint in press printing.
    */
  var overprint: js.UndefOr[Boolean] = js.native
  
  /**
    * The primitive name.
    */
  var primitiveName: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object CIMSymbolLayerBase {
  
  @scala.inline
  def apply(`type`: String): CIMSymbolLayerBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMSymbolLayerBase]
  }
  
  @scala.inline
  implicit class CIMSymbolLayerBaseOps[Self <: CIMSymbolLayerBase] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorLocked(value: Boolean): Self = this.set("colorLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorLocked: Self = this.set("colorLocked", js.undefined)
    
    @scala.inline
    def setEffectsVarargs(value: CIMGeometricEffectType*): Self = this.set("effects", js.Array(value :_*))
    
    @scala.inline
    def setEffects(value: js.Array[CIMGeometricEffectType]): Self = this.set("effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffects: Self = this.set("effects", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOverprint(value: Boolean): Self = this.set("overprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverprint: Self = this.set("overprint", js.undefined)
    
    @scala.inline
    def setPrimitiveName(value: String): Self = this.set("primitiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveName: Self = this.set("primitiveName", js.undefined)
  }
}
