package typings.atom.mod

import org.scalablytyped.runtime.StringDictionary
import typings.atom.atomStrings.Subsequence
import typings.atom.atomStrings.Symbol
import typings.atom.atomStrings.Word
import typings.atom.atomStrings.`tab alwaysComma enter when suggestion explicitly selected`
import typings.atom.atomStrings.`tab and enter`
import typings.atom.atomStrings.always
import typings.atom.atomStrings.atom
import typings.atom.atomStrings.auto
import typings.atom.atomStrings.default
import typings.atom.atomStrings.enter
import typings.atom.atomStrings.experimental
import typings.atom.atomStrings.hard
import typings.atom.atomStrings.limited
import typings.atom.atomStrings.native
import typings.atom.atomStrings.no
import typings.atom.atomStrings.none
import typings.atom.atomStrings.poll
import typings.atom.atomStrings.soft
import typings.atom.atomStrings.srgb
import typings.atom.atomStrings.tab
import typings.atom.atomStrings.textOrSnippet
import typings.atom.atomStrings.undecided
import typings.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigValues
  extends // tslint:disable-next-line:no-any
/* key */ StringDictionary[js.Any] {
  /**
    *  If you are experiencing performance issues when typing, you should try
    *  increasing this value to a non-zero number (e.g. 100).
    */
  @JSName("autocomplete-plus.autoActivationDelay")
  var `autocomplete-plusDotautoActivationDelay`: Double
  /**
    *  If enabled, typing `backspace` will show the suggestion list if suggestions
    *  are available. If disabled, suggestions will not be shown while backspacing.
    */
  @JSName("autocomplete-plus.backspaceTriggersAutocomplete")
  var `autocomplete-plusDotbackspaceTriggersAutocomplete`: Boolean
  /** Don't use the built-in provider for these selector(s). */
  @JSName("autocomplete-plus.builtinProviderBlacklist")
  var `autocomplete-plusDotbuiltinProviderBlacklist`: String
  /**
    *  You should use the key(s) indicated here to confirm a suggestion from the
    *  suggestion list and have it inserted into the file.
    */
  @JSName("autocomplete-plus.confirmCompletion")
  var `autocomplete-plusDotconfirmCompletion`: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  /**
    *  Completing a suggestion consumes text following the cursor matching the
    *  suffix of the chosen suggestion.
    */
  @JSName("autocomplete-plus.consumeSuffix")
  var `autocomplete-plusDotconsumeSuffix`: Boolean
  /**
    *  If you're having trouble with autocomplete, you may consider falling back
    *  to the Symbol provider and filing an issue.
    */
  @JSName("autocomplete-plus.defaultProvider")
  var `autocomplete-plusDotdefaultProvider`: Subsequence | Symbol
  /**
    *  Suggestions will show as you type if this preference is enabled. If it is
    *  disabled, you can still see suggestions by using the keymapping for
    *  'autocomplete-plus:activate' (shown below).
    */
  @JSName("autocomplete-plus.enableAutoActivation")
  var `autocomplete-plusDotenableAutoActivation`: Boolean
  /**
    *  If enabled, automatically insert suggestion on manual activation with
    *  'autocomplete-plus:activate' when there is only one match.
    */
  @JSName("autocomplete-plus.enableAutoConfirmSingleSuggestion")
  var `autocomplete-plusDotenableAutoConfirmSingleSuggestion`: Boolean
  /**
    *  The package comes with a built-in provider that will provide suggestions
    *  using the words in your current buffer or all open buffers. You will get
    *  better suggestions by installing additional autocomplete+ providers.
    *  To stop using the built-in provider, disable this option.
    */
  @JSName("autocomplete-plus.enableBuiltinProvider")
  var `autocomplete-plusDotenableBuiltinProvider`: Boolean
  /** Identifies non-latin alphabet characters as letters. */
  @JSName("autocomplete-plus.enableExtendedUnicodeSupport")
  var `autocomplete-plusDotenableExtendedUnicodeSupport`: Boolean
  /**
    *  Suggestions will not be provided for files matching this list, e.g. *.md
    *  for Markdown files. To blacklist more than one file extension, use comma
    *  as a separator, e.g. ["*.md", "*.txt"] (both Markdown and text files).
    */
  @JSName("autocomplete-plus.fileBlacklist")
  var `autocomplete-plusDotfileBlacklist`: js.Array[String]
  /**
    *  For grammars with no registered provider(s), the default provider will
    *  include completions from all buffers, instead of just the buffer you are
    *  currently editing.
    */
  @JSName("autocomplete-plus.includeCompletionsFromAllBuffers")
  var `autocomplete-plusDotincludeCompletionsFromAllBuffers`: Boolean
  /** The suggestion list will only show this many suggestions. */
  @JSName("autocomplete-plus.maxVisibleSuggestions")
  var `autocomplete-plusDotmaxVisibleSuggestions`: Double
  /**
    *  Only autocomplete when you've typed at least this many characters.
    *  Note: May not affect external providers.
    */
  @JSName("autocomplete-plus.minimumWordLength")
  var `autocomplete-plusDotminimumWordLength`: Double
  /** Suggestions will not be provided for scopes matching this list. */
  @JSName("autocomplete-plus.scopeBlacklist")
  var `autocomplete-plusDotscopeBlacklist`: js.Array[String]
  /**
    *  Should similar suggestions be removed from the list? If so how to determine
    *  they are similar.
    */
  @JSName("autocomplete-plus.similarSuggestionRemoval")
  var `autocomplete-plusDotsimilarSuggestionRemoval`: none | textOrSnippet
  /**
    *  Fuzzy searching is performed if this is disabled; if it is enabled, suggestions
    *  must begin with the prefix from the current word.
    */
  @JSName("autocomplete-plus.strictMatching")
  var `autocomplete-plusDotstrictMatching`: Boolean
  /**
    *  With 'Cursor' the suggestion list appears at the cursor's position.
    *  With 'Word' it appears at the beginning of the word that's being completed.
    */
  @JSName("autocomplete-plus.suggestionListFollows")
  var `autocomplete-plusDotsuggestionListFollows`: Word | typings.atom.atomStrings.Cursor
  /** Don't auto-activate when any of these classes are present in the editor. */
  @JSName("autocomplete-plus.suppressActivationForEditorClasses")
  var `autocomplete-plusDotsuppressActivationForEditorClasses`: js.Array[String]
  /**
    *  -EXPERIMENTAL- Prefers runs of consecutive characters, acronyms and start
    *  of words.
    */
  @JSName("autocomplete-plus.useAlternateScoring")
  var `autocomplete-plusDotuseAlternateScoring`: Boolean
  /**
    *  Disable this if you want to bind your own keystrokes to move around the
    *  suggestion list. You will also need to add definitions to your keymap.
    */
  @JSName("autocomplete-plus.useCoreMovementCommands")
  var `autocomplete-plusDotuseCoreMovementCommands`: Boolean
  /** Gives words near the cursor position a higher score than those far away. */
  @JSName("autocomplete-plus.useLocalityBonus")
  var `autocomplete-plusDotuseLocalityBonus`: Boolean
  /**
    *  Allow items to be previewed without adding them to a pane permanently, such as
    *  when single clicking files in the tree view.
    */
  @JSName("core.allowPendingPaneItems")
  var coreDotallowPendingPaneItems: Boolean
  /**
    *  Trigger the system's beep sound when certain actions cannot be executed or
    *  there are no results.
    */
  @JSName("core.audioBeep")
  var coreDotaudioBeep: Boolean
  /** Automatically update Atom when a new release is available. */
  @JSName("core.automaticallyUpdate")
  var coreDotautomaticallyUpdate: Boolean
  /** Close corresponding editors when a file is deleted outside Atom. */
  @JSName("core.closeDeletedFileTabs")
  var coreDotcloseDeletedFileTabs: Boolean
  /**
    *  When a window with no open tabs or panes is given the 'Close Tab' command,
    *  close that window.
    */
  @JSName("core.closeEmptyWindows")
  var coreDotcloseEmptyWindows: Boolean
  /**
    * Specify whether Atom should use the operating system's color profile (recommended)
    * or an alternative color profile.
    */
  @JSName("core.colorProfile")
  var coreDotcolorProfile: default | srgb
  /**
    *  Associates scope names (e.g. "source.coffee") with arrays of file extensions
    *  and file names (e.g. ["Cakefile", ".coffee2"]).
    */
  @JSName("core.customFileTypes")
  var coreDotcustomFileTypes: StringDictionary[js.Array[String]]
  /** When the last tab of a pane is closed, remove that pane as well. */
  @JSName("core.destroyEmptyPanes")
  var coreDotdestroyEmptyPanes: Boolean
  /** List of names of installed packages which are not loaded at startup. */
  @JSName("core.disabledPackages")
  var coreDotdisabledPackages: js.Array[String]
  /**
    *  Files and directories ignored by the current project's VCS system will be ignored
    *  by some packages, such as the fuzzy finder and find and replace. For example,
    *  projects using Git have these paths defined in the .gitignore file. Individual
    *  packages might have additional config settings for ignoring VCS ignored files and
    *  folders.
    */
  @JSName("core.excludeVcsIgnoredPaths")
  var coreDotexcludeVcsIgnoredPaths: Boolean
  /** Default character set encoding to use when reading and writing files. */
  @JSName("core.fileEncoding")
  var coreDotfileEncoding: FileEncoding
  /**
    *  Choose the underlying implementation used to watch for filesystem changes. Emulating
    *  changes will miss any events caused by applications other than Atom, but may help
    *  prevent crashes or freezes.
    */
  @JSName("core.fileSystemWatcher")
  var coreDotfileSystemWatcher: native | experimental | poll | atom
  /**
    *  Follow symbolic links when searching files and when opening files with the fuzzy
    *  finder.
    */
  @JSName("core.followSymlinks")
  var coreDotfollowSymlinks: Boolean
  /**
    *  List of glob patterns. Files and directories matching these patterns will be
    *  ignored by some packages, such as the fuzzy finder and tree view. Individual
    *  packages might have additional config settings for ignoring names.
    */
  @JSName("core.ignoredNames")
  var coreDotignoredNames: js.Array[String]
  /**
    *  When checked opens an untitled editor when loading a blank environment (such as
    *  with 'File > New Window' or when "Restore Previous Windows On Start" is unchecked);
    *  otherwise, no editor is opened when loading a blank environment.
    *  This setting has no effect when restoring a previous state.
    */
  @JSName("core.openEmptyEditorOnStart")
  var coreDotopenEmptyEditorOnStart: Boolean
  /** How many recent projects to show in the Reopen Project menu. */
  @JSName("core.reopenProjectMenuCount")
  var coreDotreopenProjectMenuCount: Double
  /**
    *  When selected 'no', a blank environment is loaded. When selected 'yes' and Atom
    *  is started from the icon or `atom` by itself from the command line, restores the
    *  last state of all Atom windows; otherwise a blank environment is loaded. When
    *  selected 'always', restores the last state of all Atom windows always, no matter
    *  how Atom is started.
    */
  @JSName("core.restorePreviousWindowsOnStart")
  var coreDotrestorePreviousWindowsOnStart: no | yes | always
  /**
    *  Allow usage statistics and exception reports to be sent to the Atom team to help
    *  improve the product.
    */
  @JSName("core.telemetryConsent")
  var coreDottelemetryConsent: limited | no | undecided
  /** Names of UI and syntax themes which will be used when Atom starts. */
  @JSName("core.themes")
  var coreDotthemes: js.Array[String]
  /** Use detected proxy settings when calling the `apm` command-line tool. */
  @JSName("core.useProxySettingsWhenCallingApm")
  var coreDotuseProxySettingsWhenCallingApm: Boolean
  /** Experimental: Use the new Tree-sitter parsing system for supported languages. */
  @JSName("core.useTreeSitterParsers")
  var coreDotuseTreeSitterParsers: Boolean
  /** List of names of installed packages which are not automatically updated. */
  @JSName("core.versionPinnedPackages")
  var coreDotversionPinnedPackages: js.Array[String]
  /** Warn before opening files larger than this number of megabytes. */
  @JSName("core.warnOnLargeFileLimit")
  var coreDotwarnOnLargeFileLimit: Double
  /** Skip over tab-length runs of leading whitespace when moving the cursor. */
  @JSName("editor.atomicSoftTabs")
  var editorDotatomicSoftTabs: Boolean
  /** Automatically indent the cursor when inserting a newline. */
  @JSName("editor.autoIndent")
  var editorDotautoIndent: Boolean
  /** Automatically indent pasted text based on the indentation of the previous line. */
  @JSName("editor.autoIndentOnPaste")
  var editorDotautoIndentOnPaste: Boolean
  @JSName("editor.commentEnd")
  var editorDotcommentEnd: String | Null
  @JSName("editor.commentStart")
  var editorDotcommentStart: String | Null
  /**
    *  Show confirmation dialog when checking out the HEAD revision and discarding
    *  changes to current file since last commit.
    */
  @JSName("editor.confirmCheckoutHeadRevision")
  var editorDotconfirmCheckoutHeadRevision: Boolean
  @JSName("editor.decreaseIndentPattern")
  var editorDotdecreaseIndentPattern: String | Null
  @JSName("editor.foldEndPattern")
  var editorDotfoldEndPattern: String | Null
  /** The name of the font family used for editor text. */
  @JSName("editor.fontFamily")
  var editorDotfontFamily: String
  /** Height in pixels of editor text. */
  @JSName("editor.fontSize")
  var editorDotfontSize: Double
  @JSName("editor.increaseIndentPattern")
  var editorDotincreaseIndentPattern: String | Null
  /**
    *  A hash of characters Atom will use to render whitespace characters. Keys are
    *  whitespace character types, values are rendered characters (use value false to
    *  turn off individual whitespace character types).
    */
  @JSName("editor.invisibles")
  var editorDotinvisibles: Invisibles
  /** Height of editor lines, as a multiplier of font size. */
  @JSName("editor.lineHeight")
  var editorDotlineHeight: String | Double
  /**
    * Defines the maximum width of the editor window before soft wrapping is enforced,
    * in number of characters.
    */
  @JSName("editor.maxScreenLineLength")
  var editorDotmaxScreenLineLength: Double
  /** A string of non-word characters to define word boundaries. */
  @JSName("editor.nonWordCharacters")
  var editorDotnonWordCharacters: String
  /**
    *  Identifies the length of a line which is used when wrapping text with the
    *  `Soft Wrap At Preferred Line Length` setting enabled, in number of characters.
    */
  @JSName("editor.preferredLineLength")
  var editorDotpreferredLineLength: Double
  /** Allow the editor to be scrolled past the end of the last line. */
  @JSName("editor.scrollPastEnd")
  var editorDotscrollPastEnd: Boolean
  /** Determines how fast the editor scrolls when using a mouse or trackpad. */
  @JSName("editor.scrollSensitivity")
  var editorDotscrollSensitivity: Double
  /** Show cursor while there is a selection. */
  @JSName("editor.showCursorOnSelection")
  var editorDotshowCursorOnSelection: Boolean
  /** Show indentation indicators in the editor. */
  @JSName("editor.showIndentGuide")
  var editorDotshowIndentGuide: Boolean
  /** Render placeholders for invisible characters, such as tabs, spaces and newlines. */
  @JSName("editor.showInvisibles")
  var editorDotshowInvisibles: Boolean
  /** Show line numbers in the editor's gutter. */
  @JSName("editor.showLineNumbers")
  var editorDotshowLineNumbers: Boolean
  /**
    *  If the `Tab Type` config setting is set to "auto" and autodetection of tab type
    *  from buffer content fails, then this config setting determines whether a soft tab
    *  or a hard tab will be inserted when the Tab key is pressed.
    */
  @JSName("editor.softTabs")
  var editorDotsoftTabs: Boolean
  /**
    *  Wraps lines that exceed the width of the window. When `Soft Wrap At Preferred
    *  Line Length` is set, it will wrap to the number of characters defined by the
    *  `Preferred Line Length` setting.
    */
  @JSName("editor.softWrap")
  var editorDotsoftWrap: Boolean
  /**
    *  Instead of wrapping lines to the window's width, wrap lines to the number of
    *  characters defined by the `Preferred Line Length` setting. This will only take
    *  effect when the soft wrap config setting is enabled globally or for the current
    *  language.
    *  **Note:** If you want to hide the wrap guide (the vertical line) you can disable
    *  the `wrap-guide` package.
    */
  @JSName("editor.softWrapAtPreferredLineLength")
  var editorDotsoftWrapAtPreferredLineLength: Boolean
  /**
    *  When soft wrap is enabled, defines length of additional indentation applied to
    *  wrapped lines, in number of characters.
    */
  @JSName("editor.softWrapHangingIndent")
  var editorDotsoftWrapHangingIndent: Double
  /** Number of spaces used to represent a tab. */
  @JSName("editor.tabLength")
  var editorDottabLength: Double
  /**
    *  Determine character inserted when Tab key is pressed. Possible values: "auto",
    *  "soft" and "hard". When set to "soft" or "hard", soft tabs (spaces) or hard tabs
    *  (tab characters) are used. When set to "auto", the editor auto-detects the tab
    *  type based on the contents of the buffer (it uses the first leading whitespace
    *  on a non-comment line), or uses the value of the Soft Tabs config setting if
    *  auto-detection fails.
    */
  @JSName("editor.tabType")
  var editorDottabType: auto | soft | hard
  /**
    *  Time interval in milliseconds within which text editing operations will be
    *  grouped together in the undo history.
    */
  @JSName("editor.undoGroupingInterval")
  var editorDotundoGroupingInterval: Double
  /**
    *  Change the editor font size when pressing the Ctrl key and scrolling the mouse
    *  up/down.
    */
  @JSName("editor.zoomFontWhenCtrlScrolling")
  var editorDotzoomFontWhenCtrlScrolling: Boolean
  /** Disabled providers. */
  @JSName("linter.disabledProviders")
  var linterDotdisabledProviders: js.Array[String]
  /** Ignore files matching this Glob. */
  @JSName("linter.ignoreGlob")
  var linterDotignoreGlob: String
  /**
    *  Lint files while typing, without the need to save (only for supported
    *  providers).
    */
  @JSName("linter.lintOnChange")
  var linterDotlintOnChange: Boolean
  /** Interval at which linting is done as you type (in ms). */
  @JSName("linter.lintOnChangeInterval")
  var linterDotlintOnChangeInterval: Double
  /** Lint files automatically when they are opened. */
  @JSName("linter.lintOnOpen")
  var linterDotlintOnOpen: Boolean
  /** Lint tabs while they are still in preview status. */
  @JSName("linter.lintPreviewTabs")
  var linterDotlintPreviewTabs: Boolean
  /**
    *  Format for the cursor position status bar element, where %L is the line
    *  number and %C is the column number.
    */
  @JSName("status-bar.cursorPositionFormat")
  var `status-barDotcursorPositionFormat`: String
  /** Fit the status-bar to the window's full-width. */
  @JSName("status-bar.fullWidth")
  var `status-barDotfullWidth`: Boolean
  /** Show status bar at the bottom of the workspace. */
  @JSName("status-bar.isVisible")
  var `status-barDotisVisible`: Boolean
  /**
    *  Format for the selection count status bar element, where %L is the line
    *  count and %C is the character count.
    */
  @JSName("status-bar.selectionCountFormat")
  var `status-barDotselectionCountFormat`: String
}

