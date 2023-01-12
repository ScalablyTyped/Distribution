package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentClassificationJobResponse extends StObject {
  
  /**
    * An object that describes the properties associated with the document classification job.
    */
  var DocumentClassificationJobProperties: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentClassificationJobProperties] = js.undefined
}
object DescribeDocumentClassificationJobResponse {
  
  inline def apply(): DescribeDocumentClassificationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentClassificationJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDocumentClassificationJobResponse] (val x: Self) extends AnyVal {
    
    inline def setDocumentClassificationJobProperties(value: DocumentClassificationJobProperties): Self = StObject.set(x, "DocumentClassificationJobProperties", value.asInstanceOf[js.Any])
    
    inline def setDocumentClassificationJobPropertiesUndefined: Self = StObject.set(x, "DocumentClassificationJobProperties", js.undefined)
  }
}
