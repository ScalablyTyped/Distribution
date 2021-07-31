package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ATSAUD extends StObject {
  
  var ATS: js.Array[String]
  
  var AUD: js.Array[String]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
}
object ATSAUD {
  
  @scala.inline
  def apply(ATS: js.Array[String], AUD: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): ATSAUD = {
    val __obj = js.Dynamic.literal(ATS = ATS.asInstanceOf[js.Any], AUD = AUD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATSAUD]
  }
  
  @scala.inline
  implicit class ATSAUDMutableBuilder[Self <: ATSAUD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setATS(value: js.Array[String]): Self = StObject.set(x, "ATS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setATSVarargs(value: String*): Self = StObject.set(x, "ATS", js.Array(value :_*))
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
  }
}
