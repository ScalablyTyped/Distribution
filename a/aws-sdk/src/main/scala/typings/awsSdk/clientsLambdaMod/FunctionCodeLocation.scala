package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionCodeLocation extends StObject {
  
  /**
    * URI of a container image in the Amazon ECR registry.
    */
  var ImageUri: js.UndefOr[String] = js.undefined
  
  /**
    * A presigned URL that you can use to download the deployment package.
    */
  var Location: js.UndefOr[String] = js.undefined
  
  /**
    * The service that's hosting the file.
    */
  var RepositoryType: js.UndefOr[String] = js.undefined
  
  /**
    * The resolved URI for the image.
    */
  var ResolvedImageUri: js.UndefOr[String] = js.undefined
}
object FunctionCodeLocation {
  
  inline def apply(): FunctionCodeLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionCodeLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionCodeLocation] (val x: Self) extends AnyVal {
    
    inline def setImageUri(value: String): Self = StObject.set(x, "ImageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "ImageUri", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setRepositoryType(value: String): Self = StObject.set(x, "RepositoryType", value.asInstanceOf[js.Any])
    
    inline def setRepositoryTypeUndefined: Self = StObject.set(x, "RepositoryType", js.undefined)
    
    inline def setResolvedImageUri(value: String): Self = StObject.set(x, "ResolvedImageUri", value.asInstanceOf[js.Any])
    
    inline def setResolvedImageUriUndefined: Self = StObject.set(x, "ResolvedImageUri", js.undefined)
  }
}
