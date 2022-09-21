package typings.angularIdle

import typings.angular.mod.IRequestConfig
import typings.angular.mod.IServiceProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object idle {
    
    /**
      * Used to configure the Idle service.
      */
    @js.native
    trait IIdleProvider
      extends StObject
         with IServiceProvider {
      
      def autoResume(enabled: String): Unit = js.native
      /**
        * When true or idle, user activity will automatically interrupt the warning countdown
        * and reset the idle state. If false or off, you will need to manually call watch()
        * when you want to start watching for idleness again. If notIdle, user activity will
        * only automatically interrupt if the user is not yet idle.
        *
        * @param enabled boolean or string, possible values: off/false, idle/true, or notIdle
        */
      def autoResume(enabled: Boolean): Unit = js.native
      
      /**
        * The idle timeout duration in seconds. After this amount of time passes without the user
        * performing an action that triggers one of the watched DOM events, the user is considered
        * idle.
        *
        * @param seconds integer, default is 20min
        */
      def idle(seconds: Double): Unit = js.native
      
      /**
        * Specifies the DOM events the service will watch to reset the idle timeout.
        * Multiple events should be separated by a space.
        *
        * @param events string, default 'mousemove keydown DOMMouseScroll mousewheel mousedown'
        */
      def interrupt(events: String): Unit = js.native
      
      /**
        * When true, the Keepalive service is automatically stopped and started as needed.
        *
        * @param enabled boolean, default is true
        */
      def keepalive(enabled: Boolean): Unit = js.native
      
      /**
        * The amount of time the user has to respond (in seconds) before they have been considered
        * timed out.
        *
        * @param seconds integer, default is 30s
        */
      def timeout(seconds: Double): Unit = js.native
    }
    
    /**
      * Idle, once watch() is called, will start a timeout which if expires, will enter a warning state
      * countdown. Once the countdown reaches zero, idle will broadcast a timeout event indicating the
      * user has timed out (where your app should log them out or whatever you like). If the user performs
      * an action that triggers a watched DOM event that bubbles up to document.body, this will reset the
      * idle/warning state and start the process over again.
      */
    trait IIdleService extends StObject {
      
      /**
        * Gets the current idle value
        */
      def getIdle(): Double
      
      /**
        * Gets the current timeout value
        */
      def getTimeout(): Double
      
      /**
        * Whether or not the user appears to be idle.
        */
      def idling(): Boolean
      
      /**
        * Manually trigger the idle interrupt that normally occurs during user activity.
        */
      def interrupt(): Any
      
      /**
        * Whether user has timed out (meaning idleDuration + timeout has passed without any activity)
        */
      def isExpired(): Boolean
      
      /**
        * Whether or not the watch() has been called and it is watching for idleness.
        */
      def running(): Boolean
      
      /**
        * Updates the idle value (see IdleProvider.idle()) and
        * restarts the watch if its running.
        */
      def setIdle(idle: Double): Unit
      
      /**
        * Updates the timeout value (see IdleProvider.timeout()) and
        * restarts the watch if its running.
        */
      def setTimeout(timeout: Double): Unit
      
      /**
        * Stops watching for idleness, and resets the idle/warning state.
        */
      def unwatch(): Unit
      
      /**
        * Starts watching for idleness, or resets the idle/warning state and continues watching.
        */
      def watch(): Unit
    }
    object IIdleService {
      
      inline def apply(
        getIdle: () => Double,
        getTimeout: () => Double,
        idling: () => Boolean,
        interrupt: () => Any,
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
      
      extension [Self <: IIdleService](x: Self) {
        
        inline def setGetIdle(value: () => Double): Self = StObject.set(x, "getIdle", js.Any.fromFunction0(value))
        
        inline def setGetTimeout(value: () => Double): Self = StObject.set(x, "getTimeout", js.Any.fromFunction0(value))
        
        inline def setIdling(value: () => Boolean): Self = StObject.set(x, "idling", js.Any.fromFunction0(value))
        
        inline def setInterrupt(value: () => Any): Self = StObject.set(x, "interrupt", js.Any.fromFunction0(value))
        
        inline def setIsExpired(value: () => Boolean): Self = StObject.set(x, "isExpired", js.Any.fromFunction0(value))
        
        inline def setRunning(value: () => Boolean): Self = StObject.set(x, "running", js.Any.fromFunction0(value))
        
        inline def setSetIdle(value: Double => Unit): Self = StObject.set(x, "setIdle", js.Any.fromFunction1(value))
        
        inline def setSetTimeout(value: Double => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
        
        inline def setUnwatch(value: () => Unit): Self = StObject.set(x, "unwatch", js.Any.fromFunction0(value))
        
        inline def setWatch(value: () => Unit): Self = StObject.set(x, "watch", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * Used to configure the Keepalive service.
      */
    @js.native
    trait IKeepAliveProvider
      extends StObject
         with IServiceProvider {
      
      /**
        * If configured, options will be used to issue a request using $http.
        * If the value is null, no HTTP request will be issued.
        * You can specify a string, which it will assume to be a URL to a simple GET request.
        * Otherwise, you can use the same options $http takes. However, cache will always be false.
        *
        * @param value May be string or IRequestConfig, default is null.
        */
      def http(value: String): Unit = js.native
      def http(value: IRequestConfig): Unit = js.native
      
      /**
        * This specifies how often the keepalive event is triggered and the
        * HTTP request is issued.
        *
        * @param seconds Integer, default is 10 minutes. Must be greater than 0.
        */
      def interval(seconds: Double): Unit = js.native
    }
    
    /**
      * Keepalive will use a timeout to periodically wake, broadcast a Keepalive event on the root scope,
      * and optionally make an $http request. By default, the Idle service will stop and start Keepalive
      * when a user becomes idle or returns from idle, respectively. It is also started automatically when
      * Idle.watch() is called. This can be disabled by configuring the IdleProvider.
      */
    trait IKeepAliveService extends StObject {
      
      /**
        * Performs one ping only.
        */
      def ping(): Unit
      
      /**
        * Changes the interval value at runtime.
        * You will need to restart the pinging process by calling start() manually for the changes to be reflected.
        */
      def setInterval(seconds: Double): Unit
      
      /**
        * Starts pinging periodically until stop() is called.
        */
      def start(): Unit
      
      /**
        * Stops pinging.
        */
      def stop(): Unit
    }
    object IKeepAliveService {
      
      inline def apply(ping: () => Unit, setInterval: Double => Unit, start: () => Unit, stop: () => Unit): IKeepAliveService = {
        val __obj = js.Dynamic.literal(ping = js.Any.fromFunction0(ping), setInterval = js.Any.fromFunction1(setInterval), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
        __obj.asInstanceOf[IKeepAliveService]
      }
      
      extension [Self <: IKeepAliveService](x: Self) {
        
        inline def setPing(value: () => Unit): Self = StObject.set(x, "ping", js.Any.fromFunction0(value))
        
        inline def setSetInterval(value: Double => Unit): Self = StObject.set(x, "setInterval", js.Any.fromFunction1(value))
        
        inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
        
        inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * Used to configure the Title service.
      */
    trait ITitleProvider
      extends StObject
         with IServiceProvider {
      
      /**
        * Enables or disables the Title functionality.
        *
        * @param enabled Boolean, default is true.
        */
      def enabled(enabled: Boolean): Unit
    }
    object ITitleProvider {
      
      inline def apply($get: Any, enabled: Boolean => Unit): ITitleProvider = {
        val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], enabled = js.Any.fromFunction1(enabled))
        __obj.asInstanceOf[ITitleProvider]
      }
      
      extension [Self <: ITitleProvider](x: Self) {
        
        inline def setEnabled(value: Boolean => Unit): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait ITitleService extends StObject {
      
      /**
        * Gets the text to use as the message displayed when the user is idle.
        */
      def idleMessage(): String = js.native
      /**
        * Sets the text to use as the message displayed when the user is idle.
        */
      def idleMessage(`val`: String): Unit = js.native
      
      /**
        * Returns whether or not the title functionality has been enabled.
        */
      def isEnabled(): Boolean = js.native
      
      /**
        * Returns the "original" title value that has been previously set.
        *
        * Tracking the original title is important when restoring the title after displaying, for example, the idle warning message.
        */
      def original(): String = js.native
      /**
        * Will store val as the "original" title of the document.
        *
        * Tracking the original title is important when restoring the title after displaying, for example, the idle warning message.
        */
      def original(`val`: String): Unit = js.native
      
      /**
        * Sets the title to the original value (if it was stored or set previously).
        */
      def restore(): Unit = js.native
      
      /**
        * Stores the original title if it hasn't been already, determines the number minutes, seconds,
        * and total seconds from countdown, and displays the idleMessage with the aforementioned values interpolated.
        */
      def setAsIdle(countdown: Double): Unit = js.native
      
      /**
        * Stores the original title if it hasn't been already, and displays the timedOutMessage.
        */
      def setAsTimedOut(): Unit = js.native
      
      /**
        * Allows the title functionality to be enabled or disabled on the fly.
        */
      def setEnabled(enabled: Boolean): Unit = js.native
      
      /**
        * If overwrite is false or unspecified, updates the "original" title with the current document title
        * if it has not already been stored. If overwrite is true, the current document title is stored regardless.
        */
      def store(): Unit = js.native
      def store(overwrite: Boolean): Unit = js.native
      
      /**
        * Gets the text to use as the message displayed when the user is timed out.
        */
      def timedOutMessage(): String = js.native
      /**
        * Sets the text to use as the message displayed when the user is timed out.
        */
      def timedOutMessage(`val`: String): Unit = js.native
      
      /**
        * Returns the current document title.
        */
      def value(): String = js.native
      /**
        * Changes the actual title of the document.
        */
      def value(`val`: String): Unit = js.native
    }
  }
}
