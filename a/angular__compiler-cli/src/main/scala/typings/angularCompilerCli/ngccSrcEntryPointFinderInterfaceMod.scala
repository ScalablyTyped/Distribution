package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcDependenciesDependencyResolverMod.SortedEntryPointsInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcEntryPointFinderInterfaceMod {
  
  trait EntryPointFinder extends StObject {
    
    /**
      * Search for Angular package entry-points.
      */
    def findEntryPoints(): SortedEntryPointsInfo
  }
  object EntryPointFinder {
    
    inline def apply(findEntryPoints: () => SortedEntryPointsInfo): EntryPointFinder = {
      val __obj = js.Dynamic.literal(findEntryPoints = js.Any.fromFunction0(findEntryPoints))
      __obj.asInstanceOf[EntryPointFinder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EntryPointFinder] (val x: Self) extends AnyVal {
      
      inline def setFindEntryPoints(value: () => SortedEntryPointsInfo): Self = StObject.set(x, "findEntryPoints", js.Any.fromFunction0(value))
    }
  }
}
