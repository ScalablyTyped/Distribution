package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CNYJPY extends StObject {
  
  var CNY: js.Array[String]
  
  var JPY: js.Array[String]
  
  var RON: js.Array[js.UndefOr[String]]
  
  var XXX: js.Array[scala.Nothing]
}
object CNYJPY {
  
  @scala.inline
  def apply(
    CNY: js.Array[String],
    JPY: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    XXX: js.Array[scala.Nothing]
  ): CNYJPY = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[CNYJPY]
  }
  
  @scala.inline
  implicit class CNYJPYMutableBuilder[Self <: CNYJPY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCNY(value: js.Array[String]): Self = StObject.set(x, "CNY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCNYVarargs(value: String*): Self = StObject.set(x, "CNY", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "RON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRONVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "RON", js.Array(value :_*))
    
    @scala.inline
    def setXXX(value: js.Array[scala.Nothing]): Self = StObject.set(x, "XXX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXXXVarargs(value: scala.Nothing*): Self = StObject.set(x, "XXX", js.Array(value :_*))
  }
}
