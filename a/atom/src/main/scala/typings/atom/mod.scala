package typings.atom

import org.scalablytyped.runtime.StringDictionary
import typings.atom.anon.Config
import typings.atom.anon.RefreshOnWindowFocus
import typings.atom.anon.ShouldDestroyOnFileDelete
import typings.atom.atomStrings.Bottom
import typings.atom.atomStrings.Cursor
import typings.atom.atomStrings.Left
import typings.atom.atomStrings.Right
import typings.atom.atomStrings.Subsequence
import typings.atom.atomStrings.Symbol
import typings.atom.atomStrings.Top
import typings.atom.atomStrings.Word
import typings.atom.atomStrings.`12px`
import typings.atom.atomStrings.`14px`
import typings.atom.atomStrings.`16px`
import typings.atom.atomStrings.`18px`
import typings.atom.atomStrings.`21px`
import typings.atom.atomStrings.`24px`
import typings.atom.atomStrings.`28px`
import typings.atom.atomStrings.`32px`
import typings.atom.atomStrings.`tab alwaysComma enter when suggestion explicitly selected`
import typings.atom.atomStrings.`tab and enter`
import typings.atom.atomStrings.always
import typings.atom.atomStrings.auto
import typings.atom.atomStrings.default
import typings.atom.atomStrings.enter
import typings.atom.atomStrings.error
import typings.atom.atomStrings.experimental
import typings.atom.atomStrings.fatal
import typings.atom.atomStrings.hard
import typings.atom.atomStrings.info
import typings.atom.atomStrings.limited
import typings.atom.atomStrings.native
import typings.atom.atomStrings.no
import typings.atom.atomStrings.none
import typings.atom.atomStrings.poll
import typings.atom.atomStrings.soft
import typings.atom.atomStrings.srgb
import typings.atom.atomStrings.success
import typings.atom.atomStrings.tab
import typings.atom.atomStrings.textOrSnippet
import typings.atom.atomStrings.undecided
import typings.atom.atomStrings.warning
import typings.atom.atomStrings.yes
import typings.atom.dependenciesEventKitMod.DisposableLike
import typings.atom.dependenciesTextBufferSrcPointMod.PointCompatible
import typings.atom.dependenciesTextBufferSrcRangeMod.RangeCompatible
import typings.atom.dependenciesTextBufferSrcTextBufferMod.BufferLoadOptions
import typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBufferFileBackend
import typings.atom.srcAtomEnvironmentMod.AtomEnvironment
import typings.atom.srcBufferedProcessMod.NodeProcessOptions
import typings.atom.srcBufferedProcessMod.ProcessOptions
import typings.atom.srcNotificationMod.ErrorNotificationOptions
import typings.atom.srcNotificationMod.NotificationOptions
import typings.atom.srcOtherTypesMod.FileEncoding
import typings.atom.srcOtherTypesMod.FilesystemChangeEvent
import typings.atom.srcOtherTypesMod.Invisibles
import typings.atom.srcPathWatcherMod.PathWatcher
import typings.atom.srcTextEditorElementMod.TextEditorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// NOTE: intentional; needed for config extensibility
// tslint:disable-next-line:no-declare-current-package
object mod {
  
