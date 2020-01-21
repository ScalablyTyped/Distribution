package typings.appleMapkitJs.mapkit

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object or callback function called when performing a search or autocomplete
  * request.
  */
trait SearchDelegate extends js.Object {
  /**
    * When an autocomplete request successfully completes, this method returns
    * a data array that is the same as the one passed to the autocomplete
    * callback function.
    */
  var autocompleteDidComplete: js.UndefOr[js.Function1[/* data */ SearchAutocompleteResponse, Unit]] = js.undefined
  /**
    * Invoked when an autocomplete request fails.
    */
  var autocompleteDidError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  /**
    * Upon successful completion of a search request, this method returns a data
    * object that is the same as the one passed to the search callback function.
    */
  var searchDidComplete: js.UndefOr[js.Function1[/* data */ SearchResponse, Unit]] = js.undefined
  /**
    * Called when the search request fails.
    */
  var searchDidError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
}

object SearchDelegate {
  @scala.inline
  def apply(
    autocompleteDidComplete: /* data */ SearchAutocompleteResponse => Unit = null,
    autocompleteDidError: /* error */ Error => Unit = null,
    searchDidComplete: /* data */ SearchResponse => Unit = null,
    searchDidError: /* error */ Error => Unit = null
  ): SearchDelegate = {
    val __obj = js.Dynamic.literal()
    if (autocompleteDidComplete != null) __obj.updateDynamic("autocompleteDidComplete")(js.Any.fromFunction1(autocompleteDidComplete))
    if (autocompleteDidError != null) __obj.updateDynamic("autocompleteDidError")(js.Any.fromFunction1(autocompleteDidError))
    if (searchDidComplete != null) __obj.updateDynamic("searchDidComplete")(js.Any.fromFunction1(searchDidComplete))
    if (searchDidError != null) __obj.updateDynamic("searchDidError")(js.Any.fromFunction1(searchDidError))
    __obj.asInstanceOf[SearchDelegate]
  }
}

