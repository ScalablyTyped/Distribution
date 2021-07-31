package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FKP extends StObject {
  
  var FKP: js.Array[String]
  
  var GBP: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object FKP {
  
  @scala.inline
  def apply(FKP: js.Array[String], GBP: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): FKP = {
    val __obj = js.Dynamic.literal(FKP = FKP.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[FKP]
  }
  
  @scala.inline
  implicit class FKPMutableBuilder[Self <: FKP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFKP(value: js.Array[String]): Self = StObject.set(x, "FKP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFKPVarargs(value: String*): Self = StObject.set(x, "FKP", js.Array(value :_*))
    
    @scala.inline
    def setGBP(value: js.Array[String]): Self = StObject.set(x, "GBP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGBPVarargs(value: String*): Self = StObject.set(x, "GBP", js.Array(value :_*))
    
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
