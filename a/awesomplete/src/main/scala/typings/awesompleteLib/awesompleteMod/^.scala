package typings
package awesompleteLib.awesompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("awesomplete", JSImport.Namespace)
@js.native
class ^ protected () extends Awesomplete {
  def this(input: java.lang.String) = this()
  def this(input: stdLib.Element) = this()
  def this(input: stdLib.HTMLElement) = this()
  def this(input: java.lang.String, o: Options) = this()
  def this(input: stdLib.Element, o: Options) = this()
  def this(input: stdLib.HTMLElement, o: Options) = this()
}

@JSImport("awesomplete", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$")
  var $_Original: awesompleteLib.Anon_Con = js.native
  var all: js.Array[_] = js.native
  @JSName("$")
  def $(expr: java.lang.String): java.lang.String | stdLib.Element = js.native
  @JSName("$")
  def $(expr: java.lang.String, con: stdLib.ParentNode): java.lang.String | stdLib.Element = js.native
  @JSName("$")
  def $(expr: stdLib.Element): java.lang.String | stdLib.Element = js.native
  @JSName("$")
  def $(expr: stdLib.Element, con: stdLib.ParentNode): java.lang.String | stdLib.Element = js.native
  @JSName("$$")
  def $$(expr: java.lang.String): stdLib.NodeList = js.native
  @JSName("$$")
  def $$(expr: java.lang.String, con: js.Any): stdLib.NodeList = js.native
  @JSName("$$")
  def $$(expr: stdLib.ParentNode): stdLib.NodeList = js.native
  @JSName("$$")
  def $$(expr: stdLib.ParentNode, con: js.Any): stdLib.NodeList = js.native
  def DATA(item: Suggestion): Suggestion = js.native
  def FILTER_CONTAINS(text: java.lang.String, input: java.lang.String): scala.Boolean = js.native
  def FILTER_STARTSWITH(text: java.lang.String, input: java.lang.String): scala.Boolean = js.native
  def ITEM(text: java.lang.String, input: java.lang.String): stdLib.HTMLElement = js.native
  def REPLACE(text: java.lang.String): scala.Unit = js.native
  def SORT_BYLENGTH(left: js.Array[_], right: js.Array[_]): scala.Double = js.native
  def SORT_BYLENGTH(left: js.Array[_], right: scala.Double): scala.Double = js.native
  def SORT_BYLENGTH(left: scala.Double, right: js.Array[_]): scala.Double = js.native
  def SORT_BYLENGTH(left: scala.Double, right: scala.Double): scala.Double = js.native
}

