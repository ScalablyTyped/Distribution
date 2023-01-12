package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowFilter extends StObject {
  
  /**
    * A wildcard for all rows.
    */
  var AllRowsWildcard: js.UndefOr[typings.awsSdk.clientsLakeformationMod.AllRowsWildcard] = js.undefined
  
  /**
    * A filter expression.
    */
  var FilterExpression: js.UndefOr[PredicateString] = js.undefined
}
object RowFilter {
  
  inline def apply(): RowFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowFilter] (val x: Self) extends AnyVal {
    
    inline def setAllRowsWildcard(value: AllRowsWildcard): Self = StObject.set(x, "AllRowsWildcard", value.asInstanceOf[js.Any])
    
    inline def setAllRowsWildcardUndefined: Self = StObject.set(x, "AllRowsWildcard", js.undefined)
    
    inline def setFilterExpression(value: PredicateString): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
    
    inline def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
  }
}
