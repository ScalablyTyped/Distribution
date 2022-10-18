package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferencedImageDetail extends StObject {
  
  /**
    * The artifact media type of the image.
    */
  var artifactMediaType: js.UndefOr[MediaType] = js.undefined
  
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.undefined
  
  /**
    * The media type of the image manifest.
    */
  var imageManifestMediaType: js.UndefOr[MediaType] = js.undefined
  
  /**
    * The date and time, expressed in standard JavaScript date format, at which the current image tag was pushed to the repository.
    */
  var imagePushedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The size, in bytes, of the image in the repository. If the image is a manifest list, this will be the max size of all manifests in the list.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
    */
  var imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.undefined
}
object ReferencedImageDetail {
  
  inline def apply(): ReferencedImageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferencedImageDetail]
  }
  
  extension [Self <: ReferencedImageDetail](x: Self) {
    
    inline def setArtifactMediaType(value: MediaType): Self = StObject.set(x, "artifactMediaType", value.asInstanceOf[js.Any])
    
    inline def setArtifactMediaTypeUndefined: Self = StObject.set(x, "artifactMediaType", js.undefined)
    
    inline def setImageDigest(value: ImageDigest): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    inline def setImageManifestMediaType(value: MediaType): Self = StObject.set(x, "imageManifestMediaType", value.asInstanceOf[js.Any])
    
    inline def setImageManifestMediaTypeUndefined: Self = StObject.set(x, "imageManifestMediaType", js.undefined)
    
    inline def setImagePushedAt(value: js.Date): Self = StObject.set(x, "imagePushedAt", value.asInstanceOf[js.Any])
    
    inline def setImagePushedAtUndefined: Self = StObject.set(x, "imagePushedAt", js.undefined)
    
    inline def setImageSizeInBytes(value: ImageSizeInBytes): Self = StObject.set(x, "imageSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setImageSizeInBytesUndefined: Self = StObject.set(x, "imageSizeInBytes", js.undefined)
  }
}
