package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRepositoryNameInput extends StObject {
  
  /**
    * The new name for the repository.
    */
  var newName: RepositoryName
  
  /**
    * The current name of the repository.
    */
  var oldName: RepositoryName
}
object UpdateRepositoryNameInput {
  
  inline def apply(newName: RepositoryName, oldName: RepositoryName): UpdateRepositoryNameInput = {
    val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRepositoryNameInput]
  }
  
  extension [Self <: UpdateRepositoryNameInput](x: Self) {
    
    inline def setNewName(value: RepositoryName): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    inline def setOldName(value: RepositoryName): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
  }
}
