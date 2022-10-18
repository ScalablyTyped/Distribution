package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackApplicationRequest extends StObject {
  
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The current application version ID. You can retrieve the application version ID using DescribeApplication.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
}
object RollbackApplicationRequest {
  
  inline def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId): RollbackApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackApplicationRequest]
  }
  
  extension [Self <: RollbackApplicationRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
  }
}
