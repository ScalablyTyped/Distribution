package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageBuilderResult extends StObject {
  
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typings.awsSdk.clientsAppstreamMod.ImageBuilder] = js.undefined
}
object CreateImageBuilderResult {
  
  inline def apply(): CreateImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageBuilderResult]
  }
  
  extension [Self <: CreateImageBuilderResult](x: Self) {
    
    inline def setImageBuilder(value: ImageBuilder): Self = StObject.set(x, "ImageBuilder", value.asInstanceOf[js.Any])
    
    inline def setImageBuilderUndefined: Self = StObject.set(x, "ImageBuilder", js.undefined)
  }
}
