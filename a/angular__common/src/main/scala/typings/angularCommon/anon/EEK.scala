package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EEK extends StObject {
  
  var AUD: js.Array[String]
  
  var EEK: js.Array[String]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
}
object EEK {
  
  @scala.inline
  def apply(AUD: js.Array[String], EEK: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): EEK = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], EEK = EEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[EEK]
  }
  
  @scala.inline
  implicit class EEKMutableBuilder[Self <: EEK] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    @scala.inline
    def setEEK(value: js.Array[String]): Self = StObject.set(x, "EEK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEEKVarargs(value: String*): Self = StObject.set(x, "EEK", js.Array(value :_*))
    
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
