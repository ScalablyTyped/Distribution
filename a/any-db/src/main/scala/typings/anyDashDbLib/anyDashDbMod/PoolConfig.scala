package typings
package anyDashDbLib.anyDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolConfig extends js.Object {
  /**
    * (default 30000) The maximum amount of time a connection can sit idle in the pool before being reaped
    */
  var idleTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * max (default 10) The maximum number of connections to keep open in the pool.
    * When this limit is reached further requests for connections will queue waiting
    * for an existing connection to be released back into the pool.
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * min (default 0) The minimum number of connections to keep open in the pool.
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * Called immediately after a connection is first established. Use this to do one-time setup of new connections.
    * The supplied Connection will not be added to the pool until you pass it to the done continuation.
    */
  var onConnect: js.UndefOr[
    js.Function2[
      /* connection */ Connection, 
      /* ready */ js.Function2[/* error */ nodeLib.Error, /* result */ Connection, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    *  (default 1000) How frequently the pool should check for connections that are old enough to be reaped.
    */
  var reapInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * (default true) When this is true, the pool will reap connections that
    * have been idle for more than idleTimeout milliseconds.
    */
  var refreshIdle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called each time a connection is returned to the pool. Use this to restore a connection to
    * it's original state (e.g. rollback transactions, set the database session vars). If reset
    * fails to call the done continuation the connection will be lost in limbo.
    */
  var reset: js.UndefOr[
    js.Function2[
      /* connection */ Connection, 
      /* done */ js.Function1[/* error */ nodeLib.Error, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * (default function (err) { return true }) - Called when an error is encountered
    * by pool.query or emitted by an idle connection. If shouldDestroyConnection(error)
    * is truthy the connection will be destroyed, otherwise it will be reset.
    */
  var shouldDestroyConnection: js.UndefOr[js.Function1[/* error */ nodeLib.Error, scala.Boolean]] = js.undefined
}

