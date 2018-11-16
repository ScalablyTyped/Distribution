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
    extends asanaLib.asanaMod.asanaNs.errorsNs.AsanaError {
    /**
                 * @param message
                 * @return
                 */
    def this(message: js.Any) = this()
    /* CompleteClass */
    override var code: scala.Double = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
  }
  
  @js.native
  class Forbidden protected ()
    extends asanaLib.asanaMod.asanaNs.errorsNs.Forbidden {
    /**
                 * @param value
                 * @return
                 */
    def this(value: js.Any) = this()
    /* CompleteClass */
    override var code: scala.Double = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
  }
  
  @js.native
  class InvalidRequest protected ()
    extends asanaLib.asanaMod.asanaNs.errorsNs.InvalidRequest {
    /**
                 * @param value
                 * @return
                 */
    def this(value: js.Any) = this()
    /* CompleteClass */
    override var code: scala.Double = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
  }
  
  @js.native
  class NoAuthorization protected ()
    extends asanaLib.asanaMod.asanaNs.errorsNs.NoAuthorization {
    /**
                 * @param value
                 * @return
                 */
    def this(value: js.Any) = this()
    /* CompleteClass */
    override var code: scala.Double = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
  }
  
  @js.native
  class NotFound protected ()
    extends asanaLib.asanaMod.asanaNs.errorsNs.NotFound {
    /**
                 * @param value
                 * @return
                 */
    def this(value: js.Any) = this()
    /* CompleteClass */
    override var code: scala.Double = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
  }
  
  @js.native
  class RateLimitEnforced protected ()
    extends asanaLib.asanaMod.asanaNs.errorsNs.RateLimitEnforced {
    /**
                 * @param value
                 * @return
                 */
    def this(value: js.Any) = this()
    /* CompleteClass */
    override var code: scala.Double = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
  }
  
  @js.native
  class ServerError protected ()
    extends asanaLib.asanaMod.asanaNs.errorsNs.ServerError {
    /**
                 * @param value
                 * @return
                 */
    def this(value: js.Any) = this()
    /* CompleteClass */
    override var code: scala.Double = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
  }
  
}

