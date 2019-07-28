package typings.androiduix.androidNs.contentNs

import typings.androiduix.androidNs.appNs.Application
import typings.androiduix.androidNs.contentNs.resNs.Resources
import typings.androiduix.androidNs.contentNs.resNs.TypedArray
import typings.androiduix.androidNs.viewNs.LayoutInflater
import typings.androiduix.androidNs.viewNs.WindowManager
import typings.androiduix.androiduiNs.AndroidUI
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.content.Context")
@js.native
abstract class Context protected () extends js.Object {
  def this(androidUI: AndroidUI) = this()
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

