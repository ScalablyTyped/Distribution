package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePipeRequest extends StObject {
  
  /**
    * The name of the pipe.
    */
  var Name: PipeName
}
object DescribePipeRequest {
  
  inline def apply(Name: PipeName): DescribePipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePipeRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: PipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
