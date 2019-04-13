package typings
package agendaLib.agendaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agenda", JSImport.Namespace)
@js.native
/**
  * Constructs a new Agenda object.
  * @param config Optional configuration to initialize the Agenda.
  * @param cb Optional callback called with the MongoDB colleciton.
  */
class ^ () extends Agenda {
  def this(config: AgendaConfiguration) = this()
  def this(config: AgendaConfiguration, cb: ResultCallback[mongodbLib.mongodbMod.Collection[mongodbLib.Default]]) = this()
}

