package typings
package asanaLib.asanaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asana", "errors")
@js.native
object errorsNs extends js.Object {
  @js.native
  class AsanaError protected ()
    extends stdLib.Error {
    /**
      * @param message
      * @return
      */
    def this(message: js.Any) = this()
    var code: scala.Double = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
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

