package typings
package atomLib.autocompleteDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutocompleteProvider extends js.Object {
  /**
       *  Defines the scope selector(s) (can be comma-separated) for which your provider
       *  should not be used.
       */
  var disableForSelector: js.UndefOr[java.lang.String] = js.undefined
  /** Will be called if your provider is being destroyed by autocomplete+ */
  var dispose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Will not use lower priority providers when this provider is used. */
  var excludeLowerPriority: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  (experimental) Is called when a suggestion is selected by the user for
       *  the purpose of loading more information about the suggestion. Return a
       *  Promise of the new suggestion to replace it with or return null if
       *  no change is needed.
       */
  var getSuggestionDetailsOnSelect: js.UndefOr[
    js.Function1[
      /* suggestion */ AnySuggestion, 
      (stdLib.Promise[AnySuggestion | scala.Null]) | AnySuggestion | scala.Null
    ]
  ] = js.undefined
  /**
       *  A number to indicate its priority to be included in a suggestions request.
       *  The default provider has an inclusion priority of 0. Higher priority providers
       *  can suppress lower priority providers with excludeLowerPriority.
       */
  var inclusionPriority: js.UndefOr[scala.Double] = js.undefined
  /**
       *  Function that is called when a suggestion from your provider was inserted
       *  into the buffer.
       */
  var onDidInsertSuggestion: js.UndefOr[js.Function1[/* params */ SuggestionInsertedEvent, scala.Unit]] = js.undefined
  /**
       *  Defines the scope selector(s) (can be comma-separated) for which your provider
       *  should receive suggestion requests.
       */
  var selector: java.lang.String
  /**
       *  A number to determine the sort order of suggestions. The default provider has
       *  an suggestion priority of 1.
       */
  var suggestionPriority: js.UndefOr[scala.Double] = js.undefined
  /**
       *  Is called when a suggestion request has been dispatched by autocomplete+ to
       *  your provider. Return an array of suggestions (if any) in the order you would
       *  like them displayed to the user. Returning a Promise of an array of suggestions
       *  is also supported.
       */
  def getSuggestions(params: SuggestionsRequestedEvent): Suggestions | stdLib.Promise[Suggestions]
}

