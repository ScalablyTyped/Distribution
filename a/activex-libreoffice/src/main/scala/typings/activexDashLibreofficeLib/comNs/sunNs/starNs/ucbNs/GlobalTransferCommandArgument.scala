package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This struct contains information needed to transfer objects from one location to another. */
trait GlobalTransferCommandArgument extends js.Object {
  /**
    * describes how to act in case of title clashes while transferring the data.
    *
    * A title clash for instance occurs, if a file named "foo.txt" is to be transferred to a folder already containing another file named "foo.txt". Refer
    * to {@link NameClash} for possible values for this field.
    */
  var NameClash: scala.Double
  /**
    * contains the title of the transferred object, if it is different from the original one.
    *
    * If this field is filled, for example, a file will be renamed while it is being transferred.
    */
  var NewTitle: java.lang.String
  /** contains the action to perform ( COPY, MOVE, LINK ). */
  var Operation: TransferCommandOperation
  /** contains the URL of the source object. */
  var SourceURL: java.lang.String
  /** contains the URL of the target folder. */
  var TargetURL: java.lang.String
}

object GlobalTransferCommandArgument {
  @scala.inline
  def apply(
    NameClash: scala.Double,
    NewTitle: java.lang.String,
    Operation: TransferCommandOperation,
    SourceURL: java.lang.String,
    TargetURL: java.lang.String
  ): GlobalTransferCommandArgument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("NameClash")(NameClash)
    __obj.updateDynamic("NewTitle")(NewTitle)
    __obj.updateDynamic("Operation")(Operation)
    __obj.updateDynamic("SourceURL")(SourceURL)
    __obj.updateDynamic("TargetURL")(TargetURL)
    __obj.asInstanceOf[GlobalTransferCommandArgument]
  }
}

