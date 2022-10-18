package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImageVersionRequest extends StObject {
  
  /**
    * The name of the image.
    */
  var ImageName: typings.awsSdk.clientsSagemakerMod.ImageName
  
  /**
    * The version of the image. If not specified, the latest version is described.
    */
  var Version: js.UndefOr[ImageVersionNumber] = js.undefined
}
object DescribeImageVersionRequest {
  
  inline def apply(ImageName: ImageName): DescribeImageVersionRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageVersionRequest]
  }
  
  extension [Self <: DescribeImageVersionRequest](x: Self) {
    
    inline def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: ImageVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
