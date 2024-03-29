package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCodeRepository extends StObject {
  
  /**
    *  The branch of the source code. 
    */
  var branch: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the project.
    */
  var projectName: js.UndefOr[String] = js.undefined
  
  /**
    *  The repository name for the source code. 
    */
  var repository: js.UndefOr[String] = js.undefined
  
  /**
    *  The type of repository to use for the source code. 
    */
  var versionControlType: js.UndefOr[String] = js.undefined
}
object SourceCodeRepository {
  
  inline def apply(): SourceCodeRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCodeRepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceCodeRepository] (val x: Self) extends AnyVal {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setVersionControlType(value: String): Self = StObject.set(x, "versionControlType", value.asInstanceOf[js.Any])
    
    inline def setVersionControlTypeUndefined: Self = StObject.set(x, "versionControlType", js.undefined)
  }
}
