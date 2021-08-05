package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageBuilderResult extends StObject {
  
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typings.awsSdk.appstreamMod.ImageBuilder] = js.undefined
}
object DeleteImageBuilderResult {
  
  inline def apply(): DeleteImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImageBuilderResult]
  }
  
  extension [Self <: DeleteImageBuilderResult](x: Self) {
    
    inline def setImageBuilder(value: ImageBuilder): Self = StObject.set(x, "ImageBuilder", value.asInstanceOf[js.Any])
    
    inline def setImageBuilderUndefined: Self = StObject.set(x, "ImageBuilder", js.undefined)
  }
}
