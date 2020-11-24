package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMPointSymbol
  extends CIMMultiLayerSymbol
     with CIMSymbolType {
  
  /**
    * The amount of variation applied to the symbol, measured in degrees, propagated cumulatively to all marker symbols.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * Whether point symbols align to the map or to the display when a rotation is applied to the map.
    */
  var angleAlignment: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AngleAlignment * / any */ String
  ] = js.native
  
  /**
    * The callout of the point symbol.
    */
  var callout: js.UndefOr[CIMCalloutType] = js.native
  
  /**
    * The size of the halo that extends beyond the symbol shape.
    */
  var haloSize: js.UndefOr[Double] = js.native
  
  /**
    * The polygon symbol that is used to draw the halo for a point symbol.
    */
  var haloSymbol: js.UndefOr[CIMPolygonSymbol] = js.native
  
  /**
    * The primitive name.
    */
  var primitiveName: js.UndefOr[String] = js.native
  
  /**
    * The X scale which changes the width of the symbol without changing the height (or depth in 3D), as a ratio.
    */
  var scaleX: js.UndefOr[Double] = js.native
  
  /**
    * The collection of symbol properties that apply when the symbol is used in a 3D context.
    */
  var symbol3DProperties: js.UndefOr[CIM3DSymbolProperties] = js.native
  
  @JSName("type")
  var type_CIMPointSymbol: typings.arcgisJsApi.arcgisJsApiStrings.CIMPointSymbol = js.native
}
object CIMPointSymbol {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPointSymbol): CIMPointSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMPointSymbol]
  }
  
  @scala.inline
  implicit class CIMPointSymbolOps[Self <: CIMPointSymbol] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPointSymbol): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setAngleAlignment(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AngleAlignment * / any */ String
    ): Self = this.set("angleAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleAlignment: Self = this.set("angleAlignment", js.undefined)
    
    @scala.inline
    def setCallout(value: CIMCalloutType): Self = this.set("callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
    
    @scala.inline
    def setHaloSize(value: Double): Self = this.set("haloSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHaloSize: Self = this.set("haloSize", js.undefined)
    
    @scala.inline
    def setHaloSymbol(value: CIMPolygonSymbol): Self = this.set("haloSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHaloSymbol: Self = this.set("haloSymbol", js.undefined)
    
    @scala.inline
    def setPrimitiveName(value: String): Self = this.set("primitiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveName: Self = this.set("primitiveName", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    
    @scala.inline
    def setSymbol3DProperties(value: CIM3DSymbolProperties): Self = this.set("symbol3DProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol3DProperties: Self = this.set("symbol3DProperties", js.undefined)
  }
}
