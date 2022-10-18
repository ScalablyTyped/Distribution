package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobInputConfig extends StObject {
  
  /**
    * Attributes of the data specified by the customer.
    */
  var DataAttributes: js.UndefOr[LabelingJobDataAttributes] = js.undefined
  
  /**
    * The location of the input data.
    */
  var DataSource: LabelingJobDataSource
}
object LabelingJobInputConfig {
  
  inline def apply(DataSource: LabelingJobDataSource): LabelingJobInputConfig = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobInputConfig]
  }
  
  extension [Self <: LabelingJobInputConfig](x: Self) {
    
    inline def setDataAttributes(value: LabelingJobDataAttributes): Self = StObject.set(x, "DataAttributes", value.asInstanceOf[js.Any])
    
    inline def setDataAttributesUndefined: Self = StObject.set(x, "DataAttributes", js.undefined)
    
    inline def setDataSource(value: LabelingJobDataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
  }
}
