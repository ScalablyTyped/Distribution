package typings.aceBuilds.mod

import typings.aceBuilds.mod.Ace.Document
import typings.aceBuilds.mod.Ace.SyntaxMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ace-builds", "createEditSession")
@js.native
object createEditSession extends js.Object {
  def apply(text: String, mode: SyntaxMode): typings.aceBuilds.mod.Ace.EditSession = js.native
  def apply(text: Document, mode: SyntaxMode): typings.aceBuilds.mod.Ace.EditSession = js.native
}

