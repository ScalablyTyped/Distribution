package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StudioLifecycleConfigDetails extends StObject {
  
  /**
    * The creation time of the Studio Lifecycle Configuration.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This value is equivalent to CreationTime because Studio Lifecycle Configurations are immutable.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The App type to which the Lifecycle Configuration is attached.
    */
  var StudioLifecycleConfigAppType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.StudioLifecycleConfigAppType] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the Lifecycle Configuration.
    */
  var StudioLifecycleConfigArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.StudioLifecycleConfigArn] = js.undefined
  
  /**
    * The name of the Studio Lifecycle Configuration.
    */
  var StudioLifecycleConfigName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.StudioLifecycleConfigName] = js.undefined
}
object StudioLifecycleConfigDetails {
  
  inline def apply(): StudioLifecycleConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StudioLifecycleConfigDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StudioLifecycleConfigDetails] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setStudioLifecycleConfigAppType(value: StudioLifecycleConfigAppType): Self = StObject.set(x, "StudioLifecycleConfigAppType", value.asInstanceOf[js.Any])
    
    inline def setStudioLifecycleConfigAppTypeUndefined: Self = StObject.set(x, "StudioLifecycleConfigAppType", js.undefined)
    
    inline def setStudioLifecycleConfigArn(value: StudioLifecycleConfigArn): Self = StObject.set(x, "StudioLifecycleConfigArn", value.asInstanceOf[js.Any])
    
    inline def setStudioLifecycleConfigArnUndefined: Self = StObject.set(x, "StudioLifecycleConfigArn", js.undefined)
    
    inline def setStudioLifecycleConfigName(value: StudioLifecycleConfigName): Self = StObject.set(x, "StudioLifecycleConfigName", value.asInstanceOf[js.Any])
    
    inline def setStudioLifecycleConfigNameUndefined: Self = StObject.set(x, "StudioLifecycleConfigName", js.undefined)
  }
}
