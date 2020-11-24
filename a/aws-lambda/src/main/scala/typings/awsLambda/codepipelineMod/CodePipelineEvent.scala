package typings.awsLambda.codepipelineMod

import typings.awsLambda.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodePipelineEvent extends js.Object {
  
  @JSName("CodePipeline.job")
  var CodePipelineDotjob: Data = js.native
}
object CodePipelineEvent {
  
  @scala.inline
  def apply(CodePipelineDotjob: Data): CodePipelineEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CodePipeline.job")(CodePipelineDotjob.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePipelineEvent]
  }
  
  @scala.inline
  implicit class CodePipelineEventOps[Self <: CodePipelineEvent] (val x: Self) extends AnyVal {
    
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
    def setCodePipelineDotjob(value: Data): Self = this.set("CodePipeline.job", value.asInstanceOf[js.Any])
  }
}
