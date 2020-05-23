package typings.agenda.mod

import typings.agenda.anon.Address
import typings.mongodb.mod.Db
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
  var db: js.UndefOr[Address] = js.undefined
  /**
    * Takes a number which specifies the default number of a specific job that can be running at any given moment.
    * By default it is 5.
    */
  var defaultConcurrency: js.UndefOr[Double] = js.undefined
  /**
    * Takes a number which specifies the default lock lifetime in milliseconds. By default it is 10 minutes. This
    * can be overridden by specifying the lockLifetime option to a defined job.
    */
  var defaultLockLifetime: js.UndefOr[Double] = js.undefined
  /**
    * Takes a number which specifies the default number of a specific job that can be locked at any given moment.
    * By default it is 0 for no max.
    */
  var defaultLockLimit: js.UndefOr[Double] = js.undefined
  /**
    * Takes a number which specifies the max number jobs that can be locked at any given moment. By default it is
    * 0 for no max.
    */
  var lockLimit: js.UndefOr[Double] = js.undefined
  /**
    * Takes a number which specifies the max number of jobs that can be running at any given moment. By default it
    * is 20.
    */
  var maxConcurrency: js.UndefOr[Double] = js.undefined
  /**
    * Specifies that Agenda should be initialized using and existing MongoDB connection.
    */
  var mongo: js.UndefOr[Db] = js.undefined
  /**
    * Sets the interval with which the queue is checked. A number in milliseconds or a frequency string.
    */
  var processEvery: js.UndefOr[String | Double] = js.undefined
}

object AgendaConfiguration {
  @scala.inline
  def apply(
    db: Address = null,
    defaultConcurrency: js.UndefOr[Double] = js.undefined,
    defaultLockLifetime: js.UndefOr[Double] = js.undefined,
    defaultLockLimit: js.UndefOr[Double] = js.undefined,
    lockLimit: js.UndefOr[Double] = js.undefined,
    maxConcurrency: js.UndefOr[Double] = js.undefined,
    mongo: Db = null,
    processEvery: String | Double = null
  ): AgendaConfiguration = {
    val __obj = js.Dynamic.literal()
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultConcurrency)) __obj.updateDynamic("defaultConcurrency")(defaultConcurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultLockLifetime)) __obj.updateDynamic("defaultLockLifetime")(defaultLockLifetime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultLockLimit)) __obj.updateDynamic("defaultLockLimit")(defaultLockLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockLimit)) __obj.updateDynamic("lockLimit")(lockLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConcurrency)) __obj.updateDynamic("maxConcurrency")(maxConcurrency.get.asInstanceOf[js.Any])
    if (mongo != null) __obj.updateDynamic("mongo")(mongo.asInstanceOf[js.Any])
    if (processEvery != null) __obj.updateDynamic("processEvery")(processEvery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgendaConfiguration]
  }
}

