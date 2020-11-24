package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregationConfig extends js.Object {
  
  /**
    *  Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them unaggregated. 
    */
  var aggregationType: js.UndefOr[AggregationType] = js.native
}
object AggregationConfig {
  
  @scala.inline
  def apply(): AggregationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationConfig]
  }
  
  @scala.inline
  implicit class AggregationConfigOps[Self <: AggregationConfig] (val x: Self) extends AnyVal {
    
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
    def setAggregationType(value: AggregationType): Self = this.set("aggregationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationType: Self = this.set("aggregationType", js.undefined)
  }
}
