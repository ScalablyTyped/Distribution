package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KESSOS extends StObject {
  
  var BBD: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var KES: js.Array[String] = js.native
  
  var SOS: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object KESSOS {
  
  @scala.inline
  def apply(
    BBD: js.Array[String],
    JPY: js.Array[String],
    KES: js.Array[String],
    SOS: js.Array[String],
    USD: js.Array[String]
  ): KESSOS = {
    val __obj = js.Dynamic.literal(BBD = BBD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], SOS = SOS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KESSOS]
  }
  
  @scala.inline
  implicit class KESSOSMutableBuilder[Self <: KESSOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBBD(value: js.Array[String]): Self = StObject.set(x, "BBD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBBDVarargs(value: String*): Self = StObject.set(x, "BBD", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setKES(value: js.Array[String]): Self = StObject.set(x, "KES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKESVarargs(value: String*): Self = StObject.set(x, "KES", js.Array(value :_*))
    
    @scala.inline
    def setSOS(value: js.Array[String]): Self = StObject.set(x, "SOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSOSVarargs(value: String*): Self = StObject.set(x, "SOS", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
