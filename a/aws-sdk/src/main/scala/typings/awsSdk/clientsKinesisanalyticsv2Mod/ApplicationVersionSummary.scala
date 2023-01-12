package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationVersionSummary extends StObject {
  
  /**
    * The status of the application.
    */
  var ApplicationStatus: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationStatus
  
  /**
    * The ID of the application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application.
    */
  var ApplicationVersionId: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId
}
object ApplicationVersionSummary {
  
  inline def apply(ApplicationStatus: ApplicationStatus, ApplicationVersionId: ApplicationVersionId): ApplicationVersionSummary = {
    val __obj = js.Dynamic.literal(ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVersionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationVersionSummary] (val x: Self) extends AnyVal {
    
    inline def setApplicationStatus(value: ApplicationStatus): Self = StObject.set(x, "ApplicationStatus", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
  }
}
