package typings.atom.mod

import typings.atom.anon.Added
import typings.atom.anon.Ahead
import typings.atom.anon.Heads
import typings.atom.anon.NewLines
import typings.atom.anon.RefreshOnWindowFocus
import typings.atom.atomStrings.git
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atom", "GitRepository")
@js.native
class GitRepository protected () extends StObject {
  def this(path: String) = this()
  def this(path: String, options: typings.atom.anon.Config) = this()
  
  // Checking Out
  /**
    *  Restore the contents of a path in the working directory and index to the
    *  version at HEAD.
    */
  def checkoutHead(path: String): Boolean = js.native
  
  /** Checks out a branch in your repository. */
  def checkoutReference(reference: String, create: Boolean): Boolean = js.native
  
  // Lifecycle
  /** Destroy this GitRepository object. */
  def destroy(): Unit = js.native
  
  /**
    *  Returns the number of commits behind the current branch is from the its
    *  upstream remote branch. The default reference is the HEAD.
    *  @param reference The branch reference name.
    *  @param path The path in the repository to get this ifnromation for, only
    *  needed if the repository contains submodules.
    *  @return Returns the number of commits behind the current branch is from its
    *  upstream remote branch.
    */
  def getAheadBehindCount(reference: String): Ahead = js.native
  def getAheadBehindCount(reference: String, path: String): Ahead = js.native
  
  /** Get the cached status for the given path. */
  def getCachedPathStatus(path: String): Double | Null = js.native
  
  /**
    *  Get the cached ahead/behind commit counts for the current branch's
    *  upstream branch.
    */
  def getCachedUpstreamAheadBehindCount(): Ahead = js.native
  def getCachedUpstreamAheadBehindCount(path: String): Ahead = js.native
  
  /** Returns the git configuration value specified by the key. */
  def getConfigValue(key: String): String = js.native
  def getConfigValue(key: String, path: String): String = js.native
  
  // Retrieving Diffs
  /**
    *  Retrieves the number of lines added and removed to a path.
    *  This compares the working directory contents of the path to the HEAD version.
    */
  def getDiffStats(path: String): Added = js.native
  
  /** Get the status of a directory in the repository's working directory. */
  def getDirectoryStatus(path: String): Double = js.native
  
  /**
    *  Retrieves the line diffs comparing the HEAD version of the given path
    *  and the given text.
    */
  def getLineDiffs(path: String, text: String): js.Array[NewLines] = js.native
  
  /** Returns the origin url of the repository. */
  def getOriginURL(): String = js.native
  def getOriginURL(path: String): String = js.native
  
  /** Returns the string path of the repository. */
  def getPath(): String = js.native
  
  /** Get the status of a single path in the repository. */
  def getPathStatus(path: String): Double = js.native
  
  /** Returns the current string SHA for the given reference. */
  def getReferenceTarget(reference: String): String = js.native
  def getReferenceTarget(reference: String, path: String): String = js.native
  
  /** Gets all the local and remote references. */
  def getReferences(): Heads = js.native
  def getReferences(path: String): Heads = js.native
  
  /** Retrieves a shortened version of the HEAD reference value. */
  def getShortHead(): String = js.native
  def getShortHead(path: String): String = js.native
  
  // Repository Details
  /** A string indicating the type of version control system used by this repository. */
  def getType(): git = js.native
  
  /**
    *  Returns the upstream branch for the current HEAD, or null if there is no
    *  upstream branch for the current HEAD.
    */
  def getUpstreamBranch(): String | Null = js.native
  def getUpstreamBranch(path: String): String | Null = js.native
  
  /** Returns the string working directory path of the repository. */
  def getWorkingDirectory(): String = js.native
  
  /** Returns true if the given branch exists. */
  def hasBranch(branch: String): Boolean = js.native
  
  /** Returns a boolean indicating if this repository has been destroyed. */
  def isDestroyed(): Boolean = js.native
  
  /** Is the given path ignored? */
  def isPathIgnored(path: String): Boolean = js.native
  
  // Reading Status
  /** Returns true if the given path is modified. */
  def isPathModified(path: String): Boolean = js.native
  
  /** Returns true if the given path is new. */
  def isPathNew(path: String): Boolean = js.native
  
  /** Returns true if at the root, false if in a subfolder of the repository. */
  def isProjectAtRoot(): Boolean = js.native
  
  /** Returns true if the given status indicates modification. */
  def isStatusModified(status: Double): Boolean = js.native
  
  /** Returns true if the given status indicates a new path. */
  def isStatusNew(status: Double): Boolean = js.native
  
  /** Is the given path a submodule in the repository? */
  def isSubmodule(path: String): Boolean = js.native
  
  /**
    *  Invoke the given callback when a specific file's status has changed. When
    *  a file is updated, reloaded, etc, and the status changes, this will be fired.
    */
  def onDidChangeStatus(callback: js.Function1[/* event */ RepoStatusChangedEvent, Unit]): Disposable = js.native
  
  /** Invoke the given callback when a multiple files' statuses have changed. */
  def onDidChangeStatuses(callback: js.Function0[Unit]): Disposable = js.native
  
  // Event Subscription
  /**
    *  Invoke the given callback when this GitRepository's destroy() method is
    *  invoked.
    */
  def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
  
  /** Makes a path relative to the repository's working directory. */
  def relativize(): String = js.native
}
/* static members */
object GitRepository {
  
  @JSImport("atom", "GitRepository")
  @js.native
  val ^ : js.Any = js.native
  
  // Construction
  /** Creates a new GitRepository instance. */
  @scala.inline
  def open(path: String): GitRepository = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[GitRepository]
  @scala.inline
  def open(path: String, options: RefreshOnWindowFocus): GitRepository = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GitRepository]
}
