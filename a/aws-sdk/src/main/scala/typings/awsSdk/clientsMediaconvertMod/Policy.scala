package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  /**
    * Allow or disallow jobs that specify HTTP inputs.
    */
  var HttpInputs: js.UndefOr[InputPolicy] = js.undefined
  
  /**
    * Allow or disallow jobs that specify HTTPS inputs.
    */
  var HttpsInputs: js.UndefOr[InputPolicy] = js.undefined
  
  /**
    * Allow or disallow jobs that specify Amazon S3 inputs.
    */
  var S3Inputs: js.UndefOr[InputPolicy] = js.undefined
}
object Policy {
  
  inline def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
    
    inline def setHttpInputs(value: InputPolicy): Self = StObject.set(x, "HttpInputs", value.asInstanceOf[js.Any])
    
    inline def setHttpInputsUndefined: Self = StObject.set(x, "HttpInputs", js.undefined)
    
    inline def setHttpsInputs(value: InputPolicy): Self = StObject.set(x, "HttpsInputs", value.asInstanceOf[js.Any])
    
    inline def setHttpsInputsUndefined: Self = StObject.set(x, "HttpsInputs", js.undefined)
    
    inline def setS3Inputs(value: InputPolicy): Self = StObject.set(x, "S3Inputs", value.asInstanceOf[js.Any])
    
    inline def setS3InputsUndefined: Self = StObject.set(x, "S3Inputs", js.undefined)
  }
}
