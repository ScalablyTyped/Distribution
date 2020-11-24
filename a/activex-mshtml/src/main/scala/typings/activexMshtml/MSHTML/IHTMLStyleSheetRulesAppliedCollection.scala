package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait IHTMLStyleSheetRulesAppliedCollection extends js.Object {
  
  def apply(index: Double): IHTMLStyleSheetRule = js.native
  
  def item(index: Double): IHTMLStyleSheetRule = js.native
  
  val length: Double = js.native
  
  def propertyAppliedBy(name: String): IHTMLStyleSheetRule = js.native
  
  def propertyAppliedTrace(name: String, index: Double): IHTMLStyleSheetRule = js.native
  
  def propertyAppliedTraceLength(name: String): Double = js.native
}
