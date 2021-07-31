package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BMDJPY extends StObject {
  
  var BMD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object BMDJPY {
  
  @scala.inline
  def apply(BMD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BMDJPY = {
    val __obj = js.Dynamic.literal(BMD = BMD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BMDJPY]
  }
  
  @scala.inline
  implicit class BMDJPYMutableBuilder[Self <: BMDJPY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBMD(value: js.Array[String]): Self = StObject.set(x, "BMD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBMDVarargs(value: String*): Self = StObject.set(x, "BMD", js.Array(value :_*))
    
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
