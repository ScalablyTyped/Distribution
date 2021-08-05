package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedIndex extends StObject {
  
  var selectedIndex: Double
}
object SelectedIndex {
  
  inline def apply(selectedIndex: Double): SelectedIndex = {
    val __obj = js.Dynamic.literal(selectedIndex = selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedIndex]
  }
  
  extension [Self <: SelectedIndex](x: Self) {
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
  }
}
