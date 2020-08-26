package typings.angularIdle.mod.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Keepalive will use a timeout to periodically wake, broadcast a Keepalive event on the root scope,
  * and optionally make an $http request. By default, the Idle service will stop and start Keepalive
  * when a user becomes idle or returns from idle, respectively. It is also started automatically when
  * Idle.watch() is called. This can be disabled by configuring the IdleProvider.
  */
@js.native
trait IKeepAliveService extends js.Object {
  /**
    * Performs one ping only.
    */
  def ping(): Unit = js.native
  /**
    * Changes the interval value at runtime.
    * You will need to restart the pinging process by calling start() manually for the changes to be reflected.
    */
  def setInterval(seconds: Double): Unit = js.native
  /**
    * Starts pinging periodically until stop() is called.
    */
  def start(): Unit = js.native
  /**
    * Stops pinging.
    */
  def stop(): Unit = js.native
}

object IKeepAliveService {
  @scala.inline
  def apply(ping: () => Unit, setInterval: Double => Unit, start: () => Unit, stop: () => Unit): IKeepAliveService = {
    val __obj = js.Dynamic.literal(ping = js.Any.fromFunction0(ping), setInterval = js.Any.fromFunction1(setInterval), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IKeepAliveService]
  }
  @scala.inline
  implicit class IKeepAliveServiceOps[Self <: IKeepAliveService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPing(value: () => Unit): Self = this.set("ping", js.Any.fromFunction0(value))
    @scala.inline
    def setSetInterval(value: Double => Unit): Self = this.set("setInterval", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

