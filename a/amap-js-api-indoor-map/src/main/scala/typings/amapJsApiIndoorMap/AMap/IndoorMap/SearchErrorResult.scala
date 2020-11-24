package typings.amapJsApiIndoorMap.AMap.IndoorMap

import typings.amapJsApiIndoorMap.amapJsApiIndoorMapNumbers.`1`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchErrorResult extends SearchResult {
  
  var error: Error = js.native
  
  /**
    * 楼宇id
    */
  var id: String = js.native
  
  var status: `1` = js.native
}
object SearchErrorResult {
  
  @scala.inline
  def apply(error: Error, id: String, status: `1`): SearchErrorResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchErrorResult]
  }
  
  @scala.inline
  implicit class SearchErrorResultOps[Self <: SearchErrorResult] (val x: Self) extends AnyVal {
    
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `1`): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
