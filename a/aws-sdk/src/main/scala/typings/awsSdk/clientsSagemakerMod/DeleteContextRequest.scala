package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContextRequest extends StObject {
  
  /**
    * The name of the context to delete.
    */
  var ContextName: ExperimentEntityName
}
object DeleteContextRequest {
  
  inline def apply(ContextName: ExperimentEntityName): DeleteContextRequest = {
    val __obj = js.Dynamic.literal(ContextName = ContextName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContextRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteContextRequest] (val x: Self) extends AnyVal {
    
    inline def setContextName(value: ExperimentEntityName): Self = StObject.set(x, "ContextName", value.asInstanceOf[js.Any])
  }
}
