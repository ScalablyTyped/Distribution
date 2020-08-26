package typings.androiduix.android.content

import typings.androiduix.android.app.Application
import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.view.LayoutInflater
import typings.androiduix.android.view.WindowManager
import typings.androiduix.androidui.AndroidUI
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var androidUI: AndroidUI = js.native
  var mLayoutInflater: js.Any = js.native
  var mResources: js.Any = js.native
  def getApplicationContext(): Application = js.native
  def getLayoutInflater(): LayoutInflater = js.native
  def getResources(): Resources = js.native
  def getWindowManager(): WindowManager = js.native
  def obtainStyledAttributes(attrs: HTMLElement): TypedArray = js.native
  def obtainStyledAttributes(attrs: HTMLElement, defStyleAttr: Map[String, String]): TypedArray = js.native
}

