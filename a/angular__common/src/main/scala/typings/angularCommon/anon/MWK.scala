package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MWK extends StObject {
  
  var JPY: js.Array[String]
  
  var MWK: js.Array[String]
  
  var USD: js.Array[String]
}
object MWK {
  
  @scala.inline
  def apply(JPY: js.Array[String], MWK: js.Array[String], USD: js.Array[String]): MWK = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MWK = MWK.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MWK]
  }
  
  @scala.inline
  implicit class MWKMutableBuilder[Self <: MWK] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setMWK(value: js.Array[String]): Self = StObject.set(x, "MWK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMWKVarargs(value: String*): Self = StObject.set(x, "MWK", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
