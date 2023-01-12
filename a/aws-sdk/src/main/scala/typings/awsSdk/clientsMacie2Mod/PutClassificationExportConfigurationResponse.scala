package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutClassificationExportConfigurationResponse extends StObject {
  
  /**
    * The location where the data classification results are stored, and the encryption settings that are used when storing results in that location.
    */
  var configuration: js.UndefOr[ClassificationExportConfiguration] = js.undefined
}
object PutClassificationExportConfigurationResponse {
  
  inline def apply(): PutClassificationExportConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutClassificationExportConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutClassificationExportConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: ClassificationExportConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
  }
}
