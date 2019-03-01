package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains information needed to transfer objects from one location to another.
  *
  * The transfer command is always called on the target folder. For a details description of the transfer command refer to the documentation of service
  * {@link Content} .
  */
trait TransferInfo extends js.Object {
  /** contains the flags describing whether the data shall be moved instead of copied. */
  var MoveData: scala.Boolean
  /**
    * describes how to act in case of title clashes while transferring the data.
    *
    * A title clash for instance occurs, if a file named "foo.txt" is to be transferred to a folder already containing another file named "foo.txt".
    *
    * The value can be one of the {@link NameClash} constants.
    *
    * Implementations that are not able to detect whether there is a clashing resource may ignore {@link NameClash.ERROR} and {@link NameClash.RENAME}
    * always write the new data.
    */
  var NameClash: scala.Double
  /**
    * contains the title of the transferred object, if it is different from the original one.
    *
    * If this field is filled, for example, a file will be renamed while it is being transferred.
    */
  var NewTitle: java.lang.String
  /** contains the URL of the source of the action (e.g. the URL of a file to move). */
  var SourceURL: java.lang.String
}

object TransferInfo {
  @scala.inline
  def apply(
    MoveData: scala.Boolean,
    NameClash: scala.Double,
    NewTitle: java.lang.String,
    SourceURL: java.lang.String
  ): TransferInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MoveData")(MoveData)
    __obj.updateDynamic("NameClash")(NameClash)
    __obj.updateDynamic("NewTitle")(NewTitle)
    __obj.updateDynamic("SourceURL")(SourceURL)
    __obj.asInstanceOf[TransferInfo]
  }
}

