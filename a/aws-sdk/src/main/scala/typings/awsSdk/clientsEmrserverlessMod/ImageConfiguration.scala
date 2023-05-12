package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageConfiguration extends StObject {
  
  /**
    * The image URI.
    */
  var imageUri: ImageUri
  
  /**
    * The SHA256 digest of the image URI. This indicates which specific image the application is configured for. The image digest doesn't exist until an application has started.
    */
  var resolvedImageDigest: js.UndefOr[ImageDigest] = js.undefined
}
object ImageConfiguration {
  
  inline def apply(imageUri: ImageUri): ImageConfiguration = {
    val __obj = js.Dynamic.literal(imageUri = imageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageConfiguration] (val x: Self) extends AnyVal {
    
    inline def setImageUri(value: ImageUri): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setResolvedImageDigest(value: ImageDigest): Self = StObject.set(x, "resolvedImageDigest", value.asInstanceOf[js.Any])
    
    inline def setResolvedImageDigestUndefined: Self = StObject.set(x, "resolvedImageDigest", js.undefined)
  }
}
