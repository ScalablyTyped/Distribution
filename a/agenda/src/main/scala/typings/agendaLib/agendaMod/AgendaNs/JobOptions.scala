package typings
package agendaLib.agendaMod.AgendaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JobOptions extends js.Object {
  /**
           * Maximum number of that job that can be running at once (per instance of agenda)
           */
  var concurrency: js.UndefOr[scala.Double] = js.undefined
  /**
           * Interval in ms of how long the job stays locked for (see multiple job processors for more info). A job will
           * automatically unlock if done() is called.
           */
  var lockLifetime: js.UndefOr[scala.Double] = js.undefined
  /**
           * Maximum number of that job that can be locked at once (per instance of agenda)
           */
  var lockLimit: js.UndefOr[scala.Double] = js.undefined
  /**
           * (lowest|low|normal|high|highest|number) specifies the priority of the job. Higher priority jobs will run
           * first.
           */
  var priority: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

