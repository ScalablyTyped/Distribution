package typings.angularDesktopNotification

import org.scalablytyped.runtime.Shortcut
import typings.angular.mod.IPromise
import typings.angularDesktopNotification.anon.Default
import typings.std.Event
import typings.std.EventListener
import typings.std.MouseEvent
import typings.std.NotificationOptions
import typings.std.NotificationPermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-desktop-notification", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    object desktopNotification {
      
      /**
        * All options available during show notification according to https://developer.mozilla.org/en-US/docs/Web/API/notification
        */
      trait AugmentedNotificationOptions
        extends StObject
           with NotificationOptions {
        
        /**
          * The onclick property of the Notification interface specifies an event listener to receive click events.
          * These events occur when the user clicks on a displayed Notification.
          *
          * The default behavior is to move the focus to the viewport of the notification's related browsing context.
          * If you don't want that behaviour, call preventDefault() on the event object.
          */
        var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
        
        /**
          * The onerror property of the Notification interface specifies an event listener to receive error events.
          * These events occur when something goes wrong with a Notification (in many cases an error preventing the notification from being displayed.)
          *
          * A function which serves as the event handler for the error event. When an error occurs, the specified function will be called.
          * If null, no error handler is in effect.
          */
        var onError: js.UndefOr[EventListener] = js.undefined
        
        /**
          * The timestamp read-only property of the Notification interface returns a DOMTimeStamp, as specified in the timestamp option of the
          * Notification() constructor.
          *
          * The notification's timestamp can represent the time, in milliseconds since 00:00:00 UTC on 1 January 1970, of the event for which
          * the notification was created, or it can be an arbitrary timestamp that you want associated with the notification. For example, a
          * timestamp for an upcoming meeting could be set in the future, whereas a timestamp for a missed message could be set in the past.
          *
          * Note: This feature is available in Web Workers
          * Ref: https://developer.mozilla.org/en-US/docs/Web/API/Notification/timestamp
          */
        @JSName("timestamp")
        var timestamp_AugmentedNotificationOptions: js.UndefOr[Double] = js.undefined
        
        /**
          * The title read-only property of the Notification interface indicates the title of the notification, as specified in the title parameter
          * of the Notification() constructor.
          *
          * Note: This feature is available in Web Workers.
          * Ref: https://developer.mozilla.org/en-US/docs/Web/API/Notification/title
          */
        var title: js.UndefOr[String] = js.undefined
        
        /**
          * The vibrate read-only property of the Notification interface specifies a a vibration pattern for the device's vibration hardware to emit
          * when the notification fires. This is specified in the vibrate option of the Notification() constructor.
          *
          * Note: This property is not currently supported in any browser.
          * Ref: https://developer.mozilla.org/en-US/docs/Web/API/Notification/vibrate
          */
        @JSName("vibrate")
        var vibrate_AugmentedNotificationOptions: js.UndefOr[Any] = js.undefined
      }
      object AugmentedNotificationOptions {
        
        inline def apply(): AugmentedNotificationOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AugmentedNotificationOptions]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: AugmentedNotificationOptions] (val x: Self) extends AnyVal {
          
          inline def setOnClick(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
          
          inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
          
          inline def setOnError(value: /* evt */ Event => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
          
          inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
          
          inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
          
          inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
          
          inline def setVibrate(value: Any): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
          
          inline def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
        }
      }
      
      // tslint:disable-next-line interface-name
      trait IDesktopNotificationOptions extends StObject {
        
        var autoClose: js.UndefOr[Boolean] = js.undefined
        
        var duration: js.UndefOr[Double] = js.undefined
        
        var showOnPageHidden: js.UndefOr[Boolean] = js.undefined
      }
      object IDesktopNotificationOptions {
        
        inline def apply(): IDesktopNotificationOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IDesktopNotificationOptions]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: IDesktopNotificationOptions] (val x: Self) extends AnyVal {
          
          inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
          
          inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
          
          inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
          
          inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
          
          inline def setShowOnPageHidden(value: Boolean): Self = StObject.set(x, "showOnPageHidden", value.asInstanceOf[js.Any])
          
          inline def setShowOnPageHiddenUndefined: Self = StObject.set(x, "showOnPageHidden", js.undefined)
        }
      }
      
      // tslint:disable-next-line interface-name
      trait IDesktopNotificationProvider extends StObject {
        
        /**
          * Set the default app-wide configuration for desktopNotification
          */
        def config(options: IDesktopNotificationOptions): Unit
      }
      object IDesktopNotificationProvider {
        
        inline def apply(config: IDesktopNotificationOptions => Unit): IDesktopNotificationProvider = {
          val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
          __obj.asInstanceOf[IDesktopNotificationProvider]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: IDesktopNotificationProvider] (val x: Self) extends AnyVal {
          
          inline def setConfig(value: IDesktopNotificationOptions => Unit): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
        }
      }
      
      // tslint:disable-next-line interface-name
      @js.native
      trait IDesktopNotificationService extends StObject {
        
        /**
          * This method will get the current permission set in the browser which could be one of the ff.
          * - desktopNotification.permissions.default
          * - desktopNotification.permissions.denied
          * - desktopNotification.permissions.granted
          */
        def currentPermission(): NotificationPermission = js.native
        
        /**
          * This method returns true if the browser supports the Notification API, false otherwise
          */
        def isSupported(): Boolean = js.native
        
        var permissions: Default = js.native
        
        /**
          * This method returns a $q promise, if the user allowed the notification the successCallback will be executed,
          * errorCallback will be executed otherwise
          */
        def requestPermission(): IPromise[NotificationPermission] = js.native
        
        /**
          * This method will display the notification using the parameter values.
          * See all available options here at https://developer.mozilla.org/en-US/docs/Web/API/notification#Instance_properties
          */
        def show(title: String): Unit = js.native
        def show(title: String, options: AugmentedNotificationOptions): Unit = js.native
        def show(title: String, options: NotificationOptions): Unit = js.native
      }
    }
  }
}
