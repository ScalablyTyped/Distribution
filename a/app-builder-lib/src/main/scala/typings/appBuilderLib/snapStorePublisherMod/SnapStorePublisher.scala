package typings.appBuilderLib.snapStorePublisherMod

import typings.appBuilderLib.appBuilderLibStrings.snapStore
import typings.electronPublish.mod.PublishContext
import typings.electronPublish.mod.Publisher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/SnapStorePublisher", "SnapStorePublisher")
@js.native
class SnapStorePublisher protected () extends Publisher {
  def this(context: PublishContext, options: SnapStoreOptions) = this()
  var options: js.Any = js.native
  @JSName("providerName")
  val providerName_FSnapStorePublisher: snapStore = js.native
}

