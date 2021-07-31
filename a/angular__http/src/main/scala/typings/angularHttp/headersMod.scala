package typings.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headersMod {
  
  @JSImport("@angular/http/src/headers", "Headers")
  @js.native
  class Headers () extends StObject {
    def this(headers: StringDictionary[js.Any]) = this()
    def this(headers: Headers) = this()
    
    /**
      * Appends a header to existing list of header values for a given header name.
      */
    def append(name: String, value: String): Unit = js.native
    
    /**
      * Deletes all header values for the given name.
      */
    def delete(name: String): Unit = js.native
    
    /**
      * This method is not implemented.
      */
    def entries(): Unit = js.native
    
    def forEach(
      fn: js.Function3[
          /* values */ js.Array[String], 
          /* name */ js.UndefOr[String], 
          /* headers */ Map[String, js.Array[String]], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Returns first header that matches given name.
      */
    def get(name: String): String | Null = js.native
    
    /**
      * Returns list of header values for a given name.
      */
    def getAll(name: String): js.Array[String] | Null = js.native
    
    /**
      * Checks for existence of header by given name.
      */
    def has(name: String): Boolean = js.native
    
    /**
      * Returns the names of the headers
      */
    def keys(): js.Array[String] = js.native
    
    var mayBeSetNormalizedName: js.Any = js.native
    
    /**
      * Sets or overrides header value for given name.
      */
    def set(name: String, value: String): Unit = js.native
    def set(name: String, value: js.Array[String]): Unit = js.native
    
    /**
      * Returns string of all headers.
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /**
      * Returns values of all headers.
      */
    def values(): js.Array[js.Array[String]] = js.native
  }
  /* static members */
  object Headers {
    
    @JSImport("@angular/http/src/headers", "Headers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Headers instance from the given DOMString of Response Headers
      */
    @scala.inline
    def fromResponseHeaderString(headersString: String): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("fromResponseHeaderString")(headersString.asInstanceOf[js.Any]).asInstanceOf[Headers]
  }
}
