package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProblemResponse extends js.Object {
  
  /**
    * Information about the problem. 
    */
  var Problem: js.UndefOr[typings.awsSdk.applicationinsightsMod.Problem] = js.native
}
object DescribeProblemResponse {
  
  @scala.inline
  def apply(): DescribeProblemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProblemResponse]
  }
  
  @scala.inline
  implicit class DescribeProblemResponseOps[Self <: DescribeProblemResponse] (val x: Self) extends AnyVal {
    
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
    def setProblem(value: Problem): Self = this.set("Problem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProblem: Self = this.set("Problem", js.undefined)
  }
}
