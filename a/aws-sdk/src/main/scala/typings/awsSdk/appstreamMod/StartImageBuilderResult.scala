package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartImageBuilderResult extends StObject {
  
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typings.awsSdk.appstreamMod.ImageBuilder] = js.native
}
object StartImageBuilderResult {
  
  @scala.inline
  def apply(): StartImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImageBuilderResult]
  }
  
  @scala.inline
  implicit class StartImageBuilderResultMutableBuilder[Self <: StartImageBuilderResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageBuilder(value: ImageBuilder): Self = StObject.set(x, "ImageBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBuilderUndefined: Self = StObject.set(x, "ImageBuilder", js.undefined)
  }
}
