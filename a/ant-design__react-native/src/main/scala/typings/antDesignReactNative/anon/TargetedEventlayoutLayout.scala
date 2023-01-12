package typings.antDesignReactNative.anon

import typings.reactNative.mod.LayoutRectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ant-design/react-native.@ant-design/react-native/lib/carousel.TargetedEvent & {  layout :react-native.react-native.LayoutRectangle} */
trait TargetedEventlayoutLayout extends StObject {
  
  var layout: LayoutRectangle
  
  var target: Double
}
object TargetedEventlayoutLayout {
  
  inline def apply(layout: LayoutRectangle, target: Double): TargetedEventlayoutLayout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedEventlayoutLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetedEventlayoutLayout] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: LayoutRectangle): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
