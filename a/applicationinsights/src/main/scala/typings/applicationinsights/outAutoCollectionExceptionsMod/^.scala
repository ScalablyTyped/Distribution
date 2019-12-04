package typings.applicationinsights.outAutoCollectionExceptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/Exceptions", JSImport.Namespace)
@js.native
class ^ protected () extends AutoCollectExceptions {
  def this(client: typings.applicationinsights.outLibraryTelemetryClientMod.^) = this()
  /* CompleteClass */
  override var _client: js.Any = js.native
  /* CompleteClass */
  override var _exceptionListenerHandle: js.Any = js.native
  /* CompleteClass */
  override var _isInitialized: js.Any = js.native
  /* CompleteClass */
  override var _rejectionListenerHandle: js.Any = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def enable(isEnabled: Boolean): Unit = js.native
  /* CompleteClass */
  override def isInitialized(): Boolean = js.native
}

@JSImport("applicationinsights/out/AutoCollection/Exceptions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var INSTANCE: AutoCollectExceptions = js.native
  val UNCAUGHT_EXCEPTION_HANDLER_NAME: String = js.native
  val UNHANDLED_REJECTION_HANDLER_NAME: String = js.native
  var _FALLBACK_ERROR_MESSAGE: js.Any = js.native
}

