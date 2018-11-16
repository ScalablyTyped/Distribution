package typings
package angularDashIdleLib.angularMod.idleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Used to configure the Idle service.
         */
@js.native
trait IIdleProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  /**
               * When true or idle, user activity will automatically interrupt the warning countdown
               * and reset the idle state. If false or off, you will need to manually call watch()
               * when you want to start watching for idleness again. If notIdle, user activity will
               * only automatically interrupt if the user is not yet idle.
               *
               * @param enabled boolean or string, possible values: off/false, idle/true, or notIdle
               */
  def autoResume(enabled: java.lang.String): scala.Unit = js.native
  /**
               * When true or idle, user activity will automatically interrupt the warning countdown
               * and reset the idle state. If false or off, you will need to manually call watch()
               * when you want to start watching for idleness again. If notIdle, user activity will
               * only automatically interrupt if the user is not yet idle.
               *
               * @param enabled boolean or string, possible values: off/false, idle/true, or notIdle
               */
  def autoResume(enabled: scala.Boolean): scala.Unit = js.native
  /**
               * The idle timeout duration in seconds. After this amount of time passes without the user
               * performing an action that triggers one of the watched DOM events, the user is considered
               * idle.
               *
               * @param seconds integer, default is 20min
               */
  def idle(seconds: scala.Double): scala.Unit = js.native
  /**
               * Specifies the DOM events the service will watch to reset the idle timeout.
               * Multiple events should be separated by a space.
               *
               * @param events string, default 'mousemove keydown DOMMouseScroll mousewheel mousedown'
               */
  def interrupt(events: java.lang.String): scala.Unit = js.native
  /**
               * When true, the Keepalive service is automatically stopped and started as needed.
               *
               * @param enabled boolean, default is true
               */
  def keepalive(enabled: scala.Boolean): scala.Unit = js.native
  /**
               * The amount of time the user has to respond (in seconds) before they have been considered
               * timed out.
               *
               * @param seconds integer, default is 30s
               */
  def timeout(seconds: scala.Double): scala.Unit = js.native
}

