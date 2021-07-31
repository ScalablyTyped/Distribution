package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id
  
  /**
    * A description of the environment.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.undefined
  
  /**
    * The environment ID.
    */
  var EnvironmentId: Id
  
  /**
    * Amazon CloudWatch alarms to monitor during the deployment process.
    */
  var Monitors: js.UndefOr[MonitorList] = js.undefined
  
  /**
    * The name of the environment.
    */
  var Name: js.UndefOr[typings.awsSdk.appconfigMod.Name] = js.undefined
}
object UpdateEnvironmentRequest {
  
  @scala.inline
  def apply(ApplicationId: Id, EnvironmentId: Id): UpdateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentRequest]
  }
  
  @scala.inline
  implicit class UpdateEnvironmentRequestMutableBuilder[Self <: UpdateEnvironmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitors(value: MonitorList): Self = StObject.set(x, "Monitors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorsUndefined: Self = StObject.set(x, "Monitors", js.undefined)
    
    @scala.inline
    def setMonitorsVarargs(value: Monitor*): Self = StObject.set(x, "Monitors", js.Array(value :_*))
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
