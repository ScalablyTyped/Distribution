package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentAccountConnectionsOutput extends StObject {
  
  /**
    * An array of environment account connections with details that's returned by Proton. 
    */
  var environmentAccountConnections: EnvironmentAccountConnectionSummaryList
  
  /**
    * A token that indicates the location of the next environment account connection in the array of environment account connections, after the current requested list of environment account connections.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListEnvironmentAccountConnectionsOutput {
  
  inline def apply(environmentAccountConnections: EnvironmentAccountConnectionSummaryList): ListEnvironmentAccountConnectionsOutput = {
    val __obj = js.Dynamic.literal(environmentAccountConnections = environmentAccountConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentAccountConnectionsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEnvironmentAccountConnectionsOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentAccountConnections(value: EnvironmentAccountConnectionSummaryList): Self = StObject.set(x, "environmentAccountConnections", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentAccountConnectionsVarargs(value: EnvironmentAccountConnectionSummary*): Self = StObject.set(x, "environmentAccountConnections", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
