package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeStarParameters extends StObject {
  
  /**
    * The absolute path wehre the artifact resides within the repo and branch, formatted as "folder/file.json." 
    */
  var ArtifactPath: RepositoryArtifactPath
  
  /**
    * The specific branch where the artifact resides. 
    */
  var Branch: RepositoryBranch
  
  /**
    * The CodeStar ARN, which is the connection between Service Catalog and the external repository.
    */
  var ConnectionArn: CodeStarConnectionArn
  
  /**
    * The specific repository where the product’s artifact-to-be-synced resides, formatted as "Account/Repo." 
    */
  var Repository: typings.awsSdk.clientsServicecatalogMod.Repository
}
object CodeStarParameters {
  
  inline def apply(
    ArtifactPath: RepositoryArtifactPath,
    Branch: RepositoryBranch,
    ConnectionArn: CodeStarConnectionArn,
    Repository: Repository
  ): CodeStarParameters = {
    val __obj = js.Dynamic.literal(ArtifactPath = ArtifactPath.asInstanceOf[js.Any], Branch = Branch.asInstanceOf[js.Any], ConnectionArn = ConnectionArn.asInstanceOf[js.Any], Repository = Repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeStarParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeStarParameters] (val x: Self) extends AnyVal {
    
    inline def setArtifactPath(value: RepositoryArtifactPath): Self = StObject.set(x, "ArtifactPath", value.asInstanceOf[js.Any])
    
    inline def setBranch(value: RepositoryBranch): Self = StObject.set(x, "Branch", value.asInstanceOf[js.Any])
    
    inline def setConnectionArn(value: CodeStarConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Repository): Self = StObject.set(x, "Repository", value.asInstanceOf[js.Any])
  }
}
