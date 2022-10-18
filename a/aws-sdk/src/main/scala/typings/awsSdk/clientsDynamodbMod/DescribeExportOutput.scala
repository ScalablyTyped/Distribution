package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportOutput extends StObject {
  
  /**
    * Represents the properties of the export.
    */
  var ExportDescription: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ExportDescription] = js.undefined
}
object DescribeExportOutput {
  
  inline def apply(): DescribeExportOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportOutput]
  }
  
  extension [Self <: DescribeExportOutput](x: Self) {
    
    inline def setExportDescription(value: ExportDescription): Self = StObject.set(x, "ExportDescription", value.asInstanceOf[js.Any])
    
    inline def setExportDescriptionUndefined: Self = StObject.set(x, "ExportDescription", js.undefined)
  }
}
