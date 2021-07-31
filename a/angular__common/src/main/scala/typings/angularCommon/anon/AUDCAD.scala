package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AUDCAD extends StObject {
  
  var AUD: js.Array[String]
  
  var CAD: js.Array[String]
  
  var FJD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var SBD: js.Array[String]
  
  var THB: js.Array[String]
  
  var USD: js.Array[String]
  
  var XPF: js.Array[scala.Nothing]
}
object AUDCAD {
  
  @scala.inline
  def apply(
    AUD: js.Array[String],
    CAD: js.Array[String],
    FJD: js.Array[String],
    JPY: js.Array[String],
    SBD: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String],
    XPF: js.Array[scala.Nothing]
  ): AUDCAD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], FJD = FJD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SBD = SBD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XPF = XPF.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDCAD]
  }
  
  @scala.inline
  implicit class AUDCADMutableBuilder[Self <: AUDCAD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    @scala.inline
    def setCAD(value: js.Array[String]): Self = StObject.set(x, "CAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADVarargs(value: String*): Self = StObject.set(x, "CAD", js.Array(value :_*))
    
    @scala.inline
    def setFJD(value: js.Array[String]): Self = StObject.set(x, "FJD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFJDVarargs(value: String*): Self = StObject.set(x, "FJD", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setSBD(value: js.Array[String]): Self = StObject.set(x, "SBD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSBDVarargs(value: String*): Self = StObject.set(x, "SBD", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    @scala.inline
    def setXPF(value: js.Array[scala.Nothing]): Self = StObject.set(x, "XPF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPFVarargs(value: scala.Nothing*): Self = StObject.set(x, "XPF", js.Array(value :_*))
  }
}
