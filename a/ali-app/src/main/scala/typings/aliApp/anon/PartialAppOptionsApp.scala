package typings.aliApp.anon

import typings.aliApp.my.App
import typings.aliApp.my.LaunchOptions
import typings.aliApp.my.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.AppOptions & ali-app.my.App> */
trait PartialAppOptionsApp extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var getCurrentPage: js.UndefOr[js.Function0[Page]] = js.undefined
  var globalData: js.UndefOr[js.Object] = js.undefined
  var onError: js.UndefOr[js.ThisFunction1[/* this */ App, /* msg */ String, Unit]] = js.undefined
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ App, Unit]] = js.undefined
  var onLaunch: js.UndefOr[js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]] = js.undefined
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]] = js.undefined
  var onUnlaunch: js.UndefOr[js.ThisFunction0[/* this */ App, Unit]] = js.undefined
}

object PartialAppOptionsApp {
  @scala.inline
  def apply(
    data: js.Any = null,
    getCurrentPage: () => Page = null,
    globalData: js.Object = null,
    onError: js.ThisFunction1[/* this */ App, /* msg */ String, Unit] = null,
    onHide: js.ThisFunction0[/* this */ App, Unit] = null,
    onLaunch: js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit] = null,
    onShow: js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit] = null,
    onUnlaunch: js.ThisFunction0[/* this */ App, Unit] = null
  ): PartialAppOptionsApp = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (getCurrentPage != null) __obj.updateDynamic("getCurrentPage")(js.Any.fromFunction0(getCurrentPage))
    if (globalData != null) __obj.updateDynamic("globalData")(globalData.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(onLaunch.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (onUnlaunch != null) __obj.updateDynamic("onUnlaunch")(onUnlaunch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAppOptionsApp]
  }
}

