package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSearchCompleteEvent extends js.Object {
  var activeSourceIndex: Double = js.native
  var errors: js.Array[Error] = js.native
  var numResults: Double = js.native
  var results: js.Array[SearchSearchCompleteEventResults] = js.native
  var searchTerm: String = js.native
}

object SearchSearchCompleteEvent {
  @scala.inline
  def apply(
    activeSourceIndex: Double,
    errors: js.Array[Error],
    numResults: Double,
    results: js.Array[SearchSearchCompleteEventResults],
    searchTerm: String
  ): SearchSearchCompleteEvent = {
    val __obj = js.Dynamic.literal(activeSourceIndex = activeSourceIndex.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], numResults = numResults.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], searchTerm = searchTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSearchCompleteEvent]
  }
  @scala.inline
  implicit class SearchSearchCompleteEventOps[Self <: SearchSearchCompleteEvent] (val x: Self) extends AnyVal {
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
    def setActiveSourceIndex(value: Double): Self = this.set("activeSourceIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumResults(value: Double): Self = this.set("numResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: SearchSearchCompleteEventResults*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[SearchSearchCompleteEventResults]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchTerm(value: String): Self = this.set("searchTerm", value.asInstanceOf[js.Any])
  }
  
}

