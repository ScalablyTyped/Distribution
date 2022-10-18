package typings.awsSdk.clientsServerlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsRequest extends StObject {
  
  /**
    * The total number of items to return.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.clientsServerlessapplicationrepositoryMod.MaxItems] = js.undefined
  
  /**
    * A token to specify where to start paginating.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListApplicationsRequest {
  
  inline def apply(): ListApplicationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsRequest]
  }
  
  extension [Self <: ListApplicationsRequest](x: Self) {
    
    inline def setMaxItems(value: MaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
