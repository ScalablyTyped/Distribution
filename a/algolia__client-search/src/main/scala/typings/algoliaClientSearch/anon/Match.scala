package typings.algoliaClientSearch.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Match extends js.Object {
  
  /**
    * The explain query match.
    */
  var `match`: Alternatives = js.native
  
  /**
    * Query parameter reporting. Parameters are reported
    * as a JSON object with one field per parameter.
    */
  var params: js.UndefOr[Record[String, _]] = js.native
}
object Match {
  
  @scala.inline
  def apply(`match`: Alternatives): Match = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
  
  @scala.inline
  implicit class MatchOps[Self <: Match] (val x: Self) extends AnyVal {
    
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
    def setMatch(value: Alternatives): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: Record[String, _]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
