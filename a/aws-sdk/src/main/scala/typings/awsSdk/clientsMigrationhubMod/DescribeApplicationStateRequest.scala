package typings.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationStateRequest extends StObject {
  
  /**
    * The configurationId in Application Discovery Service that uniquely identifies the grouped application.
    */
  var ApplicationId: typings.awsSdk.clientsMigrationhubMod.ApplicationId
}
object DescribeApplicationStateRequest {
  
  inline def apply(ApplicationId: ApplicationId): DescribeApplicationStateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationStateRequest]
  }
  
  extension [Self <: DescribeApplicationStateRequest](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
