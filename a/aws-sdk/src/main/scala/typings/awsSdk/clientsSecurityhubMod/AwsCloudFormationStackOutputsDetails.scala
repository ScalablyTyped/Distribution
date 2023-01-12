package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFormationStackOutputsDetails extends StObject {
  
  /**
    * A user-defined description associated with the output. 
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The key associated with the output. 
    */
  var OutputKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value associated with the output. 
    */
  var OutputValue: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCloudFormationStackOutputsDetails {
  
  inline def apply(): AwsCloudFormationStackOutputsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFormationStackOutputsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCloudFormationStackOutputsDetails] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setOutputKey(value: NonEmptyString): Self = StObject.set(x, "OutputKey", value.asInstanceOf[js.Any])
    
    inline def setOutputKeyUndefined: Self = StObject.set(x, "OutputKey", js.undefined)
    
    inline def setOutputValue(value: NonEmptyString): Self = StObject.set(x, "OutputValue", value.asInstanceOf[js.Any])
    
    inline def setOutputValueUndefined: Self = StObject.set(x, "OutputValue", js.undefined)
  }
}
