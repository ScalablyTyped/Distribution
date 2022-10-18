package typings.abortableIterator

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAbortErrorMod {
  
  @JSImport("abortable-iterator/dist/src/abort-error", "AbortError")
  @js.native
  open class AbortError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: Unit, code: String) = this()
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var `type`: String = js.native
  }
}
