package typings.angularIdle.mod.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Idle, once watch() is called, will start a timeout which if expires, will enter a warning state
  * countdown. Once the countdown reaches zero, idle will broadcast a timeout event indicating the
  * user has timed out (where your app should log them out or whatever you like). If the user performs
  * an action that triggers a watched DOM event that bubbles up to document.body, this will reset the
  * idle/warning state and start the process over again.
  */
@js.native
trait IIdleService extends js.Object {
  /**
    * Gets the current idle value
    */
  def getIdle(): Double = js.native
  /**
    * Gets the current timeout value
    */
  def getTimeout(): Double = js.native
  /**
    * Whether or not the user appears to be idle.
    */
  def idling(): Boolean = js.native
  /**
    * Manually trigger the idle interrupt that normally occurs during user activity.
    */
  def interrupt(): js.Any = js.native
  /**
    * Whether user has timed out (meaning idleDuration + timeout has passed without any activity)
    */
  def isExpired(): Boolean = js.native
  /**
    * Whether or not the watch() has been called and it is watching for idleness.
    */
  def running(): Boolean = js.native
  /**
    * Updates the idle value (see IdleProvider.idle()) and
    * restarts the watch if its running.
    */
  def setIdle(idle: Double): Unit = js.native
  /**
    * Updates the timeout value (see IdleProvider.timeout()) and
    * restarts the watch if its running.
    */
  def setTimeout(timeout: Double): Unit = js.native
  /**
    * Stops watching for idleness, and resets the idle/warning state.
    */
  def unwatch(): Unit = js.native
  /**
    * Starts watching for idleness, or resets the idle/warning state and continues watching.
    */
  def watch(): Unit = js.native
}

object IIdleService {
  @scala.inline
  def apply(
    getIdle: () => Double,
    getTimeout: () => Double,
    idling: () => Boolean,
    interrupt: () => js.Any,
    isExpired: () => Boolean,
    running: () => Boolean,
    setIdle: Double => Unit,
    setTimeout: Double => Unit,
    unwatch: () => Unit,
    watch: () => Unit
  ): IIdleService = {
    val __obj = js.Dynamic.literal(getIdle = js.Any.fromFunction0(getIdle), getTimeout = js.Any.fromFunction0(getTimeout), idling = js.Any.fromFunction0(idling), interrupt = js.Any.fromFunction0(interrupt), isExpired = js.Any.fromFunction0(isExpired), running = js.Any.fromFunction0(running), setIdle = js.Any.fromFunction1(setIdle), setTimeout = js.Any.fromFunction1(setTimeout), unwatch = js.Any.fromFunction0(unwatch), watch = js.Any.fromFunction0(watch))
    __obj.asInstanceOf[IIdleService]
  }
  @scala.inline
  implicit class IIdleServiceOps[Self <: IIdleService] (val x: Self) extends AnyVal {
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
    def setGetIdle(value: () => Double): Self = this.set("getIdle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTimeout(value: () => Double): Self = this.set("getTimeout", js.Any.fromFunction0(value))
    @scala.inline
    def setIdling(value: () => Boolean): Self = this.set("idling", js.Any.fromFunction0(value))
    @scala.inline
    def setInterrupt(value: () => js.Any): Self = this.set("interrupt", js.Any.fromFunction0(value))
    @scala.inline
    def setIsExpired(value: () => Boolean): Self = this.set("isExpired", js.Any.fromFunction0(value))
    @scala.inline
    def setRunning(value: () => Boolean): Self = this.set("running", js.Any.fromFunction0(value))
    @scala.inline
    def setSetIdle(value: Double => Unit): Self = this.set("setIdle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTimeout(value: Double => Unit): Self = this.set("setTimeout", js.Any.fromFunction1(value))
    @scala.inline
    def setUnwatch(value: () => Unit): Self = this.set("unwatch", js.Any.fromFunction0(value))
    @scala.inline
    def setWatch(value: () => Unit): Self = this.set("watch", js.Any.fromFunction0(value))
  }
  
}

