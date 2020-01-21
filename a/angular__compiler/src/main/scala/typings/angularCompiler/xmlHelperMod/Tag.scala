package typings.angularCompiler.xmlHelperMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/serializers/xml_helper", "Tag")
@js.native
class Tag protected () extends Node {
  def this(name: String) = this()
  def this(name: String, unescapedAttrs: StringDictionary[String]) = this()
  def this(name: String, unescapedAttrs: StringDictionary[String], children: js.Array[Node]) = this()
  var attrs: StringDictionary[String] = js.native
  var children: js.Array[Node] = js.native
  var name: String = js.native
  /* CompleteClass */
  override def visit(visitor: IVisitor): js.Any = js.native
}

