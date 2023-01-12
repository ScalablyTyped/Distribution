package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEnvironmentManagedActionsRequest extends StObject {
  
  /**
    * The environment ID of the target environment.
    */
  var EnvironmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the target environment.
    */
  var EnvironmentName: js.UndefOr[String] = js.undefined
  
  /**
    * To show only actions with a particular status, specify a status.
    */
  var Status: js.UndefOr[ActionStatus] = js.undefined
}
object DescribeEnvironmentManagedActionsRequest {
  
  inline def apply(): DescribeEnvironmentManagedActionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentManagedActionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEnvironmentManagedActionsRequest] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentId(value: String): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setStatus(value: ActionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
