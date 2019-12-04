package typings.atom.atomMod

import org.scalablytyped.runtime.StringDictionary
import typings.atom.atomStrings.Subsequence
import typings.atom.atomStrings.Symbol
import typings.atom.atomStrings.Word
import typings.atom.atomStrings.`tab always, enter when suggestion explicitly selected`
import typings.atom.atomStrings.`tab and enter`
import typings.atom.atomStrings.always
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
  var `autocomplete-plus.autoActivationDelay`: Double
  /**
    *  If enabled, typing `backspace` will show the suggestion list if suggestions
    *  are available. If disabled, suggestions will not be shown while backspacing.
    */
  var `autocomplete-plus.backspaceTriggersAutocomplete`: Boolean
  /** Don't use the built-in provider for these selector(s). */
  var `autocomplete-plus.builtinProviderBlacklist`: String
  /**
    *  You should use the key(s) indicated here to confirm a suggestion from the
    *  suggestion list and have it inserted into the file.
    */
  var `autocomplete-plus.confirmCompletion`: tab | enter | (`tab and enter`) | (`tab always, enter when suggestion explicitly selected`)
  /**
    *  Completing a suggestion consumes text following the cursor matching the
    *  suffix of the chosen suggestion.
    */
  var `autocomplete-plus.consumeSuffix`: Boolean
  /**
    *  If you're having trouble with autocomplete, you may consider falling back
    *  to the Symbol provider and filing an issue.
    */
  var `autocomplete-plus.defaultProvider`: Subsequence | Symbol
  /**
    *  Suggestions will show as you type if this preference is enabled. If it is
    *  disabled, you can still see suggestions by using the keymapping for
    *  'autocomplete-plus:activate' (shown below).
    */
  var `autocomplete-plus.enableAutoActivation`: Boolean
  /**
    *  If enabled, automatically insert suggestion on manual activation with
    *  'autocomplete-plus:activate' when there is only one match.
    */
  var `autocomplete-plus.enableAutoConfirmSingleSuggestion`: Boolean
  /**
    *  The package comes with a built-in provider that will provide suggestions
    *  using the words in your current buffer or all open buffers. You will get
    *  better suggestions by installing additional autocomplete+ providers.
    *  To stop using the built-in provider, disable this option.
    */
  var `autocomplete-plus.enableBuiltinProvider`: Boolean
  /** Identifies non-latin alphabet characters as letters. */
  var `autocomplete-plus.enableExtendedUnicodeSupport`: Boolean
  /**
    *  Suggestions will not be provided for files matching this list, e.g. *.md
    *  for Markdown files. To blacklist more than one file extension, use comma
    *  as a separator, e.g. ["*.md", "*.txt"] (both Markdown and text files).
    */
  var `autocomplete-plus.fileBlacklist`: js.Array[String]
  /**
    *  For grammars with no registered provider(s), the default provider will
    *  include completions from all buffers, instead of just the buffer you are
    *  currently editing.
    */
  var `autocomplete-plus.includeCompletionsFromAllBuffers`: Boolean
  /** The suggestion list will only show this many suggestions. */
  var `autocomplete-plus.maxVisibleSuggestions`: Double
  /**
    *  Only autocomplete when you've typed at least this many characters.
    *  Note: May not affect external providers.
    */
  var `autocomplete-plus.minimumWordLength`: Double
  /** Suggestions will not be provided for scopes matching this list. */
  var `autocomplete-plus.scopeBlacklist`: js.Array[String]
  /**
    *  Should similar suggestions be removed from the list? If so how to determine
    *  they are similar.
    */
  var `autocomplete-plus.similarSuggestionRemoval`: none | textOrSnippet
  /**
    *  Fuzzy searching is performed if this is disabled; if it is enabled, suggestions
    *  must begin with the prefix from the current word.
    */
  var `autocomplete-plus.strictMatching`: Boolean
  /**
    *  With 'Cursor' the suggestion list appears at the cursor's position.
    *  With 'Word' it appears at the beginning of the word that's being completed.
    */
  var `autocomplete-plus.suggestionListFollows`: Word | typings.atom.atomStrings.Cursor
  /** Don't auto-activate when any of these classes are present in the editor. */
  var `autocomplete-plus.suppressActivationForEditorClasses`: js.Array[String]
  /**
    *  -EXPERIMENTAL- Prefers runs of consecutive characters, acronyms and start
    *  of words.
    */
  var `autocomplete-plus.useAlternateScoring`: Boolean
  /**
    *  Disable this if you want to bind your own keystrokes to move around the
    *  suggestion list. You will also need to add definitions to your keymap.
    */
  var `autocomplete-plus.useCoreMovementCommands`: Boolean
  /** Gives words near the cursor position a higher score than those far away. */
  var `autocomplete-plus.useLocalityBonus`: Boolean
  /**
    *  Allow items to be previewed without adding them to a pane permanently, such as
    *  when single clicking files in the tree view.
    */
  var `core.allowPendingPaneItems`: Boolean
  /**
    *  Trigger the system's beep sound when certain actions cannot be executed or
    *  there are no results.
    */
  var `core.audioBeep`: Boolean
  /** Automatically update Atom when a new release is available. */
  var `core.automaticallyUpdate`: Boolean
  /** Close corresponding editors when a file is deleted outside Atom. */
  var `core.closeDeletedFileTabs`: Boolean
  /**
    *  When a window with no open tabs or panes is given the 'Close Tab' command,
    *  close that window.
    */
  var `core.closeEmptyWindows`: Boolean
  /**
    * Specify whether Atom should use the operating system's color profile (recommended)
    * or an alternative color profile.
    */
  var `core.colorProfile`: default | srgb
  /**
    *  Associates scope names (e.g. "source.coffee") with arrays of file extensions
    *  and file names (e.g. ["Cakefile", ".coffee2"]).
    */
  var `core.customFileTypes`: StringDictionary[js.Array[String]]
  /** When the last tab of a pane is closed, remove that pane as well. */
  var `core.destroyEmptyPanes`: Boolean
  /** List of names of installed packages which are not loaded at startup. */
  var `core.disabledPackages`: js.Array[String]
  /**
    *  Files and directories ignored by the current project's VCS system will be ignored
    *  by some packages, such as the fuzzy finder and find and replace. For example,
    *  projects using Git have these paths defined in the .gitignore file. Individual
    *  packages might have additional config settings for ignoring VCS ignored files and
    *  folders.
    */
  var `core.excludeVcsIgnoredPaths`: Boolean
  /** Default character set encoding to use when reading and writing files. */
  var `core.fileEncoding`: FileEncoding
  /**
    *  Choose the underlying implementation used to watch for filesystem changes. Emulating
    *  changes will miss any events caused by applications other than Atom, but may help
    *  prevent crashes or freezes.
    */
  var `core.fileSystemWatcher`: native | experimental | poll | typings.atom.atomStrings.atom
  /**
    *  Follow symbolic links when searching files and when opening files with the fuzzy
    *  finder.
    */
  var `core.followSymlinks`: Boolean
  /**
    *  List of glob patterns. Files and directories matching these patterns will be
    *  ignored by some packages, such as the fuzzy finder and tree view. Individual
    *  packages might have additional config settings for ignoring names.
    */
  var `core.ignoredNames`: js.Array[String]
  /**
    *  When checked opens an untitled editor when loading a blank environment (such as
    *  with 'File > New Window' or when "Restore Previous Windows On Start" is unchecked);
    *  otherwise, no editor is opened when loading a blank environment.
    *  This setting has no effect when restoring a previous state.
    */
  var `core.openEmptyEditorOnStart`: Boolean
  /** How many recent projects to show in the Reopen Project menu. */
  var `core.reopenProjectMenuCount`: Double
  /**
    *  When selected 'no', a blank environment is loaded. When selected 'yes' and Atom
    *  is started from the icon or `atom` by itself from the command line, restores the
    *  last state of all Atom windows; otherwise a blank environment is loaded. When
    *  selected 'always', restores the last state of all Atom windows always, no matter
    *  how Atom is started.
    */
  var `core.restorePreviousWindowsOnStart`: no | yes | always
  /**
    *  Allow usage statistics and exception reports to be sent to the Atom team to help
    *  improve the product.
    */
  var `core.telemetryConsent`: limited | no | undecided
  /** Names of UI and syntax themes which will be used when Atom starts. */
  var `core.themes`: js.Array[String]
  /** Use detected proxy settings when calling the `apm` command-line tool. */
  var `core.useProxySettingsWhenCallingApm`: Boolean
  /** Experimental: Use the new Tree-sitter parsing system for supported languages. */
  var `core.useTreeSitterParsers`: Boolean
  /** List of names of installed packages which are not automatically updated. */
  var `core.versionPinnedPackages`: js.Array[String]
  /** Warn before opening files larger than this number of megabytes. */
  var `core.warnOnLargeFileLimit`: Double
  /** Skip over tab-length runs of leading whitespace when moving the cursor. */
  var `editor.atomicSoftTabs`: Boolean
  /** Automatically indent the cursor when inserting a newline. */
  var `editor.autoIndent`: Boolean
  /** Automatically indent pasted text based on the indentation of the previous line. */
  var `editor.autoIndentOnPaste`: Boolean
  var `editor.commentEnd`: String | Null
  var `editor.commentStart`: String | Null
  /**
    *  Show confirmation dialog when checking out the HEAD revision and discarding
    *  changes to current file since last commit.
    */
  var `editor.confirmCheckoutHeadRevision`: Boolean
  var `editor.decreaseIndentPattern`: String | Null
  var `editor.foldEndPattern`: String | Null
  /** The name of the font family used for editor text. */
  var `editor.fontFamily`: String
  /** Height in pixels of editor text. */
  var `editor.fontSize`: Double
  var `editor.increaseIndentPattern`: String | Null
  /**
    *  A hash of characters Atom will use to render whitespace characters. Keys are
    *  whitespace character types, values are rendered characters (use value false to
    *  turn off individual whitespace character types).
    */
  var `editor.invisibles`: Invisibles
  /** Height of editor lines, as a multiplier of font size. */
  var `editor.lineHeight`: String | Double
  /**
    * Defines the maximum width of the editor window before soft wrapping is enforced,
    * in number of characters.
    */
  var `editor.maxScreenLineLength`: Double
  /** A string of non-word characters to define word boundaries. */
  var `editor.nonWordCharacters`: String
  /**
    *  Identifies the length of a line which is used when wrapping text with the
    *  `Soft Wrap At Preferred Line Length` setting enabled, in number of characters.
    */
  var `editor.preferredLineLength`: Double
  /** Allow the editor to be scrolled past the end of the last line. */
  var `editor.scrollPastEnd`: Boolean
  /** Determines how fast the editor scrolls when using a mouse or trackpad. */
  var `editor.scrollSensitivity`: Double
  /** Show cursor while there is a selection. */
  var `editor.showCursorOnSelection`: Boolean
  /** Show indentation indicators in the editor. */
  var `editor.showIndentGuide`: Boolean
  /** Render placeholders for invisible characters, such as tabs, spaces and newlines. */
  var `editor.showInvisibles`: Boolean
  /** Show line numbers in the editor's gutter. */
  var `editor.showLineNumbers`: Boolean
  /**
    *  If the `Tab Type` config setting is set to "auto" and autodetection of tab type
    *  from buffer content fails, then this config setting determines whether a soft tab
    *  or a hard tab will be inserted when the Tab key is pressed.
    */
  var `editor.softTabs`: Boolean
  /**
    *  Wraps lines that exceed the width of the window. When `Soft Wrap At Preferred
    *  Line Length` is set, it will wrap to the number of characters defined by the
    *  `Preferred Line Length` setting.
    */
  var `editor.softWrap`: Boolean
  /**
    *  Instead of wrapping lines to the window's width, wrap lines to the number of
    *  characters defined by the `Preferred Line Length` setting. This will only take
    *  effect when the soft wrap config setting is enabled globally or for the current
    *  language.
    *  **Note:** If you want to hide the wrap guide (the vertical line) you can disable
    *  the `wrap-guide` package.
    */
  var `editor.softWrapAtPreferredLineLength`: Boolean
  /**
    *  When soft wrap is enabled, defines length of additional indentation applied to
    *  wrapped lines, in number of characters.
    */
  var `editor.softWrapHangingIndent`: Double
  /** Number of spaces used to represent a tab. */
  var `editor.tabLength`: Double
  /**
    *  Determine character inserted when Tab key is pressed. Possible values: "auto",
    *  "soft" and "hard". When set to "soft" or "hard", soft tabs (spaces) or hard tabs
    *  (tab characters) are used. When set to "auto", the editor auto-detects the tab
    *  type based on the contents of the buffer (it uses the first leading whitespace
    *  on a non-comment line), or uses the value of the Soft Tabs config setting if
    *  auto-detection fails.
    */
  var `editor.tabType`: auto | soft | hard
  /**
    *  Time interval in milliseconds within which text editing operations will be
    *  grouped together in the undo history.
    */
  var `editor.undoGroupingInterval`: Double
  /**
    *  Change the editor font size when pressing the Ctrl key and scrolling the mouse
    *  up/down.
    */
  var `editor.zoomFontWhenCtrlScrolling`: Boolean
  /** Disabled providers. */
  var `linter.disabledProviders`: js.Array[String]
  /** Ignore files matching this Glob. */
  var `linter.ignoreGlob`: String
  /**
    *  Lint files while typing, without the need to save (only for supported
    *  providers).
    */
  var `linter.lintOnChange`: Boolean
  /** Interval at which linting is done as you type (in ms). */
  var `linter.lintOnChangeInterval`: Double
  /** Lint files automatically when they are opened. */
  var `linter.lintOnOpen`: Boolean
  /** Lint tabs while they are still in preview status. */
  var `linter.lintPreviewTabs`: Boolean
  /**
    *  Format for the cursor position status bar element, where %L is the line
    *  number and %C is the column number.
    */
  var `status-bar.cursorPositionFormat`: String
  /** Fit the status-bar to the window's full-width. */
  var `status-bar.fullWidth`: Boolean
  /** Show status bar at the bottom of the workspace. */
  var `status-bar.isVisible`: Boolean
  /**
    *  Format for the selection count status bar element, where %L is the line
    *  count and %C is the character count.
    */
  var `status-bar.selectionCountFormat`: String
}

