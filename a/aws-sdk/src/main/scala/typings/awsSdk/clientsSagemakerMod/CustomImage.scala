package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomImage extends StObject {
  
  /**
    * The name of the AppImageConfig.
    */
  var AppImageConfigName: typings.awsSdk.clientsSagemakerMod.AppImageConfigName
  
  /**
    * The name of the CustomImage. Must be unique to your account.
    */
  var ImageName: typings.awsSdk.clientsSagemakerMod.ImageName
  
  /**
    * The version number of the CustomImage.
    */
  var ImageVersionNumber: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ImageVersionNumber] = js.undefined
}
object CustomImage {
  
  inline def apply(AppImageConfigName: AppImageConfigName, ImageName: ImageName): CustomImage = {
    val __obj = js.Dynamic.literal(AppImageConfigName = AppImageConfigName.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomImage] (val x: Self) extends AnyVal {
    
    inline def setAppImageConfigName(value: AppImageConfigName): Self = StObject.set(x, "AppImageConfigName", value.asInstanceOf[js.Any])
    
    inline def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    inline def setImageVersionNumber(value: ImageVersionNumber): Self = StObject.set(x, "ImageVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setImageVersionNumberUndefined: Self = StObject.set(x, "ImageVersionNumber", js.undefined)
  }
}
