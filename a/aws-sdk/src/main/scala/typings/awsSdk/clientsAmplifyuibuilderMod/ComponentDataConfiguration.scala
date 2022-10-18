package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDataConfiguration extends StObject {
  
  /**
    * A list of IDs to use to bind data to a component. Use this property to bind specifically chosen data, rather than data retrieved from a query.
    */
  var identifiers: js.UndefOr[IdentifierList] = js.undefined
  
  /**
    * The name of the data model to use to bind data to a component.
    */
  var model: String
  
  /**
    * Represents the conditional logic to use when binding data to a component. Use this property to retrieve only a subset of the data in a collection.
    */
  var predicate: js.UndefOr[Predicate] = js.undefined
  
  /**
    * Describes how to sort the component's properties.
    */
  var sort: js.UndefOr[SortPropertyList] = js.undefined
}
object ComponentDataConfiguration {
  
  inline def apply(model: String): ComponentDataConfiguration = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDataConfiguration]
  }
  
  extension [Self <: ComponentDataConfiguration](x: Self) {
    
    inline def setIdentifiers(value: IdentifierList): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
    
    inline def setIdentifiersVarargs(value: String*): Self = StObject.set(x, "identifiers", js.Array(value*))
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: Predicate): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    
    inline def setSort(value: SortPropertyList): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortProperty*): Self = StObject.set(x, "sort", js.Array(value*))
  }
}
