package typings.asana.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asana", "errors")
@js.native
object errors extends js.Object {
  
  @js.native
  class AsanaError protected () extends Error {
    /**
      * @param message
      * @return
      */
    def this(message: js.Any) = this()
    
    var code: Double = js.native
    
    var value: js.Any = js.native
  }
  
  @js.native
  class Forbidden protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: js.Any) = this()
  }
  
  @js.native
  class InvalidRequest protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: js.Any) = this()
  }
  
  @js.native
  class NoAuthorization protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: js.Any) = this()
  }
  
  @js.native
  class NotFound protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: js.Any) = this()
  }
  
  @js.native
  class RateLimitEnforced protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: js.Any) = this()
  }
  
  @js.native
  class ServerError protected () extends AsanaError {
    /**
      * @param value
      * @return
      */
    def this(value: js.Any) = this()
  }
}
