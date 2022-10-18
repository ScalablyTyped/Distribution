package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteV2LoggingLevelRequest extends StObject {
  
  /**
    * The name of the resource for which you are configuring logging.
    */
  var targetName: LogTargetName
  
  /**
    * The type of resource for which you are configuring logging. Must be THING_Group.
    */
  var targetType: LogTargetType
}
object DeleteV2LoggingLevelRequest {
  
  inline def apply(targetName: LogTargetName, targetType: LogTargetType): DeleteV2LoggingLevelRequest = {
    val __obj = js.Dynamic.literal(targetName = targetName.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteV2LoggingLevelRequest]
  }
  
  extension [Self <: DeleteV2LoggingLevelRequest](x: Self) {
    
    inline def setTargetName(value: LogTargetName): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    
    inline def setTargetType(value: LogTargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
  }
}
