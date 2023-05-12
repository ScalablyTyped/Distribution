package typings.atlaskitInteractionContext

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@atlaskit/interaction-context", JSImport.Default)
  @js.native
  val default: Context[InteractionContextType | Null] = js.native
  
  @js.native
  trait InteractionContextType extends StObject {
    
    /**
      * Hold a in-progress interaction
      *
      * Usage:
      * ```
      * function MyLoading(){
      *     const context = useContext(InteractionContext);
      *
      *     useLayoutEffect(() => {
      *       if (!context) {
      *         return context.hold(name)
      *       }
      *     }, [context, name]);
      *
      *     return <Spinner />
      * }
      *
      * ```
      */
    def hold(): Unit | js.Function0[Unit] = js.native
    def hold(name: String): Unit | js.Function0[Unit] = js.native
    
    /**
      * Trace a press event
      * Measures from your trigger (e.g. a button click)
      *
      * Usage:
      * ```
      * function MyComponent(){
      *     const context = useContext(InteractionContext)
      *
      *     const onClick = (event: MouseEvent) => {
      *       context.tracePress('event', event.timeStamp)
      *       // handling the click event
      *     };
      *
      *     return <Button onClick={onClick} />
      * }
      *
      * ```
      * Pass along the timeStamp from the original event if you have one - We need it
      * to measure input delay
      */
    def tracePress(): Unit = js.native
    def tracePress(name: String): Unit = js.native
    def tracePress(name: String, timestamp: Double): Unit = js.native
    def tracePress(name: Unit, timestamp: Double): Unit = js.native
  }
  
  type _To = Context[InteractionContextType | Null]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Context[InteractionContextType | Null] = default
}
