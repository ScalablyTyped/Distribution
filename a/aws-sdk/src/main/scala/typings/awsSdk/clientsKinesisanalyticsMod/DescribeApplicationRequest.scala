package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationRequest extends StObject {
  
  /**
    * Name of the application.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsMod.ApplicationName
}
object DescribeApplicationRequest {
  
  inline def apply(ApplicationName: ApplicationName): DescribeApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationRequest]
  }
  
  extension [Self <: DescribeApplicationRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
  }
}
