package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreObjectOutput extends StObject {
  
  var RequestCharged: js.UndefOr[typings.awsSdk.clientsS3Mod.RequestCharged] = js.undefined
  
  /**
    * Indicates the path in the provided S3 output location where Select results will be restored to.
    */
  var RestoreOutputPath: js.UndefOr[typings.awsSdk.clientsS3Mod.RestoreOutputPath] = js.undefined
}
object RestoreObjectOutput {
  
  inline def apply(): RestoreObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreObjectOutput]
  }
  
  extension [Self <: RestoreObjectOutput](x: Self) {
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    inline def setRestoreOutputPath(value: RestoreOutputPath): Self = StObject.set(x, "RestoreOutputPath", value.asInstanceOf[js.Any])
    
    inline def setRestoreOutputPathUndefined: Self = StObject.set(x, "RestoreOutputPath", js.undefined)
  }
}
