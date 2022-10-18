package typings.antd

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDrawerMod {
  
  object default {
    
    inline def apply(props: DrawerProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/drawer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/drawer", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait DrawerProps
    extends StObject
       with typings.rcDrawer.esDrawerMod.DrawerProps {
    
    /**
      * @deprecated `afterVisibleChange` is deprecated which will be removed in next major version.
      *   Please use `afterOpenChange` instead.
      */
    var afterVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    /** Wrapper dom node style of header and body */
    var drawerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var footerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var headerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var size: js.UndefOr[sizeType] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * @deprecated `visible` is deprecated which will be removed in next major version. Please use
      *   `open` instead.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DrawerProps {
    
    inline def apply(): DrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerProps]
    }
    
    extension [Self <: DrawerProps](x: Self) {
      
      inline def setAfterVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "afterVisibleChange", js.Any.fromFunction1(value))
      
      inline def setAfterVisibleChangeUndefined: Self = StObject.set(x, "afterVisibleChange", js.undefined)
      
      inline def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setDrawerStyle(value: CSSProperties): Self = StObject.set(x, "drawerStyle", value.asInstanceOf[js.Any])
      
      inline def setDrawerStyleUndefined: Self = StObject.set(x, "drawerStyle", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterStyle(value: CSSProperties): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
      
      inline def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setSize(value: sizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait PushState extends StObject {
    
    var distance: String | Double
  }
  object PushState {
    
    inline def apply(distance: String | Double): PushState = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushState]
    }
    
    extension [Self <: PushState](x: Self) {
      
      inline def setDistance(value: String | Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.default
    - typings.antd.antdStrings.large
  */
  trait sizeType extends StObject
}
