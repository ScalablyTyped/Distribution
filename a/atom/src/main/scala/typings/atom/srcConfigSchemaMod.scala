package typings.atom

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
import typings.atom.srcOtherTypesMod.FileEncoding
import typings.atom.srcOtherTypesMod.Invisibles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConfigSchemaMod {
  
  trait ConfigValues extends StObject
  
  // NOTE: A hack to make ConfigValues extensible
  // eslint-disable-next-line no-declare-current-package
  /* augmented module */
  object atomAugmentingMod {
    
    trait ConfigValues
      extends StObject
         with // tslint:disable-next-line:no-any
    /* key */ StringDictionary[Any] {
      
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
      var coreDotfileSystemWatcher: native | experimental | poll | typings.atom.atomStrings.atom
      
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
      
      /** Use the new Tree-sitter parsing system for supported languages. */
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
    }
    object ConfigValues {
      
      inline def apply(
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
        coreDotfileSystemWatcher: native | experimental | poll | typings.atom.atomStrings.atom,
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
        editorDotzoomFontWhenCtrlScrolling: Boolean
      ): typings.atom.srcConfigSchemaMod.atomAugmentingMod.ConfigValues = {
        val __obj = js.Dynamic.literal()
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
        __obj.updateDynamic("editor.commentEnd")(null)
        __obj.updateDynamic("editor.commentStart")(null)
        __obj.updateDynamic("editor.decreaseIndentPattern")(null)
        __obj.updateDynamic("editor.foldEndPattern")(null)
        __obj.updateDynamic("editor.increaseIndentPattern")(null)
        __obj.asInstanceOf[typings.atom.srcConfigSchemaMod.atomAugmentingMod.ConfigValues]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.atom.srcConfigSchemaMod.atomAugmentingMod.ConfigValues] (val x: Self) extends AnyVal {
        
        inline def setCoreDotallowPendingPaneItems(value: Boolean): Self = StObject.set(x, "core.allowPendingPaneItems", value.asInstanceOf[js.Any])
        
        inline def setCoreDotaudioBeep(value: Boolean): Self = StObject.set(x, "core.audioBeep", value.asInstanceOf[js.Any])
        
        inline def setCoreDotautomaticallyUpdate(value: Boolean): Self = StObject.set(x, "core.automaticallyUpdate", value.asInstanceOf[js.Any])
        
        inline def setCoreDotcloseDeletedFileTabs(value: Boolean): Self = StObject.set(x, "core.closeDeletedFileTabs", value.asInstanceOf[js.Any])
        
        inline def setCoreDotcloseEmptyWindows(value: Boolean): Self = StObject.set(x, "core.closeEmptyWindows", value.asInstanceOf[js.Any])
        
        inline def setCoreDotcolorProfile(value: default | srgb): Self = StObject.set(x, "core.colorProfile", value.asInstanceOf[js.Any])
        
        inline def setCoreDotcustomFileTypes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "core.customFileTypes", value.asInstanceOf[js.Any])
        
        inline def setCoreDotdestroyEmptyPanes(value: Boolean): Self = StObject.set(x, "core.destroyEmptyPanes", value.asInstanceOf[js.Any])
        
        inline def setCoreDotdisabledPackages(value: js.Array[String]): Self = StObject.set(x, "core.disabledPackages", value.asInstanceOf[js.Any])
        
        inline def setCoreDotdisabledPackagesVarargs(value: String*): Self = StObject.set(x, "core.disabledPackages", js.Array(value*))
        
        inline def setCoreDotexcludeVcsIgnoredPaths(value: Boolean): Self = StObject.set(x, "core.excludeVcsIgnoredPaths", value.asInstanceOf[js.Any])
        
        inline def setCoreDotfileEncoding(value: FileEncoding): Self = StObject.set(x, "core.fileEncoding", value.asInstanceOf[js.Any])
        
        inline def setCoreDotfileSystemWatcher(value: native | experimental | poll | typings.atom.atomStrings.atom): Self = StObject.set(x, "core.fileSystemWatcher", value.asInstanceOf[js.Any])
        
        inline def setCoreDotfollowSymlinks(value: Boolean): Self = StObject.set(x, "core.followSymlinks", value.asInstanceOf[js.Any])
        
        inline def setCoreDotignoredNames(value: js.Array[String]): Self = StObject.set(x, "core.ignoredNames", value.asInstanceOf[js.Any])
        
        inline def setCoreDotignoredNamesVarargs(value: String*): Self = StObject.set(x, "core.ignoredNames", js.Array(value*))
        
        inline def setCoreDotopenEmptyEditorOnStart(value: Boolean): Self = StObject.set(x, "core.openEmptyEditorOnStart", value.asInstanceOf[js.Any])
        
        inline def setCoreDotreopenProjectMenuCount(value: Double): Self = StObject.set(x, "core.reopenProjectMenuCount", value.asInstanceOf[js.Any])
        
        inline def setCoreDotrestorePreviousWindowsOnStart(value: no | yes | always): Self = StObject.set(x, "core.restorePreviousWindowsOnStart", value.asInstanceOf[js.Any])
        
        inline def setCoreDottelemetryConsent(value: limited | no | undecided): Self = StObject.set(x, "core.telemetryConsent", value.asInstanceOf[js.Any])
        
        inline def setCoreDotthemes(value: js.Array[String]): Self = StObject.set(x, "core.themes", value.asInstanceOf[js.Any])
        
        inline def setCoreDotthemesVarargs(value: String*): Self = StObject.set(x, "core.themes", js.Array(value*))
        
        inline def setCoreDotuseProxySettingsWhenCallingApm(value: Boolean): Self = StObject.set(x, "core.useProxySettingsWhenCallingApm", value.asInstanceOf[js.Any])
        
        inline def setCoreDotuseTreeSitterParsers(value: Boolean): Self = StObject.set(x, "core.useTreeSitterParsers", value.asInstanceOf[js.Any])
        
        inline def setCoreDotversionPinnedPackages(value: js.Array[String]): Self = StObject.set(x, "core.versionPinnedPackages", value.asInstanceOf[js.Any])
        
        inline def setCoreDotversionPinnedPackagesVarargs(value: String*): Self = StObject.set(x, "core.versionPinnedPackages", js.Array(value*))
        
        inline def setCoreDotwarnOnLargeFileLimit(value: Double): Self = StObject.set(x, "core.warnOnLargeFileLimit", value.asInstanceOf[js.Any])
        
        inline def setEditorDotatomicSoftTabs(value: Boolean): Self = StObject.set(x, "editor.atomicSoftTabs", value.asInstanceOf[js.Any])
        
        inline def setEditorDotautoIndent(value: Boolean): Self = StObject.set(x, "editor.autoIndent", value.asInstanceOf[js.Any])
        
        inline def setEditorDotautoIndentOnPaste(value: Boolean): Self = StObject.set(x, "editor.autoIndentOnPaste", value.asInstanceOf[js.Any])
        
        inline def setEditorDotcommentEnd(value: String): Self = StObject.set(x, "editor.commentEnd", value.asInstanceOf[js.Any])
        
        inline def setEditorDotcommentEndNull: Self = StObject.set(x, "editor.commentEnd", null)
        
        inline def setEditorDotcommentStart(value: String): Self = StObject.set(x, "editor.commentStart", value.asInstanceOf[js.Any])
        
        inline def setEditorDotcommentStartNull: Self = StObject.set(x, "editor.commentStart", null)
        
        inline def setEditorDotconfirmCheckoutHeadRevision(value: Boolean): Self = StObject.set(x, "editor.confirmCheckoutHeadRevision", value.asInstanceOf[js.Any])
        
        inline def setEditorDotdecreaseIndentPattern(value: String): Self = StObject.set(x, "editor.decreaseIndentPattern", value.asInstanceOf[js.Any])
        
        inline def setEditorDotdecreaseIndentPatternNull: Self = StObject.set(x, "editor.decreaseIndentPattern", null)
        
        inline def setEditorDotfoldEndPattern(value: String): Self = StObject.set(x, "editor.foldEndPattern", value.asInstanceOf[js.Any])
        
        inline def setEditorDotfoldEndPatternNull: Self = StObject.set(x, "editor.foldEndPattern", null)
        
        inline def setEditorDotfontFamily(value: String): Self = StObject.set(x, "editor.fontFamily", value.asInstanceOf[js.Any])
        
        inline def setEditorDotfontSize(value: Double): Self = StObject.set(x, "editor.fontSize", value.asInstanceOf[js.Any])
        
        inline def setEditorDotincreaseIndentPattern(value: String): Self = StObject.set(x, "editor.increaseIndentPattern", value.asInstanceOf[js.Any])
        
        inline def setEditorDotincreaseIndentPatternNull: Self = StObject.set(x, "editor.increaseIndentPattern", null)
        
        inline def setEditorDotinvisibles(value: Invisibles): Self = StObject.set(x, "editor.invisibles", value.asInstanceOf[js.Any])
        
        inline def setEditorDotlineHeight(value: String | Double): Self = StObject.set(x, "editor.lineHeight", value.asInstanceOf[js.Any])
        
        inline def setEditorDotmaxScreenLineLength(value: Double): Self = StObject.set(x, "editor.maxScreenLineLength", value.asInstanceOf[js.Any])
        
        inline def setEditorDotnonWordCharacters(value: String): Self = StObject.set(x, "editor.nonWordCharacters", value.asInstanceOf[js.Any])
        
        inline def setEditorDotpreferredLineLength(value: Double): Self = StObject.set(x, "editor.preferredLineLength", value.asInstanceOf[js.Any])
        
        inline def setEditorDotscrollPastEnd(value: Boolean): Self = StObject.set(x, "editor.scrollPastEnd", value.asInstanceOf[js.Any])
        
        inline def setEditorDotscrollSensitivity(value: Double): Self = StObject.set(x, "editor.scrollSensitivity", value.asInstanceOf[js.Any])
        
        inline def setEditorDotshowCursorOnSelection(value: Boolean): Self = StObject.set(x, "editor.showCursorOnSelection", value.asInstanceOf[js.Any])
        
        inline def setEditorDotshowIndentGuide(value: Boolean): Self = StObject.set(x, "editor.showIndentGuide", value.asInstanceOf[js.Any])
        
        inline def setEditorDotshowInvisibles(value: Boolean): Self = StObject.set(x, "editor.showInvisibles", value.asInstanceOf[js.Any])
        
        inline def setEditorDotshowLineNumbers(value: Boolean): Self = StObject.set(x, "editor.showLineNumbers", value.asInstanceOf[js.Any])
        
        inline def setEditorDotsoftTabs(value: Boolean): Self = StObject.set(x, "editor.softTabs", value.asInstanceOf[js.Any])
        
        inline def setEditorDotsoftWrap(value: Boolean): Self = StObject.set(x, "editor.softWrap", value.asInstanceOf[js.Any])
        
        inline def setEditorDotsoftWrapAtPreferredLineLength(value: Boolean): Self = StObject.set(x, "editor.softWrapAtPreferredLineLength", value.asInstanceOf[js.Any])
        
        inline def setEditorDotsoftWrapHangingIndent(value: Double): Self = StObject.set(x, "editor.softWrapHangingIndent", value.asInstanceOf[js.Any])
        
        inline def setEditorDottabLength(value: Double): Self = StObject.set(x, "editor.tabLength", value.asInstanceOf[js.Any])
        
        inline def setEditorDottabType(value: auto | soft | hard): Self = StObject.set(x, "editor.tabType", value.asInstanceOf[js.Any])
        
        inline def setEditorDotundoGroupingInterval(value: Double): Self = StObject.set(x, "editor.undoGroupingInterval", value.asInstanceOf[js.Any])
        
        inline def setEditorDotzoomFontWhenCtrlScrolling(value: Boolean): Self = StObject.set(x, "editor.zoomFontWhenCtrlScrolling", value.asInstanceOf[js.Any])
      }
    }
  }
}
