package typings.awesomplete.awesompleteMod

import typings.awesomplete.Anon_Con
import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.ParentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("awesomplete", JSImport.Namespace)
@js.native
class ^ protected () extends Awesomplete {
  def this(input: String) = this()
  def this(input: Element) = this()
  def this(input: HTMLElement) = this()
  def this(input: String, o: Options) = this()
  def this(input: Element, o: Options) = this()
  def this(input: HTMLElement, o: Options) = this()
}

@JSImport("awesomplete", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$")
  var $_Original: Anon_Con = js.native
  var all: js.Array[_] = js.native
  @JSName("$")
  def $(expr: String): String | Element = js.native
  @JSName("$")
  def $(expr: String, con: ParentNode): String | Element = js.native
  @JSName("$")
  def $(expr: Element): String | Element = js.native
  @JSName("$")
  def $(expr: Element, con: ParentNode): String | Element = js.native
  @JSName("$$")
  def $$(expr: String): NodeList = js.native
  @JSName("$$")
  def $$(expr: String, con: js.Any): NodeList = js.native
  @JSName("$$")
  def $$(expr: ParentNode): NodeList = js.native
  @JSName("$$")
  def $$(expr: ParentNode, con: js.Any): NodeList = js.native
  def DATA(item: Suggestion): Suggestion = js.native
  def FILTER_CONTAINS(text: String, input: String): Boolean = js.native
  def FILTER_STARTSWITH(text: String, input: String): Boolean = js.native
  def ITEM(text: String, input: String): HTMLElement = js.native
  def REPLACE(text: String): Unit = js.native
  def SORT_BYLENGTH(left: js.Array[_], right: js.Array[_]): Double = js.native
  def SORT_BYLENGTH(left: js.Array[_], right: Double): Double = js.native
  def SORT_BYLENGTH(left: Double, right: js.Array[_]): Double = js.native
  def SORT_BYLENGTH(left: Double, right: Double): Double = js.native
}

