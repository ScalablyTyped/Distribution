package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ATSArray extends StObject {
  
  var ATS: js.Array[String]
}
object ATSArray {
  
  @scala.inline
  def apply(ATS: js.Array[String]): ATSArray = {
    val __obj = js.Dynamic.literal(ATS = ATS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATSArray]
  }
  
  @scala.inline
  implicit class ATSArrayMutableBuilder[Self <: ATSArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setATS(value: js.Array[String]): Self = StObject.set(x, "ATS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setATSVarargs(value: String*): Self = StObject.set(x, "ATS", js.Array(value :_*))
  }
}
