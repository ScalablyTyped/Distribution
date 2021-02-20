package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait IHTMLAreasCollection extends StObject {
  
  def apply(): js.Any = js.native
  def apply(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def apply(name: js.Any): js.Any = js.native
  def apply(name: js.Any, index: js.Any): js.Any = js.native
  
  def add(element: IHTMLElement): Unit = js.native
  def add(element: IHTMLElement, before: js.Any): Unit = js.native
  
  def item(): js.Any = js.native
  def item(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def item(name: js.Any): js.Any = js.native
  def item(name: js.Any, index: js.Any): js.Any = js.native
  
  var length: Double = js.native
  
  /** @param index [index=-1] */
  def remove(): Unit = js.native
  def remove(index: Double): Unit = js.native
  
  def tags(tagName: js.Any): js.Any = js.native
}
