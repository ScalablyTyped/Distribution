package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Standard WebDAV/HTTP methods.
  * @since Apache OpenOffice 4.0, LibreOffice 4.2
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`12`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`14`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`13`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`15`
*/
trait WebDAVHTTPMethod extends js.Object

object WebDAVHTTPMethod {
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.9"} */
  @scala.inline
  def CONNECT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /**
    * Copy the source to the target folder.
    *
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.8"}
    */
  @scala.inline
  def COPY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`12` = this.cast(12)
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.7"} */
  @scala.inline
  def DELETE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /**
    * Get a list of all folders.
    *
    * HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.3"}
    */
  @scala.inline
  def GET: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.4"} */
  @scala.inline
  def HEAD: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.10"}
    */
  @scala.inline
  def LOCK: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`14` = this.cast(14)
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.3"}
    */
  @scala.inline
  def MKCOL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11` = this.cast(11)
  /**
    * Move the source to the target folder.
    *
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.9"}
    */
  @scala.inline
  def MOVE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`13` = this.cast(13)
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.2"} */
  @scala.inline
  def OPTIONS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /** HTTP request method as defined in [RFC 5789: PATCH Method for HTTP]{@link url="http://tools.ietf.org/html/rfc5789"} */
  @scala.inline
  def PATCH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8` = this.cast(8)
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.5"} */
  @scala.inline
  def POST: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.1"}
    */
  @scala.inline
  def PROPFIND: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9` = this.cast(9)
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.2"}
    */
  @scala.inline
  def PROPPATCH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10` = this.cast(10)
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.6"} */
  @scala.inline
  def PUT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.8"} */
  @scala.inline
  def TRACE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.11"}
    */
  @scala.inline
  def UNLOCK: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`15` = this.cast(15)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

