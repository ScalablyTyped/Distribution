package typings.applicationinsights.outLibrarySenderMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Library/Sender", JSImport.Namespace)
@js.native
class ^ protected () extends Sender {
  def this(config: typings.applicationinsights.outLibraryConfigMod.^) = this()
  def this(
    config: typings.applicationinsights.outLibraryConfigMod.^,
    onSuccess: js.Function1[/* response */ String, Unit]
  ) = this()
  def this(
    config: typings.applicationinsights.outLibraryConfigMod.^,
    onSuccess: js.Function1[/* response */ String, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ) = this()
}

@JSImport("applicationinsights/out/Library/Sender", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ACLED_DIRECTORIES: js.Any = js.native
  var ACL_IDENTITY: js.Any = js.native
  var ICACLS_PATH: js.Any = js.native
  var MAX_BYTES_ON_DISK: Double = js.native
  var MAX_CONNECTION_FAILURES_BEFORE_WARN: Double = js.native
  var OS_PROVIDES_FILE_PROTECTION: Boolean = js.native
  var POWERSHELL_PATH: js.Any = js.native
  var TAG: js.Any = js.native
  var TEMPDIR_PREFIX: String = js.native
  var USE_ICACLS: Boolean = js.native
  var WAIT_BETWEEN_RESEND: Double = js.native
}

