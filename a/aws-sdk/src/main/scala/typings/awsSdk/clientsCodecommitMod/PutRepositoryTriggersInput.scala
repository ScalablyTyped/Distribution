package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRepositoryTriggersInput extends StObject {
  
  /**
    * The name of the repository where you want to create or update the trigger.
    */
  var repositoryName: RepositoryName
  
  /**
    * The JSON block of configuration information for each trigger.
    */
  var triggers: RepositoryTriggersList
}
object PutRepositoryTriggersInput {
  
  inline def apply(repositoryName: RepositoryName, triggers: RepositoryTriggersList): PutRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRepositoryTriggersInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRepositoryTriggersInput] (val x: Self) extends AnyVal {
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setTriggers(value: RepositoryTriggersList): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersVarargs(value: RepositoryTrigger*): Self = StObject.set(x, "triggers", js.Array(value*))
  }
}
