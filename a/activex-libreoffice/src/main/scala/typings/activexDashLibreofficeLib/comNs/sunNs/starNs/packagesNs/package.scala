package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object packagesNs {
  /** This exception can be thrown in case object is encrypted when it is not allowed */
  type EncryptionNotAllowedException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /** This exception can be thrown in case object is not encrypted one as expected. */
  type NoEncryptionException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /** This exception can be thrown in case provided stream is not a raw stream representing encrypted package stream. */
  type NoRawFormatException = activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.IOException
  /**
    * This service provides an iterator over the contents of a given instance of a {@link PackageFolder} . This provides a "snapshot" of the contents of the
    * {@link PackageFolder} at the time of construction. It is the responsibility of the caller to ensure that any given member of the enumeration refers to
    * a valid {@link PackageStream} or {@link PackageFolder} .
    */
  type PackageFolderEnumeration = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
  /** This exception can be thrown in case wrong password was provided. */
  type WrongPasswordException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
}
