package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportFileTaskRequest extends StObject {
  
  /**
    *  The ID of the import file task. This ID is returned in the response of StartImportFileTask. 
    */
  var id: String
}
object GetImportFileTaskRequest {
  
  inline def apply(id: String): GetImportFileTaskRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportFileTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImportFileTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
