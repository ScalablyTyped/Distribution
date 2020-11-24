package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartFragmentNumber extends js.Object {
  
  var StartFragmentNumber: js.UndefOr[String] = js.native
  
  var StartTimestamp: js.UndefOr[String] = js.native
  
  var StreamARN: js.UndefOr[String] = js.native
}
object StartFragmentNumber {
  
  @scala.inline
  def apply(): StartFragmentNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFragmentNumber]
  }
  
  @scala.inline
  implicit class StartFragmentNumberOps[Self <: StartFragmentNumber] (val x: Self) extends AnyVal {
    
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
    def setStartFragmentNumber(value: String): Self = this.set("StartFragmentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartFragmentNumber: Self = this.set("StartFragmentNumber", js.undefined)
    
    @scala.inline
    def setStartTimestamp(value: String): Self = this.set("StartTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimestamp: Self = this.set("StartTimestamp", js.undefined)
    
    @scala.inline
    def setStreamARN(value: String): Self = this.set("StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamARN: Self = this.set("StreamARN", js.undefined)
  }
}
