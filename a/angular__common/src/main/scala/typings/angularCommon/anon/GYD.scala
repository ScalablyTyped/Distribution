package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GYD extends StObject {
  
  var GYD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object GYD {
  
  @scala.inline
  def apply(GYD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): GYD = {
    val __obj = js.Dynamic.literal(GYD = GYD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[GYD]
  }
  
  @scala.inline
  implicit class GYDMutableBuilder[Self <: GYD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGYD(value: js.Array[String]): Self = StObject.set(x, "GYD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGYDVarargs(value: String*): Self = StObject.set(x, "GYD", js.Array(value :_*))
    
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
