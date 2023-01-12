package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersByPathRequest extends StObject {
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[GetParametersByPathMaxResults] = js.undefined
  
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * Filters to limit the request results.  The following Key values are supported for GetParametersByPath: Type, KeyId, and Label. The following Key values aren't supported for GetParametersByPath: tag, DataType, Name, Path, and Tier. 
    */
  var ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined
  
  /**
    * The hierarchy for the parameter. Hierarchies start with a forward slash (/). The hierarchy is the parameter name except the last part of the parameter. For the API call to succeed, the last part of the parameter name can't be in the path. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy: /Finance/Prod/IAD/WinServ2016/license33  
    */
  var Path: PSParameterName
  
  /**
    * Retrieve all parameters within a hierarchy.  If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path /a, then the user can also access /a/b. Even if a user has explicitly been denied access in IAM for parameter /a/b, they can still call the GetParametersByPath API operation recursively for /a and view /a/b. 
    */
  var Recursive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Retrieve all parameters in a hierarchy with their value decrypted.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.undefined
}
object GetParametersByPathRequest {
  
  inline def apply(Path: PSParameterName): GetParametersByPathRequest = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersByPathRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersByPathRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: GetParametersByPathMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParameterFilters(value: ParameterStringFilterList): Self = StObject.set(x, "ParameterFilters", value.asInstanceOf[js.Any])
    
    inline def setParameterFiltersUndefined: Self = StObject.set(x, "ParameterFilters", js.undefined)
    
    inline def setParameterFiltersVarargs(value: ParameterStringFilter*): Self = StObject.set(x, "ParameterFilters", js.Array(value*))
    
    inline def setPath(value: PSParameterName): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "Recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "Recursive", js.undefined)
    
    inline def setWithDecryption(value: Boolean): Self = StObject.set(x, "WithDecryption", value.asInstanceOf[js.Any])
    
    inline def setWithDecryptionUndefined: Self = StObject.set(x, "WithDecryption", js.undefined)
  }
}
