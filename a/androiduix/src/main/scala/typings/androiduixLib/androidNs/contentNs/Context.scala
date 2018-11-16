package typings
package androiduixLib.androidNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.content.Context")
@js.native
abstract class Context protected () extends js.Object {
  def this(androidUI: androiduixLib.androiduiNs.AndroidUI) = this()
  var androidUI: androiduixLib.androiduiNs.AndroidUI = js.native
  var mLayoutInflater: js.Any = js.native
  var mResources: js.Any = js.native
  def getApplicationContext(): androiduixLib.androidNs.appNs.Application = js.native
  def getLayoutInflater(): androiduixLib.androidNs.viewNs.LayoutInflater = js.native
  def getResources(): androiduixLib.androidNs.contentNs.resNs.Resources = js.native
  def getWindowManager(): androiduixLib.androidNs.viewNs.WindowManager = js.native
  def obtainStyledAttributes(attrs: stdLib.HTMLElement): androiduixLib.androidNs.contentNs.resNs.TypedArray = js.native
  def obtainStyledAttributes(attrs: stdLib.HTMLElement, defStyleAttr: stdLib.Map[java.lang.String, java.lang.String]): androiduixLib.androidNs.contentNs.resNs.TypedArray = js.native
}

