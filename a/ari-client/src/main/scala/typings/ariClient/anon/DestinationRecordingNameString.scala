package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationRecordingNameString extends js.Object {
  var destinationRecordingName: String = js.native
}

object DestinationRecordingNameString {
  @scala.inline
  def apply(destinationRecordingName: String): DestinationRecordingNameString = {
    val __obj = js.Dynamic.literal(destinationRecordingName = destinationRecordingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationRecordingNameString]
  }
  @scala.inline
  implicit class DestinationRecordingNameStringOps[Self <: DestinationRecordingNameString] (val x: Self) extends AnyVal {
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
    def setDestinationRecordingName(value: String): Self = this.set("destinationRecordingName", value.asInstanceOf[js.Any])
  }
  
}

