package typings.appleDashMapkitDashJs.mapkitNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchDelegate extends js.Object {
  var autocompleteDidComplete: js.UndefOr[js.Function1[/* data */ SearchAutocompleteResponse, Unit]] = js.undefined
  var autocompleteDidError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var searchDidComplete: js.UndefOr[js.Function1[/* response */ SearchResponse, Unit]] = js.undefined
  var searchDidError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
}

object SearchDelegate {
  @scala.inline
  def apply(
    autocompleteDidComplete: /* data */ SearchAutocompleteResponse => Unit = null,
    autocompleteDidError: /* error */ Error => Unit = null,
    searchDidComplete: /* response */ SearchResponse => Unit = null,
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

