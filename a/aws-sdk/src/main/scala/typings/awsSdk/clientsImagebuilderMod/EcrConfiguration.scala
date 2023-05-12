package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcrConfiguration extends StObject {
  
  /**
    * Tags for Image Builder to apply to the output container image that &amp;INS; scans. Tags can help you identify and manage your scanned images.
    */
  var containerTags: js.UndefOr[StringList] = js.undefined
  
  /**
    * The name of the container repository that Amazon Inspector scans to identify findings for your container images. The name includes the path for the repository location. If you don’t provide this information, Image Builder creates a repository in your account named image-builder-image-scanning-repository for vulnerability scans of your output container images.
    */
  var repositoryName: js.UndefOr[NonEmptyString] = js.undefined
}
object EcrConfiguration {
  
  inline def apply(): EcrConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcrConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcrConfiguration] (val x: Self) extends AnyVal {
    
    inline def setContainerTags(value: StringList): Self = StObject.set(x, "containerTags", value.asInstanceOf[js.Any])
    
    inline def setContainerTagsUndefined: Self = StObject.set(x, "containerTags", js.undefined)
    
    inline def setContainerTagsVarargs(value: NonEmptyString*): Self = StObject.set(x, "containerTags", js.Array(value*))
    
    inline def setRepositoryName(value: NonEmptyString): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
