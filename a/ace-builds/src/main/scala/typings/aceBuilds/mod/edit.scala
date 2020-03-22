package typings.aceBuilds.mod

import typings.aceBuilds.PartialEditorOptions
import typings.aceBuilds.mod.Ace.Editor
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ace-builds", "edit")
@js.native
object edit extends js.Object {
  def apply(el: String): Editor = js.native
  def apply(el: String, options: PartialEditorOptions): Editor = js.native
  def apply(el: Element): Editor = js.native
  def apply(el: Element, options: PartialEditorOptions): Editor = js.native
}

