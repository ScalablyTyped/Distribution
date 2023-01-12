package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExplainabilityExportResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the export.
    */
  var ExplainabilityExportArn: js.UndefOr[Arn] = js.undefined
}
object CreateExplainabilityExportResponse {
  
  inline def apply(): CreateExplainabilityExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateExplainabilityExportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateExplainabilityExportResponse] (val x: Self) extends AnyVal {
    
    inline def setExplainabilityExportArn(value: Arn): Self = StObject.set(x, "ExplainabilityExportArn", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityExportArnUndefined: Self = StObject.set(x, "ExplainabilityExportArn", js.undefined)
  }
}
