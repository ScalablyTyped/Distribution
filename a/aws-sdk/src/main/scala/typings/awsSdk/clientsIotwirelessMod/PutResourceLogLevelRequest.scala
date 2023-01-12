package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourceLogLevelRequest extends StObject {
  
  var LogLevel: typings.awsSdk.clientsIotwirelessMod.LogLevel
  
  var ResourceIdentifier: typings.awsSdk.clientsIotwirelessMod.ResourceIdentifier
  
  /**
    * The type of the resource, which can be WirelessDevice or WirelessGateway.
    */
  var ResourceType: typings.awsSdk.clientsIotwirelessMod.ResourceType
}
object PutResourceLogLevelRequest {
  
  inline def apply(LogLevel: LogLevel, ResourceIdentifier: ResourceIdentifier, ResourceType: ResourceType): PutResourceLogLevelRequest = {
    val __obj = js.Dynamic.literal(LogLevel = LogLevel.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourceLogLevelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourceLogLevelRequest] (val x: Self) extends AnyVal {
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
