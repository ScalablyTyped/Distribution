package typings.anchorJs.mod.anchorjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anchor extends js.Object {
  var options: AnchorOptions = js.native
  def add(): Anchor = js.native
  def add(selector: String): Anchor = js.native
  def remove(): Anchor = js.native
  def remove(selector: String): Anchor = js.native
  def removeAll(): Unit = js.native
}

