package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePipeRequest extends StObject {
  
  /**
    * The name of the pipe.
    */
  var Name: PipeName
}
object DeletePipeRequest {
  
  inline def apply(Name: PipeName): DeletePipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePipeRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: PipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
