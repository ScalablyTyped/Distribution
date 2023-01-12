package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportRequest extends StObject {
  
  /**
    * The unique identifier of the export to describe.
    */
  var exportId: Id
}
object DescribeExportRequest {
  
  inline def apply(exportId: Id): DescribeExportRequest = {
    val __obj = js.Dynamic.literal(exportId = exportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeExportRequest] (val x: Self) extends AnyVal {
    
    inline def setExportId(value: Id): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
  }
}
