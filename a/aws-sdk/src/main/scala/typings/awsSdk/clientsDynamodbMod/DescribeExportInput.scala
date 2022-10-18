package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) associated with the export.
    */
  var ExportArn: typings.awsSdk.clientsDynamodbMod.ExportArn
}
object DescribeExportInput {
  
  inline def apply(ExportArn: ExportArn): DescribeExportInput = {
    val __obj = js.Dynamic.literal(ExportArn = ExportArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExportInput]
  }
  
  extension [Self <: DescribeExportInput](x: Self) {
    
    inline def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
  }
}
