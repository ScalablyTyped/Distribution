package typings.asana.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errors {
  
  @JSImport("asana", "errors.AsanaError")
  @js.native
  class AsanaError protected ()
    extends StObject
       with Error {
    /**
      * @param message
      * @return
      */
    def this(message: js.Any) = this()
    
    var code: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var value: js.Any = js.native
  }
  
  @JSImport("asana", "errors.Forbidden")
  @js.native
  class Forbidden protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: js.Any) = this()
  }
  
  @JSImport("asana", "errors.InvalidRequest")
  @js.native
  class InvalidRequest protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: js.Any) = this()
  }
  
  @JSImport("asana", "errors.NoAuthorization")
  @js.native
  class NoAuthorization protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: js.Any) = this()
  }
  
  @JSImport("asana", "errors.NotFound")
  @js.native
  class NotFound protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: js.Any) = this()
  }
  
  @JSImport("asana", "errors.RateLimitEnforced")
  @js.native
  class RateLimitEnforced protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: js.Any) = this()
  }
  
  @JSImport("asana", "errors.ServerError")
  @js.native
  class ServerError protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: js.Any) = this()
  }
}
