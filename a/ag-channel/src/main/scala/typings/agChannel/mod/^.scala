package typings.agChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-channel", JSImport.Namespace)
@js.native
class ^[T] protected () extends AGChannel[T] {
  def this(
    name: String,
    client: Client,
    eventDemux: typings.streamDemux.mod.^[T],
    dataDemux: typings.streamDemux.mod.^[T]
  ) = this()
}
