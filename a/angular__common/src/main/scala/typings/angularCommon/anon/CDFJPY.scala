package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CDFJPY extends StObject {
  
  var CDF: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object CDFJPY {
  
  @scala.inline
  def apply(CDF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): CDFJPY = {
    val __obj = js.Dynamic.literal(CDF = CDF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDFJPY]
  }
  
  @scala.inline
  implicit class CDFJPYMutableBuilder[Self <: CDFJPY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCDF(value: js.Array[String]): Self = StObject.set(x, "CDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCDFVarargs(value: String*): Self = StObject.set(x, "CDF", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
