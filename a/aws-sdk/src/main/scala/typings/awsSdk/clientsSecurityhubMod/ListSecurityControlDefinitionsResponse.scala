package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityControlDefinitionsResponse extends StObject {
  
  /**
    *  A pagination parameter that's included in the response only if it was included in the request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
  
  /**
    *  An array of controls that apply to the specified standard. 
    */
  var SecurityControlDefinitions: typings.awsSdk.clientsSecurityhubMod.SecurityControlDefinitions
}
object ListSecurityControlDefinitionsResponse {
  
  inline def apply(SecurityControlDefinitions: SecurityControlDefinitions): ListSecurityControlDefinitionsResponse = {
    val __obj = js.Dynamic.literal(SecurityControlDefinitions = SecurityControlDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecurityControlDefinitionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSecurityControlDefinitionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecurityControlDefinitions(value: SecurityControlDefinitions): Self = StObject.set(x, "SecurityControlDefinitions", value.asInstanceOf[js.Any])
    
    inline def setSecurityControlDefinitionsVarargs(value: SecurityControlDefinition*): Self = StObject.set(x, "SecurityControlDefinitions", js.Array(value*))
  }
}