object ConfigValues {
  @scala.inline
  def apply(
    `autocomplete-plus.autoActivationDelay`: Double,
    `autocomplete-plus.backspaceTriggersAutocomplete`: Boolean,
    `autocomplete-plus.builtinProviderBlacklist`: String,
    `autocomplete-plus.confirmCompletion`: tab | enter | (`tab and enter`) | (`tab always, enter when suggestion explicitly selected`),
    `autocomplete-plus.consumeSuffix`: Boolean,
    `autocomplete-plus.defaultProvider`: Subsequence | Symbol,
    `autocomplete-plus.enableAutoActivation`: Boolean,
    `autocomplete-plus.enableAutoConfirmSingleSuggestion`: Boolean,
    `autocomplete-plus.enableBuiltinProvider`: Boolean,
    `autocomplete-plus.enableExtendedUnicodeSupport`: Boolean,
    `autocomplete-plus.fileBlacklist`: js.Array[String],
    `autocomplete-plus.includeCompletionsFromAllBuffers`: Boolean,
    `autocomplete-plus.maxVisibleSuggestions`: Double,
    `autocomplete-plus.minimumWordLength`: Double,
    `autocomplete-plus.scopeBlacklist`: js.Array[String],
    `autocomplete-plus.similarSuggestionRemoval`: none | textOrSnippet,
    `autocomplete-plus.strictMatching`: Boolean,
    `autocomplete-plus.suggestionListFollows`: Word | typings.atom.atomStrings.Cursor,
    `autocomplete-plus.suppressActivationForEditorClasses`: js.Array[String],
    `autocomplete-plus.useAlternateScoring`: Boolean,
    `autocomplete-plus.useCoreMovementCommands`: Boolean,
    `autocomplete-plus.useLocalityBonus`: Boolean,
    `core.allowPendingPaneItems`: Boolean,
    `core.audioBeep`: Boolean,
    `core.automaticallyUpdate`: Boolean,
    `core.closeDeletedFileTabs`: Boolean,
    `core.closeEmptyWindows`: Boolean,
    `core.colorProfile`: default | srgb,
    `core.customFileTypes`: StringDictionary[js.Array[String]],
    `core.destroyEmptyPanes`: Boolean,
    `core.disabledPackages`: js.Array[String],
    `core.excludeVcsIgnoredPaths`: Boolean,
    `core.fileEncoding`: FileEncoding,
    `core.fileSystemWatcher`: native | experimental | poll | typings.atom.atomStrings.atom,
    `core.followSymlinks`: Boolean,
    `core.ignoredNames`: js.Array[String],
    `core.openEmptyEditorOnStart`: Boolean,
    `core.reopenProjectMenuCount`: Double,
    `core.restorePreviousWindowsOnStart`: no | yes | always,
    `core.telemetryConsent`: limited | no | undecided,
    `core.themes`: js.Array[String],
    `core.useProxySettingsWhenCallingApm`: Boolean,
    `core.useTreeSitterParsers`: Boolean,
    `core.versionPinnedPackages`: js.Array[String],
    `core.warnOnLargeFileLimit`: Double,
    `editor.atomicSoftTabs`: Boolean,
    `editor.autoIndent`: Boolean,
    `editor.autoIndentOnPaste`: Boolean,
    `editor.confirmCheckoutHeadRevision`: Boolean,
    `editor.fontFamily`: String,
    `editor.fontSize`: Double,
    `editor.invisibles`: Invisibles,
    `editor.lineHeight`: String | Double,
    `editor.maxScreenLineLength`: Double,
    `editor.nonWordCharacters`: String,
    `editor.preferredLineLength`: Double,
    `editor.scrollPastEnd`: Boolean,
    `editor.scrollSensitivity`: Double,
    `editor.showCursorOnSelection`: Boolean,
    `editor.showIndentGuide`: Boolean,
    `editor.showInvisibles`: Boolean,
    `editor.showLineNumbers`: Boolean,
    `editor.softTabs`: Boolean,
    `editor.softWrap`: Boolean,
    `editor.softWrapAtPreferredLineLength`: Boolean,
    `editor.softWrapHangingIndent`: Double,
    `editor.tabLength`: Double,
    `editor.tabType`: auto | soft | hard,
    `editor.undoGroupingInterval`: Double,
    `editor.zoomFontWhenCtrlScrolling`: Boolean,
    `linter.disabledProviders`: js.Array[String],
    `linter.ignoreGlob`: String,
    `linter.lintOnChange`: Boolean,
    `linter.lintOnChangeInterval`: Double,
    `linter.lintOnOpen`: Boolean,
    `linter.lintPreviewTabs`: Boolean,
    `status-bar.cursorPositionFormat`: String,
    `status-bar.fullWidth`: Boolean,
    `status-bar.isVisible`: Boolean,
    `status-bar.selectionCountFormat`: String,
    StringDictionary: // tslint:disable-next-line:no-any
  /* key */ StringDictionary[js.Any] = null,
    `editor.commentEnd`: String = null,
    `editor.commentStart`: String = null,
    `editor.decreaseIndentPattern`: String = null,
    `editor.foldEndPattern`: String = null,
    `editor.increaseIndentPattern`: String = null
  ): ConfigValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autocomplete-plus.autoActivationDelay")(`autocomplete-plus.autoActivationDelay`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.backspaceTriggersAutocomplete")(`autocomplete-plus.backspaceTriggersAutocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.builtinProviderBlacklist")(`autocomplete-plus.builtinProviderBlacklist`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.confirmCompletion")(`autocomplete-plus.confirmCompletion`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.consumeSuffix")(`autocomplete-plus.consumeSuffix`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.defaultProvider")(`autocomplete-plus.defaultProvider`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.enableAutoActivation")(`autocomplete-plus.enableAutoActivation`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.enableAutoConfirmSingleSuggestion")(`autocomplete-plus.enableAutoConfirmSingleSuggestion`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.enableBuiltinProvider")(`autocomplete-plus.enableBuiltinProvider`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.enableExtendedUnicodeSupport")(`autocomplete-plus.enableExtendedUnicodeSupport`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.fileBlacklist")(`autocomplete-plus.fileBlacklist`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.includeCompletionsFromAllBuffers")(`autocomplete-plus.includeCompletionsFromAllBuffers`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.maxVisibleSuggestions")(`autocomplete-plus.maxVisibleSuggestions`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.minimumWordLength")(`autocomplete-plus.minimumWordLength`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.scopeBlacklist")(`autocomplete-plus.scopeBlacklist`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.similarSuggestionRemoval")(`autocomplete-plus.similarSuggestionRemoval`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.strictMatching")(`autocomplete-plus.strictMatching`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.suggestionListFollows")(`autocomplete-plus.suggestionListFollows`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.suppressActivationForEditorClasses")(`autocomplete-plus.suppressActivationForEditorClasses`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.useAlternateScoring")(`autocomplete-plus.useAlternateScoring`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.useCoreMovementCommands")(`autocomplete-plus.useCoreMovementCommands`.asInstanceOf[js.Any])
    __obj.updateDynamic("autocomplete-plus.useLocalityBonus")(`autocomplete-plus.useLocalityBonus`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.allowPendingPaneItems")(`core.allowPendingPaneItems`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.audioBeep")(`core.audioBeep`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.automaticallyUpdate")(`core.automaticallyUpdate`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.closeDeletedFileTabs")(`core.closeDeletedFileTabs`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.closeEmptyWindows")(`core.closeEmptyWindows`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.colorProfile")(`core.colorProfile`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.customFileTypes")(`core.customFileTypes`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.destroyEmptyPanes")(`core.destroyEmptyPanes`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.disabledPackages")(`core.disabledPackages`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.excludeVcsIgnoredPaths")(`core.excludeVcsIgnoredPaths`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.fileEncoding")(`core.fileEncoding`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.fileSystemWatcher")(`core.fileSystemWatcher`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.followSymlinks")(`core.followSymlinks`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.ignoredNames")(`core.ignoredNames`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.openEmptyEditorOnStart")(`core.openEmptyEditorOnStart`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.reopenProjectMenuCount")(`core.reopenProjectMenuCount`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.restorePreviousWindowsOnStart")(`core.restorePreviousWindowsOnStart`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.telemetryConsent")(`core.telemetryConsent`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.themes")(`core.themes`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.useProxySettingsWhenCallingApm")(`core.useProxySettingsWhenCallingApm`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.useTreeSitterParsers")(`core.useTreeSitterParsers`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.versionPinnedPackages")(`core.versionPinnedPackages`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.warnOnLargeFileLimit")(`core.warnOnLargeFileLimit`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.atomicSoftTabs")(`editor.atomicSoftTabs`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.autoIndent")(`editor.autoIndent`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.autoIndentOnPaste")(`editor.autoIndentOnPaste`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.confirmCheckoutHeadRevision")(`editor.confirmCheckoutHeadRevision`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.fontFamily")(`editor.fontFamily`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.fontSize")(`editor.fontSize`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.invisibles")(`editor.invisibles`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.lineHeight")(`editor.lineHeight`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.maxScreenLineLength")(`editor.maxScreenLineLength`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.nonWordCharacters")(`editor.nonWordCharacters`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.preferredLineLength")(`editor.preferredLineLength`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.scrollPastEnd")(`editor.scrollPastEnd`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.scrollSensitivity")(`editor.scrollSensitivity`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.showCursorOnSelection")(`editor.showCursorOnSelection`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.showIndentGuide")(`editor.showIndentGuide`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.showInvisibles")(`editor.showInvisibles`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.showLineNumbers")(`editor.showLineNumbers`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.softTabs")(`editor.softTabs`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.softWrap")(`editor.softWrap`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.softWrapAtPreferredLineLength")(`editor.softWrapAtPreferredLineLength`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.softWrapHangingIndent")(`editor.softWrapHangingIndent`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.tabLength")(`editor.tabLength`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.tabType")(`editor.tabType`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.undoGroupingInterval")(`editor.undoGroupingInterval`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.zoomFontWhenCtrlScrolling")(`editor.zoomFontWhenCtrlScrolling`.asInstanceOf[js.Any])
    __obj.updateDynamic("linter.disabledProviders")(`linter.disabledProviders`.asInstanceOf[js.Any])
    __obj.updateDynamic("linter.ignoreGlob")(`linter.ignoreGlob`.asInstanceOf[js.Any])
    __obj.updateDynamic("linter.lintOnChange")(`linter.lintOnChange`.asInstanceOf[js.Any])
    __obj.updateDynamic("linter.lintOnChangeInterval")(`linter.lintOnChangeInterval`.asInstanceOf[js.Any])
    __obj.updateDynamic("linter.lintOnOpen")(`linter.lintOnOpen`.asInstanceOf[js.Any])
    __obj.updateDynamic("linter.lintPreviewTabs")(`linter.lintPreviewTabs`.asInstanceOf[js.Any])
    __obj.updateDynamic("status-bar.cursorPositionFormat")(`status-bar.cursorPositionFormat`.asInstanceOf[js.Any])
    __obj.updateDynamic("status-bar.fullWidth")(`status-bar.fullWidth`.asInstanceOf[js.Any])
    __obj.updateDynamic("status-bar.isVisible")(`status-bar.isVisible`.asInstanceOf[js.Any])
    __obj.updateDynamic("status-bar.selectionCountFormat")(`status-bar.selectionCountFormat`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`editor.commentEnd` != null) __obj.updateDynamic("editor.commentEnd")(`editor.commentEnd`.asInstanceOf[js.Any])
    if (`editor.commentStart` != null) __obj.updateDynamic("editor.commentStart")(`editor.commentStart`.asInstanceOf[js.Any])
    if (`editor.decreaseIndentPattern` != null) __obj.updateDynamic("editor.decreaseIndentPattern")(`editor.decreaseIndentPattern`.asInstanceOf[js.Any])
    if (`editor.foldEndPattern` != null) __obj.updateDynamic("editor.foldEndPattern")(`editor.foldEndPattern`.asInstanceOf[js.Any])
    if (`editor.increaseIndentPattern` != null) __obj.updateDynamic("editor.increaseIndentPattern")(`editor.increaseIndentPattern`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigValues]
  }
}

