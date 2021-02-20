package typings.awaitTimeout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("await-timeout", JSImport.Namespace)
  @js.native
  class ^ () extends Timeout
  
  /* static member */
  @JSImport("await-timeout", "set")
  @js.native
  def set(delay: Double): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  /* static member */
  @JSImport("await-timeout", "set")
  @js.native
  def set(delay: Double, message: String): js.Promise[scala.Nothing] = js.native
  
  /* static member */
  @JSImport("await-timeout", "wrap")
  @js.native
  def wrap(promise: js.Promise[_], delay: Double): js.Promise[_] = js.native
  @JSImport("await-timeout", "wrap")
  @js.native
  def wrap(promise: js.Promise[_], delay: Double, error: String): js.Promise[_] = js.native
  
  @js.native
  trait Timeout extends StObject {
    
    def clear(): Unit = js.native
    
    def set(delay: Double): js.Promise[js.UndefOr[scala.Nothing]] = js.native
    def set(delay: Double, message: String): js.Promise[scala.Nothing] = js.native
  }
}
