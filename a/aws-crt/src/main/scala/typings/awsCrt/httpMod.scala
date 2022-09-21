package typings.awsCrt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("aws-crt/dist/common/http", "CommonHttpProxyOptions")
  @js.native
  open class CommonHttpProxyOptions protected () extends StObject {
    /**
      *
      * @param host_name endpoint of the proxy to use
      * @param port port of proxy to use
      * @param auth_method type of authentication to use with the proxy
      * @param auth_username (basic authentication only) proxy username
      * @param auth_password (basic authentication only) password associated with the username
      */
    def this(host_name: String, port: Double) = this()
    def this(host_name: String, port: Double, auth_method: HttpProxyAuthenticationType) = this()
    def this(host_name: String, port: Double, auth_method: Unit, auth_username: String) = this()
    def this(host_name: String, port: Double, auth_method: HttpProxyAuthenticationType, auth_username: String) = this()
    def this(host_name: String, port: Double, auth_method: Unit, auth_username: String, auth_password: String) = this()
    def this(host_name: String, port: Double, auth_method: Unit, auth_username: Unit, auth_password: String) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: String
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: String
    ) = this()
    
    var auth_method: HttpProxyAuthenticationType = js.native
    
    var auth_password: js.UndefOr[String] = js.native
    
    var auth_username: js.UndefOr[String] = js.native
    
    var host_name: String = js.native
    
    var port: Double = js.native
  }
  
  @js.native
  sealed trait HttpProxyAuthenticationType extends StObject
  @JSImport("aws-crt/dist/common/http", "HttpProxyAuthenticationType")
  @js.native
  object HttpProxyAuthenticationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HttpProxyAuthenticationType & Double] = js.native
    
    /**
      * Use basic authentication (user/pass).  Supply these values in {@link HttpProxyOptions}
      */
    @js.native
    sealed trait Basic
      extends StObject
         with HttpProxyAuthenticationType
    /* 1 */ val Basic: typings.awsCrt.httpMod.HttpProxyAuthenticationType.Basic & Double = js.native
    
    /**
      * No to-proxy authentication logic
      */
    @js.native
    sealed trait None
      extends StObject
         with HttpProxyAuthenticationType
    /* 0 */ val None: typings.awsCrt.httpMod.HttpProxyAuthenticationType.None & Double = js.native
  }
  
  @js.native
  sealed trait HttpVersion extends StObject
  @JSImport("aws-crt/dist/common/http", "HttpVersion")
  @js.native
  object HttpVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HttpVersion & Double] = js.native
    
    /** HTTP/1.0 */
    @js.native
    sealed trait Http1_0
      extends StObject
         with HttpVersion
    /* 1 */ val Http1_0: typings.awsCrt.httpMod.HttpVersion.Http1_0 & Double = js.native
    
    /** HTTP/1.1 */
    @js.native
    sealed trait Http1_1
      extends StObject
         with HttpVersion
    /* 2 */ val Http1_1: typings.awsCrt.httpMod.HttpVersion.Http1_1 & Double = js.native
    
    /** HTTP/2 */
    @js.native
    sealed trait Http2
      extends StObject
         with HttpVersion
    /* 3 */ val Http2: typings.awsCrt.httpMod.HttpVersion.Http2 & Double = js.native
    
    @js.native
    sealed trait Unknown
      extends StObject
         with HttpVersion
    /* 0 */ val Unknown: typings.awsCrt.httpMod.HttpVersion.Unknown & Double = js.native
  }
  
  type HttpClientConnectionClosed = js.Function0[Unit]
  
  type HttpClientConnectionConnected = js.Function0[Unit]
  
  type HttpClientConnectionError = js.Function1[/* error */ js.Error, Unit]
  
  type HttpHeader = js.Tuple2[String, String]
  
  @js.native
  trait HttpHeaders extends StObject {
    
    /** @hidden */
    def _flatten(): js.Array[HttpHeader] = js.native
    
    /**
      * Add a name/value pair
      * @param name - The header name
      * @param value - The header value
      */
    def add(name: String, value: String): Unit = js.native
    
    /** Clears the entire header set */
    def clear(): Unit = js.native
    
    /**
      * Gets the first value for the given name, ignoring any additional values
      * @param name - The header name to look for
      * @param default_value - Value returned if no values are found for the given name
      * @return The first header value, or default if no values exist
      */
    def get(name: String): String = js.native
    def get(name: String, default_value: String): String = js.native
    
    /**
      * Get the list of values for the given name
      * @param name - The header name to look for
      * @return List of values, or empty list if none exist
      */
    def get_values(name: String): js.Array[String] = js.native
    
    /**
      * Iterator. Allows for:
      * let headers = new HttpHeaders();
      * ...
      * for (const header of headers) { }
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Iterator[HttpHeader]] = js.native
    
    val length: Double = js.native
    
    /**
      * Removes all values for the given name
      * @param name - The header to remove all values for
      */
    def remove(name: String): Unit = js.native
    
    /**
      * Removes a specific name/value pair
      * @param name - The header name to remove
      * @param value - The header value to remove
      */
    def remove_value(name: String, value: String): Unit = js.native
    
    /**
      * Set a name/value pair, replacing any existing values for the name
      * @param name - The header name
      * @param value - The header value
      */
    def set(name: String, value: String): Unit = js.native
  }
  
  type HttpStreamComplete = js.Function0[Unit]
  
  type HttpStreamData = js.Function1[/* body_data */ js.typedarray.ArrayBuffer, Unit]
  
  type HttpStreamError = js.Function1[/* error */ js.Error, Unit]
}
