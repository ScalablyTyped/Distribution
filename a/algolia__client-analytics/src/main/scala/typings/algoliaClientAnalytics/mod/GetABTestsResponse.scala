package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetABTestsResponse extends js.Object {
  
  /**
    * The list of ab tests.
    */
  var abtests: js.Array[GetABTestResponse] | Null = js.native
  
  /**
    * The number of ab tests within this response.
    */
  var count: Double = js.native
  
  /**
    * The total of ab tests.
    */
  var total: Double = js.native
}
object GetABTestsResponse {
  
  @scala.inline
  def apply(count: Double, total: Double): GetABTestsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetABTestsResponse]
  }
  
  @scala.inline
  implicit class GetABTestsResponseOps[Self <: GetABTestsResponse] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbtestsVarargs(value: GetABTestResponse*): Self = this.set("abtests", js.Array(value :_*))
    
    @scala.inline
    def setAbtests(value: js.Array[GetABTestResponse]): Self = this.set("abtests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbtestsNull: Self = this.set("abtests", null)
  }
}
