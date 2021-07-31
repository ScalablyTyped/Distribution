package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KESTHB extends StObject {
  
  var CDF: js.Array[String]
  
  var JPY: js.Array[String]
  
  var KES: js.Array[String]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
  
  var TZS: js.Array[String]
  
  var USD: js.Array[String]
}
object KESTHB {
  
  @scala.inline
  def apply(
    CDF: js.Array[String],
    JPY: js.Array[String],
    KES: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    TZS: js.Array[String],
    USD: js.Array[String]
  ): KESTHB = {
    val __obj = js.Dynamic.literal(CDF = CDF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], TZS = TZS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KESTHB]
  }
  
  @scala.inline
  implicit class KESTHBMutableBuilder[Self <: KESTHB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCDF(value: js.Array[String]): Self = StObject.set(x, "CDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCDFVarargs(value: String*): Self = StObject.set(x, "CDF", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setKES(value: js.Array[String]): Self = StObject.set(x, "KES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKESVarargs(value: String*): Self = StObject.set(x, "KES", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
    
    @scala.inline
    def setTZS(value: js.Array[String]): Self = StObject.set(x, "TZS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTZSVarargs(value: String*): Self = StObject.set(x, "TZS", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
