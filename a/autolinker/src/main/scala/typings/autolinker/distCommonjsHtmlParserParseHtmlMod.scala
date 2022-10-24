package typings.autolinker

import typings.autolinker.anon.OnCloseTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsHtmlParserParseHtmlMod {
  
  @JSImport("autolinker/dist/commonjs/htmlParser/parse-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseHtml(html: String, param1: OnCloseTag): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHtml")(html.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
