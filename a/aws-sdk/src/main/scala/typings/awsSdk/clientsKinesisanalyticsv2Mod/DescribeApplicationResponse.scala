package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationResponse extends StObject {
  
  /**
    * Provides a description of the application, such as the application's Amazon Resource Name (ARN), status, and latest version.
    */
  var ApplicationDetail: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationDetail
}
object DescribeApplicationResponse {
  
  inline def apply(ApplicationDetail: ApplicationDetail): DescribeApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeApplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationDetail(value: ApplicationDetail): Self = StObject.set(x, "ApplicationDetail", value.asInstanceOf[js.Any])
  }
}
