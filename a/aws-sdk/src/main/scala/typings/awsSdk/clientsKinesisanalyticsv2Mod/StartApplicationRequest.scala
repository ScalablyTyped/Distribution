package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartApplicationRequest extends StObject {
  
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
    */
  var RunConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.RunConfiguration] = js.undefined
}
object StartApplicationRequest {
  
  inline def apply(ApplicationName: ApplicationName): StartApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartApplicationRequest]
  }
  
  extension [Self <: StartApplicationRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setRunConfiguration(value: RunConfiguration): Self = StObject.set(x, "RunConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRunConfigurationUndefined: Self = StObject.set(x, "RunConfiguration", js.undefined)
  }
}
