package typings.awaitTimeout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("await-timeout", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Timeout
  @JSImport("await-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def set(delay: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(delay.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /* static member */
  inline def set(delay: Double, message: String): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(delay.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  
  /* static member */
  inline def wrap(promise: js.Promise[js.Any], delay: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(promise.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def wrap(promise: js.Promise[js.Any], delay: Double, error: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(promise.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @js.native
  trait Timeout extends StObject {
    
    def clear(): Unit = js.native
    
    def set(delay: Double): js.Promise[Unit] = js.native
    def set(delay: Double, message: String): js.Promise[scala.Nothing] = js.native
  }
}
