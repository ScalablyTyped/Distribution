package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMSymbolReference extends js.Object {
  
  /**
    * The maximum distance at which symbols are visible. Objects beyond this point don't get rendered.
    */
  var maxDistance: js.UndefOr[Double] = js.native
  
  /**
    * The maximum scale range the symbol reference should be displayed at.
    */
  var maxScale: js.UndefOr[Double] = js.native
  
  /**
    * The minimum distance at which symbols are visible. Objects closer than this don't get rendered.
    */
  var minDistance: js.UndefOr[Double] = js.native
  
  /**
    * The minimum scale range the symbol reference should be displayed at.
    */
  var minScale: js.UndefOr[Double] = js.native
  
  /**
    * The primitive overrides. Typically set by renderers at draw time.
    */
  var primitiveOverrides: js.UndefOr[js.Array[CIMPrimitiveOverride]] = js.native
  
  /**
    * An array of scale dependent sizes.
    */
  var scaleDependentSizeVariation: js.UndefOr[js.Array[CIMScaleDependentSizeVariation]] = js.native
  
  /**
    * The style path. Reserved for future use.
    */
  var stylePath: js.UndefOr[String] = js.native
  
  /**
    * The symbol.
    */
  var symbol: js.UndefOr[CIMSymbolType] = js.native
  
  /**
    * The symbol name.
    */
  var symbolName: js.UndefOr[String] = js.native
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMSymbolReference = js.native
}
object CIMSymbolReference {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMSymbolReference): CIMSymbolReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMSymbolReference]
  }
  
  @scala.inline
  implicit class CIMSymbolReferenceOps[Self <: CIMSymbolReference] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMSymbolReference): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDistance(value: Double): Self = this.set("maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDistance: Self = this.set("maxDistance", js.undefined)
    
    @scala.inline
    def setMaxScale(value: Double): Self = this.set("maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScale: Self = this.set("maxScale", js.undefined)
    
    @scala.inline
    def setMinDistance(value: Double): Self = this.set("minDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDistance: Self = this.set("minDistance", js.undefined)
    
    @scala.inline
    def setMinScale(value: Double): Self = this.set("minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScale: Self = this.set("minScale", js.undefined)
    
    @scala.inline
    def setPrimitiveOverridesVarargs(value: CIMPrimitiveOverride*): Self = this.set("primitiveOverrides", js.Array(value :_*))
    
    @scala.inline
    def setPrimitiveOverrides(value: js.Array[CIMPrimitiveOverride]): Self = this.set("primitiveOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveOverrides: Self = this.set("primitiveOverrides", js.undefined)
    
    @scala.inline
    def setScaleDependentSizeVariationVarargs(value: CIMScaleDependentSizeVariation*): Self = this.set("scaleDependentSizeVariation", js.Array(value :_*))
    
    @scala.inline
    def setScaleDependentSizeVariation(value: js.Array[CIMScaleDependentSizeVariation]): Self = this.set("scaleDependentSizeVariation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleDependentSizeVariation: Self = this.set("scaleDependentSizeVariation", js.undefined)
    
    @scala.inline
    def setStylePath(value: String): Self = this.set("stylePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylePath: Self = this.set("stylePath", js.undefined)
    
    @scala.inline
    def setSymbol(value: CIMSymbolType): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setSymbolName(value: String): Self = this.set("symbolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolName: Self = this.set("symbolName", js.undefined)
  }
}
