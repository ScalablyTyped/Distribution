package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryFilter extends StObject {
  
  /**
    * The repository filter details. When the PREFIX_MATCH filter type is specified, this value is required and should be the repository name prefix to configure replication for.
    */
  var filter: RepositoryFilterValue
  
  /**
    * The repository filter type. The only supported value is PREFIX_MATCH, which is a repository name prefix specified with the filter parameter.
    */
  var filterType: RepositoryFilterType
}
object RepositoryFilter {
  
  inline def apply(filter: RepositoryFilterValue, filterType: RepositoryFilterType): RepositoryFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryFilter] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: RepositoryFilterValue): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterType(value: RepositoryFilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
  }
}
