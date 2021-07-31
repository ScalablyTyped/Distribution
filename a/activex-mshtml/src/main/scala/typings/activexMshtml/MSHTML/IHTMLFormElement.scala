package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait IHTMLFormElement extends StObject {
  
  def apply(): js.Any = js.native
  def apply(name: js.Any): js.Any = js.native
  def apply(name: js.Any, index: js.Any): js.Any = js.native
  def apply(name: Unit, index: js.Any): js.Any = js.native
  
  var action: String = js.native
  
  var dir: String = js.native
  
  val elements: js.Any = js.native
  
  var encoding: String = js.native
  
  def item(): js.Any = js.native
  def item(name: js.Any): js.Any = js.native
  def item(name: js.Any, index: js.Any): js.Any = js.native
  def item(name: Unit, index: js.Any): js.Any = js.native
  
  var length: Double = js.native
  
  var method: String = js.native
  
  var name: String = js.native
  
  var onreset: js.Any = js.native
  
  var onsubmit: js.Any = js.native
  
  def reset(): Unit = js.native
  
  def submit(): Unit = js.native
  
  def tags(tagName: js.Any): js.Any = js.native
  
  var target: String = js.native
}
