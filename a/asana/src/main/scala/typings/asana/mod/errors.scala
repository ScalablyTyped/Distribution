package typings.asana.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errors {
  
  @JSImport("asana", "errors.AsanaError")
  @js.native
  open class AsanaError protected ()
    extends StObject
       with Error {
    /**
      * @param message
      * @return
      */
    def this(message: Any) = this()
    
    var code: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var value: Any = js.native
  }
  
  @JSImport("asana", "errors.Forbidden")
  @js.native
  open class Forbidden protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: Any) = this()
  }
  
  @JSImport("asana", "errors.InvalidRequest")
  @js.native
  open class InvalidRequest protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: Any) = this()
  }
  
  @JSImport("asana", "errors.NoAuthorization")
  @js.native
  open class NoAuthorization protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: Any) = this()
  }
  
  @JSImport("asana", "errors.NotFound")
  @js.native
  open class NotFound protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: Any) = this()
  }
  
  @JSImport("asana", "errors.RateLimitEnforced")
  @js.native
  open class RateLimitEnforced protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: Any) = this()
  }
  
  @JSImport("asana", "errors.ServerError")
  @js.native
  open class ServerError protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: Any) = this()
  }
}
