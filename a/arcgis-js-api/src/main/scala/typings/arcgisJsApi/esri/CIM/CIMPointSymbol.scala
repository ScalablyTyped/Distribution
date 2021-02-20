package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
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
  implicit class CIMPointSymbolMutableBuilder[Self <: CIMPointSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleAlignment(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AngleAlignment * / any */ String
    ): Self = StObject.set(x, "angleAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleAlignmentUndefined: Self = StObject.set(x, "angleAlignment", js.undefined)
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setCallout(value: CIMCalloutType): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    @scala.inline
    def setHaloSize(value: Double): Self = StObject.set(x, "haloSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaloSizeUndefined: Self = StObject.set(x, "haloSize", js.undefined)
    
    @scala.inline
    def setHaloSymbol(value: CIMPolygonSymbol): Self = StObject.set(x, "haloSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaloSymbolUndefined: Self = StObject.set(x, "haloSymbol", js.undefined)
    
    @scala.inline
    def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setSymbol3DProperties(value: CIM3DSymbolProperties): Self = StObject.set(x, "symbol3DProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol3DPropertiesUndefined: Self = StObject.set(x, "symbol3DProperties", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPointSymbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
