package typings.aliApp.anon

import typings.aliApp.my.App
import typings.aliApp.my.LaunchOptions
import typings.aliApp.my.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.AppOptions & ali-app.my.App> */
@js.native
trait PartialAppOptionsApp extends StObject {
  
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
  implicit class PartialAppOptionsAppMutableBuilder[Self <: PartialAppOptionsApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setGetCurrentPage(value: () => Page): Self = StObject.set(x, "getCurrentPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentPageUndefined: Self = StObject.set(x, "getCurrentPage", js.undefined)
    
    @scala.inline
    def setGlobalData(value: js.Object): Self = StObject.set(x, "globalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalDataUndefined: Self = StObject.set(x, "globalData", js.undefined)
    
    @scala.inline
    def setOnError(value: js.ThisFunction1[/* this */ App, /* msg */ String, Unit]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnHide(value: js.ThisFunction0[/* this */ App, Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnLaunch(value: js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]): Self = StObject.set(x, "onLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnUnlaunch(value: js.ThisFunction0[/* this */ App, Unit]): Self = StObject.set(x, "onUnlaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUnlaunchUndefined: Self = StObject.set(x, "onUnlaunch", js.undefined)
  }
}
