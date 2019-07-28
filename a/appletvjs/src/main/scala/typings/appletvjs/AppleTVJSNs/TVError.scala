package typings.appletvjs.AppleTVJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AppleTVJS.TVError")
@js.native
class TVError () extends js.Object {
  /** The error code. */
  var code: String = js.native
  /** A string containing the description of the error. */
  var description: String = js.native
  /**
  		 * A string containing the error domain.
  		 *
  		 * The predefined error domains:
  		 * NSPOSIXErrorDomain - POSIX/BSD errors
  		 * NSOSStatusErrorDomain - OS X/Carbon errors
  		 * NSMachErrorDomain - Mach errors
  		 * */
  var domain: String = js.native
  /**
  		 * The user info dictionary.
  		 *
  		 * These keys may exist in the user info dictionary:
  		 * NSLocalizedDesciptionKey
  		 * NSFilePathErrorKey
  		 * NSStringEncodingErrorKey
  		 * NSUnderlyingErrorKey
  		 * NSURLErrorKey
  		 * NSLocalizedFailureReasonErrorKey
  		 * NSLocalizedRecoverySuggestionErrorKey
  		 * NSLocalizedRecoveryOptionsErrorKey
  		 * NSRecoveryAttempterErrorKey
  		 * NSHelpAnchorErrorKey
  		 * NSURLErrorFailingURLErrorKey
  		 * NSURLErrorFailingURLStringErrorKey
  		 * NSURLErrorFailingURLPeerTrustErrorKey
  		 * */
  var userInfo: js.Any = js.native
}

