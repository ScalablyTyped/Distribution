package typings.adone.adoneNs.utilNs

import typings.adone.Anon_CheckInterval
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
  def this(target: String) = this()
  def this(target: String, options: Anon_CheckInterval) = this()
  /**
    * Completes a rotate iteration
    */
  def rotate(): js.Promise[Unit] = js.native
  /**
    * Starts checking using the given interval, the first check is completed on the next tick
    */
  def start(): Unit = js.native
  /**
    * Stops checking
    */
  def stop(): Unit = js.native
}

