package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SHP extends StObject {
  
  var GBP: js.Array[String]
  
  var JPY: js.Array[String]
  
  var SHP: js.Array[String]
  
  var USD: js.Array[String]
}
object SHP {
  
  @scala.inline
  def apply(GBP: js.Array[String], JPY: js.Array[String], SHP: js.Array[String], USD: js.Array[String]): SHP = {
    val __obj = js.Dynamic.literal(GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SHP = SHP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SHP]
  }
  
  @scala.inline
  implicit class SHPMutableBuilder[Self <: SHP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGBP(value: js.Array[String]): Self = StObject.set(x, "GBP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGBPVarargs(value: String*): Self = StObject.set(x, "GBP", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setSHP(value: js.Array[String]): Self = StObject.set(x, "SHP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHPVarargs(value: String*): Self = StObject.set(x, "SHP", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
