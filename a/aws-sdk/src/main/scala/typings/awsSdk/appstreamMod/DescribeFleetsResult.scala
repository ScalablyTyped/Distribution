package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetsResult extends js.Object {
  
  /**
    * Information about the fleets.
    */
  var Fleets: js.UndefOr[FleetList] = js.native
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeFleetsResult {
  
  @scala.inline
  def apply(): DescribeFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetsResult]
  }
  
  @scala.inline
  implicit class DescribeFleetsResultOps[Self <: DescribeFleetsResult] (val x: Self) extends AnyVal {
    
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
    def setFleetsVarargs(value: Fleet*): Self = this.set("Fleets", js.Array(value :_*))
    
    @scala.inline
    def setFleets(value: FleetList): Self = this.set("Fleets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleets: Self = this.set("Fleets", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
