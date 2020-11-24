package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMultiLayerSymbol extends CIMSymbolBase {
  
  /**
    * The geometric effects that are applied to the symbol.
    */
  var effects: js.UndefOr[js.Array[CIMGeometricEffectType]] = js.native
  
  /**
    * The symbol layers. Symbol layers are the components that make up a symbol. A symbol layer is represented by a stroke, fill, marker, or procedural symbol layer.
    */
  var symbolLayers: js.UndefOr[js.Array[CIMSymbolLayerType]] = js.native
  
  /**
    * The representative image of the symbol.
    */
  var thumbnailURI: js.UndefOr[String] = js.native
  
  /**
    * A value indicating whether the symbol size properties are rendered using real world units or page units. When set to true the symbol will draw using real world units (e.g. meters).
    */
  var useRealWorldSymbolSizes: js.UndefOr[Boolean] = js.native
}
object CIMMultiLayerSymbol {
  
  @scala.inline
  def apply(`type`: String): CIMMultiLayerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMultiLayerSymbol]
  }
  
  @scala.inline
  implicit class CIMMultiLayerSymbolOps[Self <: CIMMultiLayerSymbol] (val x: Self) extends AnyVal {
    
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
    def setEffectsVarargs(value: CIMGeometricEffectType*): Self = this.set("effects", js.Array(value :_*))
    
    @scala.inline
    def setEffects(value: js.Array[CIMGeometricEffectType]): Self = this.set("effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffects: Self = this.set("effects", js.undefined)
    
    @scala.inline
    def setSymbolLayersVarargs(value: CIMSymbolLayerType*): Self = this.set("symbolLayers", js.Array(value :_*))
    
    @scala.inline
    def setSymbolLayers(value: js.Array[CIMSymbolLayerType]): Self = this.set("symbolLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolLayers: Self = this.set("symbolLayers", js.undefined)
    
    @scala.inline
    def setThumbnailURI(value: String): Self = this.set("thumbnailURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailURI: Self = this.set("thumbnailURI", js.undefined)
    
    @scala.inline
    def setUseRealWorldSymbolSizes(value: Boolean): Self = this.set("useRealWorldSymbolSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseRealWorldSymbolSizes: Self = this.set("useRealWorldSymbolSizes", js.undefined)
  }
}
