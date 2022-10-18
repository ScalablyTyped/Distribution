package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExtensionAssociationsRequest extends StObject {
  
  /**
    * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
    */
  var ExtensionIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The version number for the extension defined in the association.
    */
  var ExtensionVersionNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsAppconfigMod.MaxResults] = js.undefined
  
  /**
    * A token to start the list. Use this token to get the next set of results or pass null to get the first set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAppconfigMod.NextToken] = js.undefined
  
  /**
    * The ARN of an application, configuration profile, or environment.
    */
  var ResourceIdentifier: js.UndefOr[Arn] = js.undefined
}
object ListExtensionAssociationsRequest {
  
  inline def apply(): ListExtensionAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExtensionAssociationsRequest]
  }
  
  extension [Self <: ListExtensionAssociationsRequest](x: Self) {
    
    inline def setExtensionIdentifier(value: Identifier): Self = StObject.set(x, "ExtensionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setExtensionIdentifierUndefined: Self = StObject.set(x, "ExtensionIdentifier", js.undefined)
    
    inline def setExtensionVersionNumber(value: Integer): Self = StObject.set(x, "ExtensionVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setExtensionVersionNumberUndefined: Self = StObject.set(x, "ExtensionVersionNumber", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceIdentifier(value: Arn): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifierUndefined: Self = StObject.set(x, "ResourceIdentifier", js.undefined)
  }
}
