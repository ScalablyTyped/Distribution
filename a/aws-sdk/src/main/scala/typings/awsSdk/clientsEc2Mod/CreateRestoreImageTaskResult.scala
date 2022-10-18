package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRestoreImageTaskResult extends StObject {
  
  /**
    * The AMI ID.
    */
  var ImageId: js.UndefOr[String] = js.undefined
}
object CreateRestoreImageTaskResult {
  
  inline def apply(): CreateRestoreImageTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRestoreImageTaskResult]
  }
  
  extension [Self <: CreateRestoreImageTaskResult](x: Self) {
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
  }
}
