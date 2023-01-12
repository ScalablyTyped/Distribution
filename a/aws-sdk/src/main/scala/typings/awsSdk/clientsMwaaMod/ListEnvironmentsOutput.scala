package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentsOutput extends StObject {
  
  /**
    * Returns a list of Amazon MWAA environments.
    */
  var Environments: EnvironmentList
  
  /**
    * Retrieves the next page of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsMwaaMod.NextToken] = js.undefined
}
object ListEnvironmentsOutput {
  
  inline def apply(Environments: EnvironmentList): ListEnvironmentsOutput = {
    val __obj = js.Dynamic.literal(Environments = Environments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEnvironmentsOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironments(value: EnvironmentList): Self = StObject.set(x, "Environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsVarargs(value: EnvironmentName*): Self = StObject.set(x, "Environments", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
