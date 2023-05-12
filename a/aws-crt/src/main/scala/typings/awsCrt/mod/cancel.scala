package typings.awsCrt.mod

import typings.awsCrt.distCommonCancelMod.CancelControllerOptions
import typings.awsCrt.distCommonCancelMod.CancellableNextEventPromiseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cancel {
  
  @JSImport("aws-crt", "cancel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt", "cancel.CancelController")
  @js.native
  open class CancelController ()
    extends typings.awsCrt.distCommonCancelMod.CancelController {
    def this(options: CancelControllerOptions) = this()
  }
  
  @JSImport("aws-crt", "cancel.EVENT_NAME")
  @js.native
  val EVENT_NAME: /* "cancelled" */ String = js.native
  
  inline def newCancellablePromiseFromNextEvent[ResultType](config: CancellableNextEventPromiseOptions[ResultType]): js.Promise[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("newCancellablePromiseFromNextEvent")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultType]]
}
