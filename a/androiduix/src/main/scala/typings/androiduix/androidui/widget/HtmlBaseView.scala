package typings.androiduix.androidui.widget

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlBaseView extends View {
  
  def isHtmlTouchAble(): Boolean = js.native
  
  var mHtmlTouchAble: js.Any = js.native
  
  def setHtmlTouchAble(enable: Boolean): Unit = js.native
}
