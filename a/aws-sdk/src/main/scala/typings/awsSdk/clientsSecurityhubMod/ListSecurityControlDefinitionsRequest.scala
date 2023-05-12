package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityControlDefinitionsRequest extends StObject {
  
  /**
    *  An optional parameter that limits the total results of the API response to the specified number. If this parameter isn't provided in the request, the results include the first 25 security controls that apply to the specified standard. The results also include a NextToken parameter that you can use in a subsequent API call to get the next 25 controls. This repeats until all controls for the standard are returned. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.MaxResults] = js.undefined
  
  /**
    *  Optional pagination parameter. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the standard that you want to view controls for. 
    */
  var StandardsArn: js.UndefOr[NonEmptyString] = js.undefined
}
object ListSecurityControlDefinitionsRequest {
  
  inline def apply(): ListSecurityControlDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityControlDefinitionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSecurityControlDefinitionsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStandardsArn(value: NonEmptyString): Self = StObject.set(x, "StandardsArn", value.asInstanceOf[js.Any])
    
    inline def setStandardsArnUndefined: Self = StObject.set(x, "StandardsArn", js.undefined)
  }
}
