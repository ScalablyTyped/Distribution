package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusteringKey extends StObject {
  
  /**
    * The name(s) of the clustering column(s).
    */
  var name: GenericString
  
  /**
    * Sets the ascendant (ASC) or descendant (DESC) order modifier.
    */
  var orderBy: SortOrder
}
object ClusteringKey {
  
  inline def apply(name: GenericString, orderBy: SortOrder): ClusteringKey = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusteringKey]
  }
  
  extension [Self <: ClusteringKey](x: Self) {
    
    inline def setName(value: GenericString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrderBy(value: SortOrder): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
  }
}
