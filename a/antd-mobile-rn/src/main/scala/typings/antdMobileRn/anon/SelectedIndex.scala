package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedIndex extends StObject {
  
  var selectedIndex: Double = js.native
  
  var tintColor: String = js.native
}
object SelectedIndex {
  
  @scala.inline
  def apply(selectedIndex: Double, tintColor: String): SelectedIndex = {
    val __obj = js.Dynamic.literal(selectedIndex = selectedIndex.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedIndex]
  }
  
  @scala.inline
  implicit class SelectedIndexMutableBuilder[Self <: SelectedIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
  }
}
