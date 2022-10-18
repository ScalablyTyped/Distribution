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
    * The map resource associated with the sprite ﬁle.
    */
  var MapName: ResourceName
}
object GetMapSpritesRequest {
  
  inline def apply(FileName: GetMapSpritesRequestFileNameString, MapName: ResourceName): GetMapSpritesRequest = {
    val __obj = js.Dynamic.literal(FileName = FileName.asInstanceOf[js.Any], MapName = MapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMapSpritesRequest]
  }
  
  extension [Self <: GetMapSpritesRequest](x: Self) {
    
    inline def setFileName(value: GetMapSpritesRequestFileNameString): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
  }
}
