package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportingConfig extends StObject {
  
  /**
    * The S3 location where Identity Resolution Jobs write result files.
    */
  var S3Exporting: js.UndefOr[S3ExportingConfig] = js.undefined
}
object ExportingConfig {
  
  inline def apply(): ExportingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingConfig]
  }
  
  extension [Self <: ExportingConfig](x: Self) {
    
    inline def setS3Exporting(value: S3ExportingConfig): Self = StObject.set(x, "S3Exporting", value.asInstanceOf[js.Any])
    
    inline def setS3ExportingUndefined: Self = StObject.set(x, "S3Exporting", js.undefined)
  }
}
