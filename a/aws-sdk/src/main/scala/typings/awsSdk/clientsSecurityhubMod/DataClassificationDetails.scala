package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataClassificationDetails extends StObject {
  
  /**
    * The path to the folder or file that contains the sensitive data.
    */
  var DetailedResultsLocation: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The details about the sensitive data that was detected on the resource.
    */
  var Result: js.UndefOr[ClassificationResult] = js.undefined
}
object DataClassificationDetails {
  
  inline def apply(): DataClassificationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataClassificationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataClassificationDetails] (val x: Self) extends AnyVal {
    
    inline def setDetailedResultsLocation(value: NonEmptyString): Self = StObject.set(x, "DetailedResultsLocation", value.asInstanceOf[js.Any])
    
    inline def setDetailedResultsLocationUndefined: Self = StObject.set(x, "DetailedResultsLocation", js.undefined)
    
    inline def setResult(value: ClassificationResult): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
  }
}
