package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployAsApplicationConfigurationUpdate extends StObject {
  
  /**
    * Updates to the location that holds the data required to specify an Amazon Data Analytics application.
    */
  var S3ContentLocationUpdate: js.UndefOr[S3ContentBaseLocationUpdate] = js.undefined
}
object DeployAsApplicationConfigurationUpdate {
  
  inline def apply(): DeployAsApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployAsApplicationConfigurationUpdate]
  }
  
  extension [Self <: DeployAsApplicationConfigurationUpdate](x: Self) {
    
    inline def setS3ContentLocationUpdate(value: S3ContentBaseLocationUpdate): Self = StObject.set(x, "S3ContentLocationUpdate", value.asInstanceOf[js.Any])
    
    inline def setS3ContentLocationUpdateUndefined: Self = StObject.set(x, "S3ContentLocationUpdate", js.undefined)
  }
}
