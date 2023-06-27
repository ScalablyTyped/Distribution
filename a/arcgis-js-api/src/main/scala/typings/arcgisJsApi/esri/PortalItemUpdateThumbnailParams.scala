package typings.arcgisJsApi.esri

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalItemUpdateThumbnailParams extends StObject {
  
  /**
  		 * The file name used for the thumbnail in [thumbnailUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#thumbnailUrl).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#updateThumbnail)
  		 */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
  		 * A URL, Data URI, Blob, or File.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#updateThumbnail)
  		 */
  var thumbnail: Blob | String
}
object PortalItemUpdateThumbnailParams {
  
  inline def apply(thumbnail: Blob | String): PortalItemUpdateThumbnailParams = {
    val __obj = js.Dynamic.literal(thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalItemUpdateThumbnailParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortalItemUpdateThumbnailParams] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setThumbnail(value: Blob | String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
