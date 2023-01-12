package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSampleDataResponse extends StObject {
  
  /**
    * A list of header labels for the records.
    */
  var HeaderValues: js.UndefOr[HeaderValueList] = js.undefined
  
  /**
    * A list of records.
    */
  var SampleRows: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.SampleRows] = js.undefined
}
object GetSampleDataResponse {
  
  inline def apply(): GetSampleDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSampleDataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSampleDataResponse] (val x: Self) extends AnyVal {
    
    inline def setHeaderValues(value: HeaderValueList): Self = StObject.set(x, "HeaderValues", value.asInstanceOf[js.Any])
    
    inline def setHeaderValuesUndefined: Self = StObject.set(x, "HeaderValues", js.undefined)
    
    inline def setHeaderValuesVarargs(value: HeaderValue*): Self = StObject.set(x, "HeaderValues", js.Array(value*))
    
    inline def setSampleRows(value: SampleRows): Self = StObject.set(x, "SampleRows", value.asInstanceOf[js.Any])
    
    inline def setSampleRowsUndefined: Self = StObject.set(x, "SampleRows", js.undefined)
    
    inline def setSampleRowsVarargs(value: SampleRow*): Self = StObject.set(x, "SampleRows", js.Array(value*))
  }
}
