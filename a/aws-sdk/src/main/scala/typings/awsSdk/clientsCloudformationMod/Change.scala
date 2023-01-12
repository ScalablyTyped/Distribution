package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  /**
    * Is either null, if no hooks invoke for the resource, or contains the number of hooks that will invoke for the resource.
    */
  var HookInvocationCount: js.UndefOr[typings.awsSdk.clientsCloudformationMod.HookInvocationCount] = js.undefined
  
  /**
    * A ResourceChange structure that describes the resource and action that CloudFormation will perform.
    */
  var ResourceChange: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ResourceChange] = js.undefined
  
  /**
    * The type of entity that CloudFormation changes. Currently, the only entity type is Resource.
    */
  var Type: js.UndefOr[ChangeType] = js.undefined
}
object Change {
  
  inline def apply(): Change = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    inline def setHookInvocationCount(value: HookInvocationCount): Self = StObject.set(x, "HookInvocationCount", value.asInstanceOf[js.Any])
    
    inline def setHookInvocationCountUndefined: Self = StObject.set(x, "HookInvocationCount", js.undefined)
    
    inline def setResourceChange(value: ResourceChange): Self = StObject.set(x, "ResourceChange", value.asInstanceOf[js.Any])
    
    inline def setResourceChangeUndefined: Self = StObject.set(x, "ResourceChange", js.undefined)
    
    inline def setType(value: ChangeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
