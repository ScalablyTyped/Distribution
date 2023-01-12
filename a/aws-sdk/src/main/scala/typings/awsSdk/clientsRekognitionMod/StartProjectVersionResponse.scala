package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartProjectVersionResponse extends StObject {
  
  /**
    * The current running status of the model. 
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.undefined
}
object StartProjectVersionResponse {
  
  inline def apply(): StartProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartProjectVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartProjectVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: ProjectVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
