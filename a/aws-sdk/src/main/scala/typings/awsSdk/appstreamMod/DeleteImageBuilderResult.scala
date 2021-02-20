package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteImageBuilderResult extends StObject {
  
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typings.awsSdk.appstreamMod.ImageBuilder] = js.native
}
object DeleteImageBuilderResult {
  
  @scala.inline
  def apply(): DeleteImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImageBuilderResult]
  }
  
  @scala.inline
  implicit class DeleteImageBuilderResultMutableBuilder[Self <: DeleteImageBuilderResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageBuilder(value: ImageBuilder): Self = StObject.set(x, "ImageBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBuilderUndefined: Self = StObject.set(x, "ImageBuilder", js.undefined)
  }
}
