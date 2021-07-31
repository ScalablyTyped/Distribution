package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BZDCAD extends StObject {
  
  var BBD: js.Array[String]
  
  var BMD: js.Array[String]
  
  var BZD: js.Array[String]
  
  var CAD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var PEN: js.Array[String]
  
  var USD: js.Array[String]
}
object BZDCAD {
  
  @scala.inline
  def apply(
    BBD: js.Array[String],
    BMD: js.Array[String],
    BZD: js.Array[String],
    CAD: js.Array[String],
    JPY: js.Array[String],
    PEN: js.Array[String],
    USD: js.Array[String]
  ): BZDCAD = {
    val __obj = js.Dynamic.literal(BBD = BBD.asInstanceOf[js.Any], BMD = BMD.asInstanceOf[js.Any], BZD = BZD.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], PEN = PEN.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BZDCAD]
  }
  
  @scala.inline
  implicit class BZDCADMutableBuilder[Self <: BZDCAD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBBD(value: js.Array[String]): Self = StObject.set(x, "BBD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBBDVarargs(value: String*): Self = StObject.set(x, "BBD", js.Array(value :_*))
    
    @scala.inline
    def setBMD(value: js.Array[String]): Self = StObject.set(x, "BMD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBMDVarargs(value: String*): Self = StObject.set(x, "BMD", js.Array(value :_*))
    
    @scala.inline
    def setBZD(value: js.Array[String]): Self = StObject.set(x, "BZD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBZDVarargs(value: String*): Self = StObject.set(x, "BZD", js.Array(value :_*))
    
    @scala.inline
    def setCAD(value: js.Array[String]): Self = StObject.set(x, "CAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADVarargs(value: String*): Self = StObject.set(x, "CAD", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setPEN(value: js.Array[String]): Self = StObject.set(x, "PEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPENVarargs(value: String*): Self = StObject.set(x, "PEN", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
