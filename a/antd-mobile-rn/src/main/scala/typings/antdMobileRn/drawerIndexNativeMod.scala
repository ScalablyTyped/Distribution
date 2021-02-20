package typings.antdMobileRn

import typings.antdMobileRn.anon.DrawerWidth
import typings.antdMobileRn.drawerPropsTypeMod.DrawerProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/drawer/index.native", JSImport.Default)
  @js.native
  class default () extends Drawer
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/drawer/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/drawer/index.native", "default.defaultProps")
    @js.native
    def defaultProps: DrawerWidth = js.native
    @scala.inline
    def defaultProps_=(x: DrawerWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Drawer
    extends Component[DrawerNativeProps, js.Any, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MDrawer(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MDrawer(nextProps: DrawerNativeProps): Unit = js.native
    
    var drawer: typings.reactNativeDrawerLayout.mod.default | Null = js.native
    
    def onOpenChange(isOpen: Boolean): Unit = js.native
  }
  
  @js.native
  trait DrawerNativeProps extends DrawerProps {
    
    var drawerBackgroundColor: js.UndefOr[String] = js.native
    
    var drawerRef: js.UndefOr[js.Function1[/* el */ typings.reactNativeDrawerLayout.mod.default | Null, Unit]] = js.native
    
    var drawerWidth: js.UndefOr[Double] = js.native
  }
  object DrawerNativeProps {
    
    @scala.inline
    def apply(): DrawerNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerNativeProps]
    }
    
    @scala.inline
    implicit class DrawerNativePropsMutableBuilder[Self <: DrawerNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawerBackgroundColor(value: String): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
      
      @scala.inline
      def setDrawerRef(value: /* el */ typings.reactNativeDrawerLayout.mod.default | Null => Unit): Self = StObject.set(x, "drawerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawerRefUndefined: Self = StObject.set(x, "drawerRef", js.undefined)
      
      @scala.inline
      def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerWidthUndefined: Self = StObject.set(x, "drawerWidth", js.undefined)
    }
  }
}
