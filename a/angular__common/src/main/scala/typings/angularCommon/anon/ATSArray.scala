package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ATSArray extends StObject {
  
  var ATS: js.Array[String]
}
object ATSArray {
  
  inline def apply(ATS: js.Array[String]): ATSArray = {
    val __obj = js.Dynamic.literal(ATS = ATS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATSArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATSArray] (val x: Self) extends AnyVal {
    
    inline def setATS(value: js.Array[String]): Self = StObject.set(x, "ATS", value.asInstanceOf[js.Any])
    
    inline def setATSVarargs(value: String*): Self = StObject.set(x, "ATS", js.Array(value*))
  }
}
