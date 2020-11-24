package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesAppliedCollection extends js.Object {
  
  def apply(index: Double): IRulesApplied = js.native
  
  val element: IHTMLElement = js.native
  
  def item(index: Double): IRulesApplied = js.native
  
  val length: Double = js.native
  
  def property(index: Double): String = js.native
  
  val propertyCount: Double = js.native
  
  def propertyInheritedFrom(name: String): IRulesApplied = js.native
  
  def propertyInheritedTrace(name: String, index: Double): IRulesApplied = js.native
  
  def propertyInheritedTraceLength(name: String): Double = js.native
}
