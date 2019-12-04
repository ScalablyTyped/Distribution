package typings.applicationinsights

import typings.applicationinsights.outLibraryTelemetryClientMod.^
import typings.diagnosticDashChannel.diagnosticDashChannelMod.IStandardEvent
import typings.diagnosticDashChannelDashPublishers.distSrcMongodbDotPubMod.IMongoData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/diagnostic-channel/mongodb.sub", JSImport.Namespace)
@js.native
object outAutoCollectionDiagnosticDashChannelMongodbDotSubMod extends js.Object {
  def enable(enabled: Boolean, client: ^): Unit = js.native
  def subscriber(event: IStandardEvent[IMongoData]): Unit = js.native
}

