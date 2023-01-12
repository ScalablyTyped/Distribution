package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstalledComponent extends StObject {
  
  /**
    * The name of the component.
    */
  var componentName: js.UndefOr[ComponentNameString] = js.undefined
  
  /**
    * The version of the component.
    */
  var componentVersion: js.UndefOr[ComponentVersionString] = js.undefined
  
  /**
    * Whether or not the component is a root component.
    */
  var isRoot: js.UndefOr[IsRoot] = js.undefined
  
  /**
    * The most recent deployment source that brought the component to the Greengrass core device. For a thing group deployment or thing deployment, the source will be the The ID of the deployment. and for local deployments it will be LOCAL.
    */
  var lastInstallationSource: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The last time the Greengrass core device sent a message containing a certain component to the Amazon Web Services Cloud. A component does not need to see a state change for this field to update.
    */
  var lastReportedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of how current the data is. This response is based off of component state changes. The status reflects component disruptions and deployments. If a component only sees a configuration update during a deployment, it might not undergo a state change and this status would not be updated.
    */
  var lastStatusChangeTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The lifecycle state of the component.
    */
  var lifecycleState: js.UndefOr[InstalledComponentLifecycleState] = js.undefined
  
  /**
    * A detailed response about the lifecycle state of the component that explains the reason why a component has an error or is broken.
    */
  var lifecycleStateDetails: js.UndefOr[LifecycleStateDetails] = js.undefined
  
  /**
    * The status codes that indicate the reason for failure whenever the lifecycleState has an error or is in a broken state.  Greengrass nucleus v2.8.0 or later is required to get an accurate lifecycleStatusCodes response. This response can be inaccurate in earlier Greengrass nucleus versions. 
    */
  var lifecycleStatusCodes: js.UndefOr[InstalledComponentLifecycleStatusCodeList] = js.undefined
}
object InstalledComponent {
  
  inline def apply(): InstalledComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstalledComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstalledComponent] (val x: Self) extends AnyVal {
    
    inline def setComponentName(value: ComponentNameString): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setComponentVersion(value: ComponentVersionString): Self = StObject.set(x, "componentVersion", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionUndefined: Self = StObject.set(x, "componentVersion", js.undefined)
    
    inline def setIsRoot(value: IsRoot): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    inline def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    inline def setLastInstallationSource(value: NonEmptyString): Self = StObject.set(x, "lastInstallationSource", value.asInstanceOf[js.Any])
    
    inline def setLastInstallationSourceUndefined: Self = StObject.set(x, "lastInstallationSource", js.undefined)
    
    inline def setLastReportedTimestamp(value: js.Date): Self = StObject.set(x, "lastReportedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastReportedTimestampUndefined: Self = StObject.set(x, "lastReportedTimestamp", js.undefined)
    
    inline def setLastStatusChangeTimestamp(value: js.Date): Self = StObject.set(x, "lastStatusChangeTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChangeTimestampUndefined: Self = StObject.set(x, "lastStatusChangeTimestamp", js.undefined)
    
    inline def setLifecycleState(value: InstalledComponentLifecycleState): Self = StObject.set(x, "lifecycleState", value.asInstanceOf[js.Any])
    
    inline def setLifecycleStateDetails(value: LifecycleStateDetails): Self = StObject.set(x, "lifecycleStateDetails", value.asInstanceOf[js.Any])
    
    inline def setLifecycleStateDetailsUndefined: Self = StObject.set(x, "lifecycleStateDetails", js.undefined)
    
    inline def setLifecycleStateUndefined: Self = StObject.set(x, "lifecycleState", js.undefined)
    
    inline def setLifecycleStatusCodes(value: InstalledComponentLifecycleStatusCodeList): Self = StObject.set(x, "lifecycleStatusCodes", value.asInstanceOf[js.Any])
    
    inline def setLifecycleStatusCodesUndefined: Self = StObject.set(x, "lifecycleStatusCodes", js.undefined)
    
    inline def setLifecycleStatusCodesVarargs(value: InstalledComponentLifecycleStatusCode*): Self = StObject.set(x, "lifecycleStatusCodes", js.Array(value*))
  }
}
