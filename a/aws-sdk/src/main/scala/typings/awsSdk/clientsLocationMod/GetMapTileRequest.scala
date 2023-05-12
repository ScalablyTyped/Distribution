package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMapTileRequest extends StObject {
  
  /**
    * The optional API key to authorize the request.
    */
  var Key: js.UndefOr[ApiKey] = js.undefined
  
  /**
    * The map resource to retrieve the map tiles from.
    */
  var MapName: ResourceName
  
  /**
    * The X axis value for the map tile.
    */
  var X: GetMapTileRequestXString
  
  /**
    * The Y axis value for the map tile. 
    */
  var Y: GetMapTileRequestYString
  
  /**
    * The zoom value for the map tile.
    */
  var Z: GetMapTileRequestZString
}
object GetMapTileRequest {
  
  inline def apply(
    MapName: ResourceName,
    X: GetMapTileRequestXString,
    Y: GetMapTileRequestYString,
    Z: GetMapTileRequestZString
  ): GetMapTileRequest = {
    val __obj = js.Dynamic.literal(MapName = MapName.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMapTileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMapTileRequest] (val x: Self) extends AnyVal {
    
    inline def setKey(value: ApiKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
    
    inline def setX(value: GetMapTileRequestXString): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    inline def setY(value: GetMapTileRequestYString): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: GetMapTileRequestZString): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
  }
}
