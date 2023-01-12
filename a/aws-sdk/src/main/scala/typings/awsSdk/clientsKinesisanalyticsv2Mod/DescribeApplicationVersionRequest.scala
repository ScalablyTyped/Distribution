package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationVersionRequest extends StObject {
  
  /**
    * The name of the application for which you want to get the version description.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The ID of the application version for which you want to get the description.
    */
  var ApplicationVersionId: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId
}
object DescribeApplicationVersionRequest {
  
  inline def apply(ApplicationName: ApplicationName, ApplicationVersionId: ApplicationVersionId): DescribeApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeApplicationVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
  }
}
