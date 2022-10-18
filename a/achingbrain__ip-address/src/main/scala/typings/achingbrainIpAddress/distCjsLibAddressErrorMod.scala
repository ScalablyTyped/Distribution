package typings.achingbrainIpAddress

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsLibAddressErrorMod {
  
  @JSImport("@achingbrain/ip-address/dist/cjs/lib/address-error", "AddressError")
  @js.native
  open class AddressError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, parseMessage: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var parseMessage: js.UndefOr[String] = js.native
  }
}
