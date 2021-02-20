package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeIconTabMod {
  
  @JSImport("ant-design-pro/lib/NoticeIcon/NoticeIconTab", JSImport.Default)
  @js.native
  class default ()
    extends Component[NoticeIconTabProps, js.Any, js.Any]
  
  @js.native
  trait NoticeIconData extends StObject {
    
    var avatar: js.UndefOr[String | ReactNode] = js.native
    
    var datetime: js.UndefOr[ReactNode] = js.native
    
    var description: js.UndefOr[ReactNode] = js.native
    
    var extra: js.UndefOr[ReactNode] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
  }
  object NoticeIconData {
    
    @scala.inline
    def apply(): NoticeIconData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeIconData]
    }
    
    @scala.inline
    implicit class NoticeIconDataMutableBuilder[Self <: NoticeIconData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar(value: String | ReactNode): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setDatetime(value: ReactNode): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type NoticeIconTab = Component[NoticeIconTabProps, js.Any, js.Any]
  
  @js.native
  trait NoticeIconTabProps extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    var data: js.UndefOr[js.Array[_]] = js.native
    
    var emptyImage: js.UndefOr[String] = js.native
    
    var emptyText: js.UndefOr[ReactNode] = js.native
    
    var list: js.UndefOr[js.Array[NoticeIconData]] = js.native
    
    var locale: js.Any = js.native
    
    var name: js.UndefOr[String] = js.native
    
    def onClear(item: js.Any): Unit = js.native
    
    def onClick(item: js.Any): Unit = js.native
    
    def onViewMore(e: js.Any): Unit = js.native
    
    var showClear: js.UndefOr[Boolean] = js.native
    
    var showViewMore: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object NoticeIconTabProps {
    
    @scala.inline
    def apply(locale: js.Any, onClear: js.Any => Unit, onClick: js.Any => Unit, onViewMore: js.Any => Unit): NoticeIconTabProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onClear = js.Any.fromFunction1(onClear), onClick = js.Any.fromFunction1(onClick), onViewMore = js.Any.fromFunction1(onViewMore))
      __obj.asInstanceOf[NoticeIconTabProps]
    }
    
    @scala.inline
    implicit class NoticeIconTabPropsMutableBuilder[Self <: NoticeIconTabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setEmptyImage(value: String): Self = StObject.set(x, "emptyImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyImageUndefined: Self = StObject.set(x, "emptyImage", js.undefined)
      
      @scala.inline
      def setEmptyText(value: ReactNode): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      @scala.inline
      def setList(value: js.Array[NoticeIconData]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setListVarargs(value: NoticeIconData*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnClear(value: js.Any => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClick(value: js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnViewMore(value: js.Any => Unit): Self = StObject.set(x, "onViewMore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowClear(value: Boolean): Self = StObject.set(x, "showClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowClearUndefined: Self = StObject.set(x, "showClear", js.undefined)
      
      @scala.inline
      def setShowViewMore(value: Boolean): Self = StObject.set(x, "showViewMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowViewMoreUndefined: Self = StObject.set(x, "showViewMore", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
