package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDetectorModelResponse extends StObject {
  
  /**
    * Information about the detector model.
    */
  var detectorModel: js.UndefOr[DetectorModel] = js.undefined
}
object DescribeDetectorModelResponse {
  
  inline def apply(): DescribeDetectorModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDetectorModelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDetectorModelResponse] (val x: Self) extends AnyVal {
    
    inline def setDetectorModel(value: DetectorModel): Self = StObject.set(x, "detectorModel", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelUndefined: Self = StObject.set(x, "detectorModel", js.undefined)
  }
}
