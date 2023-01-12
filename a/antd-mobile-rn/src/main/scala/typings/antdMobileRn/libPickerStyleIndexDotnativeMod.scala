package typings.antdMobileRn

import typings.antdMobileRn.anon.AlignItemsBorderBottomColor
import typings.antdMobileRn.anon.AlignItemsFlex
import typings.antdMobileRn.anon.ColorFontSizeTextAlign
import typings.antdMobileRn.anon.FlexFlexDirectionJustifyContent
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerStyleIndexDotnativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/picker/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/picker/style/index.native", "default.actionText")
    @js.native
    def actionText: ColorFontSizeTextAlign = js.native
    inline def actionText_=(x: ColorFontSizeTextAlign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("actionText")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/picker/style/index.native", "default.header")
    @js.native
    def header: AlignItemsBorderBottomColor = js.native
    
    @JSImport("antd-mobile-rn/lib/picker/style/index.native", "default.headerItem")
    @js.native
    def headerItem: AlignItemsFlex = js.native
    inline def headerItem_=(x: AlignItemsFlex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerItem")(x.asInstanceOf[js.Any])
    
    inline def header_=(x: AlignItemsBorderBottomColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("header")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/picker/style/index.native", "default.modal")
    @js.native
    def modal: FlexFlexDirectionJustifyContent = js.native
    inline def modal_=(x: FlexFlexDirectionJustifyContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modal")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/picker/style/index.native", "default.title")
    @js.native
    def title: ColorFontSizeTextAlign = js.native
    inline def title_=(x: ColorFontSizeTextAlign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  trait IPickerStyle extends StObject {
    
    var actionText: TextStyle
    
    var header: ViewStyle
    
    var headerItem: ViewStyle
    
    var modal: ViewStyle
    
    var title: TextStyle
  }
  object IPickerStyle {
    
    inline def apply(
      actionText: TextStyle,
      header: ViewStyle,
      headerItem: ViewStyle,
      modal: ViewStyle,
      title: TextStyle
    ): IPickerStyle = {
      val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerItem = headerItem.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPickerStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPickerStyle] (val x: Self) extends AnyVal {
      
      inline def setActionText(value: TextStyle): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: ViewStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderItem(value: ViewStyle): Self = StObject.set(x, "headerItem", value.asInstanceOf[js.Any])
      
      inline def setModal(value: ViewStyle): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: TextStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
