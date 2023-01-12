package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSegmentedControlStyleMod {
  
  @JSImport("@ant-design/react-native/lib/segmented-control/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): SegmentControlStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[SegmentControlStyle]
  
  trait SegmentControlStyle extends StObject {
    
    var item: ViewStyle
    
    var itemLeftRadius: ViewStyle
    
    var itemRightRadius: ViewStyle
    
    var itemText: TextStyle
    
    var segment: ViewStyle
  }
  object SegmentControlStyle {
    
    inline def apply(
      item: ViewStyle,
      itemLeftRadius: ViewStyle,
      itemRightRadius: ViewStyle,
      itemText: TextStyle,
      segment: ViewStyle
    ): SegmentControlStyle = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemLeftRadius = itemLeftRadius.asInstanceOf[js.Any], itemRightRadius = itemRightRadius.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentControlStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SegmentControlStyle] (val x: Self) extends AnyVal {
      
      inline def setItem(value: ViewStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemLeftRadius(value: ViewStyle): Self = StObject.set(x, "itemLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setItemRightRadius(value: ViewStyle): Self = StObject.set(x, "itemRightRadius", value.asInstanceOf[js.Any])
      
      inline def setItemText(value: TextStyle): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
      
      inline def setSegment(value: ViewStyle): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    }
  }
}
