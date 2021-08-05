package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeIconTabMod {
  
  @JSImport("ant-design-pro/lib/NoticeIcon/NoticeIconTab", JSImport.Default)
  @js.native
  class default ()
    extends Component[NoticeIconTabProps, js.Any, js.Any]
  
  trait NoticeIconData extends StObject {
    
    var avatar: js.UndefOr[String | ReactNode] = js.undefined
    
    var datetime: js.UndefOr[ReactNode] = js.undefined
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object NoticeIconData {
    
    inline def apply(): NoticeIconData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeIconData]
    }
    
    extension [Self <: NoticeIconData](x: Self) {
      
      inline def setAvatar(value: String | ReactNode): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setDatetime(value: ReactNode): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type NoticeIconTab = Component[NoticeIconTabProps, js.Any, js.Any]
  
  trait NoticeIconTabProps extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var emptyImage: js.UndefOr[String] = js.undefined
    
    var emptyText: js.UndefOr[ReactNode] = js.undefined
    
    var list: js.UndefOr[js.Array[NoticeIconData]] = js.undefined
    
    var locale: js.Any
    
    var name: js.UndefOr[String] = js.undefined
    
    def onClear(item: js.Any): Unit
    
    def onClick(item: js.Any): Unit
    
    def onViewMore(e: js.Any): Unit
    
    var showClear: js.UndefOr[Boolean] = js.undefined
    
    var showViewMore: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object NoticeIconTabProps {
    
    inline def apply(locale: js.Any, onClear: js.Any => Unit, onClick: js.Any => Unit, onViewMore: js.Any => Unit): NoticeIconTabProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onClear = js.Any.fromFunction1(onClear), onClick = js.Any.fromFunction1(onClick), onViewMore = js.Any.fromFunction1(onViewMore))
      __obj.asInstanceOf[NoticeIconTabProps]
    }
    
    extension [Self <: NoticeIconTabProps](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setEmptyImage(value: String): Self = StObject.set(x, "emptyImage", value.asInstanceOf[js.Any])
      
      inline def setEmptyImageUndefined: Self = StObject.set(x, "emptyImage", js.undefined)
      
      inline def setEmptyText(value: ReactNode): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      inline def setList(value: js.Array[NoticeIconData]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setListVarargs(value: NoticeIconData*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      inline def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnClear(value: js.Any => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClick(value: js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnViewMore(value: js.Any => Unit): Self = StObject.set(x, "onViewMore", js.Any.fromFunction1(value))
      
      inline def setShowClear(value: Boolean): Self = StObject.set(x, "showClear", value.asInstanceOf[js.Any])
      
      inline def setShowClearUndefined: Self = StObject.set(x, "showClear", js.undefined)
      
      inline def setShowViewMore(value: Boolean): Self = StObject.set(x, "showViewMore", value.asInstanceOf[js.Any])
      
      inline def setShowViewMoreUndefined: Self = StObject.set(x, "showViewMore", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
