package typings.aliApp.my

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppOptions
  extends /* key */ StringDictionary[js.Any] {
  /**
    * 全局Data
    */
  var globalData: js.UndefOr[js.Object] = js.native
  /**
    * 错误监听函数
    * 当小程序发生脚本错误或者 api 调用失败时
    * 会触发 onError 并带上错误信息
    */
  var onError: js.UndefOr[js.ThisFunction1[/* this */ App, /* msg */ String, Unit]] = js.native
  /**
    * 监听小程序隐藏。
    * 当小程序从前台进入后台，会触发 onHide
    * 生命周期函数
    */
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ App, Unit]] = js.native
  /**
    * 监听小程序初始化。
    * 当小程序初始化完成时，会触发 onLaunch（全局只触发一次）
    * 生命周期函数
    */
  var onLaunch: js.UndefOr[js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]] = js.native
  /**
    * 监听小程序显示。
    * 当小程序启动，或从后台进入前台显示，会触发 onShow
    * 生命周期函数
    */
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, Unit]] = js.native
  /**
    * 小程序退出时触发
    */
  var onUnlaunch: js.UndefOr[js.ThisFunction0[/* this */ App, Unit]] = js.native
}

object AppOptions {
  @scala.inline
  def apply(): AppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppOptions]
  }
  @scala.inline
  implicit class AppOptionsOps[Self <: AppOptions] (val x: Self) extends AnyVal {
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

