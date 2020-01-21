package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autobahn", "Event")
@js.native
class Event () extends IEvent {
  def this(publication: Double) = this()
  def this(publication: Double, publisher: String) = this()
  def this(publication: Double, publisher: String, topic: String) = this()
  /* CompleteClass */
  override var publication: Double = js.native
  /* CompleteClass */
  override var topic: String = js.native
}

