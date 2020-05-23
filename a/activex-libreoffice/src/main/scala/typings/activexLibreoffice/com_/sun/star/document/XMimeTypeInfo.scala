package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides information regarding which MIME types are supported by a filter. */
trait XMimeTypeInfo extends XInterface {
  /** @returns a sequence of the names of all supported MIME types. */
  val SupportedMimeTypeNames: SafeArray[String]
  /** @returns a sequence of the names of all supported MIME types. */
  def getSupportedMimeTypeNames(): SafeArray[String]
  /** asks whether a MIME type is supported or not. */
  def supportsMimeType(MimeTypeName: String): Boolean
}

object XMimeTypeInfo {
  @scala.inline
  def apply(
    SupportedMimeTypeNames: SafeArray[String],
    acquire: () => Unit,
    getSupportedMimeTypeNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    supportsMimeType: String => Boolean
  ): XMimeTypeInfo = {
    val __obj = js.Dynamic.literal(SupportedMimeTypeNames = SupportedMimeTypeNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSupportedMimeTypeNames = js.Any.fromFunction0(getSupportedMimeTypeNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsMimeType = js.Any.fromFunction1(supportsMimeType))
    __obj.asInstanceOf[XMimeTypeInfo]
  }
}

