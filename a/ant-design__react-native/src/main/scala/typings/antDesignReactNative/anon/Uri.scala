package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uri extends StObject {
  
  var uri: Any
}
object Uri {
  
  inline def apply(uri: Any): Uri = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Uri] (val x: Self) extends AnyVal {
    
    inline def setUri(value: Any): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
