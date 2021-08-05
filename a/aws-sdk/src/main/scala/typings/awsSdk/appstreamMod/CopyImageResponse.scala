package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyImageResponse extends StObject {
  
  /**
    * The name of the destination image.
    */
  var DestinationImageName: js.UndefOr[Name] = js.undefined
}
object CopyImageResponse {
  
  inline def apply(): CopyImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyImageResponse]
  }
  
  extension [Self <: CopyImageResponse](x: Self) {
    
    inline def setDestinationImageName(value: Name): Self = StObject.set(x, "DestinationImageName", value.asInstanceOf[js.Any])
    
    inline def setDestinationImageNameUndefined: Self = StObject.set(x, "DestinationImageName", js.undefined)
  }
}
