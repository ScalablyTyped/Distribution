package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JPYMNT extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var MNT: js.Array[String] = js.native
  
  var SEK: js.Array[js.UndefOr[String]] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
}
object JPYMNT {
  
  @scala.inline
  def apply(
    JPY: js.Array[String],
    MNT: js.Array[String],
    SEK: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): JPYMNT = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MNT = MNT.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYMNT]
  }
  
  @scala.inline
  implicit class JPYMNTMutableBuilder[Self <: JPYMNT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setMNT(value: js.Array[String]): Self = StObject.set(x, "MNT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMNTVarargs(value: String*): Self = StObject.set(x, "MNT", js.Array(value :_*))
    
    @scala.inline
    def setSEK(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "SEK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSEKVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "SEK", js.Array(value :_*))
    
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
