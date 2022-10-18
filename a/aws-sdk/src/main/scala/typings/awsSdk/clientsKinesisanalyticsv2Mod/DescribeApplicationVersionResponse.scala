package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationVersionResponse extends StObject {
  
  var ApplicationVersionDetail: js.UndefOr[ApplicationDetail] = js.undefined
}
object DescribeApplicationVersionResponse {
  
  inline def apply(): DescribeApplicationVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationVersionResponse]
  }
  
  extension [Self <: DescribeApplicationVersionResponse](x: Self) {
    
    inline def setApplicationVersionDetail(value: ApplicationDetail): Self = StObject.set(x, "ApplicationVersionDetail", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionDetailUndefined: Self = StObject.set(x, "ApplicationVersionDetail", js.undefined)
  }
}
