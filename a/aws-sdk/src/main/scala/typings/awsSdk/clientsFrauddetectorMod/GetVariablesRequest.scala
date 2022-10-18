package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVariablesRequest extends StObject {
  
  /**
    * The max size per page determined for the get variable request. 
    */
  var maxResults: js.UndefOr[VariablesMaxResults] = js.undefined
  
  /**
    * The name of the variable. 
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The next page token of the get variable request. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetVariablesRequest {
  
  inline def apply(): GetVariablesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVariablesRequest]
  }
  
  extension [Self <: GetVariablesRequest](x: Self) {
    
    inline def setMaxResults(value: VariablesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
