package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMapSpritesRequest extends StObject {
  
  /**
    * The name of the sprite ﬁle. Use the following ﬁle names for the sprite sheet:    sprites.png     sprites@2x.png for high pixel density displays   For the JSON document containing image offsets. Use the following ﬁle names:    sprites.json     sprites@2x.json for high pixel density displays  
    */
  var FileName: GetMapSpritesRequestFileNameString
  
  /**
    * The optional API key to authorize the request.
    */
  var Key: js.UndefOr[ApiKey] = js.undefined
  
  /**
    * The map resource associated with the sprite ﬁle.
    */
  var MapName: ResourceName
}
object GetMapSpritesRequest {
  
  inline def apply(FileName: GetMapSpritesRequestFileNameString, MapName: ResourceName): GetMapSpritesRequest = {
    val __obj = js.Dynamic.literal(FileName = FileName.asInstanceOf[js.Any], MapName = MapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMapSpritesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMapSpritesRequest] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: GetMapSpritesRequestFileNameString): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    inline def setKey(value: ApiKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
  }
}
