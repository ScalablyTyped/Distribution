package typings.activexLibreoffice.com_.sun.star.datatransfer

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implementations of this interface do create a {@link com.sun.star.datatransfer.XMimeContentType} from a given string that represents a MIME
  * content-type (see [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and [Rfc2046]{@link url="ftp://ftp.isi.edu/in-notes/rfc2046.txt"} ).
  */
trait XMimeContentTypeFactory
  extends StObject
     with XInterface {
  
  /**
    * Creates an object that implements {@link XMimeContentType} .
    * @param aContentType A string that represents a MIME content-type as specified in [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and [Rfc2
    * @returns An object that implements {@link XMimeContentType} .
    * @see com.sun.star.datatransfer.XMimeContentType
    * @throws com::sun::star::lang::IllegalArgumentException if the string does not conform to [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} an
    */
  def createMimeContentType(aContentType: String): XMimeContentType
}
object XMimeContentTypeFactory {
  
  inline def apply(
    acquire: () => Unit,
    createMimeContentType: String => XMimeContentType,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XMimeContentTypeFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createMimeContentType = js.Any.fromFunction1(createMimeContentType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMimeContentTypeFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMimeContentTypeFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateMimeContentType(value: String => XMimeContentType): Self = StObject.set(x, "createMimeContentType", js.Any.fromFunction1(value))
  }
}
