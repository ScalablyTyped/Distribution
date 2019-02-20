package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebDAVHTTPMethod extends js.Object

/**
  * Standard WebDAV/HTTP methods.
  * @since Apache OpenOffice 4.0, LibreOffice 4.2
  */
@JSGlobal("com.sun.star.ucb.WebDAVHTTPMethod")
@js.native
object WebDAVHTTPMethod extends js.Object {
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.9"} */
  @js.native
  sealed trait CONNECT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /**
    * Copy the source to the target folder.
    *
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.8"}
    */
  @js.native
  sealed trait COPY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.7"} */
  @js.native
  sealed trait DELETE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /**
    * Get a list of all folders.
    *
    * HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.3"}
    */
  @js.native
  sealed trait GET
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.4"} */
  @js.native
  sealed trait HEAD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.10"}
    */
  @js.native
  sealed trait LOCK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.3"}
    */
  @js.native
  sealed trait MKCOL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /**
    * Move the source to the target folder.
    *
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.9"}
    */
  @js.native
  sealed trait MOVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.2"} */
  @js.native
  sealed trait OPTIONS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /** HTTP request method as defined in [RFC 5789: PATCH Method for HTTP]{@link url="http://tools.ietf.org/html/rfc5789"} */
  @js.native
  sealed trait PATCH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.5"} */
  @js.native
  sealed trait POST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.1"}
    */
  @js.native
  sealed trait PROPFIND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.2"}
    */
  @js.native
  sealed trait PROPPATCH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.6"} */
  @js.native
  sealed trait PUT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /** HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.8"} */
  @js.native
  sealed trait TRACE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /**
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.11"}
    */
  @js.native
  sealed trait UNLOCK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod
  
  /* 7 */ val CONNECT: CONNECT with scala.Double = js.native
  /* 12 */ val COPY: COPY with scala.Double = js.native
  /* 4 */ val DELETE: DELETE with scala.Double = js.native
  /* 0 */ val GET: GET with scala.Double = js.native
  /* 1 */ val HEAD: HEAD with scala.Double = js.native
  /* 14 */ val LOCK: LOCK with scala.Double = js.native
  /* 11 */ val MKCOL: MKCOL with scala.Double = js.native
  /* 13 */ val MOVE: MOVE with scala.Double = js.native
  /* 6 */ val OPTIONS: OPTIONS with scala.Double = js.native
  /* 8 */ val PATCH: PATCH with scala.Double = js.native
  /* 2 */ val POST: POST with scala.Double = js.native
  /* 9 */ val PROPFIND: PROPFIND with scala.Double = js.native
  /* 10 */ val PROPPATCH: PROPPATCH with scala.Double = js.native
  /* 3 */ val PUT: PUT with scala.Double = js.native
  /* 5 */ val TRACE: TRACE with scala.Double = js.native
  /* 15 */ val UNLOCK: UNLOCK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVHTTPMethod with scala.Double
  ] = js.native
}

