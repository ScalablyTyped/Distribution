package typings.angularServiceWorker

import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularServiceWorker.angularServiceWorkerStrings.NO_NEW_VERSION_DETECTED
import typings.angularServiceWorker.angularServiceWorkerStrings.UNRECOVERABLE_STATE
import typings.angularServiceWorker.angularServiceWorkerStrings.UPDATE_ACTIVATED
import typings.angularServiceWorker.angularServiceWorkerStrings.UPDATE_AVAILABLE
import typings.angularServiceWorker.angularServiceWorkerStrings.VERSION_DETECTED
import typings.angularServiceWorker.angularServiceWorkerStrings.VERSION_INSTALLATION_FAILED
import typings.angularServiceWorker.angularServiceWorkerStrings.VERSION_READY
import typings.angularServiceWorker.anon.Action
import typings.angularServiceWorker.anon.AppData
import typings.angularServiceWorker.anon.Hash
import typings.angularServiceWorker.anon.ServerPublicKey
import typings.rxjs.mod.Observable_
import typings.std.PushSubscription
import typings.std.ServiceWorker
import typings.std.ServiceWorkerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular/service-worker", "ServiceWorkerModule")
  @js.native
  open class ServiceWorkerModule () extends StObject
  /* static members */
  object ServiceWorkerModule {
    
    @JSImport("@angular/service-worker", "ServiceWorkerModule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Register the given Angular Service Worker script.
      *
      * If `enabled` is set to `false` in the given options, the module will behave as if service
      * workers are not supported by the browser, and the service worker will not be registered.
      */
    inline def register(script: String): ModuleWithProviders[ServiceWorkerModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(script.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[ServiceWorkerModule]]
    inline def register(script: String, opts: SwRegistrationOptions): ModuleWithProviders[ServiceWorkerModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(script.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ModuleWithProviders[ServiceWorkerModule]]
    
    @JSImport("@angular/service-worker", "ServiceWorkerModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[ServiceWorkerModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[ServiceWorkerModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/service-worker", "ServiceWorkerModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[ServiceWorkerModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[ServiceWorkerModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/service-worker", "ServiceWorkerModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[ServiceWorkerModule, scala.Nothing, scala.Nothing, scala.Nothing] = js.native
    inline def ɵmod_=(x: ɵɵNgModuleDeclaration[ServiceWorkerModule, scala.Nothing, scala.Nothing, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/service-worker", "SwPush")
  @js.native
  open class SwPush protected () extends StObject {
    def this(sw: NgswCommChannel) = this()
    
    /* private */ var decodeBase64: Any = js.native
    
    /**
      * True if the Service Worker is enabled (supported by the browser and enabled via
      * `ServiceWorkerModule`).
      */
    def isEnabled: Boolean = js.native
    
    /**
      * Emits the payloads of the received push notification messages.
      */
    val messages: Observable_[js.Object] = js.native
    
    /**
      * Emits the payloads of the received push notification messages as well as the action the user
      * interacted with. If no action was used the `action` property contains an empty string `''`.
      *
      * Note that the `notification` property does **not** contain a
      * [Notification][Mozilla Notification] object but rather a
      * [NotificationOptions](https://notifications.spec.whatwg.org/#dictdef-notificationoptions)
      * object that also includes the `title` of the [Notification][Mozilla Notification] object.
      *
      * [Mozilla Notification]: https://developer.mozilla.org/en-US/docs/Web/API/Notification
      */
    val notificationClicks: Observable_[Action] = js.native
    
    /* private */ var pushManager: Any = js.native
    
    /**
      * Subscribes to Web Push Notifications,
      * after requesting and receiving user permission.
      *
      * @param options An object containing the `serverPublicKey` string.
      * @returns A Promise that resolves to the new subscription object.
      */
    def requestSubscription(options: ServerPublicKey): js.Promise[PushSubscription] = js.native
    
    /**
      * Emits the currently active
      * [PushSubscription](https://developer.mozilla.org/en-US/docs/Web/API/PushSubscription)
      * associated to the Service Worker registration or `null` if there is no subscription.
      */
    val subscription: Observable_[PushSubscription | Null] = js.native
    
    /* private */ var subscriptionChanges: Any = js.native
    
    /* private */ var sw: Any = js.native
    
    /**
      * Unsubscribes from Service Worker push notifications.
      *
      * @returns A Promise that is resolved when the operation succeeds, or is rejected if there is no
      *          active subscription or the unsubscribe operation fails.
      */
    def unsubscribe(): js.Promise[Unit] = js.native
  }
  /* static members */
  object SwPush {
    
    @JSImport("@angular/service-worker", "SwPush")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/service-worker", "SwPush.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[SwPush, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[SwPush, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/service-worker", "SwPush.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[SwPush] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[SwPush]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("@angular/service-worker", "SwRegistrationOptions")
  @js.native
  open class SwRegistrationOptions () extends StObject {
    
    /**
      * Whether the ServiceWorker will be registered and the related services (such as `SwPush` and
      * `SwUpdate`) will attempt to communicate and interact with it.
      *
      * Default: true
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the ServiceWorker registration strategy, which determines when it will be registered
      * with the browser.
      *
      * The default behavior of registering once the application stabilizes (i.e. as soon as there are
      * no pending micro- and macro-tasks) is designed to register the ServiceWorker as soon as
      * possible but without affecting the application's first time load.
      *
      * Still, there might be cases where you want more control over when the ServiceWorker is
      * registered (for example, there might be a long-running timeout or polling interval, preventing
      * the app from stabilizing). The available option are:
      *
      * - `registerWhenStable:<timeout>`: Register as soon as the application stabilizes (no pending
      *     micro-/macro-tasks) but no later than `<timeout>` milliseconds. If the app hasn't
      *     stabilized after `<timeout>` milliseconds (for example, due to a recurrent asynchronous
      *     task), the ServiceWorker will be registered anyway.
      *     If `<timeout>` is omitted, the ServiceWorker will only be registered once the app
      *     stabilizes.
      * - `registerImmediately`: Register immediately.
      * - `registerWithDelay:<timeout>`: Register with a delay of `<timeout>` milliseconds. For
      *     example, use `registerWithDelay:5000` to register the ServiceWorker after 5 seconds. If
      *     `<timeout>` is omitted, is defaults to `0`, which will register the ServiceWorker as soon
      *     as possible but still asynchronously, once all pending micro-tasks are completed.
      * - An [Observable](guide/observables) factory function: A function that returns an `Observable`.
      *     The function will be used at runtime to obtain and subscribe to the `Observable` and the
      *     ServiceWorker will be registered as soon as the first value is emitted.
      *
      * Default: 'registerWhenStable:30000'
      */
    var registrationStrategy: js.UndefOr[String | js.Function0[Observable_[Any]]] = js.native
    
    /**
      * A URL that defines the ServiceWorker's registration scope; that is, what range of URLs it can
      * control. It will be used when calling
      * [ServiceWorkerContainer#register()](https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/register).
      */
    var scope: js.UndefOr[String] = js.native
  }
  
  @JSImport("@angular/service-worker", "SwUpdate")
  @js.native
  open class SwUpdate protected () extends StObject {
    def this(sw: NgswCommChannel) = this()
    
    /**
      * Updates the current client (i.e. browser tab) to the latest version that is ready for
      * activation.
      *
      * In most cases, you should not use this method and instead should update a client by reloading
      * the page.
      *
      * <div class="alert is-important">
      *
      * Updating a client without reloading can easily result in a broken application due to a version
      * mismatch between the [application shell](guide/glossary#app-shell) and other page resources,
      * such as [lazy-loaded chunks](guide/glossary#lazy-loading), whose filenames may change between
      * versions.
      *
      * Only use this method, if you are certain it is safe for your specific use case.
      *
      * </div>
      *
      * @returns a promise that
      *  - resolves to `true` if an update was activated successfully
      *  - resolves to `false` if no update was available (for example, the client was already on the
      *    latest version).
      *  - rejects if any error occurs
      */
    def activateUpdate(): js.Promise[Boolean] = js.native
    
    /**
      * Emits an `UpdateActivatedEvent` event whenever the app has been updated to a new version.
      *
      * @deprecated Use the return value of {@link SwUpdate#activateUpdate} instead.
      *
      */
    val activated: Observable_[UpdateActivatedEvent] = js.native
    
    /**
      * Emits an `UpdateAvailableEvent` event whenever a new app version is available.
      *
      * @deprecated Use {@link versionUpdates} instead.
      *
      * The behavior of `available` can be replicated by using `versionUpdates` by filtering for the
      * `VersionReadyEvent`:
      *
      * {@example service-worker-getting-started/src/app/prompt-update.service.ts
      * region='sw-replicate-available'}
      */
    val available: Observable_[UpdateAvailableEvent] = js.native
    
    /**
      * Checks for an update and waits until the new version is downloaded from the server and ready
      * for activation.
      *
      * @returns a promise that
      * - resolves to `true` if a new version was found and is ready to be activated.
      * - resolves to `false` if no new version was found
      * - rejects if any error occurs
      */
    def checkForUpdate(): js.Promise[Boolean] = js.native
    
    /**
      * True if the Service Worker is enabled (supported by the browser and enabled via
      * `ServiceWorkerModule`).
      */
    def isEnabled: Boolean = js.native
    
    /* private */ var sw: Any = js.native
    
    /**
      * Emits an `UnrecoverableStateEvent` event whenever the version of the app used by the service
      * worker to serve this client is in a broken state that cannot be recovered from without a full
      * page reload.
      */
    val unrecoverable: Observable_[UnrecoverableStateEvent] = js.native
    
    /**
      * Emits a `VersionDetectedEvent` event whenever a new version is detected on the server.
      *
      * Emits a `VersionInstallationFailedEvent` event whenever checking for or downloading a new
      * version fails.
      *
      * Emits a `VersionReadyEvent` event whenever a new version has been downloaded and is ready for
      * activation.
      */
    val versionUpdates: Observable_[VersionEvent] = js.native
  }
  /* static members */
  object SwUpdate {
    
    @JSImport("@angular/service-worker", "SwUpdate")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/service-worker", "SwUpdate.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[SwUpdate, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[SwUpdate, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/service-worker", "SwUpdate.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[SwUpdate] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[SwUpdate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @publicApi
    */
  @js.native
  trait NgswCommChannel extends StObject {
    
    val events: Observable_[TypedEvent] = js.native
    
    @JSName("eventsOfType")
    def eventsOfType_type[T /* <: TypedEvent */](`type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any): Observable_[T] = js.native
    @JSName("eventsOfType")
    def eventsOfType_type[T /* <: TypedEvent */](
      `type`: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any
        ]
    ): Observable_[T] = js.native
    
    def generateNonce(): Double = js.native
    
    def isEnabled: Boolean = js.native
    
    @JSName("nextEventOfType")
    def nextEventOfType_type[T /* <: TypedEvent */](`type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any): Observable_[T] = js.native
    
    def postMessage(action: String, payload: js.Object): js.Promise[Unit] = js.native
    
    def postMessageWithOperation(`type`: String, payload: js.Object, operationNonce: Double): js.Promise[Boolean] = js.native
    
    val registration: Observable_[ServiceWorkerRegistration] = js.native
    
    /* private */ var serviceWorker: Any = js.native
    
    def waitForOperationCompleted(nonce: Double): js.Promise[Boolean] = js.native
    
    val worker: Observable_[ServiceWorker] = js.native
  }
  
  trait NoNewVersionDetectedEvent
    extends StObject
       with VersionEvent {
    
    var `type`: NO_NEW_VERSION_DETECTED
    
    var version: AppData
  }
  object NoNewVersionDetectedEvent {
    
    inline def apply(version: AppData): NoNewVersionDetectedEvent = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NO_NEW_VERSION_DETECTED")
      __obj.asInstanceOf[NoNewVersionDetectedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoNewVersionDetectedEvent] (val x: Self) extends AnyVal {
      
      inline def setType(value: NO_NEW_VERSION_DETECTED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: AppData): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypedEvent extends StObject {
    
    var `type`: String
  }
  object TypedEvent {
    
    inline def apply(`type`: String): TypedEvent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypedEvent] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnrecoverableStateEvent extends StObject {
    
    var reason: String
    
    var `type`: UNRECOVERABLE_STATE
  }
  object UnrecoverableStateEvent {
    
    inline def apply(reason: String): UnrecoverableStateEvent = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("UNRECOVERABLE_STATE")
      __obj.asInstanceOf[UnrecoverableStateEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnrecoverableStateEvent] (val x: Self) extends AnyVal {
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setType(value: UNRECOVERABLE_STATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateActivatedEvent extends StObject {
    
    var current: AppData
    
    var previous: js.UndefOr[AppData] = js.undefined
    
    var `type`: UPDATE_ACTIVATED
  }
  object UpdateActivatedEvent {
    
    inline def apply(current: AppData): UpdateActivatedEvent = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("UPDATE_ACTIVATED")
      __obj.asInstanceOf[UpdateActivatedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateActivatedEvent] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: AppData): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setPrevious(value: AppData): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setType(value: UPDATE_ACTIVATED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateAvailableEvent extends StObject {
    
    var available: AppData
    
    var current: AppData
    
    var `type`: UPDATE_AVAILABLE
  }
  object UpdateAvailableEvent {
    
    inline def apply(available: AppData, current: AppData): UpdateAvailableEvent = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("UPDATE_AVAILABLE")
      __obj.asInstanceOf[UpdateAvailableEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateAvailableEvent] (val x: Self) extends AnyVal {
      
      inline def setAvailable(value: AppData): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: AppData): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setType(value: UPDATE_AVAILABLE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait VersionDetectedEvent
    extends StObject
       with VersionEvent {
    
    var `type`: VERSION_DETECTED
    
    var version: Hash
  }
  object VersionDetectedEvent {
    
    inline def apply(version: Hash): VersionDetectedEvent = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("VERSION_DETECTED")
      __obj.asInstanceOf[VersionDetectedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VersionDetectedEvent] (val x: Self) extends AnyVal {
      
      inline def setType(value: VERSION_DETECTED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Hash): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularServiceWorker.mod.VersionDetectedEvent
    - typings.angularServiceWorker.mod.VersionInstallationFailedEvent
    - typings.angularServiceWorker.mod.VersionReadyEvent
    - typings.angularServiceWorker.mod.NoNewVersionDetectedEvent
  */
  trait VersionEvent extends StObject
  object VersionEvent {
    
    inline def NoNewVersionDetectedEvent(version: AppData): typings.angularServiceWorker.mod.NoNewVersionDetectedEvent = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NO_NEW_VERSION_DETECTED")
      __obj.asInstanceOf[typings.angularServiceWorker.mod.NoNewVersionDetectedEvent]
    }
    
    inline def VersionDetectedEvent(version: Hash): typings.angularServiceWorker.mod.VersionDetectedEvent = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("VERSION_DETECTED")
      __obj.asInstanceOf[typings.angularServiceWorker.mod.VersionDetectedEvent]
    }
    
    inline def VersionInstallationFailedEvent(error: String, version: Hash): typings.angularServiceWorker.mod.VersionInstallationFailedEvent = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("VERSION_INSTALLATION_FAILED")
      __obj.asInstanceOf[typings.angularServiceWorker.mod.VersionInstallationFailedEvent]
    }
    
    inline def VersionReadyEvent(currentVersion: Hash, latestVersion: Hash): typings.angularServiceWorker.mod.VersionReadyEvent = {
      val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("VERSION_READY")
      __obj.asInstanceOf[typings.angularServiceWorker.mod.VersionReadyEvent]
    }
  }
  
  trait VersionInstallationFailedEvent
    extends StObject
       with VersionEvent {
    
    var error: String
    
    var `type`: VERSION_INSTALLATION_FAILED
    
    var version: Hash
  }
  object VersionInstallationFailedEvent {
    
    inline def apply(error: String, version: Hash): VersionInstallationFailedEvent = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("VERSION_INSTALLATION_FAILED")
      __obj.asInstanceOf[VersionInstallationFailedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VersionInstallationFailedEvent] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setType(value: VERSION_INSTALLATION_FAILED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Hash): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait VersionReadyEvent
    extends StObject
       with VersionEvent {
    
    var currentVersion: Hash
    
    var latestVersion: Hash
    
    var `type`: VERSION_READY
  }
  object VersionReadyEvent {
    
    inline def apply(currentVersion: Hash, latestVersion: Hash): VersionReadyEvent = {
      val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("VERSION_READY")
      __obj.asInstanceOf[VersionReadyEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VersionReadyEvent] (val x: Self) extends AnyVal {
      
      inline def setCurrentVersion(value: Hash): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      inline def setLatestVersion(value: Hash): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
      
      inline def setType(value: VERSION_READY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
