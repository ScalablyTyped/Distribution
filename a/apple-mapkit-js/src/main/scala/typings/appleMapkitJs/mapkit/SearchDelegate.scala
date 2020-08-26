package typings.appleMapkitJs.mapkit

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object or callback function called when performing a search or autocomplete
  * request.
  */
@js.native
trait SearchDelegate extends js.Object {
  /**
    * When an autocomplete request successfully completes, this method returns
    * a data array that is the same as the one passed to the autocomplete
    * callback function.
    */
  var autocompleteDidComplete: js.UndefOr[js.Function1[/* data */ SearchAutocompleteResponse, Unit]] = js.native
  /**
    * Invoked when an autocomplete request fails.
    */
  var autocompleteDidError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  /**
    * Upon successful completion of a search request, this method returns a data
    * object that is the same as the one passed to the search callback function.
    */
  var searchDidComplete: js.UndefOr[js.Function1[/* data */ SearchResponse, Unit]] = js.native
  /**
    * Called when the search request fails.
    */
  var searchDidError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
}

object SearchDelegate {
  @scala.inline
  def apply(): SearchDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDelegate]
  }
  @scala.inline
  implicit class SearchDelegateOps[Self <: SearchDelegate] (val x: Self) extends AnyVal {
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
    def setAutocompleteDidComplete(value: /* data */ SearchAutocompleteResponse => Unit): Self = this.set("autocompleteDidComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAutocompleteDidComplete: Self = this.set("autocompleteDidComplete", js.undefined)
    @scala.inline
    def setAutocompleteDidError(value: /* error */ Error => Unit): Self = this.set("autocompleteDidError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAutocompleteDidError: Self = this.set("autocompleteDidError", js.undefined)
    @scala.inline
    def setSearchDidComplete(value: /* data */ SearchResponse => Unit): Self = this.set("searchDidComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSearchDidComplete: Self = this.set("searchDidComplete", js.undefined)
    @scala.inline
    def setSearchDidError(value: /* error */ Error => Unit): Self = this.set("searchDidError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSearchDidError: Self = this.set("searchDidError", js.undefined)
  }
  
}

