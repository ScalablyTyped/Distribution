package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSMOutput extends StObject {
  
  var s3Location: js.UndefOr[S3Location] = js.undefined
}
object SSMOutput {
  
  inline def apply(): SSMOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSMOutput]
  }
  
  extension [Self <: SSMOutput](x: Self) {
    
    inline def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
