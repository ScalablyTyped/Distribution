package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLogsResponse extends js.Object {
  
  /**
    * The list of logs.
    */
  var logs: js.Array[Log] = js.native
}
object GetLogsResponse {
  
  @scala.inline
  def apply(logs: js.Array[Log]): GetLogsResponse = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogsResponse]
  }
  
  @scala.inline
  implicit class GetLogsResponseOps[Self <: GetLogsResponse] (val x: Self) extends AnyVal {
    
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
    def setLogsVarargs(value: Log*): Self = this.set("logs", js.Array(value :_*))
    
    @scala.inline
    def setLogs(value: js.Array[Log]): Self = this.set("logs", value.asInstanceOf[js.Any])
  }
}
