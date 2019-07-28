package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`10`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`11`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`12`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`13`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`14`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`15`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Standard WebDAV/HTTP methods.
  * @since Apache OpenOffice 4.0, LibreOffice 4.2
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`12`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`14`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`11`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`13`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`9`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`10`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`15`
*/
trait WebDAVHTTPMethod extends js.Object

object WebDAVHTTPMethod {
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.9"} */
  @scala.inline
  def CONNECT: `7` = this.cast(7)
  /**
    * Copy the source to the target folder.
    *
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.8"}
    */
  @scala.inline
  def COPY: `12` = this.cast(12)
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.7"} */
  @scala.inline
  def DELETE: `4` = this.cast(4)
  /**
    * Get a list of all folders.
    *
    * HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.3"}
    */
  @scala.inline
  def GET: `0` = this.cast(0)
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.4"} */
  @scala.inline
  def HEAD: `1` = this.cast(1)
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.10"}
    */
  @scala.inline
  def LOCK: `14` = this.cast(14)
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.3"}
    */
  @scala.inline
  def MKCOL: `11` = this.cast(11)
  /**
    * Move the source to the target folder.
    *
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.9"}
    */
  @scala.inline
  def MOVE: `13` = this.cast(13)
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.2"} */
  @scala.inline
  def OPTIONS: `6` = this.cast(6)
  /** HTTP request method as defined in [RFC 5789: PATCH Method for HTTP]{@link url="http://tools.ietf.org/html/rfc5789"} */
  @scala.inline
  def PATCH: `8` = this.cast(8)
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.5"} */
  @scala.inline
  def POST: `2` = this.cast(2)
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.1"}
    */
  @scala.inline
  def PROPFIND: `9` = this.cast(9)
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.2"}
    */
  @scala.inline
  def PROPPATCH: `10` = this.cast(10)
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.6"} */
  @scala.inline
  def PUT: `3` = this.cast(3)
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.8"} */
  @scala.inline
  def TRACE: `5` = this.cast(5)
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.11"}
    */
  @scala.inline
  def UNLOCK: `15` = this.cast(15)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

