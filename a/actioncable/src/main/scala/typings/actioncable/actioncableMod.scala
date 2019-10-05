package typings.actioncable

import typings.actioncable.ActionCable.Cable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actioncable", JSImport.Namespace)
@js.native
object actioncableMod extends js.Object {
  def createConsumer(): Cable = js.native
  def createConsumer(url: String): Cable = js.native
}

