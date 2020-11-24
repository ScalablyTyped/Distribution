package typings.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseTransformationResultRecord extends js.Object {
  
  /** Encode in Base64 */
  var data: String = js.native
  
  var recordId: String = js.native
  
  var result: FirehoseRecordTransformationStatus = js.native
}
object FirehoseTransformationResultRecord {
  
  @scala.inline
  def apply(data: String, recordId: String, result: FirehoseRecordTransformationStatus): FirehoseTransformationResultRecord = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseTransformationResultRecord]
  }
  
  @scala.inline
  implicit class FirehoseTransformationResultRecordOps[Self <: FirehoseTransformationResultRecord] (val x: Self) extends AnyVal {
    
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordId(value: String): Self = this.set("recordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: FirehoseRecordTransformationStatus): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
