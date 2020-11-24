package typings.awsLambda.s3BatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3BatchResultResult extends js.Object {
  
  var resultCode: S3BatchResultResultCode = js.native
  
  var resultString: String = js.native
  
  var taskId: String = js.native
}
object S3BatchResultResult {
  
  @scala.inline
  def apply(resultCode: S3BatchResultResultCode, resultString: String, taskId: String): S3BatchResultResult = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any], resultString = resultString.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BatchResultResult]
  }
  
  @scala.inline
  implicit class S3BatchResultResultOps[Self <: S3BatchResultResult] (val x: Self) extends AnyVal {
    
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
    def setResultCode(value: S3BatchResultResultCode): Self = this.set("resultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultString(value: String): Self = this.set("resultString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: String): Self = this.set("taskId", value.asInstanceOf[js.Any])
  }
}
