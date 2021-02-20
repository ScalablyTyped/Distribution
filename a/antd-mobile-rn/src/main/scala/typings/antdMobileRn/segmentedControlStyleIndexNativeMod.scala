package typings.antdMobileRn

import typings.antdMobileRn.anon.AlignItemsBorderLeftWidth
import typings.antdMobileRn.anon.BorderBottomLeftRadiusBorderTopLeftRadius
import typings.antdMobileRn.anon.BorderColorBorderRadius
import typings.antdMobileRn.anon.BorderTopRightRadius
import typings.antdMobileRn.anon.TextAlignString
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentedControlStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/segmented-control/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/segmented-control/style/index.native", "default.item")
    @js.native
    def item: AlignItemsBorderLeftWidth = js.native
    
    @JSImport("antd-mobile-rn/lib/segmented-control/style/index.native", "default.itemLeftRadius")
    @js.native
    def itemLeftRadius: BorderBottomLeftRadiusBorderTopLeftRadius = js.native
    @scala.inline
    def itemLeftRadius_=(x: BorderBottomLeftRadiusBorderTopLeftRadius): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemLeftRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/segmented-control/style/index.native", "default.itemRightRadius")
    @js.native
    def itemRightRadius: BorderTopRightRadius = js.native
    @scala.inline
    def itemRightRadius_=(x: BorderTopRightRadius): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemRightRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/segmented-control/style/index.native", "default.itemText")
    @js.native
    def itemText: TextAlignString = js.native
    @scala.inline
    def itemText_=(x: TextAlignString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemText")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def item_=(x: AlignItemsBorderLeftWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/segmented-control/style/index.native", "default.segment")
    @js.native
    def segment: BorderColorBorderRadius = js.native
    @scala.inline
    def segment_=(x: BorderColorBorderRadius): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("segment")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ISegmentControlStyle extends StObject {
    
    var item: ViewStyle = js.native
    
    var itemLeftRadius: ViewStyle = js.native
    
    var itemRightRadius: ViewStyle = js.native
    
    var itemText: TextStyle = js.native
    
    var segment: ViewStyle = js.native
  }
  object ISegmentControlStyle {
    
    @scala.inline
    def apply(
      item: ViewStyle,
      itemLeftRadius: ViewStyle,
      itemRightRadius: ViewStyle,
      itemText: TextStyle,
      segment: ViewStyle
    ): ISegmentControlStyle = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemLeftRadius = itemLeftRadius.asInstanceOf[js.Any], itemRightRadius = itemRightRadius.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISegmentControlStyle]
    }
    
    @scala.inline
    implicit class ISegmentControlStyleMutableBuilder[Self <: ISegmentControlStyle] (val x: Self) extends AnyVal {
      
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
