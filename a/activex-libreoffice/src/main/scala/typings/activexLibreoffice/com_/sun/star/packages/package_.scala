package typings.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object packages {
  /** This exception can be thrown in case object is encrypted when it is not allowed */
  type EncryptionNotAllowedException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  /** This exception can be thrown in case object is not encrypted one as expected. */
  type NoEncryptionException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  /** This exception can be thrown in case provided stream is not a raw stream representing encrypted package stream. */
  type NoRawFormatException = typings.activexLibreoffice.com_.sun.star.io.IOException
  /**
    * This service provides an iterator over the contents of a given instance of a {@link PackageFolder} . This provides a "snapshot" of the contents of the
    * {@link PackageFolder} at the time of construction. It is the responsibility of the caller to ensure that any given member of the enumeration refers to
    * a valid {@link PackageStream} or {@link PackageFolder} .
    */
  type PackageFolderEnumeration = typings.activexLibreoffice.com_.sun.star.container.XEnumeration
  /** This exception can be thrown in case wrong password was provided. */
  type WrongPasswordException = typings.activexLibreoffice.com_.sun.star.uno.Exception
}
