package typings
package agendaLib.agendaMod.AgendaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Agenda Configuration.
     */

trait AgendaConfiguration extends js.Object {
  /**
           * Specifies that Agenda should connect to MongoDB.
           */
  var db: js.UndefOr[agendaLib.Anon_Address] = js.undefined
  /**
           * Takes a number which specifies the default number of a specific job that can be running at any given moment.
           * By default it is 5.
           */
  var defaultConcurrency: js.UndefOr[scala.Double] = js.undefined
  /**
           * Takes a number which specifies the default lock lifetime in milliseconds. By default it is 10 minutes. This
           * can be overridden by specifying the lockLifetime option to a defined job.
           */
  var defaultLockLifetime: js.UndefOr[scala.Double] = js.undefined
  /**
           * Takes a number which specifies the default number of a specific job that can be locked at any given moment.
           * By default it is 0 for no max.
           */
  var defaultLockLimit: js.UndefOr[scala.Double] = js.undefined
  /**
           * Takes a number which specifies the max number jobs that can be locked at any given moment. By default it is
           * 0 for no max.
           */
  var lockLimit: js.UndefOr[scala.Double] = js.undefined
  /**
           * Takes a number which specifies the max number of jobs that can be running at any given moment. By default it
           * is 20.
           */
  var maxConcurrency: js.UndefOr[scala.Double] = js.undefined
  /**
           * Specifies that Agenda should be initialized using and existing MongoDB connection.
           */
  var mongo: js.UndefOr[mongodbLib.mongodbMod.Db] = js.undefined
  /**
           * Sets the interval with which the queue is checked. A number in milliseconds or a frequency string.
           */
  var processEvery: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

