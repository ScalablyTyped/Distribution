package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentDescriptionsMessage extends StObject {
  
  /**
    *  Returns an EnvironmentDescription list. 
    */
  var Environments: js.UndefOr[EnvironmentDescriptionsList] = js.undefined
  
  /**
    * In a paginated request, the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object EnvironmentDescriptionsMessage {
  
  inline def apply(): EnvironmentDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentDescriptionsMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentDescriptionsMessage] (val x: Self) extends AnyVal {
    
    inline def setEnvironments(value: EnvironmentDescriptionsList): Self = StObject.set(x, "Environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "Environments", js.undefined)
    
    inline def setEnvironmentsVarargs(value: EnvironmentDescription*): Self = StObject.set(x, "Environments", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
