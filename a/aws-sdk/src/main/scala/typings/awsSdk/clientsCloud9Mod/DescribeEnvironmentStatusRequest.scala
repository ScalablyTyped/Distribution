package typings.awsSdk.clientsCloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEnvironmentStatusRequest extends StObject {
  
  /**
    * The ID of the environment to get status information about.
    */
  var environmentId: EnvironmentId
}
object DescribeEnvironmentStatusRequest {
  
  inline def apply(environmentId: EnvironmentId): DescribeEnvironmentStatusRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentStatusRequest]
  }
  
  extension [Self <: DescribeEnvironmentStatusRequest](x: Self) {
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
