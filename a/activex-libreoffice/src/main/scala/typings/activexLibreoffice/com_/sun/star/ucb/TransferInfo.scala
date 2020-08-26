package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains information needed to transfer objects from one location to another.
  *
  * The transfer command is always called on the target folder. For a details description of the transfer command refer to the documentation of service
  * {@link Content} .
  */
@js.native
trait TransferInfo extends js.Object {
  /** contains the flags describing whether the data shall be moved instead of copied. */
  var MoveData: Boolean = js.native
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
  var NameClash: Double = js.native
  /**
    * contains the title of the transferred object, if it is different from the original one.
    *
    * If this field is filled, for example, a file will be renamed while it is being transferred.
    */
  var NewTitle: String = js.native
  /** contains the URL of the source of the action (e.g. the URL of a file to move). */
  var SourceURL: String = js.native
}

object TransferInfo {
  @scala.inline
  def apply(MoveData: Boolean, NameClash: Double, NewTitle: String, SourceURL: String): TransferInfo = {
    val __obj = js.Dynamic.literal(MoveData = MoveData.asInstanceOf[js.Any], NameClash = NameClash.asInstanceOf[js.Any], NewTitle = NewTitle.asInstanceOf[js.Any], SourceURL = SourceURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInfo]
  }
  @scala.inline
  implicit class TransferInfoOps[Self <: TransferInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMoveData(value: Boolean): Self = this.set("MoveData", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameClash(value: Double): Self = this.set("NameClash", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewTitle(value: String): Self = this.set("NewTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceURL(value: String): Self = this.set("SourceURL", value.asInstanceOf[js.Any])
  }
  
}

