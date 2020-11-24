package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineConfig extends js.Object {
  
  /**
    * A list of Function objects.
    */
  var functions: js.UndefOr[FunctionsIds] = js.native
}
object PipelineConfig {
  
  @scala.inline
  def apply(): PipelineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineConfig]
  }
  
  @scala.inline
  implicit class PipelineConfigOps[Self <: PipelineConfig] (val x: Self) extends AnyVal {
    
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
    def setFunctionsVarargs(value: String*): Self = this.set("functions", js.Array(value :_*))
    
    @scala.inline
    def setFunctions(value: FunctionsIds): Self = this.set("functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
  }
}
