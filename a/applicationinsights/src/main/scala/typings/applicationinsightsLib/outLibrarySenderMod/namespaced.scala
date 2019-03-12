package typings
package applicationinsightsLib.outLibrarySenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Library/Sender", JSImport.Namespace)
@js.native
class namespaced protected () extends Sender {
  def this(config: applicationinsightsLib.outLibraryConfigMod.namespaced) = this()
  def this(config: applicationinsightsLib.outLibraryConfigMod.namespaced, onSuccess: js.Function1[/* response */ java.lang.String, scala.Unit]) = this()
  def this(config: applicationinsightsLib.outLibraryConfigMod.namespaced, onSuccess: js.Function1[/* response */ java.lang.String, scala.Unit], onError: js.Function1[/* error */ stdLib.Error, scala.Unit]) = this()
}

/* static members */
@JSImport("applicationinsights/out/Library/Sender", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var ACLED_DIRECTORIES: js.Any = js.native
  var ACL_IDENTITY: js.Any = js.native
  var ICACLS_PATH: js.Any = js.native
  var MAX_BYTES_ON_DISK: scala.Double = js.native
  var MAX_CONNECTION_FAILURES_BEFORE_WARN: scala.Double = js.native
  var OS_PROVIDES_FILE_PROTECTION: scala.Boolean = js.native
  var POWERSHELL_PATH: js.Any = js.native
  var TAG: js.Any = js.native
  var TEMPDIR_PREFIX: java.lang.String = js.native
  var USE_ICACLS: scala.Boolean = js.native
  var WAIT_BETWEEN_RESEND: scala.Double = js.native
}

