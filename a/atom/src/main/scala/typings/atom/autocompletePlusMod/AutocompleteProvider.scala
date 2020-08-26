package typings.atom.autocompletePlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteProvider extends js.Object {
  /**
    *  Defines the scope selector(s) (can be comma-separated) for which your provider
    *  should not be used.
    */
  var disableForSelector: js.UndefOr[String] = js.native
  /** Will be called if your provider is being destroyed by autocomplete+ */
  var dispose: js.UndefOr[js.Function0[Unit]] = js.native
  /** Will not use lower priority providers when this provider is used. */
  var excludeLowerPriority: js.UndefOr[Boolean] = js.native
  /**
    *  (experimental) Is called when a suggestion is selected by the user for
    *  the purpose of loading more information about the suggestion. Return a
    *  Promise of the new suggestion to replace it with or return null if
    *  no change is needed.
    */
  var getSuggestionDetailsOnSelect: js.UndefOr[
    js.Function1[
      /* suggestion */ AnySuggestion, 
      (js.Promise[AnySuggestion | Null]) | AnySuggestion | Null
    ]
  ] = js.native
  /**
    *  A number to indicate its priority to be included in a suggestions request.
    *  The default provider has an inclusion priority of 0. Higher priority providers
    *  can suppress lower priority providers with excludeLowerPriority.
    */
  var inclusionPriority: js.UndefOr[Double] = js.native
  /**
    *  Function that is called when a suggestion from your provider was inserted
    *  into the buffer.
    */
  var onDidInsertSuggestion: js.UndefOr[js.Function1[/* params */ SuggestionInsertedEvent, Unit]] = js.native
  /**
    *  Defines the scope selector(s) (can be comma-separated) for which your provider
    *  should receive suggestion requests.
    */
  var selector: String = js.native
  /**
    *  A number to determine the sort order of suggestions. The default provider has
    *  an suggestion priority of 1.
    */
  var suggestionPriority: js.UndefOr[Double] = js.native
  /**
    *  Is called when a suggestion request has been dispatched by autocomplete+ to
    *  your provider. Return an array of suggestions (if any) in the order you would
    *  like them displayed to the user. Returning a Promise of an array of suggestions
    *  is also supported.
    */
  def getSuggestions(params: SuggestionsRequestedEvent): Suggestions | js.Promise[Suggestions] = js.native
}

object AutocompleteProvider {
  @scala.inline
  def apply(
    getSuggestions: SuggestionsRequestedEvent => Suggestions | js.Promise[Suggestions],
    selector: String
  ): AutocompleteProvider = {
    val __obj = js.Dynamic.literal(getSuggestions = js.Any.fromFunction1(getSuggestions), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteProvider]
  }
  @scala.inline
  implicit class AutocompleteProviderOps[Self <: AutocompleteProvider] (val x: Self) extends AnyVal {
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
    def setGetSuggestions(value: SuggestionsRequestedEvent => Suggestions | js.Promise[Suggestions]): Self = this.set("getSuggestions", js.Any.fromFunction1(value))
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableForSelector(value: String): Self = this.set("disableForSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableForSelector: Self = this.set("disableForSelector", js.undefined)
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
    @scala.inline
    def setExcludeLowerPriority(value: Boolean): Self = this.set("excludeLowerPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeLowerPriority: Self = this.set("excludeLowerPriority", js.undefined)
    @scala.inline
    def setGetSuggestionDetailsOnSelect(value: /* suggestion */ AnySuggestion => (js.Promise[AnySuggestion | Null]) | AnySuggestion | Null): Self = this.set("getSuggestionDetailsOnSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetSuggestionDetailsOnSelect: Self = this.set("getSuggestionDetailsOnSelect", js.undefined)
    @scala.inline
    def setInclusionPriority(value: Double): Self = this.set("inclusionPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclusionPriority: Self = this.set("inclusionPriority", js.undefined)
    @scala.inline
    def setOnDidInsertSuggestion(value: /* params */ SuggestionInsertedEvent => Unit): Self = this.set("onDidInsertSuggestion", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDidInsertSuggestion: Self = this.set("onDidInsertSuggestion", js.undefined)
    @scala.inline
    def setSuggestionPriority(value: Double): Self = this.set("suggestionPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionPriority: Self = this.set("suggestionPriority", js.undefined)
  }
  
}

