package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument for the command "post".
  * @see XCommandProcessor
  */
trait PostCommandArgument extends js.Object {
  /** The data sink receiving the returned contents (supporting either {@link com.sun.star.io.XActiveDataSink} or {@link com.sun.star.io.XOutputStream} ). */
  var Sink: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /** The data source containing the data to post. */
  var Source: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
}

object PostCommandArgument {
  @scala.inline
  def apply(
    Sink: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  ): PostCommandArgument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Sink")(Sink)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[PostCommandArgument]
  }
}

