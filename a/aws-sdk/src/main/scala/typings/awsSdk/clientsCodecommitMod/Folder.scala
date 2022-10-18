package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Folder extends StObject {
  
  /**
    * The fully qualified path of the folder in the repository.
    */
  var absolutePath: js.UndefOr[Path] = js.undefined
  
  /**
    * The relative path of the specified folder from the folder where the query originated.
    */
  var relativePath: js.UndefOr[Path] = js.undefined
  
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the folder.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}
object Folder {
  
  inline def apply(): Folder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Folder]
  }
  
  extension [Self <: Folder](x: Self) {
    
    inline def setAbsolutePath(value: Path): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
    
    inline def setRelativePath(value: Path): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    
    inline def setTreeId(value: ObjectId): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    
    inline def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
  }
}
