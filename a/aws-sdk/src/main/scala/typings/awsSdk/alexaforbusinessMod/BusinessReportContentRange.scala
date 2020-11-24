package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusinessReportContentRange extends js.Object {
  
  /**
    * The interval of the content range.
    */
  var Interval: BusinessReportInterval = js.native
}
object BusinessReportContentRange {
  
  @scala.inline
  def apply(Interval: BusinessReportInterval): BusinessReportContentRange = {
    val __obj = js.Dynamic.literal(Interval = Interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessReportContentRange]
  }
  
  @scala.inline
  implicit class BusinessReportContentRangeOps[Self <: BusinessReportContentRange] (val x: Self) extends AnyVal {
    
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
    def setInterval(value: BusinessReportInterval): Self = this.set("Interval", value.asInstanceOf[js.Any])
  }
}