object ConfigValues {
  @scala.inline
  def apply(
    `autocomplete-plusDotautoActivationDelay`: Double,
    `autocomplete-plusDotbackspaceTriggersAutocomplete`: Boolean,
    `autocomplete-plusDotbuiltinProviderBlacklist`: String,
    `autocomplete-plusDotconfirmCompletion`: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`),
    `autocomplete-plusDotconsumeSuffix`: Boolean,
    `autocomplete-plusDotdefaultProvider`: Subsequence | Symbol,
    `autocomplete-plusDotenableAutoActivation`: Boolean,
    `autocomplete-plusDotenableAutoConfirmSingleSuggestion`: Boolean,
    `autocomplete-plusDotenableBuiltinProvider`: Boolean,
    `autocomplete-plusDotenableExtendedUnicodeSupport`: Boolean,
    `autocomplete-plusDotfileBlacklist`: js.Array[String],
    `autocomplete-plusDotincludeCompletionsFromAllBuffers`: Boolean,
    `autocomplete-plusDotmaxVisibleSuggestions`: Double,
    `autocomplete-plusDotminimumWordLength`: Double,
    `autocomplete-plusDotscopeBlacklist`: js.Array[String],
    `autocomplete-plusDotsimilarSuggestionRemoval`: none | textOrSnippet,
    `autocomplete-plusDotstrictMatching`: Boolean,
    `autocomplete-plusDotsuggestionListFollows`: Word | typings.atom.atomStrings.Cursor,
    `autocomplete-plusDotsuppressActivationForEditorClasses`: js.Array[String],
    `autocomplete-plusDotuseAlternateScoring`: Boolean,
    `autocomplete-plusDotuseCoreMovementCommands`: Boolean,
    `autocomplete-plusDotuseLocalityBonus`: Boolean,
    coreDotallowPendingPaneItems: Boolean,
    coreDotaudioBeep: Boolean,
    coreDotautomaticallyUpdate: Boolean,
    coreDotcloseDeletedFileTabs: Boolean,
    coreDotcloseEmptyWindows: Boolean,
    coreDotcolorProfile: default | srgb,
    coreDotcustomFileTypes: StringDictionary[js.Array[String]],
    coreDotdestroyEmptyPanes: Boolean,
    coreDotdisabledPackages: js.Array[String],
    coreDotexcludeVcsIgnoredPaths: Boolean,
    coreDotfileEncoding: FileEncoding,
    coreDotfileSystemWatcher: native | experimental | poll | atom,
    coreDotfollowSymlinks: Boolean,
    coreDotignoredNames: js.Array[String],
    coreDotopenEmptyEditorOnStart: Boolean,
    coreDotreopenProjectMenuCount: Double,
    coreDotrestorePreviousWindowsOnStart: no | yes | always,
    coreDottelemetryConsent: limited | no | undecided,
    coreDotthemes: js.Array[String],
    coreDotuseProxySettingsWhenCallingApm: Boolean,
    coreDotuseTreeSitterParsers: Boolean,
    coreDotversionPinnedPackages: js.Array[String],
    coreDotwarnOnLargeFileLimit: Double,
    editorDotatomicSoftTabs: Boolean,
    editorDotautoIndent: Boolean,
    editorDotautoIndentOnPaste: Boolean,
    editorDotconfirmCheckoutHeadRevision: Boolean,
    editorDotfontFamily: String,
    editorDotfontSize: Double,
    editorDotinvisibles: Invisibles,
    editorDotlineHeight: String | Double,
    editorDotmaxScreenLineLength: Double,
    editorDotnonWordCharacters: String,
    editorDotpreferredLineLength: Double,
    editorDotscrollPastEnd: Boolean,
    editorDotscrollSensitivity: Double,
    editorDotshowCursorOnSelection: Boolean,
    editorDotshowIndentGuide: Boolean,
    editorDotshowInvisibles: Boolean,
    editorDotshowLineNumbers: Boolean,
    editorDotsoftTabs: Boolean,
    editorDotsoftWrap: Boolean,
    editorDotsoftWrapAtPreferredLineLength: Boolean,
    editorDotsoftWrapHangingIndent: Double,
    editorDottabLength: Double,
    editorDottabType: auto | soft | hard,
    editorDotundoGroupingInterval: Double,
    editorDotzoomFontWhenCtrlScrolling: Boolean,
    linterDotdisabledProviders: js.Array[String],
    linterDotignoreGlob: String,
    linterDotlintOnChange: Boolean,
    linterDotlintOnChangeInterval: Double,
    linterDotlintOnOpen: Boolean,
    linterDotlintPreviewTabs: Boolean,
    `status-barDotcursorPositionFormat`: String,
    `status-barDotfullWidth`: Boolean,
    `status-barDotisVisible`: Boolean,
    `status-barDotselectionCountFormat`: String,
    StringDictionary: // tslint:disable-next-line:no-any
  /* key */ StringDictionary[js.Any] = null,
    editorDotcommentEnd: String = null,
    editorDotcommentStart: String = null,
    editorDotdecreaseIndentPattern: String = null,
    editorDotfoldEndPattern: String = null,
    editorDotincreaseIndentPattern: String = null
  ): ConfigValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autocomplete-plus.autoActivationDelay")(`autocomplete-plusDotautoActivationDelay`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.backspaceTriggersAutocomplete")(`autocomplete-plusDotbackspaceTriggersAutocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.builtinProviderBlacklist")(`autocomplete-plusDotbuiltinProviderBlacklist`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.confirmCompletion")(`autocomplete-plusDotconfirmCompletion`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.consumeSuffix")(`autocomplete-plusDotconsumeSuffix`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.defaultProvider")(`autocomplete-plusDotdefaultProvider`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.enableAutoActivation")(`autocomplete-plusDotenableAutoActivation`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.enableAutoConfirmSingleSuggestion")(`autocomplete-plusDotenableAutoConfirmSingleSuggestion`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.enableBuiltinProvider")(`autocomplete-plusDotenableBuiltinProvider`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.enableExtendedUnicodeSupport")(`autocomplete-plusDotenableExtendedUnicodeSupport`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.fileBlacklist")(`autocomplete-plusDotfileBlacklist`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.includeCompletionsFromAllBuffers")(`autocomplete-plusDotincludeCompletionsFromAllBuffers`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.maxVisibleSuggestions")(`autocomplete-plusDotmaxVisibleSuggestions`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.minimumWordLength")(`autocomplete-plusDotminimumWordLength`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.scopeBlacklist")(`autocomplete-plusDotscopeBlacklist`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.similarSuggestionRemoval")(`autocomplete-plusDotsimilarSuggestionRemoval`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.strictMatching")(`autocomplete-plusDotstrictMatching`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.suggestionListFollows")(`autocomplete-plusDotsuggestionListFollows`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.suppressActivationForEditorClasses")(`autocomplete-plusDotsuppressActivationForEditorClasses`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.useAlternateScoring")(`autocomplete-plusDotuseAlternateScoring`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.useCoreMovementCommands")(`autocomplete-plusDotuseCoreMovementCommands`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.useLocalityBonus")(`autocomplete-plusDotuseLocalityBonus`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.allowPendingPaneItems")(coreDotallowPendingPaneItems.asInstanceOf[js.Any])
    __obj.updateDynamic("core.audioBeep")(coreDotaudioBeep.asInstanceOf[js.Any])
    __obj.updateDynamic("core.automaticallyUpdate")(coreDotautomaticallyUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("core.closeDeletedFileTabs")(coreDotcloseDeletedFileTabs.asInstanceOf[js.Any])
    __obj.updateDynamic("core.closeEmptyWindows")(coreDotcloseEmptyWindows.asInstanceOf[js.Any])
    __obj.updateDynamic("core.colorProfile")(coreDotcolorProfile.asInstanceOf[js.Any])
    __obj.updateDynamic("core.customFileTypes")(coreDotcustomFileTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("core.destroyEmptyPanes")(coreDotdestroyEmptyPanes.asInstanceOf[js.Any])
    __obj.updateDynamic("core.disabledPackages")(coreDotdisabledPackages.asInstanceOf[js.Any])
    __obj.updateDynamic("core.excludeVcsIgnoredPaths")(coreDotexcludeVcsIgnoredPaths.asInstanceOf[js.Any])
    __obj.updateDynamic("core.fileEncoding")(coreDotfileEncoding.asInstanceOf[js.Any])
    __obj.updateDynamic("core.fileSystemWatcher")(coreDotfileSystemWatcher.asInstanceOf[js.Any])
    __obj.updateDynamic("core.followSymlinks")(coreDotfollowSymlinks.asInstanceOf[js.Any])
    __obj.updateDynamic("core.ignoredNames")(coreDotignoredNames.asInstanceOf[js.Any])
    __obj.updateDynamic("core.openEmptyEditorOnStart")(coreDotopenEmptyEditorOnStart.asInstanceOf[js.Any])
    __obj.updateDynamic("core.reopenProjectMenuCount")(coreDotreopenProjectMenuCount.asInstanceOf[js.Any])
    __obj.updateDynamic("core.restorePreviousWindowsOnStart")(coreDotrestorePreviousWindowsOnStart.asInstanceOf[js.Any])
    __obj.updateDynamic("core.telemetryConsent")(coreDottelemetryConsent.asInstanceOf[js.Any])
    __obj.updateDynamic("core.themes")(coreDotthemes.asInstanceOf[js.Any])
    __obj.updateDynamic("core.useProxySettingsWhenCallingApm")(coreDotuseProxySettingsWhenCallingApm.asInstanceOf[js.Any])
    __obj.updateDynamic("core.useTreeSitterParsers")(coreDotuseTreeSitterParsers.asInstanceOf[js.Any])
    __obj.updateDynamic("core.versionPinnedPackages")(coreDotversionPinnedPackages.asInstanceOf[js.Any])
    __obj.updateDynamic("core.warnOnLargeFileLimit")(coreDotwarnOnLargeFileLimit.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.atomicSoftTabs")(editorDotatomicSoftTabs.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.autoIndent")(editorDotautoIndent.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.autoIndentOnPaste")(editorDotautoIndentOnPaste.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.confirmCheckoutHeadRevision")(editorDotconfirmCheckoutHeadRevision.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.fontFamily")(editorDotfontFamily.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.fontSize")(editorDotfontSize.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.invisibles")(editorDotinvisibles.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.lineHeight")(editorDotlineHeight.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.maxScreenLineLength")(editorDotmaxScreenLineLength.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.nonWordCharacters")(editorDotnonWordCharacters.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.preferredLineLength")(editorDotpreferredLineLength.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.scrollPastEnd")(editorDotscrollPastEnd.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.scrollSensitivity")(editorDotscrollSensitivity.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.showCursorOnSelection")(editorDotshowCursorOnSelection.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.showIndentGuide")(editorDotshowIndentGuide.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.showInvisibles")(editorDotshowInvisibles.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.showLineNumbers")(editorDotshowLineNumbers.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.softTabs")(editorDotsoftTabs.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.softWrap")(editorDotsoftWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.softWrapAtPreferredLineLength")(editorDotsoftWrapAtPreferredLineLength.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.softWrapHangingIndent")(editorDotsoftWrapHangingIndent.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.tabLength")(editorDottabLength.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.tabType")(editorDottabType.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.undoGroupingInterval")(editorDotundoGroupingInterval.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.zoomFontWhenCtrlScrolling")(editorDotzoomFontWhenCtrlScrolling.asInstanceOf[js.Any])
    __obj.updateDynamic("linter.disabledProviders")(linterDotdisabledProviders.asInstanceOf[js.Any])
    __obj.updateDynamic("linter.ignoreGlob")(linterDotignoreGlob.asInstanceOf[js.Any])
    __obj.updateDynamic("linter.lintOnChange")(linterDotlintOnChange.asInstanceOf[js.Any])
    __obj.updateDynamic("linter.lintOnChangeInterval")(linterDotlintOnChangeInterval.asInstanceOf[js.Any])
    __obj.updateDynamic("linter.lintOnOpen")(linterDotlintOnOpen.asInstanceOf[js.Any])
    __obj.updateDynamic("linter.lintPreviewTabs")(linterDotlintPreviewTabs.asInstanceOf[js.Any])
    __obj.updateDynamic("status-bar.cursorPositionFormat")(`status-barDotcursorPositionFormat`.asInstanceOf[js.Any])
    __obj.updateDynamic("status-bar.fullWidth")(`status-barDotfullWidth`.asInstanceOf[js.Any])
    __obj.updateDynamic("status-bar.isVisible")(`status-barDotisVisible`.asInstanceOf[js.Any])
    __obj.updateDynamic("status-bar.selectionCountFormat")(`status-barDotselectionCountFormat`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (editorDotcommentEnd != null) __obj.updateDynamic("editor.commentEnd")(editorDotcommentEnd.asInstanceOf[js.Any])
    if (editorDotcommentStart != null) __obj.updateDynamic("editor.commentStart")(editorDotcommentStart.asInstanceOf[js.Any])
    if (editorDotdecreaseIndentPattern != null) __obj.updateDynamic("editor.decreaseIndentPattern")(editorDotdecreaseIndentPattern.asInstanceOf[js.Any])
    if (editorDotfoldEndPattern != null) __obj.updateDynamic("editor.foldEndPattern")(editorDotfoldEndPattern.asInstanceOf[js.Any])
    if (editorDotincreaseIndentPattern != null) __obj.updateDynamic("editor.increaseIndentPattern")(editorDotincreaseIndentPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigValues]
  }
}

