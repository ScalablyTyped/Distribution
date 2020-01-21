package typings.applicationinsights.httpDependenciesMod

import typings.applicationinsights.nodeHttpDependencyTelemetryMod.NodeHttpDependencyTelemetry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/HttpDependencies", JSImport.Namespace)
@js.native
class ^ protected () extends AutoCollectHttpDependencies {
  def this(client: typings.applicationinsights.telemetryClientMod.^) = this()
  /* CompleteClass */
  override var _client: js.Any = js.native
  /* CompleteClass */
  override var _isEnabled: js.Any = js.native
  /* CompleteClass */
  override var _isInitialized: js.Any = js.native
  /* CompleteClass */
  /* private */ override def _initialize(): js.Any = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def enable(isEnabled: Boolean): Unit = js.native
  /* CompleteClass */
  override def isInitialized(): Boolean = js.native
}

@JSImport("applicationinsights/out/AutoCollection/HttpDependencies", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var INSTANCE: AutoCollectHttpDependencies = js.native
  var alreadyAutoCollectedFlag: js.Any = js.native
  var disableCollectionRequestOption: String = js.native
  var requestNumber: js.Any = js.native
  /**
    * Tracks an outgoing request. Because it may set headers this method must be called before
    * writing content to or ending the request.
    */
  def trackRequest(client: typings.applicationinsights.telemetryClientMod.^, telemetry: NodeHttpDependencyTelemetry): Unit = js.native
}

