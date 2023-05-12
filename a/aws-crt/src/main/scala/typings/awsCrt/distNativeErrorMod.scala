package typings.awsCrt

import typings.awsCrt.distCommonErrorMod.ICrtError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativeErrorMod {
  
  @JSImport("aws-crt/dist/native/error", "CrtError")
  @js.native
  open class CrtError protected ()
    extends StObject
       with Error
       with ICrtError {
    /** @var error - The original error. Most often an error_code, but possibly some other context */
    def this(error: Any) = this()
    
    val error: Any = js.native
    
    /** The original integer error code from the CRT */
    val error_code: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
