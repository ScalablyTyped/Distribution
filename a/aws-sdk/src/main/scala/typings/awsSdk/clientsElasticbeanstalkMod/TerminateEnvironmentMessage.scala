package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateEnvironmentMessage extends StObject {
  
  /**
    * The ID of the environment to terminate.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.undefined
  
  /**
    * The name of the environment to terminate.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  
  /**
    * Terminates the target environment even if another environment in the same group is dependent on it.
    */
  var ForceTerminate: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ForceTerminate] = js.undefined
  
  /**
    * Indicates whether the associated AWS resources should shut down when the environment is terminated:    true: The specified environment as well as the associated AWS resources, such as Auto Scaling group and LoadBalancer, are terminated.    false: AWS Elastic Beanstalk resource management is removed from the environment, but the AWS resources continue to operate.    For more information, see the  AWS Elastic Beanstalk User Guide.    Default: true   Valid Values: true | false 
    */
  var TerminateResources: js.UndefOr[TerminateEnvironmentResources] = js.undefined
}
object TerminateEnvironmentMessage {
  
  inline def apply(): TerminateEnvironmentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateEnvironmentMessage]
  }
  
  extension [Self <: TerminateEnvironmentMessage](x: Self) {
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setForceTerminate(value: ForceTerminate): Self = StObject.set(x, "ForceTerminate", value.asInstanceOf[js.Any])
    
    inline def setForceTerminateUndefined: Self = StObject.set(x, "ForceTerminate", js.undefined)
    
    inline def setTerminateResources(value: TerminateEnvironmentResources): Self = StObject.set(x, "TerminateResources", value.asInstanceOf[js.Any])
    
    inline def setTerminateResourcesUndefined: Self = StObject.set(x, "TerminateResources", js.undefined)
  }
}
