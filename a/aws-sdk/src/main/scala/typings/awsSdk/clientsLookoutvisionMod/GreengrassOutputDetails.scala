package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreengrassOutputDetails extends StObject {
  
  /**
    *  The name of the component. 
    */
  var ComponentName: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ComponentName] = js.undefined
  
  /**
    *  The version of the component. 
    */
  var ComponentVersion: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ComponentVersion] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the component. 
    */
  var ComponentVersionArn: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ComponentVersionArn] = js.undefined
}
object GreengrassOutputDetails {
  
  inline def apply(): GreengrassOutputDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GreengrassOutputDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GreengrassOutputDetails] (val x: Self) extends AnyVal {
    
    inline def setComponentName(value: ComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "ComponentName", js.undefined)
    
    inline def setComponentVersion(value: ComponentVersion): Self = StObject.set(x, "ComponentVersion", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionArn(value: ComponentVersionArn): Self = StObject.set(x, "ComponentVersionArn", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionArnUndefined: Self = StObject.set(x, "ComponentVersionArn", js.undefined)
    
    inline def setComponentVersionUndefined: Self = StObject.set(x, "ComponentVersion", js.undefined)
  }
}
