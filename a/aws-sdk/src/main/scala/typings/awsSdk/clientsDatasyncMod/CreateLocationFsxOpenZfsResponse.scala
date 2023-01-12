package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationFsxOpenZfsResponse extends StObject {
  
  /**
    * The ARN of the FSx for OpenZFS file system location that you created.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationArn] = js.undefined
}
object CreateLocationFsxOpenZfsResponse {
  
  inline def apply(): CreateLocationFsxOpenZfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationFsxOpenZfsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLocationFsxOpenZfsResponse] (val x: Self) extends AnyVal {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
