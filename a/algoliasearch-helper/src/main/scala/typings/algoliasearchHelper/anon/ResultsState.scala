package typings.algoliasearchHelper.anon

import typings.algoliasearchHelper.mod.SearchParameters
import typings.algoliasearchHelper.mod.SearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultsState extends js.Object {
  
  var results: SearchResults[_] = js.native
  
  var state: SearchParameters = js.native
}
object ResultsState {
  
  @scala.inline
  def apply(results: SearchResults[_], state: SearchParameters): ResultsState = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsState]
  }
  
  @scala.inline
  implicit class ResultsStateOps[Self <: ResultsState] (val x: Self) extends AnyVal {
    
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
    def setResults(value: SearchResults[_]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: SearchParameters): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
