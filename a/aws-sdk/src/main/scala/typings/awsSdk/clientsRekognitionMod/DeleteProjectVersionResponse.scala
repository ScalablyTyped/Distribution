package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectVersionResponse extends StObject {
  
  /**
    * The status of the deletion operation.
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.undefined
}
object DeleteProjectVersionResponse {
  
  inline def apply(): DeleteProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProjectVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteProjectVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: ProjectVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
