package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubModule extends StObject {
  
  /**
    * The fully qualified path to the folder that contains the reference to the submodule.
    */
  var absolutePath: js.UndefOr[Path] = js.undefined
  
  /**
    * The commit ID that contains the reference to the submodule.
    */
  var commitId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The relative path of the submodule from the folder where the query originated.
    */
  var relativePath: js.UndefOr[Path] = js.undefined
}
object SubModule {
  
  inline def apply(): SubModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubModule]
  }
  
  extension [Self <: SubModule](x: Self) {
    
    inline def setAbsolutePath(value: Path): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
    
    inline def setCommitId(value: ObjectId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
    
    inline def setRelativePath(value: Path): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
  }
}
