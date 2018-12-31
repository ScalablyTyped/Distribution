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
class namespaced () extends Agenda {
  def this(config: agendaLib.agendaMod.AgendaNs.AgendaConfiguration) = this()
  def this(config: agendaLib.agendaMod.AgendaNs.AgendaConfiguration, cb: ResultCallback[mongodbLib.mongodbMod.Collection[mongodbLib.Default]]) = this()
}

