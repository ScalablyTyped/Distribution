package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMapTileResponse extends StObject {
  
  /**
    * Contains Mapbox Vector Tile (MVT) data.
    */
  var Blob: js.UndefOr[_Blob] = js.undefined
  
  /**
    * The map tile's content type. For example, application/vnd.mapbox-vector-tile.
    */
  var ContentType: js.UndefOr[String] = js.undefined
}
object GetMapTileResponse {
  
  inline def apply(): GetMapTileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMapTileResponse]
  }
  
  extension [Self <: GetMapTileResponse](x: Self) {
    
    inline def setBlob(value: _Blob): Self = StObject.set(x, "Blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "Blob", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
  }
}
