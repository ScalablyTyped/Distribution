package typings.athenajs.athenajsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Dom")
@js.native
object Dom extends js.Object {
  def apply(): _Dom[HTMLElement] = js.native
  def apply(sel: String): _Dom[HTMLElement] = js.native
  def apply(sel: HTMLElement): _Dom[HTMLElement] = js.native
}

