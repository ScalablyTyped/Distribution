package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSoftwareUpdateJobResponse extends StObject {
  
  /**
    * The IoT Job ARN corresponding to this update.
    */
  var IotJobArn: js.UndefOr[string] = js.undefined
  
  /**
    * The IoT Job Id corresponding to this update.
    */
  var IotJobId: js.UndefOr[string] = js.undefined
  
  /**
    * The software version installed on the device or devices after the update.
    */
  var PlatformSoftwareVersion: js.UndefOr[string] = js.undefined
}
object CreateSoftwareUpdateJobResponse {
  
  inline def apply(): CreateSoftwareUpdateJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSoftwareUpdateJobResponse]
  }
  
  extension [Self <: CreateSoftwareUpdateJobResponse](x: Self) {
    
    inline def setIotJobArn(value: string): Self = StObject.set(x, "IotJobArn", value.asInstanceOf[js.Any])
    
    inline def setIotJobArnUndefined: Self = StObject.set(x, "IotJobArn", js.undefined)
    
    inline def setIotJobId(value: string): Self = StObject.set(x, "IotJobId", value.asInstanceOf[js.Any])
    
    inline def setIotJobIdUndefined: Self = StObject.set(x, "IotJobId", js.undefined)
    
    inline def setPlatformSoftwareVersion(value: string): Self = StObject.set(x, "PlatformSoftwareVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformSoftwareVersionUndefined: Self = StObject.set(x, "PlatformSoftwareVersion", js.undefined)
  }
}
