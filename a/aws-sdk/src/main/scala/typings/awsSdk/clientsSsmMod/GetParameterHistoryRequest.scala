package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameterHistoryRequest extends StObject {
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxResults] = js.undefined
  
  /**
    * The name of the parameter for which you want to review history.
    */
  var Name: PSParameterName
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.undefined
}
object GetParameterHistoryRequest {
  
  inline def apply(Name: PSParameterName): GetParameterHistoryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameterHistoryRequest]
  }
  
  extension [Self <: GetParameterHistoryRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setName(value: PSParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWithDecryption(value: Boolean): Self = StObject.set(x, "WithDecryption", value.asInstanceOf[js.Any])
    
    inline def setWithDecryptionUndefined: Self = StObject.set(x, "WithDecryption", js.undefined)
  }
}
