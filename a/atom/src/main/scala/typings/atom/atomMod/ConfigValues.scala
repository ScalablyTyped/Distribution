package typings.atom.atomMod

import org.scalablytyped.runtime.StringDictionary
import typings.atom.atomStrings.always
import typings.atom.atomStrings.auto
import typings.atom.atomStrings.default
import typings.atom.atomStrings.experimental
import typings.atom.atomStrings.hard
import typings.atom.atomStrings.limited
import typings.atom.atomStrings.native
import typings.atom.atomStrings.no
import typings.atom.atomStrings.poll
import typings.atom.atomStrings.soft
import typings.atom.atomStrings.srgb
import typings.atom.atomStrings.undecided
import typings.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigValues
  extends // tslint:disable-next-line:no-any
/* key */ StringDictionary[js.Any] {
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
}

object ConfigValues {
  @scala.inline
  def apply(
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
    StringDictionary: // tslint:disable-next-line:no-any
  /* key */ StringDictionary[js.Any] = null,
    `editor.commentEnd`: String = null,
    `editor.commentStart`: String = null,
    `editor.decreaseIndentPattern`: String = null,
    `editor.foldEndPattern`: String = null,
    `editor.increaseIndentPattern`: String = null
  ): ConfigValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("core.allowPendingPaneItems")(`core.allowPendingPaneItems`)
    __obj.updateDynamic("core.audioBeep")(`core.audioBeep`)
    __obj.updateDynamic("core.automaticallyUpdate")(`core.automaticallyUpdate`)
    __obj.updateDynamic("core.closeDeletedFileTabs")(`core.closeDeletedFileTabs`)
    __obj.updateDynamic("core.closeEmptyWindows")(`core.closeEmptyWindows`)
    __obj.updateDynamic("core.colorProfile")(`core.colorProfile`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.customFileTypes")(`core.customFileTypes`)
    __obj.updateDynamic("core.destroyEmptyPanes")(`core.destroyEmptyPanes`)
    __obj.updateDynamic("core.disabledPackages")(`core.disabledPackages`)
    __obj.updateDynamic("core.excludeVcsIgnoredPaths")(`core.excludeVcsIgnoredPaths`)
    __obj.updateDynamic("core.fileEncoding")(`core.fileEncoding`)
    __obj.updateDynamic("core.fileSystemWatcher")(`core.fileSystemWatcher`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.followSymlinks")(`core.followSymlinks`)
    __obj.updateDynamic("core.ignoredNames")(`core.ignoredNames`)
    __obj.updateDynamic("core.openEmptyEditorOnStart")(`core.openEmptyEditorOnStart`)
    __obj.updateDynamic("core.reopenProjectMenuCount")(`core.reopenProjectMenuCount`)
    __obj.updateDynamic("core.restorePreviousWindowsOnStart")(`core.restorePreviousWindowsOnStart`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.telemetryConsent")(`core.telemetryConsent`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.themes")(`core.themes`)
    __obj.updateDynamic("core.useProxySettingsWhenCallingApm")(`core.useProxySettingsWhenCallingApm`)
    __obj.updateDynamic("core.useTreeSitterParsers")(`core.useTreeSitterParsers`)
    __obj.updateDynamic("core.versionPinnedPackages")(`core.versionPinnedPackages`)
    __obj.updateDynamic("core.warnOnLargeFileLimit")(`core.warnOnLargeFileLimit`)
    __obj.updateDynamic("editor.atomicSoftTabs")(`editor.atomicSoftTabs`)
    __obj.updateDynamic("editor.autoIndent")(`editor.autoIndent`)
    __obj.updateDynamic("editor.autoIndentOnPaste")(`editor.autoIndentOnPaste`)
    __obj.updateDynamic("editor.confirmCheckoutHeadRevision")(`editor.confirmCheckoutHeadRevision`)
    __obj.updateDynamic("editor.fontFamily")(`editor.fontFamily`)
    __obj.updateDynamic("editor.fontSize")(`editor.fontSize`)
    __obj.updateDynamic("editor.invisibles")(`editor.invisibles`)
    __obj.updateDynamic("editor.lineHeight")(`editor.lineHeight`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.maxScreenLineLength")(`editor.maxScreenLineLength`)
    __obj.updateDynamic("editor.nonWordCharacters")(`editor.nonWordCharacters`)
    __obj.updateDynamic("editor.preferredLineLength")(`editor.preferredLineLength`)
    __obj.updateDynamic("editor.scrollPastEnd")(`editor.scrollPastEnd`)
    __obj.updateDynamic("editor.scrollSensitivity")(`editor.scrollSensitivity`)
    __obj.updateDynamic("editor.showCursorOnSelection")(`editor.showCursorOnSelection`)
    __obj.updateDynamic("editor.showIndentGuide")(`editor.showIndentGuide`)
    __obj.updateDynamic("editor.showInvisibles")(`editor.showInvisibles`)
    __obj.updateDynamic("editor.showLineNumbers")(`editor.showLineNumbers`)
    __obj.updateDynamic("editor.softTabs")(`editor.softTabs`)
    __obj.updateDynamic("editor.softWrap")(`editor.softWrap`)
    __obj.updateDynamic("editor.softWrapAtPreferredLineLength")(`editor.softWrapAtPreferredLineLength`)
    __obj.updateDynamic("editor.softWrapHangingIndent")(`editor.softWrapHangingIndent`)
    __obj.updateDynamic("editor.tabLength")(`editor.tabLength`)
    __obj.updateDynamic("editor.tabType")(`editor.tabType`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.undoGroupingInterval")(`editor.undoGroupingInterval`)
    __obj.updateDynamic("editor.zoomFontWhenCtrlScrolling")(`editor.zoomFontWhenCtrlScrolling`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`editor.commentEnd` != null) __obj.updateDynamic("editor.commentEnd")(`editor.commentEnd`)
    if (`editor.commentStart` != null) __obj.updateDynamic("editor.commentStart")(`editor.commentStart`)
    if (`editor.decreaseIndentPattern` != null) __obj.updateDynamic("editor.decreaseIndentPattern")(`editor.decreaseIndentPattern`)
    if (`editor.foldEndPattern` != null) __obj.updateDynamic("editor.foldEndPattern")(`editor.foldEndPattern`)
    if (`editor.increaseIndentPattern` != null) __obj.updateDynamic("editor.increaseIndentPattern")(`editor.increaseIndentPattern`)
    __obj.asInstanceOf[ConfigValues]
  }
}

