package typings.antDesignPro

import org.scalablytyped.runtime.Instantiable0
import typings.antDesignPro.anon.Dictkey
import typings.antDesignPro.noticeIconTabMod.NoticeIconData
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeIconMod {
  
  @JSImport("ant-design-pro/lib/NoticeIcon", JSImport.Default)
  @js.native
  class default ()
    extends Component[NoticeIconProps, js.Any, js.Any]
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/NoticeIcon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/NoticeIcon", "default.Tab")
    @js.native
    def Tab: Instantiable0[typings.antDesignPro.noticeIconTabMod.default] = js.native
    @scala.inline
    def Tab_=(x: Instantiable0[typings.antDesignPro.noticeIconTabMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
  }
  
  type NoticeIcon = Component[NoticeIconProps, js.Any, js.Any]
  
  trait NoticeIconProps extends StObject {
    
    var bell: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearClose: js.UndefOr[Boolean] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[Dictkey] = js.undefined
    
    var onClear: js.UndefOr[js.Function1[/* tabName */ String, Unit]] = js.undefined
    
    var onItemClick: js.UndefOr[js.Function2[/* item */ NoticeIconData, /* tabProps */ this.type, Unit]] = js.undefined
    
    var onPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var onTabChange: js.UndefOr[js.Function1[/* tabTile */ String, Unit]] = js.undefined
    
    var onViewMore: js.UndefOr[js.Function2[/* tabProps */ this.type, /* e */ MouseEvent, Unit]] = js.undefined
    
    var popupVisible: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object NoticeIconProps {
    
    @scala.inline
    def apply(): NoticeIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeIconProps]
    }
    
    @scala.inline
    implicit class NoticeIconPropsMutableBuilder[Self <: NoticeIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBell(value: ReactNode): Self = StObject.set(x, "bell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBellUndefined: Self = StObject.set(x, "bell", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearClose(value: Boolean): Self = StObject.set(x, "clearClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearCloseUndefined: Self = StObject.set(x, "clearClose", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setLocale(value: Dictkey): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOnClear(value: /* tabName */ String => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnItemClick(value: (/* item */ NoticeIconData, NoticeIconProps) => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOnPopupVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onPopupVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPopupVisibleChangeUndefined: Self = StObject.set(x, "onPopupVisibleChange", js.undefined)
      
      @scala.inline
      def setOnTabChange(value: /* tabTile */ String => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      @scala.inline
      def setOnViewMore(value: (NoticeIconProps, /* e */ MouseEvent) => Unit): Self = StObject.set(x, "onViewMore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnViewMoreUndefined: Self = StObject.set(x, "onViewMore", js.undefined)
      
      @scala.inline
      def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
