package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PHPTHB extends StObject {
  
  var PHP: js.Array[String] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
}
object PHPTHB {
  
  @scala.inline
  def apply(PHP: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): PHPTHB = {
    val __obj = js.Dynamic.literal(PHP = PHP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[PHPTHB]
  }
  
  @scala.inline
  implicit class PHPTHBMutableBuilder[Self <: PHPTHB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPHP(value: js.Array[String]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPHPVarargs(value: String*): Self = StObject.set(x, "PHP", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
  }
}
