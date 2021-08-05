package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides information regarding which MIME types are supported by a filter. */
trait XMimeTypeInfo
  extends StObject
     with XInterface {
  
  /** @returns a sequence of the names of all supported MIME types. */
  val SupportedMimeTypeNames: SafeArray[String]
  
  /** @returns a sequence of the names of all supported MIME types. */
  def getSupportedMimeTypeNames(): SafeArray[String]
  
  /** asks whether a MIME type is supported or not. */
  def supportsMimeType(MimeTypeName: String): Boolean
}
object XMimeTypeInfo {
  
  inline def apply(
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
  
  extension [Self <: XMimeTypeInfo](x: Self) {
    
    inline def setGetSupportedMimeTypeNames(value: () => SafeArray[String]): Self = StObject.set(x, "getSupportedMimeTypeNames", js.Any.fromFunction0(value))
    
    inline def setSupportedMimeTypeNames(value: SafeArray[String]): Self = StObject.set(x, "SupportedMimeTypeNames", value.asInstanceOf[js.Any])
    
    inline def setSupportsMimeType(value: String => Boolean): Self = StObject.set(x, "supportsMimeType", js.Any.fromFunction1(value))
  }
}
