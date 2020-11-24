package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLMSCSSKeyframesRule extends js.Object {
  
  @JSName("MSHTML.HTMLMSCSSKeyframesRule_typekey")
  var MSHTMLDotHTMLMSCSSKeyframesRule_typekey: HTMLMSCSSKeyframesRule = js.native
  
  def appendRule(bstrRule: String): Unit = js.native
  
  def cssRules(index: Double): IHTMLStyleSheetRule = js.native
  @JSName("cssRules")
  val cssRules_Original: IHTMLStyleSheetRulesCollection = js.native
  
  var cssText: String = js.native
  
  def deleteRule(bstrKey: String): Unit = js.native
  
  def findRule(bstrKey: String): IHTMLMSCSSKeyframeRule = js.native
  
  var name: String = js.native
  
  val parentRule: IHTMLCSSRule = js.native
  
  val parentStyleSheet: IHTMLStyleSheet = js.native
  
  val `type`: Double = js.native
}
