package typings.awsSdk.clientsAppstreamMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyImageResponse] (val x: Self) extends AnyVal {
    
    inline def setDestinationImageName(value: Name): Self = StObject.set(x, "DestinationImageName", value.asInstanceOf[js.Any])
    
    inline def setDestinationImageNameUndefined: Self = StObject.set(x, "DestinationImageName", js.undefined)
  }
}
