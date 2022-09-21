package typings.asyncExitHook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Adds a basic hook which gets called on all exits.
    *
    * @param hook Function which will be called on exit.
    * If a `done` function is present as a parameter, the program will not exit until
    * the `done` function gets called, allowing asynchronous actions to take place.
    */
  inline def apply(hook: BaseHookFunction): Unit = ^.asInstanceOf[js.Dynamic].apply(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("async-exit-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Overwrites the internal asynchronous hook method timeout time.
    *
    * @param time New timeout time in `ms`.
    */
  inline def forceExitTimeout(time: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceExitTimeout")(time.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Adds a event/code/function filter for the basic exit hook.
    *
    * @param event The event name emitted to listen to (`process.emit(event)`).
    * @param code The exit code emitted to listen to (`process.emit(event, code)`).
    * @param filter A custom filter function which takes all parameters passed to `process.emit` excluding the event name (`process.emit(event, *parameters*)`).
    */
  inline def hookEvent(event: String, code: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookEvent")(event.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hookEvent(event: String, code: Double, filter: EventFilterFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookEvent")(event.asInstanceOf[js.Any], code.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hookEvent(event: js.Symbol, code: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookEvent")(event.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hookEvent(event: js.Symbol, code: Double, filter: EventFilterFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookEvent")(event.asInstanceOf[js.Any], code.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Lists all hooked event names.
    */
  inline def hookedEvents(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hookedEvents")().asInstanceOf[js.Array[String]]
  
  /**
    * Adds a hook which gets called specifically on uncaught exceptions.
    *
    * @param hook Function which will be called on exit
    * optionally containing the uncaught exception error.
    * If a `done` function is present as a parameter, the program will not exit until
    * the `done` function gets called, allowing asynchronous actions to take place.
    */
  inline def uncaughtExceptionHandler(hook: ExceptionHookFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uncaughtExceptionHandler")(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Adds a hook which gets called specifically on unhandled promise rejections.
    *
    * @param hook Function which will be called on exit
    * optionally containing the unhandled promise rejection error.
    * If a `done` function is present as a parameter, the program will not exit until
    * the `done` function gets called, allowing asynchronous actions to take place.
    */
  inline def unhandledRejectionHandler(hook: ExceptionHookFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unhandledRejectionHandler")(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Unhooks an event and its filters.
    *
    * @param event The name of the event to unhook.
    */
  inline def unhookEvent(event: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unhookEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unhookEvent(event: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unhookEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type BaseHookFunction = js.Function1[/* done */ DoneCallback, Unit]
  
  type DoneCallback = js.Function0[Unit]
  
  @js.native
  trait EventFilterFunction extends StObject {
    
    def apply(args: Any*): Boolean = js.native
  }
  
  type ExceptionHookFunction = js.Function2[/* error */ js.Error, /* done */ DoneCallback, Unit]
}
