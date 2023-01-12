package typings.aliApp.anon

import typings.aliApp.my.App
import typings.aliApp.my.LaunchOptions
import typings.aliApp.my.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.AppOptions & ali-app.my.App> */
trait PartialAppOptionsApp extends StObject {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var getCurrentPage: js.UndefOr[js.Function0[Page]] = js.undefined
  
  var globalData: js.UndefOr[js.Object] = js.undefined
  
  var onError: js.UndefOr[js.ThisFunction1[/* this */ App, /* msg */ String, Unit]] = js.undefined
  
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ App, Unit]] = js.undefined
  
  var onLaunch: js.UndefOr[js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]] = js.undefined
  
  var onUnlaunch: js.UndefOr[js.ThisFunction0[/* this */ App, Unit]] = js.undefined
}
object PartialAppOptionsApp {
  
  inline def apply(): PartialAppOptionsApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAppOptionsApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAppOptionsApp] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGetCurrentPage(value: () => Page): Self = StObject.set(x, "getCurrentPage", js.Any.fromFunction0(value))
    
    inline def setGetCurrentPageUndefined: Self = StObject.set(x, "getCurrentPage", js.undefined)
    
    inline def setGlobalData(value: js.Object): Self = StObject.set(x, "globalData", value.asInstanceOf[js.Any])
    
    inline def setGlobalDataUndefined: Self = StObject.set(x, "globalData", js.undefined)
    
    inline def setOnError(value: js.ThisFunction1[/* this */ App, /* msg */ String, Unit]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnHide(value: js.ThisFunction0[/* this */ App, Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnLaunch(value: js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]): Self = StObject.set(x, "onLaunch", value.asInstanceOf[js.Any])
    
    inline def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
    
    inline def setOnShow(value: js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnUnlaunch(value: js.ThisFunction0[/* this */ App, Unit]): Self = StObject.set(x, "onUnlaunch", value.asInstanceOf[js.Any])
    
    inline def setOnUnlaunchUndefined: Self = StObject.set(x, "onUnlaunch", js.undefined)
  }
}
