package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception can be thrown in case a storage commit is failed.
  *
  * If a commit process of a storage fails on last transfer and the original content may be corrupted the storage should throw this exception to notify
  * the user that a backup usage is required to restore the original content.
  *
  * The storage itself must disconnect from the medium it is based on to allow restoring. Although the storage will still contain all the data internally,
  * and can be used as a temporary storage usually used.
  */
trait UseBackupException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The URL of the temporary file the storage is based on now. */
  var TemporaryFileURL: java.lang.String
}

