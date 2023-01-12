package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStackInstancesForProvisionedProductOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * List of stack instances.
    */
  var StackInstances: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.StackInstances] = js.undefined
}
object ListStackInstancesForProvisionedProductOutput {
  
  inline def apply(): ListStackInstancesForProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackInstancesForProvisionedProductOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStackInstancesForProvisionedProductOutput] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setStackInstances(value: StackInstances): Self = StObject.set(x, "StackInstances", value.asInstanceOf[js.Any])
    
    inline def setStackInstancesUndefined: Self = StObject.set(x, "StackInstances", js.undefined)
    
    inline def setStackInstancesVarargs(value: StackInstance*): Self = StObject.set(x, "StackInstances", js.Array(value*))
  }
}
