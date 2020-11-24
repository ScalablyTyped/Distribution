package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageManager extends js.Object {
  
  /** Activate a single package by name or path. */
  def activatePackage(nameOrPath: String): js.Promise[Package] = js.native
  
  /** Deactivate a single package by name or path. */
  def deactivatePackage(nameOrPath: String): js.Promise[Unit] = js.native
  def deactivatePackage(nameOrPath: String, suppressSerialization: Boolean): js.Promise[Unit] = js.native
  
  /** Disable the package with the given name. */
  def disablePackage(name: String): js.UndefOr[Package] = js.native
  
  // Enabling and Disabling Packages
  /** Enable the package with the given name. */
  def enablePackage(name: String): js.UndefOr[Package] = js.native
  
  /** Get the active Package with the given name. */
  def getActivePackage(name: String): js.UndefOr[Package] = js.native
  
  // Accessing Active Packages
  /** Get an Array of all the active Packages. */
  def getActivePackages(): js.Array[Package] = js.native
  
  // Package System Data
  /** Get the path to the apm command. */
  def getApmPath(): String = js.native
  
  /** Returns an Array of strings of all the available package metadata. */
  def getAvailablePackageMetadata(): js.Array[String] = js.native
  
  /** Returns an Array of strings of all the available package names.  */
  def getAvailablePackageNames(): js.Array[String] = js.native
  
  // Accessing Available Packages
  /** Returns an Array of strings of all the available package paths. */
  def getAvailablePackagePaths(): js.Array[String] = js.native
  
  /** Get the loaded Package with the given name. */
  def getLoadedPackage(name: String): js.UndefOr[Package] = js.native
  
  // Accessing Loaded Packages
  /** Get an Array of all the loaded Packages. */
  def getLoadedPackages(): js.Array[Package] = js.native
  
  /** Get the paths being used to look for packages. */
  def getPackageDirPaths(): js.Array[String] = js.native
  
  /** Returns a boolean indicating whether package activation has occurred. */
  def hasActivatedInitialPackages(): Boolean = js.native
  
  /** Returns a boolean indicating whether package loading has occurred. */
  def hasLoadedInitialPackages(): Boolean = js.native
  
  /** Is the package with the given name bundled with Atom? */
  def isBundledPackage(name: String): Boolean = js.native
  
  /** Is the Package with the given name active? */
  def isPackageActive(name: String): Boolean = js.native
  
  /** Is the package with the given name disabled? */
  def isPackageDisabled(name: String): Boolean = js.native
  
  /** Is the package with the given name loaded? */
  def isPackageLoaded(name: String): Boolean = js.native
  
  /** Invoke the given callback when all packages have been activated. */
  def onDidActivateInitialPackages(callback: js.Function0[Unit]): Disposable = js.native
  
  /** Invoke the given callback when a package is activated. */
  def onDidActivatePackage(callback: js.Function1[/* package */ Package, Unit]): Disposable = js.native
  
  /** Invoke the given callback when a package is deactivated. */
  def onDidDeactivatePackage(callback: js.Function1[/* package */ Package, Unit]): Disposable = js.native
  
  // Event Subscription
  /** Invoke the given callback when all packages have been loaded. */
  def onDidLoadInitialPackages(callback: js.Function0[Unit]): Disposable = js.native
  
  /** Invoke the given callback when a package is loaded. */
  def onDidLoadPackage(callback: js.Function1[/* package */ Package, Unit]): Disposable = js.native
  
  /** Undocumented: invoke the given callback when an activation hook is triggered */
  def onDidTriggerActivationHook(hook: String, callback: js.Function0[Unit]): Disposable = js.native
  
  /** Invoke the given callback when a package is unloaded. */
  def onDidUnloadPackage(callback: js.Function1[/* package */ Package, Unit]): Disposable = js.native
  
  // General Package Data
  /** Resolve the given package name to a path on disk. */
  def resolvePackagePath(name: String): js.UndefOr[String] = js.native
  
  /** Triggers the given package activation hook. */
  def triggerActivationHook(hook: String): Unit = js.native
  
  /** Trigger all queued activation hooks immediately. */
  def triggerDeferredActivationHooks(): Unit = js.native
}
