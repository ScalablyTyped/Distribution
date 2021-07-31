package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteResult extends StObject {
  
  var count: Double
  
  var info: String
  
  var tips: js.Array[Tip]
}
object AutocompleteResult {
  
  @scala.inline
  def apply(count: Double, info: String, tips: js.Array[Tip]): AutocompleteResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteResult]
  }
  
  @scala.inline
  implicit class AutocompleteResultMutableBuilder[Self <: AutocompleteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTips(value: js.Array[Tip]): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipsVarargs(value: Tip*): Self = StObject.set(x, "tips", js.Array(value :_*))
  }
}