  @JSImport("atom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("atom", "BufferedNodeProcess")
  @js.native
  open class BufferedNodeProcess protected ()
    extends typings.atom.srcBufferedNodeProcessMod.BufferedNodeProcess {
    /** Runs the given Node script by spawning a new child process. */
    def this(options: NodeProcessOptions) = this()
  }
  
  @JSImport("atom", "BufferedProcess")
  @js.native
  open class BufferedProcess protected ()
    extends typings.atom.srcBufferedProcessMod.BufferedProcess {
    def this(options: ProcessOptions) = this()
  }
  
  @JSImport("atom", "CompositeDisposable")
  @js.native
  open class CompositeDisposable protected ()
    extends typings.atom.dependenciesEventKitMod.CompositeDisposable {
    /** Construct an instance, optionally with one or more disposables. */
    def this(disposables: DisposableLike*) = this()
  }
  
  @JSImport("atom", "Directory")
  @js.native
  open class Directory protected ()
    extends typings.atom.dependenciesPathwatcherMod.Directory {
    // Construction
    /** Configures a new Directory instance, no files are accessed. */
    def this(directoryPath: String) = this()
    def this(directoryPath: String, symlink: Boolean) = this()
  }
  
  @JSImport("atom", "Disposable")
  @js.native
  /** Construct a Disposable. */
  open class Disposable ()
    extends typings.atom.dependenciesEventKitMod.Disposable {
    def this(disposableAction: js.Function0[Unit]) = this()
  }
  /* static members */
  object Disposable {
    
    @JSImport("atom", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    /** Ensure that Object correctly implements the Disposable contract. */
    inline def isDisposable(`object`: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisposable")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("atom", "Emitter")
  @js.native
  /** Construct an emitter. */
  open class Emitter[OptionalEmissions, RequiredEmissions] ()
    extends typings.atom.dependenciesEventKitMod.Emitter[OptionalEmissions, RequiredEmissions]
  
  @JSImport("atom", "File")
  @js.native
  open class File protected ()
    extends typings.atom.dependenciesPathwatcherMod.File {
    // Construction
    /** Configures a new File instance, no files are accessed. */
    def this(filePath: String) = this()
    def this(filePath: String, symlink: Boolean) = this()
  }
  
  @JSImport("atom", "GitRepository")
  @js.native
  open class GitRepository protected ()
    extends typings.atom.srcGitRepositoryMod.GitRepository {
    def this(path: String) = this()
    def this(path: String, options: Config) = this()
  }
  /* static members */
  object GitRepository {
    
    @JSImport("atom", "GitRepository")
    @js.native
    val ^ : js.Any = js.native
    
    // Construction
    /** Creates a new GitRepository instance. */
    inline def open(path: String): typings.atom.srcGitRepositoryMod.GitRepository = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[typings.atom.srcGitRepositoryMod.GitRepository]
    inline def open(path: String, options: RefreshOnWindowFocus): typings.atom.srcGitRepositoryMod.GitRepository = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.atom.srcGitRepositoryMod.GitRepository]
  }
  
  @JSImport("atom", "Notification")
  @js.native
  open class Notification protected ()
    extends typings.atom.srcNotificationMod.Notification {
    def this(`type`: error | fatal | info | success | warning, message: String) = this()
    def this(`type`: fatal | error, message: String, options: ErrorNotificationOptions) = this()
    def this(`type`: warning | info | success, message: String, options: NotificationOptions) = this()
  }
  
  @JSImport("atom", "Point")
  @js.native
  /** Construct a Point object */
  open class Point ()
    extends typings.atom.dependenciesTextBufferMod.Point {
    def this(row: Double) = this()
    def this(row: Double, column: Double) = this()
    def this(row: Unit, column: Double) = this()
  }
  /* static members */
  object Point {
    
    @JSImport("atom", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    // Construction
    /**
      *  Create a Point from an array containing two numbers representing the
      *  row and column.
      */
    inline def fromObject(`object`: PointCompatible): typings.atom.dependenciesTextBufferSrcPointMod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.atom.dependenciesTextBufferSrcPointMod.Point]
    inline def fromObject(`object`: PointCompatible, copy: Boolean): typings.atom.dependenciesTextBufferSrcPointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[typings.atom.dependenciesTextBufferSrcPointMod.Point]
    
    // Comparison
    /** Returns the given Point that is earlier in the buffer. */
    inline def min(point1: PointCompatible, point2: PointCompatible): typings.atom.dependenciesTextBufferSrcPointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[typings.atom.dependenciesTextBufferSrcPointMod.Point]
  }
  
  @JSImport("atom", "Range")
  @js.native
  /** Construct a Range object. */
  open class Range ()
    extends typings.atom.dependenciesTextBufferMod.Range {
    def this(pointA: PointCompatible) = this()
    def this(pointA: Unit, pointB: PointCompatible) = this()
    def this(pointA: PointCompatible, pointB: PointCompatible) = this()
  }
  /* static members */
  object Range {
    
    @JSImport("atom", "Range")
    @js.native
    val ^ : js.Any = js.native
    
    /** Call this with the result of Range::serialize to construct a new Range. */
    inline def deserialize(array: js.Object): typings.atom.dependenciesTextBufferSrcRangeMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(array.asInstanceOf[js.Any]).asInstanceOf[typings.atom.dependenciesTextBufferSrcRangeMod.Range]
    
    // Construction
    /** Convert any range-compatible object to a Range. */
    inline def fromObject(`object`: RangeCompatible): typings.atom.dependenciesTextBufferSrcRangeMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.atom.dependenciesTextBufferSrcRangeMod.Range]
    inline def fromObject(`object`: RangeCompatible, copy: Boolean): typings.atom.dependenciesTextBufferSrcRangeMod.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[typings.atom.dependenciesTextBufferSrcRangeMod.Range]
  }
  
  @JSImport("atom", "Task")
  @js.native
  open class Task protected ()
    extends typings.atom.srcTaskMod.Task {
    /** Creates a task. You should probably use .once */
    def this(taskPath: String) = this()
  }
  /* static members */
  object Task {
    
    @JSImport("atom", "Task")
    @js.native
    val ^ : js.Any = js.native
    
    // NOTE: this is actually the best we can do here with the REST parameter for
    // this appearing in the middle of the parameter list, which isn't aligned with
    // the ES6 spec. Maybe when they rewrite it in JavaScript this will change.
    /** A helper method to easily launch and run a task once. */
    // tslint:disable-next-line:no-any
    inline def once(taskPath: String, args: Any*): typings.atom.srcTaskMod.Task = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(scala.List(taskPath.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.atom.srcTaskMod.Task]
  }
  
  @JSImport("atom", "TextBuffer")
  @js.native
  /** Create a new buffer with the given params. */
  open class TextBuffer ()
    extends typings.atom.dependenciesTextBufferMod.TextBuffer {
    def this(params: ShouldDestroyOnFileDelete) = this()
    /** Create a new buffer with the given starting text. */
    def this(text: String) = this()
  }
  /* static members */
  object TextBuffer {
    
    @JSImport("atom", "TextBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Restore a TextBuffer based on an earlier state created using the
      *  TextBuffer::serialize method.
      */
    inline def deserialize(params: js.Object): js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    
    /** Create a new buffer backed by the given file path. */
    inline def load(filePath: String): js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    inline def load(filePath: String, params: BufferLoadOptions): js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    inline def load(filePath: TextBufferFileBackend): js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    inline def load(filePath: TextBufferFileBackend, params: BufferLoadOptions): js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    
    /**
      *  Create a new buffer backed by the given file path. For better performance,
      *  use TextBuffer.load instead.
      */
    inline def loadSync(filePath: String): typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]
    inline def loadSync(filePath: String, params: BufferLoadOptions): typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filePath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]
  }
  
  @JSImport("atom", "TextEditor")
  @js.native
  // NOTE: undocumented within the public API. Don't go down the rabbit hole.
  open class TextEditor ()
    extends typings.atom.srcTextEditorMod.TextEditor {
    def this(options: js.Object) = this()
  }
  
  // Imports ======================================================
  object global {
    
    @JSGlobal("atom")
    @js.native
    val atom: AtomEnvironment = js.native
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `atom-text-editor`: TextEditorElement
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`atom-text-editor`: TextEditorElement): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("atom-text-editor")(`atom-text-editor`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setAtom-text-editor`(value: TextEditorElement): Self = StObject.set(x, "atom-text-editor", value.asInstanceOf[js.Any])
      }
    }
  }
  
  inline def watchPath(
    rootPath: String,
    options: js.Object,
    eventCallback: js.Function1[/* events */ FilesystemChangeEvent, Unit]
  ): js.Promise[PathWatcher] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchPath")(rootPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PathWatcher]]
  
  trait ConfigValues
    extends StObject
       with // tslint:disable-next-line:no-any
  /* key */ StringDictionary[Any] {
    
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
    var `autocomplete-plusDotsuggestionListFollows`: Word | Cursor
    
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
    
    /** Fit the tool-bar to the window's full-width. - default: true */
    @JSName("tool-bar.fullWidth")
    var `tool-barDotfullWidth`: Boolean
    
    /** Icon size. - default: "24px" */
    @JSName("tool-bar.iconSize")
    var `tool-barDoticonSize`: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`
    
    /** Position of tool-bar. - default: "Top"  */
    @JSName("tool-bar.position")
    var `tool-barDotposition`: Top | Right | Bottom | Left
    
    /** On MacOS, show seven first tool-bar buttons in the TouchBar. - default: true */
    @JSName("tool-bar.useTouchBar")
    var `tool-barDotuseTouchBar`: String
    
    /** Make tool-bar visible. - default: true */
    @JSName("tool-bar.visible")
    var `tool-barDotvisible`: Boolean
  }
  object ConfigValues {
    
    inline def apply(
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
      `autocomplete-plusDotsuggestionListFollows`: Word | Cursor,
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
      `tool-barDotfullWidth`: Boolean,
      `tool-barDoticonSize`: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`,
      `tool-barDotposition`: Top | Right | Bottom | Left,
      `tool-barDotuseTouchBar`: String,
      `tool-barDotvisible`: Boolean
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
      __obj.updateDynamic("tool-bar.fullWidth")(`tool-barDotfullWidth`.asInstanceOf[js.Any])
      __obj.updateDynamic("tool-bar.iconSize")(`tool-barDoticonSize`.asInstanceOf[js.Any])
      __obj.updateDynamic("tool-bar.position")(`tool-barDotposition`.asInstanceOf[js.Any])
      __obj.updateDynamic("tool-bar.useTouchBar")(`tool-barDotuseTouchBar`.asInstanceOf[js.Any])
      __obj.updateDynamic("tool-bar.visible")(`tool-barDotvisible`.asInstanceOf[js.Any])
      __obj.updateDynamic("editor.commentEnd")(null)
      __obj.updateDynamic("editor.commentStart")(null)
      __obj.updateDynamic("editor.decreaseIndentPattern")(null)
      __obj.updateDynamic("editor.foldEndPattern")(null)
      __obj.updateDynamic("editor.increaseIndentPattern")(null)
      __obj.asInstanceOf[ConfigValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigValues] (val x: Self) extends AnyVal {
      
      inline def `setAutocomplete-plusDotautoActivationDelay`(value: Double): Self = StObject.set(x, "autocomplete-plus.autoActivationDelay", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotbackspaceTriggersAutocomplete`(value: Boolean): Self = StObject.set(x, "autocomplete-plus.backspaceTriggersAutocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotbuiltinProviderBlacklist`(value: String): Self = StObject.set(x, "autocomplete-plus.builtinProviderBlacklist", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotconfirmCompletion`(
        value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
      ): Self = StObject.set(x, "autocomplete-plus.confirmCompletion", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotconsumeSuffix`(value: Boolean): Self = StObject.set(x, "autocomplete-plus.consumeSuffix", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotdefaultProvider`(value: Subsequence | Symbol): Self = StObject.set(x, "autocomplete-plus.defaultProvider", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotenableAutoActivation`(value: Boolean): Self = StObject.set(x, "autocomplete-plus.enableAutoActivation", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotenableAutoConfirmSingleSuggestion`(value: Boolean): Self = StObject.set(x, "autocomplete-plus.enableAutoConfirmSingleSuggestion", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotenableBuiltinProvider`(value: Boolean): Self = StObject.set(x, "autocomplete-plus.enableBuiltinProvider", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotenableExtendedUnicodeSupport`(value: Boolean): Self = StObject.set(x, "autocomplete-plus.enableExtendedUnicodeSupport", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotfileBlacklist`(value: js.Array[String]): Self = StObject.set(x, "autocomplete-plus.fileBlacklist", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotfileBlacklistVarargs`(value: String*): Self = StObject.set(x, "autocomplete-plus.fileBlacklist", js.Array(value*))
      
      inline def `setAutocomplete-plusDotincludeCompletionsFromAllBuffers`(value: Boolean): Self = StObject.set(x, "autocomplete-plus.includeCompletionsFromAllBuffers", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotmaxVisibleSuggestions`(value: Double): Self = StObject.set(x, "autocomplete-plus.maxVisibleSuggestions", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotminimumWordLength`(value: Double): Self = StObject.set(x, "autocomplete-plus.minimumWordLength", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotscopeBlacklist`(value: js.Array[String]): Self = StObject.set(x, "autocomplete-plus.scopeBlacklist", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotscopeBlacklistVarargs`(value: String*): Self = StObject.set(x, "autocomplete-plus.scopeBlacklist", js.Array(value*))
      
      inline def `setAutocomplete-plusDotsimilarSuggestionRemoval`(value: none | textOrSnippet): Self = StObject.set(x, "autocomplete-plus.similarSuggestionRemoval", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotstrictMatching`(value: Boolean): Self = StObject.set(x, "autocomplete-plus.strictMatching", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotsuggestionListFollows`(value: Word | Cursor): Self = StObject.set(x, "autocomplete-plus.suggestionListFollows", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotsuppressActivationForEditorClasses`(value: js.Array[String]): Self = StObject.set(x, "autocomplete-plus.suppressActivationForEditorClasses", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotsuppressActivationForEditorClassesVarargs`(value: String*): Self = StObject.set(x, "autocomplete-plus.suppressActivationForEditorClasses", js.Array(value*))
      
      inline def `setAutocomplete-plusDotuseAlternateScoring`(value: Boolean): Self = StObject.set(x, "autocomplete-plus.useAlternateScoring", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotuseCoreMovementCommands`(value: Boolean): Self = StObject.set(x, "autocomplete-plus.useCoreMovementCommands", value.asInstanceOf[js.Any])
      
      inline def `setAutocomplete-plusDotuseLocalityBonus`(value: Boolean): Self = StObject.set(x, "autocomplete-plus.useLocalityBonus", value.asInstanceOf[js.Any])
      
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
      
      inline def setLinterDotdisabledProviders(value: js.Array[String]): Self = StObject.set(x, "linter.disabledProviders", value.asInstanceOf[js.Any])
      
      inline def setLinterDotdisabledProvidersVarargs(value: String*): Self = StObject.set(x, "linter.disabledProviders", js.Array(value*))
      
      inline def setLinterDotignoreGlob(value: String): Self = StObject.set(x, "linter.ignoreGlob", value.asInstanceOf[js.Any])
      
      inline def setLinterDotlintOnChange(value: Boolean): Self = StObject.set(x, "linter.lintOnChange", value.asInstanceOf[js.Any])
      
      inline def setLinterDotlintOnChangeInterval(value: Double): Self = StObject.set(x, "linter.lintOnChangeInterval", value.asInstanceOf[js.Any])
      
      inline def setLinterDotlintOnOpen(value: Boolean): Self = StObject.set(x, "linter.lintOnOpen", value.asInstanceOf[js.Any])
      
      inline def setLinterDotlintPreviewTabs(value: Boolean): Self = StObject.set(x, "linter.lintPreviewTabs", value.asInstanceOf[js.Any])
      
      inline def `setStatus-barDotcursorPositionFormat`(value: String): Self = StObject.set(x, "status-bar.cursorPositionFormat", value.asInstanceOf[js.Any])
      
      inline def `setStatus-barDotfullWidth`(value: Boolean): Self = StObject.set(x, "status-bar.fullWidth", value.asInstanceOf[js.Any])
      
      inline def `setStatus-barDotisVisible`(value: Boolean): Self = StObject.set(x, "status-bar.isVisible", value.asInstanceOf[js.Any])
      
      inline def `setStatus-barDotselectionCountFormat`(value: String): Self = StObject.set(x, "status-bar.selectionCountFormat", value.asInstanceOf[js.Any])
      
      inline def `setTool-barDotfullWidth`(value: Boolean): Self = StObject.set(x, "tool-bar.fullWidth", value.asInstanceOf[js.Any])
      
      inline def `setTool-barDoticonSize`(value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`): Self = StObject.set(x, "tool-bar.iconSize", value.asInstanceOf[js.Any])
      
      inline def `setTool-barDotposition`(value: Top | Right | Bottom | Left): Self = StObject.set(x, "tool-bar.position", value.asInstanceOf[js.Any])
      
      inline def `setTool-barDotuseTouchBar`(value: String): Self = StObject.set(x, "tool-bar.useTouchBar", value.asInstanceOf[js.Any])
      
      inline def `setTool-barDotvisible`(value: Boolean): Self = StObject.set(x, "tool-bar.visible", value.asInstanceOf[js.Any])
    }
  }
  
  // NOTE: A hack to make ConfigValues extensible
  // tslint:disable-next-line:no-declare-current-package
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
      ): typings.atom.mod.atomAugmentingMod.ConfigValues = {
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
        __obj.asInstanceOf[typings.atom.mod.atomAugmentingMod.ConfigValues]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.atom.mod.atomAugmentingMod.ConfigValues] (val x: Self) extends AnyVal {
        
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
