package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveRuleSummary extends StObject {
  
  /**
    * The time at which the archive rule was created.
    */
  var createdAt: js.Date
  
  /**
    * A filter used to define the archive rule.
    */
  var filter: FilterCriteriaMap
  
  /**
    * The name of the archive rule.
    */
  var ruleName: Name
  
  /**
    * The time at which the archive rule was last updated.
    */
  var updatedAt: js.Date
}
object ArchiveRuleSummary {
  
  inline def apply(createdAt: js.Date, filter: FilterCriteriaMap, ruleName: Name, updatedAt: js.Date): ArchiveRuleSummary = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveRuleSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArchiveRuleSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: FilterCriteriaMap): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: Name): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
