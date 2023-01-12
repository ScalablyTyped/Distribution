package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersRequest extends StObject {
  
  /**
    * The names of the parameters to delete. After deleting a parameter, wait for at least 30 seconds to create a parameter with the same name.
    */
  var Names: ParameterNameList
}
object DeleteParametersRequest {
  
  inline def apply(Names: ParameterNameList): DeleteParametersRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersRequest] (val x: Self) extends AnyVal {
    
    inline def setNames(value: ParameterNameList): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: PSParameterName*): Self = StObject.set(x, "Names", js.Array(value*))
  }
}
