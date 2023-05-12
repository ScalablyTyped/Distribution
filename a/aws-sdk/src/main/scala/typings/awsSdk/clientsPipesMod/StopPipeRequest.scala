package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPipeRequest extends StObject {
  
  /**
    * The name of the pipe.
    */
  var Name: PipeName
}
object StopPipeRequest {
  
  inline def apply(Name: PipeName): StopPipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPipeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopPipeRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: PipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
