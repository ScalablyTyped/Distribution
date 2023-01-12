package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopImageBuilderResult extends StObject {
  
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typings.awsSdk.clientsAppstreamMod.ImageBuilder] = js.undefined
}
object StopImageBuilderResult {
  
  inline def apply(): StopImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopImageBuilderResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopImageBuilderResult] (val x: Self) extends AnyVal {
    
    inline def setImageBuilder(value: ImageBuilder): Self = StObject.set(x, "ImageBuilder", value.asInstanceOf[js.Any])
    
    inline def setImageBuilderUndefined: Self = StObject.set(x, "ImageBuilder", js.undefined)
  }
}
