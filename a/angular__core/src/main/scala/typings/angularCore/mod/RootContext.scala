package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RootContext contains information which is shared for all components which
  * were bootstrapped with {@link renderComponent}.
  */
@js.native
trait RootContext extends StObject {
  
  /**
    * A promise which is resolved when all components are considered clean (not dirty).
    *
    * This promise is overwritten every time a first call to {@link markDirty} is invoked.
    */
  var clean: js.Promise[Null] = js.native
  
  /**
    * RootComponents - The components that were instantiated by the call to
    * {@link renderComponent}.
    */
  var components: js.Array[js.Object] = js.native
  
  /**
    * What render-related operations to run once a scheduler has been set
    */
  var flags: RootContextFlags = js.native
  
  /**
    * The player flushing handler to kick off all animations
    */
  var playerHandler: ɵPlayerHandler | Null = js.native
  
  /**
    * A function used for scheduling change detection in the future. Usually
    * this is `requestAnimationFrame`.
    */
  def scheduler(workFn: js.Function0[Unit]): Unit = js.native
}
object RootContext {
  
  @scala.inline
  def apply(
    clean: js.Promise[Null],
    components: js.Array[js.Object],
    flags: RootContextFlags,
    scheduler: js.Function0[Unit] => Unit
  ): RootContext = {
    val __obj = js.Dynamic.literal(clean = clean.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], scheduler = js.Any.fromFunction1(scheduler))
    __obj.asInstanceOf[RootContext]
  }
  
  @scala.inline
  implicit class RootContextMutableBuilder[Self <: RootContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClean(value: js.Promise[Null]): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponents(value: js.Array[js.Object]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsVarargs(value: js.Object*): Self = StObject.set(x, "components", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: RootContextFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerHandler(value: ɵPlayerHandler): Self = StObject.set(x, "playerHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerHandlerNull: Self = StObject.set(x, "playerHandler", null)
    
    @scala.inline
    def setScheduler(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "scheduler", js.Any.fromFunction1(value))
  }
}
