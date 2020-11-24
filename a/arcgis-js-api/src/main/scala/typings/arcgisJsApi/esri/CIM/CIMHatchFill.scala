package typings.arcgisJsApi.esri.CIM

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
  implicit class CIMHatchFillOps[Self <: CIMHatchFill] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMHatchFill): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSymbol(value: CIMLineSymbol): Self = this.set("lineSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSymbol: Self = this.set("lineSymbol", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setSeparation(value: Double): Self = this.set("separation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparation: Self = this.set("separation", js.undefined)
  }
}
