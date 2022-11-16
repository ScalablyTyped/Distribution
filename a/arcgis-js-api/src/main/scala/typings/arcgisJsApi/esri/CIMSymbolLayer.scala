package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.CIMHatchFill
  - typings.arcgisJsApi.esri.CIMPictureFill
  - typings.arcgisJsApi.esri.CIMPictureMarker
  - typings.arcgisJsApi.esri.CIMPictureStroke
  - typings.arcgisJsApi.esri.CIMSolidFill
  - typings.arcgisJsApi.esri.CIMSolidStroke
  - typings.arcgisJsApi.esri.CIMVectorMarker
*/
trait CIMSymbolLayer extends StObject
object CIMSymbolLayer {
  
  inline def CIMHatchFill(enable: Boolean, lineSymbol: CIMLineSymbol, separation: Double): typings.arcgisJsApi.esri.CIMHatchFill = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], lineSymbol = lineSymbol.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMHatchFill")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMHatchFill]
  }
  
  inline def CIMPictureFill(enable: Boolean, url: String): typings.arcgisJsApi.esri.CIMPictureFill = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMPictureFill")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMPictureFill]
  }
  
  inline def CIMPictureMarker(enable: Boolean, size: Double, url: String): typings.arcgisJsApi.esri.CIMPictureMarker = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMPictureMarker")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMPictureMarker]
  }
  
  inline def CIMPictureStroke(enable: Boolean, url: String, width: Double): typings.arcgisJsApi.esri.CIMPictureStroke = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMPictureStroke")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMPictureStroke]
  }
  
  inline def CIMSolidFill(color: js.Array[Double], enable: Boolean): typings.arcgisJsApi.esri.CIMSolidFill = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMSolidFill")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMSolidFill]
  }
  
  inline def CIMSolidStroke(color: js.Array[Double], enable: Boolean, width: Double): typings.arcgisJsApi.esri.CIMSolidStroke = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMSolidStroke")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMSolidStroke]
  }
  
  inline def CIMVectorMarker(enable: Boolean, frame: Envelope, markerGraphics: js.Array[CIMMarkerGraphic], size: Double): typings.arcgisJsApi.esri.CIMVectorMarker = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], markerGraphics = markerGraphics.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMVectorMarker")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMVectorMarker]
  }
}
