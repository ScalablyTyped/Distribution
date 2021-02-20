package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides information regarding which MIME types are supported by a filter. */
@js.native
trait XMimeTypeInfo extends XInterface {
  
  /** @returns a sequence of the names of all supported MIME types. */
  val SupportedMimeTypeNames: SafeArray[String] = js.native
  
  /** @returns a sequence of the names of all supported MIME types. */
  def getSupportedMimeTypeNames(): SafeArray[String] = js.native
  
  /** asks whether a MIME type is supported or not. */
  def supportsMimeType(MimeTypeName: String): Boolean = js.native
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
  
  @scala.inline
  implicit class XMimeTypeInfoMutableBuilder[Self <: XMimeTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSupportedMimeTypeNames(value: () => SafeArray[String]): Self = StObject.set(x, "getSupportedMimeTypeNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupportedMimeTypeNames(value: SafeArray[String]): Self = StObject.set(x, "SupportedMimeTypeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsMimeType(value: String => Boolean): Self = StObject.set(x, "supportsMimeType", js.Any.fromFunction1(value))
  }
}
