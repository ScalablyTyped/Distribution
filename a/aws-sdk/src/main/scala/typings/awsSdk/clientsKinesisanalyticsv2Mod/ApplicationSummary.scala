package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSummary extends StObject {
  
  /**
    * The ARN of the application.
    */
  var ApplicationARN: ResourceARN
  
  /**
    * For a Kinesis Data Analytics for Apache Flink application, the mode is STREAMING. For a Kinesis Data Analytics Studio notebook, it is INTERACTIVE.
    */
  var ApplicationMode: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationMode] = js.undefined
  
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The status of the application.
    */
  var ApplicationStatus: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationStatus
  
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId
  
  /**
    * The runtime environment for the application.
    */
  var RuntimeEnvironment: typings.awsSdk.clientsKinesisanalyticsv2Mod.RuntimeEnvironment
}
object ApplicationSummary {
  
  inline def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId,
    RuntimeEnvironment: RuntimeEnvironment
  ): ApplicationSummary = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSummary]
  }
  
  extension [Self <: ApplicationSummary](x: Self) {
    
    inline def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    inline def setApplicationMode(value: ApplicationMode): Self = StObject.set(x, "ApplicationMode", value.asInstanceOf[js.Any])
    
    inline def setApplicationModeUndefined: Self = StObject.set(x, "ApplicationMode", js.undefined)
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationStatus(value: ApplicationStatus): Self = StObject.set(x, "ApplicationStatus", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setRuntimeEnvironment(value: RuntimeEnvironment): Self = StObject.set(x, "RuntimeEnvironment", value.asInstanceOf[js.Any])
  }
}
