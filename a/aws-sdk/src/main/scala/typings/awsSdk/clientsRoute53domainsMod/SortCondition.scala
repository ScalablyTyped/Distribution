package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCondition extends StObject {
  
  /**
    * Field to be used for sorting the list of domains. It can be either the name or the expiration for a domain. Note that if filterCondition is used in the same ListDomains call, the field used for sorting has to be the same as the field used for filtering.
    */
  var Name: ListDomainsAttributeName
  
  /**
    * The sort order for a list of domains. Either ascending (ASC) or descending (DES).
    */
  var SortOrder: typings.awsSdk.clientsRoute53domainsMod.SortOrder
}
object SortCondition {
  
  inline def apply(Name: ListDomainsAttributeName, SortOrder: SortOrder): SortCondition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SortOrder = SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortCondition] (val x: Self) extends AnyVal {
    
    inline def setName(value: ListDomainsAttributeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
  }
}
