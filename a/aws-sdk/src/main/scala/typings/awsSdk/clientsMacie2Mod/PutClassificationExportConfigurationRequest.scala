package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutClassificationExportConfigurationRequest extends StObject {
  
  /**
    * The location to store data classification results in, and the encryption settings to use when storing results in that location.
    */
  var configuration: ClassificationExportConfiguration
}
object PutClassificationExportConfigurationRequest {
  
  inline def apply(configuration: ClassificationExportConfiguration): PutClassificationExportConfigurationRequest = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutClassificationExportConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutClassificationExportConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: ClassificationExportConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
  }
}
