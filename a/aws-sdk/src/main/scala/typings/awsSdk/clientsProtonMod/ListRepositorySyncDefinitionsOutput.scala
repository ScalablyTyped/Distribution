package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepositorySyncDefinitionsOutput extends StObject {
  
  /**
    * A token that indicates the location of the next repository sync definition in the array of repository sync definitions, after the current requested list of repository sync definitions.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
  
  /**
    * An array of repository sync definitions.
    */
  var syncDefinitions: RepositorySyncDefinitionList
}
object ListRepositorySyncDefinitionsOutput {
  
  inline def apply(syncDefinitions: RepositorySyncDefinitionList): ListRepositorySyncDefinitionsOutput = {
    val __obj = js.Dynamic.literal(syncDefinitions = syncDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositorySyncDefinitionsOutput]
  }
  
  extension [Self <: ListRepositorySyncDefinitionsOutput](x: Self) {
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSyncDefinitions(value: RepositorySyncDefinitionList): Self = StObject.set(x, "syncDefinitions", value.asInstanceOf[js.Any])
    
    inline def setSyncDefinitionsVarargs(value: RepositorySyncDefinition*): Self = StObject.set(x, "syncDefinitions", js.Array(value*))
  }
}
