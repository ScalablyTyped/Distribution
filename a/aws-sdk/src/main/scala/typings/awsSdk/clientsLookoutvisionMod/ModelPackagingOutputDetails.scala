package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPackagingOutputDetails extends StObject {
  
  /**
    *  Information about the AWS IoT Greengrass component in a model packaging job. 
    */
  var Greengrass: js.UndefOr[GreengrassOutputDetails] = js.undefined
}
object ModelPackagingOutputDetails {
  
  inline def apply(): ModelPackagingOutputDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelPackagingOutputDetails]
  }
  
  extension [Self <: ModelPackagingOutputDetails](x: Self) {
    
    inline def setGreengrass(value: GreengrassOutputDetails): Self = StObject.set(x, "Greengrass", value.asInstanceOf[js.Any])
    
    inline def setGreengrassUndefined: Self = StObject.set(x, "Greengrass", js.undefined)
  }
}
