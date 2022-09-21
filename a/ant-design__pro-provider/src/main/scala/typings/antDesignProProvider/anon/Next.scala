package typings.antDesignProProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Next extends StObject {
  
  var next: String
  
  var prev: String
  
  var submit: String
}
object Next {
  
  inline def apply(next: String, prev: String, submit: String): Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
  
  extension [Self <: Next](x: Self) {
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: String): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
  }
}
