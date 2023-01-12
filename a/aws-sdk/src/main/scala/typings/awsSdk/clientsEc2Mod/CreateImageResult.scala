package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageResult extends StObject {
  
  /**
    * The ID of the new AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
}
object CreateImageResult {
  
  inline def apply(): CreateImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateImageResult] (val x: Self) extends AnyVal {
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
  }
}
