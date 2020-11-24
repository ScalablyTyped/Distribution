package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordingName extends js.Object {
  
  var recordingName: String = js.native
}
object RecordingName {
  
  @scala.inline
  def apply(recordingName: String): RecordingName = {
    val __obj = js.Dynamic.literal(recordingName = recordingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingName]
  }
  
  @scala.inline
  implicit class RecordingNameOps[Self <: RecordingName] (val x: Self) extends AnyVal {
    
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
    def setRecordingName(value: String): Self = this.set("recordingName", value.asInstanceOf[js.Any])
  }
}
