package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument for the command "post".
  * @see XCommandProcessor
  * @see WebDAVDocumentContent
  */
trait PostCommandArgument2 extends PostCommandArgument {
  /** The media type (mime type) for the data to post. */
  var MediaType: java.lang.String
  /** The URL of the referrer. */
  var Referer: java.lang.String
}

object PostCommandArgument2 {
  @scala.inline
  def apply(
    MediaType: java.lang.String,
    Referer: java.lang.String,
    Sink: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  ): PostCommandArgument2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MediaType")(MediaType)
    __obj.updateDynamic("Referer")(Referer)
    __obj.updateDynamic("Sink")(Sink)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[PostCommandArgument2]
  }
}

