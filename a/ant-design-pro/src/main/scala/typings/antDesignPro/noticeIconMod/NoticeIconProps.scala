package typings.antDesignPro.noticeIconMod

import typings.antDesignPro.anon.Dictkey
import typings.antDesignPro.noticeIconTabMod.NoticeIconData
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoticeIconProps extends js.Object {
  
  var bell: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var clearClose: js.UndefOr[Boolean] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[Dictkey] = js.native
  
  var onClear: js.UndefOr[js.Function1[/* tabName */ String, Unit]] = js.native
  
  var onItemClick: js.UndefOr[js.Function2[/* item */ NoticeIconData, /* tabProps */ this.type, Unit]] = js.native
  
  var onPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  
  var onTabChange: js.UndefOr[js.Function1[/* tabTile */ String, Unit]] = js.native
  
  var onViewMore: js.UndefOr[js.Function2[/* tabProps */ this.type, /* e */ MouseEvent, Unit]] = js.native
  
  var popupVisible: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object NoticeIconProps {
  
  @scala.inline
  def apply(): NoticeIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoticeIconProps]
  }
  
  @scala.inline
  implicit class NoticeIconPropsOps[Self <: NoticeIconProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBell(value: ReactNode): Self = this.set("bell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBell: Self = this.set("bell", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClearClose(value: Boolean): Self = this.set("clearClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearClose: Self = this.set("clearClose", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setLocale(value: Dictkey): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setOnClear(value: /* tabName */ String => Unit): Self = this.set("onClear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    
    @scala.inline
    def setOnItemClick(value: (/* item */ NoticeIconData, NoticeIconProps) => Unit): Self = this.set("onItemClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    
    @scala.inline
    def setOnPopupVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onPopupVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPopupVisibleChange: Self = this.set("onPopupVisibleChange", js.undefined)
    
    @scala.inline
    def setOnTabChange(value: /* tabTile */ String => Unit): Self = this.set("onTabChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTabChange: Self = this.set("onTabChange", js.undefined)
    
    @scala.inline
    def setOnViewMore(value: (NoticeIconProps, /* e */ MouseEvent) => Unit): Self = this.set("onViewMore", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnViewMore: Self = this.set("onViewMore", js.undefined)
    
    @scala.inline
    def setPopupVisible(value: Boolean): Self = this.set("popupVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupVisible: Self = this.set("popupVisible", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
