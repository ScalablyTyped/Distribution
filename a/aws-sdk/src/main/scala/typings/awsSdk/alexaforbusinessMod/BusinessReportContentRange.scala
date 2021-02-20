package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusinessReportContentRange extends StObject {
  
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
  implicit class BusinessReportContentRangeMutableBuilder[Self <: BusinessReportContentRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: BusinessReportInterval): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
  }
}
