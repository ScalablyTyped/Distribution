package typings
package adoneLib.adoneNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Represents a log file rotator
         */
@JSGlobal("adone.util.LogRotator")
@js.native
class LogRotator protected () extends js.Object {
  /**
               * @param target filepath
               */
  def this(target: java.lang.String) = this()
  /**
               * @param target filepath
               */
  def this(target: java.lang.String, options: adoneLib.Anon_Compress) = this()
  /**
               * Completes a rotate iteration
               */
  def rotate(): js.Promise[scala.Unit] = js.native
  /**
               * Starts checking using the given interval, the first check is completed on the next tick
               */
  def start(): scala.Unit = js.native
  /**
               * Stops checking
               */
  def stop(): scala.Unit = js.native
}

