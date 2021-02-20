package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMHatchFill
  extends CIMSymbolLayerBase
     with CIMSymbolLayerType {
  
  /**
    * The line symbol that is used to draw the hatch lines in the fill.
    */
  var lineSymbol: js.UndefOr[CIMLineSymbol] = js.native
  
  /**
    * How much to move the stroke to a new X-position.
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * How much to move the stroke to a new Y-position.
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * The angle of rotation for all the strokes, in degrees.
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * The distance between the line symbols in the hatch pattern.
    */
  var separation: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMHatchFill: typings.arcgisJsApi.arcgisJsApiStrings.CIMHatchFill = js.native
}
object CIMHatchFill {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMHatchFill): CIMHatchFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMHatchFill]
  }
  
  @scala.inline
  implicit class CIMHatchFillMutableBuilder[Self <: CIMHatchFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineSymbol(value: CIMLineSymbol): Self = StObject.set(x, "lineSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSymbolUndefined: Self = StObject.set(x, "lineSymbol", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSeparation(value: Double): Self = StObject.set(x, "separation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparationUndefined: Self = StObject.set(x, "separation", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMHatchFill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
