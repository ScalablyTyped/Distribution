package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportFileTaskResponse extends StObject {
  
  /**
    *  The token you use to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    *  Lists information about the files you import.
    */
  var taskInfos: js.UndefOr[ListImportFileTaskInformation] = js.undefined
}
object ListImportFileTaskResponse {
  
  inline def apply(): ListImportFileTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportFileTaskResponse]
  }
  
  extension [Self <: ListImportFileTaskResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTaskInfos(value: ListImportFileTaskInformation): Self = StObject.set(x, "taskInfos", value.asInstanceOf[js.Any])
    
    inline def setTaskInfosUndefined: Self = StObject.set(x, "taskInfos", js.undefined)
    
    inline def setTaskInfosVarargs(value: ImportFileTaskInformation*): Self = StObject.set(x, "taskInfos", js.Array(value*))
  }
}
