package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationRule extends StObject {
  
  /**
    * An array of objects representing the destination for a replication rule.
    */
  var destinations: ReplicationDestinationList
  
  /**
    * An array of objects representing the filters for a replication rule. Specifying a repository filter for a replication rule provides a method for controlling which repositories in a private registry are replicated.
    */
  var repositoryFilters: js.UndefOr[RepositoryFilterList] = js.undefined
}
object ReplicationRule {
  
  inline def apply(destinations: ReplicationDestinationList): ReplicationRule = {
    val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRule]
  }
  
  extension [Self <: ReplicationRule](x: Self) {
    
    inline def setDestinations(value: ReplicationDestinationList): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsVarargs(value: ReplicationDestination*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setRepositoryFilters(value: RepositoryFilterList): Self = StObject.set(x, "repositoryFilters", value.asInstanceOf[js.Any])
    
    inline def setRepositoryFiltersUndefined: Self = StObject.set(x, "repositoryFilters", js.undefined)
    
    inline def setRepositoryFiltersVarargs(value: RepositoryFilter*): Self = StObject.set(x, "repositoryFilters", js.Array(value*))
  }
}
