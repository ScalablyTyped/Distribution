package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStudioLifecycleConfigsResponse extends StObject {
  
  /**
    * A token for getting the next set of actions, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * A list of Lifecycle Configurations and their properties.
    */
  var StudioLifecycleConfigs: js.UndefOr[StudioLifecycleConfigsList] = js.undefined
}
object ListStudioLifecycleConfigsResponse {
  
  inline def apply(): ListStudioLifecycleConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudioLifecycleConfigsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStudioLifecycleConfigsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStudioLifecycleConfigs(value: StudioLifecycleConfigsList): Self = StObject.set(x, "StudioLifecycleConfigs", value.asInstanceOf[js.Any])
    
    inline def setStudioLifecycleConfigsUndefined: Self = StObject.set(x, "StudioLifecycleConfigs", js.undefined)
    
    inline def setStudioLifecycleConfigsVarargs(value: StudioLifecycleConfigDetails*): Self = StObject.set(x, "StudioLifecycleConfigs", js.Array(value*))
  }
}
