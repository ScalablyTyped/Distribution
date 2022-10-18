package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameterHistoryResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * A list of parameters returned by the request.
    */
  var Parameters: js.UndefOr[ParameterHistoryList] = js.undefined
}
object GetParameterHistoryResult {
  
  inline def apply(): GetParameterHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParameterHistoryResult]
  }
  
  extension [Self <: GetParameterHistoryResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParameters(value: ParameterHistoryList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: ParameterHistory*): Self = StObject.set(x, "Parameters", js.Array(value*))
  }
}
