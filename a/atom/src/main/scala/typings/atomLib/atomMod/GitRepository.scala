package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "GitRepository")
@js.native
class GitRepository protected () extends js.Object {
  def this(path: java.lang.String) = this()
  def this(path: java.lang.String, options: atomLib.Anon_Config) = this()
  // Checking Out
  /**
    *  Restore the contents of a path in the working directory and index to the
    *  version at HEAD.
    */
  def checkoutHead(path: java.lang.String): scala.Boolean = js.native
  /** Checks out a branch in your repository. */
  def checkoutReference(reference: java.lang.String, create: scala.Boolean): scala.Boolean = js.native
  // Lifecycle
  /** Destroy this GitRepository object. */
  def destroy(): scala.Unit = js.native
  /**
    *  Returns the number of commits behind the current branch is from the its
    *  upstream remote branch. The default reference is the HEAD.
    *  @param reference The branch reference name.
    *  @param path The path in the repository to get this ifnromation for, only
    *  needed if the repository contains submodules.
    *  @return Returns the number of commits behind the current branch is from its
    *  upstream remote branch.
    */
  def getAheadBehindCount(reference: java.lang.String): atomLib.Anon_Behind = js.native
  def getAheadBehindCount(reference: java.lang.String, path: java.lang.String): atomLib.Anon_Behind = js.native
  /** Get the cached status for the given path. */
  def getCachedPathStatus(path: java.lang.String): scala.Double | scala.Null = js.native
  /**
    *  Get the cached ahead/behind commit counts for the current branch's
    *  upstream branch.
    */
  def getCachedUpstreamAheadBehindCount(): atomLib.Anon_Behind = js.native
  def getCachedUpstreamAheadBehindCount(path: java.lang.String): atomLib.Anon_Behind = js.native
  /** Returns the git configuration value specified by the key. */
  def getConfigValue(key: java.lang.String): java.lang.String = js.native
  def getConfigValue(key: java.lang.String, path: java.lang.String): java.lang.String = js.native
  // Retrieving Diffs
  /**
    *  Retrieves the number of lines added and removed to a path.
    *  This compares the working directory contents of the path to the HEAD version.
    */
  def getDiffStats(path: java.lang.String): atomLib.Anon_Deleted = js.native
  /** Get the status of a directory in the repository's working directory. */
  def getDirectoryStatus(path: java.lang.String): scala.Double = js.native
  /**
    *  Retrieves the line diffs comparing the HEAD version of the given path
    *  and the given text.
    */
  def getLineDiffs(path: java.lang.String, text: java.lang.String): js.Array[atomLib.Anon_NewStart] = js.native
  /** Returns the origin url of the repository. */
  def getOriginURL(): java.lang.String = js.native
  def getOriginURL(path: java.lang.String): java.lang.String = js.native
  /** Returns the string path of the repository. */
  def getPath(): java.lang.String = js.native
  /** Get the status of a single path in the repository. */
  def getPathStatus(path: java.lang.String): scala.Double = js.native
  /** Returns the current string SHA for the given reference. */
  def getReferenceTarget(reference: java.lang.String): java.lang.String = js.native
  def getReferenceTarget(reference: java.lang.String, path: java.lang.String): java.lang.String = js.native
  /** Gets all the local and remote references. */
  def getReferences(): atomLib.Anon_Remotes = js.native
  def getReferences(path: java.lang.String): atomLib.Anon_Remotes = js.native
  /** Retrieves a shortened version of the HEAD reference value. */
  def getShortHead(): java.lang.String = js.native
  def getShortHead(path: java.lang.String): java.lang.String = js.native
  // Repository Details
  /** A string indicating the type of version control system used by this repository. */
  def getType(): atomLib.atomLibStrings.git = js.native
  /**
    *  Returns the upstream branch for the current HEAD, or null if there is no
    *  upstream branch for the current HEAD.
    */
  def getUpstreamBranch(): java.lang.String | scala.Null = js.native
  def getUpstreamBranch(path: java.lang.String): java.lang.String | scala.Null = js.native
  /** Returns the string working directory path of the repository. */
  def getWorkingDirectory(): java.lang.String = js.native
  /** Returns true if the given branch exists. */
  def hasBranch(branch: java.lang.String): scala.Boolean = js.native
  /** Returns a boolean indicating if this repository has been destroyed. */
  def isDestroyed(): scala.Boolean = js.native
  /** Is the given path ignored? */
  def isPathIgnored(path: java.lang.String): scala.Boolean = js.native
  // Reading Status
  /** Returns true if the given path is modified. */
  def isPathModified(path: java.lang.String): scala.Boolean = js.native
  /** Returns true if the given path is new. */
  def isPathNew(path: java.lang.String): scala.Boolean = js.native
  /** Returns true if at the root, false if in a subfolder of the repository. */
  def isProjectAtRoot(): scala.Boolean = js.native
  /** Returns true if the given status indicates modification. */
  def isStatusModified(status: scala.Double): scala.Boolean = js.native
  /** Returns true if the given status indicates a new path. */
  def isStatusNew(status: scala.Double): scala.Boolean = js.native
  /** Is the given path a submodule in the repository? */
  def isSubmodule(path: java.lang.String): scala.Boolean = js.native
  /**
    *  Invoke the given callback when a specific file's status has changed. When
    *  a file is updated, reloaded, etc, and the status changes, this will be fired.
    */
  def onDidChangeStatus(callback: js.Function1[/* event */ RepoStatusChangedEvent, scala.Unit]): Disposable = js.native
  /** Invoke the given callback when a multiple files' statuses have changed. */
  def onDidChangeStatuses(callback: js.Function0[scala.Unit]): Disposable = js.native
  // Event Subscription
  /**
    *  Invoke the given callback when this GitRepository's destroy() method is
    *  invoked.
    */
  def onDidDestroy(callback: js.Function0[scala.Unit]): Disposable = js.native
  /** Makes a path relative to the repository's working directory. */
  def relativize(): java.lang.String = js.native
}

@JSImport("atom", "GitRepository")
@js.native
object GitRepository extends js.Object {
  // Construction
  /** Creates a new GitRepository instance. */
  def open(path: java.lang.String): atomLib.atomMod.GitRepository = js.native
  def open(path: java.lang.String, options: atomLib.Anon_RefreshOnWindowFocus): atomLib.atomMod.GitRepository = js.native
}

