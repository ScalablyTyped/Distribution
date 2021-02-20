package typings.antdMobileRn

import typings.antdMobileRn.anon.AlignItemsBorderRadius
import typings.antdMobileRn.anon.BackgroundColorColor
import typings.antdMobileRn.anon.BorderColor
import typings.antdMobileRn.anon.BorderRadiusOverflow
import typings.antdMobileRn.anon.FlexWrap
import typings.antdMobileRn.anon.FontWeight
import typings.antdMobileRn.anon.HeightWidth
import typings.antdMobileRn.anon.JustifyContent
import typings.antdMobileRn.anon.MarginBottom
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagePickerStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/image-picker/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/image-picker/style/index.native", "default.closeText")
    @js.native
    def closeText: FontWeight = js.native
    @scala.inline
    def closeText_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeText")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/image-picker/style/index.native", "default.closeWrap")
    @js.native
    def closeWrap: JustifyContent = js.native
    @scala.inline
    def closeWrap_=(x: JustifyContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeWrap")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/image-picker/style/index.native", "default.container")
    @js.native
    def container: FlexWrap = js.native
    @scala.inline
    def container_=(x: FlexWrap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/image-picker/style/index.native", "default.image")
    @js.native
    def image: BorderRadiusOverflow = js.native
    @scala.inline
    def image_=(x: BorderRadiusOverflow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/image-picker/style/index.native", "default.item")
    @js.native
    def item: MarginBottom = js.native
    @scala.inline
    def item_=(x: MarginBottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/image-picker/style/index.native", "default.plusText")
    @js.native
    def plusText: BackgroundColorColor = js.native
    @scala.inline
    def plusText_=(x: BackgroundColorColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plusText")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/image-picker/style/index.native", "default.plusWrap")
    @js.native
    def plusWrap: AlignItemsBorderRadius = js.native
    
    @JSImport("antd-mobile-rn/lib/image-picker/style/index.native", "default.plusWrapHighlight")
    @js.native
    def plusWrapHighlight: BorderColor = js.native
    @scala.inline
    def plusWrapHighlight_=(x: BorderColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plusWrapHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/image-picker/style/index.native", "default.plusWrapNormal")
    @js.native
    def plusWrapNormal: BorderColor = js.native
    @scala.inline
    def plusWrapNormal_=(x: BorderColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plusWrapNormal")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def plusWrap_=(x: AlignItemsBorderRadius): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plusWrap")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/image-picker/style/index.native", "default.size")
    @js.native
    def size: HeightWidth = js.native
    @scala.inline
    def size_=(x: HeightWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IImagePickerStyle extends StObject {
    
    var closeText: TextStyle = js.native
    
    var closeWrap: ViewStyle = js.native
    
    var container: ViewStyle = js.native
    
    var image: ImageStyle = js.native
    
    var item: ViewStyle = js.native
    
    var plusText: TextStyle = js.native
    
    var plusWrap: ViewStyle = js.native
    
    var plusWrapHighlight: ViewStyle = js.native
    
    var plusWrapNormal: ViewStyle = js.native
    
    var size: ViewStyle = js.native
  }
  object IImagePickerStyle {
    
    @scala.inline
    def apply(
      closeText: TextStyle,
      closeWrap: ViewStyle,
      container: ViewStyle,
      image: ImageStyle,
      item: ViewStyle,
      plusText: TextStyle,
      plusWrap: ViewStyle,
      plusWrapHighlight: ViewStyle,
      plusWrapNormal: ViewStyle,
      size: ViewStyle
    ): IImagePickerStyle = {
      val __obj = js.Dynamic.literal(closeText = closeText.asInstanceOf[js.Any], closeWrap = closeWrap.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], plusText = plusText.asInstanceOf[js.Any], plusWrap = plusWrap.asInstanceOf[js.Any], plusWrapHighlight = plusWrapHighlight.asInstanceOf[js.Any], plusWrapNormal = plusWrapNormal.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IImagePickerStyle]
    }
    
    @scala.inline
    implicit class IImagePickerStyleMutableBuilder[Self <: IImagePickerStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseText(value: TextStyle): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseWrap(value: ViewStyle): Self = StObject.set(x, "closeWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: ImageStyle): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: ViewStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlusText(value: TextStyle): Self = StObject.set(x, "plusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlusWrap(value: ViewStyle): Self = StObject.set(x, "plusWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlusWrapHighlight(value: ViewStyle): Self = StObject.set(x, "plusWrapHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlusWrapNormal(value: ViewStyle): Self = StObject.set(x, "plusWrapNormal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: ViewStyle): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
