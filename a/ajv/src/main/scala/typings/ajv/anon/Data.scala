package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  @JSName("$data")
  var $data: String
}
object Data {
  
  inline def apply($data: String): Data = {
    val __obj = js.Dynamic.literal($data = $data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def set$data(value: String): Self = StObject.set(x, "$data", value.asInstanceOf[js.Any])
  }
}
