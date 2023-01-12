package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelsInputConfiguration extends StObject {
  
  /**
    *  The name of the label group to be used for label data. 
    */
  var LabelGroupName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.LabelGroupName] = js.undefined
  
  /**
    * Contains location information for the S3 location being used for label data. 
    */
  var S3InputConfiguration: js.UndefOr[LabelsS3InputConfiguration] = js.undefined
}
object LabelsInputConfiguration {
  
  inline def apply(): LabelsInputConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelsInputConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelsInputConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupNameUndefined: Self = StObject.set(x, "LabelGroupName", js.undefined)
    
    inline def setS3InputConfiguration(value: LabelsS3InputConfiguration): Self = StObject.set(x, "S3InputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3InputConfigurationUndefined: Self = StObject.set(x, "S3InputConfiguration", js.undefined)
  }
}
