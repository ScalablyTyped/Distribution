package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NZDUSD extends StObject {
  
  var NZD: js.Array[String]
  
  var USD: js.Array[String]
}
object NZDUSD {
  
  @scala.inline
  def apply(NZD: js.Array[String], USD: js.Array[String]): NZDUSD = {
    val __obj = js.Dynamic.literal(NZD = NZD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NZDUSD]
  }
  
  @scala.inline
  implicit class NZDUSDMutableBuilder[Self <: NZDUSD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNZD(value: js.Array[String]): Self = StObject.set(x, "NZD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNZDVarargs(value: String*): Self = StObject.set(x, "NZD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
