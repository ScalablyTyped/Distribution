package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An identifier for contents.
  * @author Kai Sommerfeld
  * @see XContent
  * @version 1.0
  */
trait XContentIdentifier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the content identifier string.
    * @returns the content identifier string. This must be a valid URI (Uniform Resource Identifier, see RFC 2396). This string is required. If a content provid
    */
  val ContentIdentifier: java.lang.String
  /**
    * returns the content provider scheme string.
    *
    * This string will be calculated from the content identifier string and must be lower-cased(!). It is the "scheme" the content provider is registered
    * for. In example, a provider for FTP contents will use ftp-URLs as content identifiers. The content provider scheme for all contents provided by that
    * provider will be "ftp".
    * @returns the content provider scheme string.
    */
  val ContentProviderScheme: java.lang.String
  /**
    * returns the content identifier string.
    * @returns the content identifier string. This must be a valid URI (Uniform Resource Identifier, see RFC 2396). This string is required. If a content provid
    */
  def getContentIdentifier(): java.lang.String
  /**
    * returns the content provider scheme string.
    *
    * This string will be calculated from the content identifier string and must be lower-cased(!). It is the "scheme" the content provider is registered
    * for. In example, a provider for FTP contents will use ftp-URLs as content identifiers. The content provider scheme for all contents provided by that
    * provider will be "ftp".
    * @returns the content provider scheme string.
    */
  def getContentProviderScheme(): java.lang.String
}

