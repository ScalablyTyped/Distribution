package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImportFileTaskResponse extends StObject {
  
  /**
    *  The ID for a specific import task. The ID is unique within an AWS account. 
    */
  var id: js.UndefOr[String] = js.undefined
}
object StartImportFileTaskResponse {
  
  inline def apply(): StartImportFileTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImportFileTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartImportFileTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
