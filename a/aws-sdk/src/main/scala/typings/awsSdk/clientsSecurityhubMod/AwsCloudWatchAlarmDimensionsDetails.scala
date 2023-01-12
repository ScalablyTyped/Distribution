package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudWatchAlarmDimensionsDetails extends StObject {
  
  /**
    * The name of a dimension. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value of a dimension. 
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCloudWatchAlarmDimensionsDetails {
  
  inline def apply(): AwsCloudWatchAlarmDimensionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudWatchAlarmDimensionsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCloudWatchAlarmDimensionsDetails] (val x: Self) extends AnyVal {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
