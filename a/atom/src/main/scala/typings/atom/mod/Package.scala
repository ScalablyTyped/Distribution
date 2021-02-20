package typings.atom.mod

import typings.atom.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Package extends StObject {
  
  /** If a previous rebuild failed, get the contents of stderr. */
  def getBuildFailureOutput(): String | Null = js.native
  
  // Native Module Compatibility
  /**
    *  Are all native modules depended on by this package correctly compiled
    *  against the current version of Atom?
    */
  def isCompatible(): Boolean = js.native
  
  /** The name of the Package. */
  val name: String = js.native
  
  // Event Subscription
  /** Invoke the given callback when all packages have been activated. */
  def onDidDeactivate(callback: js.Function0[Unit]): Disposable = js.native
  
  /** The path to the Package on disk. */
  val path: String = js.native
  
  /**
    *  Rebuild native modules in this package's dependencies for the current
    *  version of Atom.
    */
  def rebuild(): js.Promise[Code] = js.native
}
object Package {
  
  @scala.inline
  def apply(
    getBuildFailureOutput: () => String | Null,
    isCompatible: () => Boolean,
    name: String,
    onDidDeactivate: js.Function0[Unit] => Disposable,
    path: String,
    rebuild: () => js.Promise[Code]
  ): Package = {
    val __obj = js.Dynamic.literal(getBuildFailureOutput = js.Any.fromFunction0(getBuildFailureOutput), isCompatible = js.Any.fromFunction0(isCompatible), name = name.asInstanceOf[js.Any], onDidDeactivate = js.Any.fromFunction1(onDidDeactivate), path = path.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild))
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit class PackageMutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBuildFailureOutput(value: () => String | Null): Self = StObject.set(x, "getBuildFailureOutput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCompatible(value: () => Boolean): Self = StObject.set(x, "isCompatible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDidDeactivate(value: js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidDeactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebuild(value: () => js.Promise[Code]): Self = StObject.set(x, "rebuild", js.Any.fromFunction0(value))
  }
}
