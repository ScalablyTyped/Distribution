package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotebookExecutionsOutput extends StObject {
  
  /**
    * A pagination token that a subsequent ListNotebookExecutions can use to determine the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEmrMod.Marker] = js.undefined
  
  /**
    * A list of notebook executions.
    */
  var NotebookExecutions: js.UndefOr[NotebookExecutionSummaryList] = js.undefined
}
object ListNotebookExecutionsOutput {
  
  inline def apply(): ListNotebookExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookExecutionsOutput]
  }
  
  extension [Self <: ListNotebookExecutionsOutput](x: Self) {
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setNotebookExecutions(value: NotebookExecutionSummaryList): Self = StObject.set(x, "NotebookExecutions", value.asInstanceOf[js.Any])
    
    inline def setNotebookExecutionsUndefined: Self = StObject.set(x, "NotebookExecutions", js.undefined)
    
    inline def setNotebookExecutionsVarargs(value: NotebookExecutionSummary*): Self = StObject.set(x, "NotebookExecutions", js.Array(value*))
  }
}
