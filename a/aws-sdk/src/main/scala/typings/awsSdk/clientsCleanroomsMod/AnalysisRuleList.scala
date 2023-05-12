package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisRuleList extends StObject {
  
  /**
    * Columns that can be used to join a configured table with the table of the member who can query and another members' configured tables.
    */
  var joinColumns: AnalysisRuleListJoinColumnsList
  
  /**
    * Columns that can be listed in the output.
    */
  var listColumns: AnalysisRuleColumnList
}
object AnalysisRuleList {
  
  inline def apply(joinColumns: AnalysisRuleListJoinColumnsList, listColumns: AnalysisRuleColumnList): AnalysisRuleList = {
    val __obj = js.Dynamic.literal(joinColumns = joinColumns.asInstanceOf[js.Any], listColumns = listColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisRuleList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisRuleList] (val x: Self) extends AnyVal {
    
    inline def setJoinColumns(value: AnalysisRuleListJoinColumnsList): Self = StObject.set(x, "joinColumns", value.asInstanceOf[js.Any])
    
    inline def setJoinColumnsVarargs(value: AnalysisRuleColumnName*): Self = StObject.set(x, "joinColumns", js.Array(value*))
    
    inline def setListColumns(value: AnalysisRuleColumnList): Self = StObject.set(x, "listColumns", value.asInstanceOf[js.Any])
    
    inline def setListColumnsVarargs(value: AnalysisRuleColumnName*): Self = StObject.set(x, "listColumns", js.Array(value*))
  }
}
