package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerImage extends StObject {
  
  /**
    * The timestamp when the container image was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The digest of the container image.
    */
  var digest: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the container image.
    */
  var image: js.UndefOr[String] = js.undefined
}
object ContainerImage {
  
  inline def apply(): ContainerImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerImage] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
