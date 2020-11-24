package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationRecordingName extends js.Object {
  
  var destinationRecordingName: String = js.native
  
  var recordingName: String = js.native
}
object DestinationRecordingName {
  
  @scala.inline
  def apply(destinationRecordingName: String, recordingName: String): DestinationRecordingName = {
    val __obj = js.Dynamic.literal(destinationRecordingName = destinationRecordingName.asInstanceOf[js.Any], recordingName = recordingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationRecordingName]
  }
  
  @scala.inline
  implicit class DestinationRecordingNameOps[Self <: DestinationRecordingName] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setRecordingName(value: String): Self = this.set("recordingName", value.asInstanceOf[js.Any])
  }
}
