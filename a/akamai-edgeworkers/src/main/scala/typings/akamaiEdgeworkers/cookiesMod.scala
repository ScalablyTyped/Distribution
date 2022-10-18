package typings.akamaiEdgeworkers

import typings.akamaiEdgeworkers.akamaiEdgeworkersBooleans.`true`
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.Lax
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.None
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.Strict
import typings.akamaiEdgeworkers.anon.Domain
import typings.akamaiEdgeworkers.anon.ToUTCString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Query, add, and remove cookies.
  */
object cookiesMod {
  
  /**
    * Provides access to the Cookies header of a request, allowing the
    * addition, removal, or modification of cookie values.
    */
  @JSImport("cookies", "Cookies")
  @js.native
  /**
    * Constructor for a new "Cookies" struct to hold cookies.
    *
    * @param cookieHeader The raw Cookie header to pass to the constructor
    *      to parse. If an array is passed, the first element must be a
    *      string and that is used as the cookies string to parse. If this
    *      is not passed, an empty cookies object is returned.
    *
    * @param options Only used when parsing an existing Cookie header.
    *      Object to override the default decode of the Cookie values. This
    *      object must have a function named 'decode' on it, which should
    *      take a string and return the result of the custom decoding of
    *      that string.
    */
  open class Cookies () extends StObject {
    def this(header: String) = this()
    def this(header: js.Array[String]) = this()
    def this(header: String, options: js.Object) = this()
    def this(header: js.Array[String], options: js.Object) = this()
    def this(header: Null, options: js.Object) = this()
    def this(header: Unit, options: js.Object) = this()
    
    /**
      * Adds a cookie.
      * @param name Name of the cookie
      * @param value Value of the cookie.
      */
    def add(name: String, value: String): Unit = js.native
    
    /**
      * Removes all cookies with a given name.
      *
      * @param name Cookie name.
      */
    def delete(name: String): Unit = js.native
    
    /**
      * Get the first instance of the cookie matching the given name.
      *
      * @param name Cookie name.
      */
    def get(name: String): js.UndefOr[String] = js.native
    
    /**
      * Get all Instances of the cookie matching the given name.
      *
      * @param name cookie name.
      */
    def getAll(name: String): js.Array[String] = js.native
    
    /**
      * Get all names of existing cookies held by this Cookies object.
      */
    def names(): js.Array[String] = js.native
    
    /**
      * Returns the string representation to use when setting the Cookie
      * header, encoding values by default.
      */
    def toHeader(): String = js.native
  }
  
  /**
    * Provides access to the SetCookies header of a request.
    */
  @JSImport("cookies", "SetCookie")
  @js.native
  /**
    * Constructor for a new "SetCookie" struct to hold a specific Set-Cookie
    * header representation.
    */
  open class SetCookie () extends StObject {
    def this(opts: Domain) = this()
    
    var domain: String = js.native
    
    var expires: ToUTCString = js.native
    
    var httpOnly: Boolean = js.native
    
    var maxAge: Double = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var sameSite: Strict | Lax | None | `true` = js.native
    
    var secure: Boolean = js.native
    
    /**
      * Returns the string representation to use when setting the Set-Cookie
      * header, encoding values by default.
      */
    def toHeader(): String = js.native
    
    var value: String = js.native
  }
}
