package typings.androiduix.global.android

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.webkit")
@js.native
object webkit extends js.Object {
  
  @js.native
  class WebView protected ()
    extends typings.androiduix.android.webkit.WebView {
    def this(context: Context) = this()
    def this(context: Context, bindElement: HTMLElement) = this()
    def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
    def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  }
  
  @js.native
  class WebViewClient ()
    extends typings.androiduix.android.webkit.WebViewClient
}
