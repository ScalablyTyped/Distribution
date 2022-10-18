package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureContentTypeHeader extends StObject {
  
  /**
    * The list of all content type headers that SageMaker will treat as CSV and capture accordingly.
    */
  var CsvContentTypes: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CsvContentTypes] = js.undefined
  
  /**
    * The list of all content type headers that SageMaker will treat as JSON and capture accordingly.
    */
  var JsonContentTypes: js.UndefOr[typings.awsSdk.clientsSagemakerMod.JsonContentTypes] = js.undefined
}
object CaptureContentTypeHeader {
  
  inline def apply(): CaptureContentTypeHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureContentTypeHeader]
  }
  
  extension [Self <: CaptureContentTypeHeader](x: Self) {
    
    inline def setCsvContentTypes(value: CsvContentTypes): Self = StObject.set(x, "CsvContentTypes", value.asInstanceOf[js.Any])
    
    inline def setCsvContentTypesUndefined: Self = StObject.set(x, "CsvContentTypes", js.undefined)
    
    inline def setCsvContentTypesVarargs(value: CsvContentType*): Self = StObject.set(x, "CsvContentTypes", js.Array(value*))
    
    inline def setJsonContentTypes(value: JsonContentTypes): Self = StObject.set(x, "JsonContentTypes", value.asInstanceOf[js.Any])
    
    inline def setJsonContentTypesUndefined: Self = StObject.set(x, "JsonContentTypes", js.undefined)
    
    inline def setJsonContentTypesVarargs(value: JsonContentType*): Self = StObject.set(x, "JsonContentTypes", js.Array(value*))
  }
}
