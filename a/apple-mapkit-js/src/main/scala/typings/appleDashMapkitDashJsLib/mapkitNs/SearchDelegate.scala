package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchDelegate extends js.Object {
  var autocompleteDidComplete: js.UndefOr[js.Function1[/* data */ SearchAutocompleteResponse, scala.Unit]] = js.undefined
  var autocompleteDidError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var searchDidComplete: js.UndefOr[js.Function1[/* response */ SearchResponse, scala.Unit]] = js.undefined
  var searchDidError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
}

object SearchDelegate {
  @scala.inline
  def apply(
    autocompleteDidComplete: /* data */ SearchAutocompleteResponse => scala.Unit = null,
    autocompleteDidError: /* error */ stdLib.Error => scala.Unit = null,
    searchDidComplete: /* response */ SearchResponse => scala.Unit = null,
    searchDidError: /* error */ stdLib.Error => scala.Unit = null
  ): SearchDelegate = {
    val __obj = js.Dynamic.literal()
    if (autocompleteDidComplete != null) __obj.updateDynamic("autocompleteDidComplete")(js.Any.fromFunction1(autocompleteDidComplete))
    if (autocompleteDidError != null) __obj.updateDynamic("autocompleteDidError")(js.Any.fromFunction1(autocompleteDidError))
    if (searchDidComplete != null) __obj.updateDynamic("searchDidComplete")(js.Any.fromFunction1(searchDidComplete))
    if (searchDidError != null) __obj.updateDynamic("searchDidError")(js.Any.fromFunction1(searchDidError))
    __obj.asInstanceOf[SearchDelegate]
  }
}

