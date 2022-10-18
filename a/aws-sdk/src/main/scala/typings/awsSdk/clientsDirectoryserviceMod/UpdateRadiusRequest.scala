package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRadiusRequest extends StObject {
  
  /**
    * The identifier of the directory for which to update the RADIUS server information.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * A RadiusSettings object that contains information about the RADIUS server.
    */
  var RadiusSettings: typings.awsSdk.clientsDirectoryserviceMod.RadiusSettings
}
object UpdateRadiusRequest {
  
  inline def apply(DirectoryId: DirectoryId, RadiusSettings: RadiusSettings): UpdateRadiusRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], RadiusSettings = RadiusSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRadiusRequest]
  }
  
  extension [Self <: UpdateRadiusRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setRadiusSettings(value: RadiusSettings): Self = StObject.set(x, "RadiusSettings", value.asInstanceOf[js.Any])
  }
}
