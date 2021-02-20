package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentedControlStyleMod {
  
  @JSImport("@ant-design/react-native/lib/segmented-control/style", JSImport.Default)
  @js.native
  def default(theme: Theme): SegmentControlStyle = js.native
  
  @js.native
  trait SegmentControlStyle extends StObject {
    
    var item: ViewStyle = js.native
    
    var itemLeftRadius: ViewStyle = js.native
    
    var itemRightRadius: ViewStyle = js.native
    
    var itemText: TextStyle = js.native
    
    var segment: ViewStyle = js.native
  }
  object SegmentControlStyle {
    
    @scala.inline
    def apply(
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
    implicit class SegmentControlStyleMutableBuilder[Self <: SegmentControlStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: ViewStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLeftRadius(value: ViewStyle): Self = StObject.set(x, "itemLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRightRadius(value: ViewStyle): Self = StObject.set(x, "itemRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemText(value: TextStyle): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegment(value: ViewStyle): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    }
  }
}
