package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.undefined
  
  /**
    * The description of the environment.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.undefined
  
  /**
    * The environment ID.
    */
  var Id: js.UndefOr[typings.awsSdk.appconfigMod.Id] = js.undefined
  
  /**
    * Amazon CloudWatch alarms monitored during the deployment.
    */
  var Monitors: js.UndefOr[MonitorList] = js.undefined
  
  /**
    * The name of the environment.
    */
  var Name: js.UndefOr[typings.awsSdk.appconfigMod.Name] = js.undefined
  
  /**
    * The state of the environment. An environment can be in one of the following states: READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK, or ROLLED_BACK 
    */
  var State: js.UndefOr[EnvironmentState] = js.undefined
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
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
    
    @scala.inline
    def setState(value: EnvironmentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
