package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAnalyzerResponse extends js.Object {
  
  /**
    * The ARN of the analyzer that was created by the request.
    */
  var arn: js.UndefOr[AnalyzerArn] = js.native
}
object CreateAnalyzerResponse {
  
  @scala.inline
  def apply(): CreateAnalyzerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAnalyzerResponse]
  }
  
  @scala.inline
  implicit class CreateAnalyzerResponseOps[Self <: CreateAnalyzerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: AnalyzerArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
  }
}
