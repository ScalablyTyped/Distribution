package typings.aceBuilds.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rev extends StObject {
  
  var rev: Double
  
  var value: String
}
object Rev {
  
  inline def apply(rev: Double, value: String): Rev = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rev]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rev] (val x: Self) extends AnyVal {
    
    inline def setRev(value: Double): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
