package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastLaunchConfiguration extends StObject {
  
  /**
    * The owner account ID for the fast-launch enabled Windows AMI.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * A Boolean that represents the current state of faster launching for the Windows AMI. Set to true to start using Windows faster launching, or false to stop using it.
    */
  var enabled: Boolean
  
  /**
    * The launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances to create pre-provisioned snapshots.
    */
  var launchTemplate: js.UndefOr[FastLaunchLaunchTemplateSpecification] = js.undefined
  
  /**
    * The maximum number of parallel instances that are launched for creating resources.
    */
  var maxParallelLaunches: js.UndefOr[MaxParallelLaunches] = js.undefined
  
  /**
    * Configuration settings for managing the number of snapshots that are created from pre-provisioned instances for the Windows AMI when faster launching is enabled.
    */
  var snapshotConfiguration: js.UndefOr[FastLaunchSnapshotConfiguration] = js.undefined
}
object FastLaunchConfiguration {
  
  inline def apply(enabled: Boolean): FastLaunchConfiguration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastLaunchConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FastLaunchConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplate(value: FastLaunchLaunchTemplateSpecification): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "launchTemplate", js.undefined)
    
    inline def setMaxParallelLaunches(value: MaxParallelLaunches): Self = StObject.set(x, "maxParallelLaunches", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelLaunchesUndefined: Self = StObject.set(x, "maxParallelLaunches", js.undefined)
    
    inline def setSnapshotConfiguration(value: FastLaunchSnapshotConfiguration): Self = StObject.set(x, "snapshotConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSnapshotConfigurationUndefined: Self = StObject.set(x, "snapshotConfiguration", js.undefined)
  }
}
