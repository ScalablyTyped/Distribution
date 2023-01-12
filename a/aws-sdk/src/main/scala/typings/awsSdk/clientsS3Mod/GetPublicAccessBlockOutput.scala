package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublicAccessBlockOutput extends StObject {
  
  /**
    * The PublicAccessBlock configuration currently in effect for this Amazon S3 bucket.
    */
  var PublicAccessBlockConfiguration: js.UndefOr[typings.awsSdk.clientsS3Mod.PublicAccessBlockConfiguration] = js.undefined
}
object GetPublicAccessBlockOutput {
  
  inline def apply(): GetPublicAccessBlockOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicAccessBlockOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPublicAccessBlockOutput] (val x: Self) extends AnyVal {
    
    inline def setPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = StObject.set(x, "PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessBlockConfigurationUndefined: Self = StObject.set(x, "PublicAccessBlockConfiguration", js.undefined)
  }
}
