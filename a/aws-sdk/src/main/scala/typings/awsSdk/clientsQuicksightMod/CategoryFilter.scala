package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryFilter extends StObject {
  
  /**
    * The column that the filter is applied to.
    */
  var Column: ColumnIdentifier
  
  /**
    * The configuration for a CategoryFilter.
    */
  var Configuration: CategoryFilterConfiguration
  
  /**
    * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
    */
  var FilterId: ShortRestrictiveResourceId
}
object CategoryFilter {
  
  inline def apply(
    Column: ColumnIdentifier,
    Configuration: CategoryFilterConfiguration,
    FilterId: ShortRestrictiveResourceId
  ): CategoryFilter = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], Configuration = Configuration.asInstanceOf[js.Any], FilterId = FilterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoryFilter] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: CategoryFilterConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setFilterId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "FilterId", value.asInstanceOf[js.Any])
  }
}
