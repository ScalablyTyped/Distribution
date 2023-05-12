package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculationResult extends StObject {
  
  /**
    * The Amazon S3 location of the folder for the calculation results.
    */
  var ResultS3Uri: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * The data format of the calculation result.
    */
  var ResultType: js.UndefOr[CalculationResultType] = js.undefined
  
  /**
    * The Amazon S3 location of the stderr error messages file for the calculation.
    */
  var StdErrorS3Uri: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * The Amazon S3 location of the stdout file for the calculation.
    */
  var StdOutS3Uri: js.UndefOr[S3Uri] = js.undefined
}
object CalculationResult {
  
  inline def apply(): CalculationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculationResult] (val x: Self) extends AnyVal {
    
    inline def setResultS3Uri(value: S3Uri): Self = StObject.set(x, "ResultS3Uri", value.asInstanceOf[js.Any])
    
    inline def setResultS3UriUndefined: Self = StObject.set(x, "ResultS3Uri", js.undefined)
    
    inline def setResultType(value: CalculationResultType): Self = StObject.set(x, "ResultType", value.asInstanceOf[js.Any])
    
    inline def setResultTypeUndefined: Self = StObject.set(x, "ResultType", js.undefined)
    
    inline def setStdErrorS3Uri(value: S3Uri): Self = StObject.set(x, "StdErrorS3Uri", value.asInstanceOf[js.Any])
    
    inline def setStdErrorS3UriUndefined: Self = StObject.set(x, "StdErrorS3Uri", js.undefined)
    
    inline def setStdOutS3Uri(value: S3Uri): Self = StObject.set(x, "StdOutS3Uri", value.asInstanceOf[js.Any])
    
    inline def setStdOutS3UriUndefined: Self = StObject.set(x, "StdOutS3Uri", js.undefined)
  }
}
