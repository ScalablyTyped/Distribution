package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implementations of this interface do create a {@link com.sun.star.datatransfer.XMimeContentType} from a given string that represents a MIME
  * content-type (see [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and [Rfc2046]{@link url="ftp://ftp.isi.edu/in-notes/rfc2046.txt"} ).
  */
trait XMimeContentTypeFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Creates an object that implements {@link XMimeContentType} .
    * @param aContentType A string that represents a MIME content-type as specified in [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and [Rfc2
    * @returns An object that implements {@link XMimeContentType} .
    * @see com.sun.star.datatransfer.XMimeContentType
    * @throws com::sun::star::lang::IllegalArgumentException if the string does not conform to [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} an
    */
  def createMimeContentType(aContentType: java.lang.String): XMimeContentType
}

