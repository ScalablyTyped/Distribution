package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyImageResponse extends StObject {
  
  /**
    * The name of the destination image.
    */
  var DestinationImageName: js.UndefOr[Name] = js.native
}
object CopyImageResponse {
  
  @scala.inline
  def apply(): CopyImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyImageResponse]
  }
  
  @scala.inline
  implicit class CopyImageResponseMutableBuilder[Self <: CopyImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationImageName(value: Name): Self = StObject.set(x, "DestinationImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationImageNameUndefined: Self = StObject.set(x, "DestinationImageName", js.undefined)
  }
}
