package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMVectorMarker
  extends CIMMarker
     with CIMSymbolLayerType {
  
  /**
    * A clipping path for the vector marker graphics.
    */
  var clippingPath: js.UndefOr[CIMClippingPath] = js.native
  
  /**
    * The depth of the marker when drawn in 3D.
    */
  var depth3D: js.UndefOr[Double] = js.native
  
  /**
    * The outer boundary of the entire vector marker.
    */
  var frame: js.UndefOr[ExternalReferenceEnvelope] = js.native
  
  /**
    * The vector graphics that define the shape of the marker.
    */
  var markerGraphics: js.UndefOr[js.Array[CIMMarkerGraphic]] = js.native
  
  /**
    * A value indicating whether the frame of the vector marker should be honored when drawing the marker.
    */
  var respectFrame: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether the strokes and or fills of a marker are scaled proportionally when the symbol size is changed. When enabled, the strokes for the outline or fill of the polygon symbol used to draw the marker will be scaled proportionally with changes to the symbol size. If this property is not enabled, then the stroke will draw with the specified width regardless of the marker size.
    */
  var scaleSymbolsProportionally: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_CIMVectorMarker: typings.arcgisJsApi.arcgisJsApiStrings.CIMVectorMarker = js.native
  
  /**
    * A value indicating whether the marker stands upright as though locked in place. The marker can be viewed from all angles.
    */
  var verticalOrientation3D: js.UndefOr[Boolean] = js.native
}
object CIMVectorMarker {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMVectorMarker): CIMVectorMarker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMVectorMarker]
  }
  
  @scala.inline
  implicit class CIMVectorMarkerOps[Self <: CIMVectorMarker] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMVectorMarker): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingPath(value: CIMClippingPath): Self = this.set("clippingPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClippingPath: Self = this.set("clippingPath", js.undefined)
    
    @scala.inline
    def setDepth3D(value: Double): Self = this.set("depth3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth3D: Self = this.set("depth3D", js.undefined)
    
    @scala.inline
    def setFrame(value: ExternalReferenceEnvelope): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    
    @scala.inline
    def setMarkerGraphicsVarargs(value: CIMMarkerGraphic*): Self = this.set("markerGraphics", js.Array(value :_*))
    
    @scala.inline
    def setMarkerGraphics(value: js.Array[CIMMarkerGraphic]): Self = this.set("markerGraphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerGraphics: Self = this.set("markerGraphics", js.undefined)
    
    @scala.inline
    def setRespectFrame(value: Boolean): Self = this.set("respectFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRespectFrame: Self = this.set("respectFrame", js.undefined)
    
    @scala.inline
    def setScaleSymbolsProportionally(value: Boolean): Self = this.set("scaleSymbolsProportionally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleSymbolsProportionally: Self = this.set("scaleSymbolsProportionally", js.undefined)
    
    @scala.inline
    def setVerticalOrientation3D(value: Boolean): Self = this.set("verticalOrientation3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOrientation3D: Self = this.set("verticalOrientation3D", js.undefined)
  }
}
