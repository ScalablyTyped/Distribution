package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunConfigurationDescription extends StObject {
  
  /**
    * Describes the restore behavior of a restarting application.
    */
  var ApplicationRestoreConfigurationDescription: js.UndefOr[ApplicationRestoreConfiguration] = js.undefined
  
  var FlinkRunConfigurationDescription: js.UndefOr[FlinkRunConfiguration] = js.undefined
}
object RunConfigurationDescription {
  
  inline def apply(): RunConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunConfigurationDescription]
  }
  
  extension [Self <: RunConfigurationDescription](x: Self) {
    
    inline def setApplicationRestoreConfigurationDescription(value: ApplicationRestoreConfiguration): Self = StObject.set(x, "ApplicationRestoreConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationRestoreConfigurationDescriptionUndefined: Self = StObject.set(x, "ApplicationRestoreConfigurationDescription", js.undefined)
    
    inline def setFlinkRunConfigurationDescription(value: FlinkRunConfiguration): Self = StObject.set(x, "FlinkRunConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setFlinkRunConfigurationDescriptionUndefined: Self = StObject.set(x, "FlinkRunConfigurationDescription", js.undefined)
  }
}
