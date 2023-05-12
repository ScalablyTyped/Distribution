package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositoryRequest extends StObject {
  
  /**
    * The details about the repository that are publicly visible in the Amazon ECR Public Gallery.
    */
  var catalogData: js.UndefOr[RepositoryCatalogDataInput] = js.undefined
  
  /**
    * The name to use for the repository. This appears publicly in the Amazon ECR Public Gallery. The repository name can be specified on its own (for example nginx-web-app) or prepended with a namespace to group the repository into a category (for example project-a/nginx-web-app).
    */
  var repositoryName: RepositoryName
  
  /**
    * The metadata that you apply to each repository to help categorize and organize your repositories. Each tag consists of a key and an optional value. You define both of them. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateRepositoryRequest {
  
  inline def apply(repositoryName: RepositoryName): CreateRepositoryRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRepositoryRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalogData(value: RepositoryCatalogDataInput): Self = StObject.set(x, "catalogData", value.asInstanceOf[js.Any])
    
    inline def setCatalogDataUndefined: Self = StObject.set(x, "catalogData", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
