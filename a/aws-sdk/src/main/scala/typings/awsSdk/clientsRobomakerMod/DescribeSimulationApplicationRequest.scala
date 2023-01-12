package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSimulationApplicationRequest extends StObject {
  
  /**
    * The application information for the simulation application.
    */
  var application: Arn
  
  /**
    * The version of the simulation application to describe.
    */
  var applicationVersion: js.UndefOr[Version] = js.undefined
}
object DescribeSimulationApplicationRequest {
  
  inline def apply(application: Arn): DescribeSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSimulationApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSimulationApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
  }
}
