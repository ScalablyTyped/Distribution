package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KZT extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var KZT: js.Array[String] = js.native
  
  var RUB: js.Array[String] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
}
object KZT {
  
  @scala.inline
  def apply(
    JPY: js.Array[String],
    KZT: js.Array[String],
    RUB: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): KZT = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KZT = KZT.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KZT]
  }
  
  @scala.inline
  implicit class KZTMutableBuilder[Self <: KZT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setKZT(value: js.Array[String]): Self = StObject.set(x, "KZT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKZTVarargs(value: String*): Self = StObject.set(x, "KZT", js.Array(value :_*))
    
    @scala.inline
    def setRUB(value: js.Array[String]): Self = StObject.set(x, "RUB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUBVarargs(value: String*): Self = StObject.set(x, "RUB", js.Array(value :_*))
    
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
