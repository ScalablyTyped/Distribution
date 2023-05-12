package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImportResponse extends StObject {
  
  /**
    * Start import response import task.
    */
  var importTask: js.UndefOr[ImportTask] = js.undefined
}
object StartImportResponse {
  
  inline def apply(): StartImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartImportResponse] (val x: Self) extends AnyVal {
    
    inline def setImportTask(value: ImportTask): Self = StObject.set(x, "importTask", value.asInstanceOf[js.Any])
    
    inline def setImportTaskUndefined: Self = StObject.set(x, "importTask", js.undefined)
  }
}
