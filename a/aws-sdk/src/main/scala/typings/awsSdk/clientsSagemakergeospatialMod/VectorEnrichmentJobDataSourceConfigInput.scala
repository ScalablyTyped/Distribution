package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorEnrichmentJobDataSourceConfigInput extends StObject {
  
  /**
    * The input structure for the Amazon S3 data that represents the Amazon S3 location of the input data objects.
    */
  var S3Data: js.UndefOr[VectorEnrichmentJobS3Data] = js.undefined
}
object VectorEnrichmentJobDataSourceConfigInput {
  
  inline def apply(): VectorEnrichmentJobDataSourceConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorEnrichmentJobDataSourceConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorEnrichmentJobDataSourceConfigInput] (val x: Self) extends AnyVal {
    
    inline def setS3Data(value: VectorEnrichmentJobS3Data): Self = StObject.set(x, "S3Data", value.asInstanceOf[js.Any])
    
    inline def setS3DataUndefined: Self = StObject.set(x, "S3Data", js.undefined)
  }
}
