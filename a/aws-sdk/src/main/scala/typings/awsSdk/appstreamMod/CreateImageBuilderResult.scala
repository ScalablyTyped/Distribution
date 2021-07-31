package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageBuilderResult extends StObject {
  
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typings.awsSdk.appstreamMod.ImageBuilder] = js.undefined
}
object CreateImageBuilderResult {
  
  @scala.inline
  def apply(): CreateImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageBuilderResult]
  }
  
  @scala.inline
  implicit class CreateImageBuilderResultMutableBuilder[Self <: CreateImageBuilderResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageBuilder(value: ImageBuilder): Self = StObject.set(x, "ImageBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBuilderUndefined: Self = StObject.set(x, "ImageBuilder", js.undefined)
  }
}
