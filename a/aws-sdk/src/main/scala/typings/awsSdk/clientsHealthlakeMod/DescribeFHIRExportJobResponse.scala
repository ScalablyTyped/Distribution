package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFHIRExportJobResponse extends StObject {
  
  /**
    * Displays the properties of the export job, including the ID, Arn, Name, and the status of the job. 
    */
  var ExportJobProperties: typings.awsSdk.clientsHealthlakeMod.ExportJobProperties
}
object DescribeFHIRExportJobResponse {
  
  inline def apply(ExportJobProperties: ExportJobProperties): DescribeFHIRExportJobResponse = {
    val __obj = js.Dynamic.literal(ExportJobProperties = ExportJobProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFHIRExportJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFHIRExportJobResponse] (val x: Self) extends AnyVal {
    
    inline def setExportJobProperties(value: ExportJobProperties): Self = StObject.set(x, "ExportJobProperties", value.asInstanceOf[js.Any])
  }
}
