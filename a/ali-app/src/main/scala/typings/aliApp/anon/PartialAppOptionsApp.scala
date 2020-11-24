package typings.aliApp.anon

import typings.aliApp.my.App
import typings.aliApp.my.LaunchOptions
import typings.aliApp.my.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.AppOptions & ali-app.my.App> */
@js.native
trait PartialAppOptionsApp extends js.Object {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var getCurrentPage: js.UndefOr[js.Function0[Page]] = js.native
  
  var globalData: js.UndefOr[js.Object] = js.native
  
  var onError: js.UndefOr[js.ThisFunction1[/* this */ App, /* msg */ String, Unit]] = js.native
  
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ App, Unit]] = js.native
  
  var onLaunch: js.UndefOr[js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]] = js.native
  
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]] = js.native
  
  var onUnlaunch: js.UndefOr[js.ThisFunction0[/* this */ App, Unit]] = js.native
}
object PartialAppOptionsApp {
  
  @scala.inline
  def apply(): PartialAppOptionsApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAppOptionsApp]
  }
  
  @scala.inline
  implicit class PartialAppOptionsAppOps[Self <: PartialAppOptionsApp] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setGetCurrentPage(value: () => Page): Self = this.set("getCurrentPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCurrentPage: Self = this.set("getCurrentPage", js.undefined)
    
    @scala.inline
    def setGlobalData(value: js.Object): Self = this.set("globalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalData: Self = this.set("globalData", js.undefined)
    
    @scala.inline
    def setOnError(value: js.ThisFunction1[/* this */ App, /* msg */ String, Unit]): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnHide(value: js.ThisFunction0[/* this */ App, Unit]): Self = this.set("onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnLaunch(value: js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]): Self = this.set("onLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLaunch: Self = this.set("onLaunch", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]): Self = this.set("onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnUnlaunch(value: js.ThisFunction0[/* this */ App, Unit]): Self = this.set("onUnlaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUnlaunch: Self = this.set("onUnlaunch", js.undefined)
  }
}
