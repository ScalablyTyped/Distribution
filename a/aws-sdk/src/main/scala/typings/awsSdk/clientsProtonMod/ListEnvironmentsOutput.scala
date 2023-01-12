package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentsOutput extends StObject {
  
  /**
    * An array of environment detail data summaries.
    */
  var environments: EnvironmentSummaryList
  
  /**
    * A token that indicates the location of the next environment in the array of environments, after the current requested list of environments.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListEnvironmentsOutput {
  
  inline def apply(environments: EnvironmentSummaryList): ListEnvironmentsOutput = {
    val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEnvironmentsOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironments(value: EnvironmentSummaryList): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsVarargs(value: EnvironmentSummary*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
