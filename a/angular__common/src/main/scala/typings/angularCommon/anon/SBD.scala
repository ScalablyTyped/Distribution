package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBD extends StObject {
  
  var JPY: js.Array[String]
  
  var SBD: js.Array[String]
  
  var USD: js.Array[String]
}
object SBD {
  
  @scala.inline
  def apply(JPY: js.Array[String], SBD: js.Array[String], USD: js.Array[String]): SBD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SBD = SBD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBD]
  }
  
  @scala.inline
  implicit class SBDMutableBuilder[Self <: SBD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setSBD(value: js.Array[String]): Self = StObject.set(x, "SBD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSBDVarargs(value: String*): Self = StObject.set(x, "SBD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
