package typings
package agendaLib.agendaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agenda", JSImport.Namespace)
@js.native
class namespaced () extends Agenda {
  /**
       * Constructs a new Agenda object.
       * @param config Optional configuration to initialize the Agenda.
       * @param cb Optional callback called with the MongoDB colleciton.
       */
  def this(config: agendaLib.agendaMod.AgendaNs.AgendaConfiguration) = this()
  /**
       * Constructs a new Agenda object.
       * @param config Optional configuration to initialize the Agenda.
       * @param cb Optional callback called with the MongoDB colleciton.
       */
  def this(config: agendaLib.agendaMod.AgendaNs.AgendaConfiguration, cb: ResultCallback[mongodbLib.mongodbMod.Collection[mongodbLib.Default]]) = this()
}

