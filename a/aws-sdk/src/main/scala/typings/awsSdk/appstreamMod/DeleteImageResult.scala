package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageResult extends StObject {
  
  /**
    * Information about the image.
    */
  var Image: js.UndefOr[typings.awsSdk.appstreamMod.Image] = js.undefined
}
object DeleteImageResult {
  
  @scala.inline
  def apply(): DeleteImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImageResult]
  }
  
  @scala.inline
  implicit class DeleteImageResultMutableBuilder[Self <: DeleteImageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
  }
}
