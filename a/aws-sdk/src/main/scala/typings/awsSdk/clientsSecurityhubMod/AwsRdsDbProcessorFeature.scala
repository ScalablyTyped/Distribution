package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbProcessorFeature extends StObject {
  
  /**
    * The name of the processor feature. Valid values are coreCount or threadsPerCore.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value of the processor feature.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbProcessorFeature {
  
  inline def apply(): AwsRdsDbProcessorFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbProcessorFeature]
  }
  
  extension [Self <: AwsRdsDbProcessorFeature](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
