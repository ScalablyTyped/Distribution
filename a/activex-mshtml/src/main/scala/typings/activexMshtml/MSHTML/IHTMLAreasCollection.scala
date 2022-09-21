package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait IHTMLAreasCollection extends StObject {
  
  def apply(): Any = js.native
  def apply(name: Any): Any = js.native
  def apply(name: Any, index: Any): Any = js.native
  def apply(name: Unit, index: Any): Any = js.native
  
  def add(element: IHTMLElement): Unit = js.native
  def add(element: IHTMLElement, before: Any): Unit = js.native
  
  def item(): Any = js.native
  def item(name: Any): Any = js.native
  def item(name: Any, index: Any): Any = js.native
  def item(name: Unit, index: Any): Any = js.native
  
  var length: Double = js.native
  
  /** @param index [index=-1] */
  def remove(): Unit = js.native
  def remove(index: Double): Unit = js.native
  
  def tags(tagName: Any): Any = js.native
}
