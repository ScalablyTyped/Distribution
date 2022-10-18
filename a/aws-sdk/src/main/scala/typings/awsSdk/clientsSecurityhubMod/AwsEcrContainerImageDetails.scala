package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcrContainerImageDetails extends StObject {
  
  /**
    * The architecture of the image. Valid values are as follows:    arm64     i386     x86_64   
    */
  var Architecture: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The sha256 digest of the image manifest.
    */
  var ImageDigest: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date and time when the image was pushed to the repository. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var ImagePublishedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of tags that are associated with the image.
    */
  var ImageTags: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The Amazon Web Services account identifier that is associated with the registry that the image belongs to.
    */
  var RegistryId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the repository that the image belongs to.
    */
  var RepositoryName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcrContainerImageDetails {
  
  inline def apply(): AwsEcrContainerImageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcrContainerImageDetails]
  }
  
  extension [Self <: AwsEcrContainerImageDetails](x: Self) {
    
    inline def setArchitecture(value: NonEmptyString): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    inline def setImageDigest(value: NonEmptyString): Self = StObject.set(x, "ImageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "ImageDigest", js.undefined)
    
    inline def setImagePublishedAt(value: NonEmptyString): Self = StObject.set(x, "ImagePublishedAt", value.asInstanceOf[js.Any])
    
    inline def setImagePublishedAtUndefined: Self = StObject.set(x, "ImagePublishedAt", js.undefined)
    
    inline def setImageTags(value: NonEmptyStringList): Self = StObject.set(x, "ImageTags", value.asInstanceOf[js.Any])
    
    inline def setImageTagsUndefined: Self = StObject.set(x, "ImageTags", js.undefined)
    
    inline def setImageTagsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ImageTags", js.Array(value*))
    
    inline def setRegistryId(value: NonEmptyString): Self = StObject.set(x, "RegistryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "RegistryId", js.undefined)
    
    inline def setRepositoryName(value: NonEmptyString): Self = StObject.set(x, "RepositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "RepositoryName", js.undefined)
  }
}
