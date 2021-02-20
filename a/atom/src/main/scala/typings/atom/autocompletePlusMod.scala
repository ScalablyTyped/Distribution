package typings.atom

import typings.atom.mod.Point
import typings.atom.mod.ScopeDescriptor
import typings.atom.mod.TextEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompletePlusMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.atom.autocompletePlusMod.TextSuggestion
    - typings.atom.autocompletePlusMod.SnippetSuggestion
  */
  trait AnySuggestion extends StObject
  object AnySuggestion {
    
    @scala.inline
    def SnippetSuggestion(snippet: String): typings.atom.autocompletePlusMod.SnippetSuggestion = {
      val __obj = js.Dynamic.literal(snippet = snippet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.atom.autocompletePlusMod.SnippetSuggestion]
    }
    
    @scala.inline
    def TextSuggestion(text: String): typings.atom.autocompletePlusMod.TextSuggestion = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.atom.autocompletePlusMod.TextSuggestion]
    }
  }
  
  @js.native
  trait AutocompleteProvider extends StObject {
    
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
      *  Is called when a suggestion request has been dispatched by autocomplete+ to
      *  your provider. Return an array of suggestions (if any) in the order you would
      *  like them displayed to the user. Returning a Promise of an array of suggestions
      *  is also supported.
      */
    def getSuggestions(params: SuggestionsRequestedEvent): Suggestions | js.Promise[Suggestions] = js.native
    
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
    implicit class AutocompleteProviderMutableBuilder[Self <: AutocompleteProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableForSelector(value: String): Self = StObject.set(x, "disableForSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableForSelectorUndefined: Self = StObject.set(x, "disableForSelector", js.undefined)
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      @scala.inline
      def setExcludeLowerPriority(value: Boolean): Self = StObject.set(x, "excludeLowerPriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeLowerPriorityUndefined: Self = StObject.set(x, "excludeLowerPriority", js.undefined)
      
      @scala.inline
      def setGetSuggestionDetailsOnSelect(value: /* suggestion */ AnySuggestion => (js.Promise[AnySuggestion | Null]) | AnySuggestion | Null): Self = StObject.set(x, "getSuggestionDetailsOnSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSuggestionDetailsOnSelectUndefined: Self = StObject.set(x, "getSuggestionDetailsOnSelect", js.undefined)
      
      @scala.inline
      def setGetSuggestions(value: SuggestionsRequestedEvent => Suggestions | js.Promise[Suggestions]): Self = StObject.set(x, "getSuggestions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInclusionPriority(value: Double): Self = StObject.set(x, "inclusionPriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclusionPriorityUndefined: Self = StObject.set(x, "inclusionPriority", js.undefined)
      
      @scala.inline
      def setOnDidInsertSuggestion(value: /* params */ SuggestionInsertedEvent => Unit): Self = StObject.set(x, "onDidInsertSuggestion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDidInsertSuggestionUndefined: Self = StObject.set(x, "onDidInsertSuggestion", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionPriority(value: Double): Self = StObject.set(x, "suggestionPriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionPriorityUndefined: Self = StObject.set(x, "suggestionPriority", js.undefined)
    }
  }
  
  @js.native
  trait SnippetSuggestion
    extends SuggestionBase
       with AnySuggestion {
    
    /**
      *  A snippet string. This will allow users to tab through function arguments
      *  or other options.
      */
    var snippet: String = js.native
  }
  object SnippetSuggestion {
    
    @scala.inline
    def apply(snippet: String): SnippetSuggestion = {
      val __obj = js.Dynamic.literal(snippet = snippet.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnippetSuggestion]
    }
    
    @scala.inline
    implicit class SnippetSuggestionMutableBuilder[Self <: SnippetSuggestion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SuggestionBase extends StObject {
    
    /**
      *  Class name for the suggestion in the suggestion list. Allows you to style your
      *  suggestion via CSS, if desired.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      *  A doc-string summary or short description of the suggestion. When specified, it
      *  will be displayed at the bottom of the suggestions list.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      *  (experimental) Description with Markdown formatting.
      *  Takes precedence over plaintext description.
      */
    var descriptionMarkdown: js.UndefOr[String] = js.native
    
    /**
      *  A url to the documentation or more information about this suggestion.
      *  When specified, a More.. link will be displayed in the description area.
      */
    var descriptionMoreURL: js.UndefOr[String] = js.native
    
    /**
      *  A string that will show in the UI for this suggestion.
      *  When not set, snippet || text is displayed.
      */
    var displayText: js.UndefOr[String] = js.native
    
    /**
      *  If you want complete control over the icon shown against the suggestion.
      *  e.g. iconHTML: <i class="icon-move-right"></i>
      */
    var iconHTML: js.UndefOr[String] = js.native
    
    /** This is shown before the suggestion. Useful for return values. */
    var leftLabel: js.UndefOr[String] = js.native
    
    /** Use this instead of leftLabel if you want to use html for the left label. */
    var leftLabelHTML: js.UndefOr[String] = js.native
    
    /**
      *  The text immediately preceding the cursor, which will be replaced by the text.
      *  If not provided, the prefix passed into getSuggestions will be used.
      */
    var replacementPrefix: js.UndefOr[String] = js.native
    
    /**
      *  An indicator (e.g. function, variable) denoting the "kind" of suggestion this
      *  represents.
      */
    var rightLabel: js.UndefOr[String] = js.native
    
    /** Use this instead of rightLabel if you want to use html for the right label. */
    var rightLabelHTML: js.UndefOr[String] = js.native
    
    /**
      *  The suggestion type. It will be converted into an icon shown against the
      *  suggestion.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SuggestionBase {
    
    @scala.inline
    def apply(): SuggestionBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuggestionBase]
    }
    
    @scala.inline
    implicit class SuggestionBaseMutableBuilder[Self <: SuggestionBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionMarkdown(value: String): Self = StObject.set(x, "descriptionMarkdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionMarkdownUndefined: Self = StObject.set(x, "descriptionMarkdown", js.undefined)
      
      @scala.inline
      def setDescriptionMoreURL(value: String): Self = StObject.set(x, "descriptionMoreURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionMoreURLUndefined: Self = StObject.set(x, "descriptionMoreURL", js.undefined)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
      
      @scala.inline
      def setIconHTML(value: String): Self = StObject.set(x, "iconHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconHTMLUndefined: Self = StObject.set(x, "iconHTML", js.undefined)
      
      @scala.inline
      def setLeftLabel(value: String): Self = StObject.set(x, "leftLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftLabelHTML(value: String): Self = StObject.set(x, "leftLabelHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftLabelHTMLUndefined: Self = StObject.set(x, "leftLabelHTML", js.undefined)
      
      @scala.inline
      def setLeftLabelUndefined: Self = StObject.set(x, "leftLabel", js.undefined)
      
      @scala.inline
      def setReplacementPrefix(value: String): Self = StObject.set(x, "replacementPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacementPrefixUndefined: Self = StObject.set(x, "replacementPrefix", js.undefined)
      
      @scala.inline
      def setRightLabel(value: String): Self = StObject.set(x, "rightLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightLabelHTML(value: String): Self = StObject.set(x, "rightLabelHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightLabelHTMLUndefined: Self = StObject.set(x, "rightLabelHTML", js.undefined)
      
      @scala.inline
      def setRightLabelUndefined: Self = StObject.set(x, "rightLabel", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SuggestionInsertedEvent extends StObject {
    
    var editor: TextEditor = js.native
    
    var suggestion: TextSuggestion | SnippetSuggestion = js.native
    
    var triggerPosition: Point = js.native
  }
  object SuggestionInsertedEvent {
    
    @scala.inline
    def apply(editor: TextEditor, suggestion: TextSuggestion | SnippetSuggestion, triggerPosition: Point): SuggestionInsertedEvent = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], triggerPosition = triggerPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestionInsertedEvent]
    }
    
    @scala.inline
    implicit class SuggestionInsertedEventMutableBuilder[Self <: SuggestionInsertedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditor(value: TextEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestion(value: TextSuggestion | SnippetSuggestion): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerPosition(value: Point): Self = StObject.set(x, "triggerPosition", value.asInstanceOf[js.Any])
    }
  }
  
  type Suggestions = js.Array[AnySuggestion]
  
  @js.native
  trait SuggestionsRequestedEvent extends StObject {
    
    /** Whether the autocomplete request was initiated by the user. */
    var activatedManually: Boolean = js.native
    
    /** The position of the cursor. */
    var bufferPosition: Point = js.native
    
    /** The current TextEditor. */
    var editor: TextEditor = js.native
    
    /** The prefix for the word immediately preceding the current cursor position. */
    var prefix: String = js.native
    
    /** The scope descriptor for the current cursor position. */
    var scopeDescriptor: ScopeDescriptor = js.native
  }
  object SuggestionsRequestedEvent {
    
    @scala.inline
    def apply(
      activatedManually: Boolean,
      bufferPosition: Point,
      editor: TextEditor,
      prefix: String,
      scopeDescriptor: ScopeDescriptor
    ): SuggestionsRequestedEvent = {
      val __obj = js.Dynamic.literal(activatedManually = activatedManually.asInstanceOf[js.Any], bufferPosition = bufferPosition.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestionsRequestedEvent]
    }
    
    @scala.inline
    implicit class SuggestionsRequestedEventMutableBuilder[Self <: SuggestionsRequestedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivatedManually(value: Boolean): Self = StObject.set(x, "activatedManually", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferPosition(value: Point): Self = StObject.set(x, "bufferPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditor(value: TextEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeDescriptor(value: ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextSuggestion
    extends SuggestionBase
       with AnySuggestion {
    
    /** The text which will be inserted into the editor, in place of the prefix. */
    var text: String = js.native
  }
  object TextSuggestion {
    
    @scala.inline
    def apply(text: String): TextSuggestion = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextSuggestion]
    }
    
    @scala.inline
    implicit class TextSuggestionMutableBuilder[Self <: TextSuggestion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
