package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentStrategy extends StObject {
  
  /**
    * Total amount of time the deployment lasted.
    */
  var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  
  /**
    * The description of the deployment strategy.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  
  /**
    * The amount of time AppConfig monitored for alarms before considering the deployment to be complete and no longer eligible for automatic roll back.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  
  /**
    * The percentage of targets that received a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[Percentage] = js.native
  
  /**
    * The algorithm used to define how percentage grew over time.
    */
  var GrowthType: js.UndefOr[typings.awsSdk.appconfigMod.GrowthType] = js.native
  
  /**
    * The deployment strategy ID.
    */
  var Id: js.UndefOr[typings.awsSdk.appconfigMod.Id] = js.native
  
  /**
    * The name of the deployment strategy.
    */
  var Name: js.UndefOr[typings.awsSdk.appconfigMod.Name] = js.native
  
  /**
    * Save the deployment strategy to a Systems Manager (SSM) document.
    */
  var ReplicateTo: js.UndefOr[typings.awsSdk.appconfigMod.ReplicateTo] = js.native
}
object DeploymentStrategy {
  
  @scala.inline
  def apply(): DeploymentStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStrategy]
  }
  
  @scala.inline
  implicit class DeploymentStrategyMutableBuilder[Self <: DeploymentStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentDurationInMinutes(value: MinutesBetween0And24Hours): Self = StObject.set(x, "DeploymentDurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentDurationInMinutesUndefined: Self = StObject.set(x, "DeploymentDurationInMinutes", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFinalBakeTimeInMinutes(value: MinutesBetween0And24Hours): Self = StObject.set(x, "FinalBakeTimeInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalBakeTimeInMinutesUndefined: Self = StObject.set(x, "FinalBakeTimeInMinutes", js.undefined)
    
    @scala.inline
    def setGrowthFactor(value: Percentage): Self = StObject.set(x, "GrowthFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowthFactorUndefined: Self = StObject.set(x, "GrowthFactor", js.undefined)
    
    @scala.inline
    def setGrowthType(value: GrowthType): Self = StObject.set(x, "GrowthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowthTypeUndefined: Self = StObject.set(x, "GrowthType", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setReplicateTo(value: ReplicateTo): Self = StObject.set(x, "ReplicateTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicateToUndefined: Self = StObject.set(x, "ReplicateTo", js.undefined)
  }
}
