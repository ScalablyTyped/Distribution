package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PHP extends StObject {
  
  var JPY: js.Array[String]
  
  var PHP: js.Array[String]
  
  var USD: js.Array[String]
}
object PHP {
  
  @scala.inline
  def apply(JPY: js.Array[String], PHP: js.Array[String], USD: js.Array[String]): PHP = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[PHP]
  }
  
  @scala.inline
  implicit class PHPMutableBuilder[Self <: PHP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setPHP(value: js.Array[String]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPHPVarargs(value: String*): Self = StObject.set(x, "PHP", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
