package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedIndex extends StObject {
  
  var selectedIndex: Double
}
object SelectedIndex {
  
  @scala.inline
  def apply(selectedIndex: Double): SelectedIndex = {
    val __obj = js.Dynamic.literal(selectedIndex = selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedIndex]
  }
  
  @scala.inline
  implicit class SelectedIndexMutableBuilder[Self <: SelectedIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
  }
}
