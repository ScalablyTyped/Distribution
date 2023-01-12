package typings.antdMobileRn

import typings.antdMobileRn.anon.AfterClose
import typings.antdMobileRn.libTagPropsTypeMod.TagPropsType
import typings.antdMobileRn.libTagStyleIndexDotnativeMod.ITagStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.View
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTagIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/tag/index.native", JSImport.Default)
  @js.native
  open class default protected () extends Tag {
    def this(props: TagNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/tag/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/tag/index.native", "default.defaultProps")
    @js.native
    def defaultProps: AfterClose = js.native
    inline def defaultProps_=(x: AfterClose): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tag extends Component[TagNativeProps, Any, Any] {
    
    var closeDom: View | Null = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MTag(nextProps: TagNativeProps): Unit = js.native
    
    def handleLongPress(): Unit = js.native
    
    def onClick(): Unit = js.native
    
    def onPressIn(): Unit = js.native
    
    def onPressOut(): Unit = js.native
    
    def onTagClose(): Unit = js.native
  }
  
  trait TagNativeProps
    extends StObject
       with TagPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[ITagStyle] = js.undefined
  }
  object TagNativeProps {
    
    inline def apply(): TagNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagNativeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagNativeProps] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: ITagStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
