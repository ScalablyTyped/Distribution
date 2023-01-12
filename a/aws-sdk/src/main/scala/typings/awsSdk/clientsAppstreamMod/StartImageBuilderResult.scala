package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImageBuilderResult extends StObject {
  
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typings.awsSdk.clientsAppstreamMod.ImageBuilder] = js.undefined
}
object StartImageBuilderResult {
  
  inline def apply(): StartImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImageBuilderResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartImageBuilderResult] (val x: Self) extends AnyVal {
    
    inline def setImageBuilder(value: ImageBuilder): Self = StObject.set(x, "ImageBuilder", value.asInstanceOf[js.Any])
    
    inline def setImageBuilderUndefined: Self = StObject.set(x, "ImageBuilder", js.undefined)
  }
}
