package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomPluginRequest extends StObject {
  
  /**
    * The type of the plugin file.
    */
  var contentType: CustomPluginContentType
  
  /**
    * A summary description of the custom plugin.
    */
  var description: js.UndefOr[stringMax1024] = js.undefined
  
  /**
    * Information about the location of a custom plugin.
    */
  var location: CustomPluginLocation
  
  /**
    * The name of the custom plugin.
    */
  var name: stringMin1Max128
}
object CreateCustomPluginRequest {
  
  inline def apply(contentType: CustomPluginContentType, location: CustomPluginLocation, name: stringMin1Max128): CreateCustomPluginRequest = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomPluginRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomPluginRequest] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: CustomPluginContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: stringMax1024): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLocation(value: CustomPluginLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: stringMin1Max128): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
