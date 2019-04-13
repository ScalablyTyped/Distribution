package typings
package autobahnLib.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autobahn", "Event")
@js.native
class Event () extends IEvent {
  def this(publication: scala.Double) = this()
  def this(publication: scala.Double, publisher: java.lang.String) = this()
  def this(publication: scala.Double, publisher: java.lang.String, topic: java.lang.String) = this()
  /* CompleteClass */
  override var publication: scala.Double = js.native
  /* CompleteClass */
  override var topic: java.lang.String = js.native
}

