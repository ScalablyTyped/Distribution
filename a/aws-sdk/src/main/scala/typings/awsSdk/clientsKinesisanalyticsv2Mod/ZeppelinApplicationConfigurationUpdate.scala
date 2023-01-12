package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZeppelinApplicationConfigurationUpdate extends StObject {
  
  /**
    * Updates to the configuration of the Amazon Glue Data Catalog that is associated with the Kinesis Data Analytics Studio notebook.
    */
  var CatalogConfigurationUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.CatalogConfigurationUpdate] = js.undefined
  
  /**
    * Updates to the customer artifacts. Custom artifacts are dependency JAR files and user-defined functions (UDF).
    */
  var CustomArtifactsConfigurationUpdate: js.UndefOr[CustomArtifactsConfigurationList] = js.undefined
  
  var DeployAsApplicationConfigurationUpdate: js.UndefOr[
    typings.awsSdk.clientsKinesisanalyticsv2Mod.DeployAsApplicationConfigurationUpdate
  ] = js.undefined
  
  /**
    * Updates to the monitoring configuration of a Kinesis Data Analytics Studio notebook.
    */
  var MonitoringConfigurationUpdate: js.UndefOr[ZeppelinMonitoringConfigurationUpdate] = js.undefined
}
object ZeppelinApplicationConfigurationUpdate {
  
  inline def apply(): ZeppelinApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeppelinApplicationConfigurationUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZeppelinApplicationConfigurationUpdate] (val x: Self) extends AnyVal {
    
    inline def setCatalogConfigurationUpdate(value: CatalogConfigurationUpdate): Self = StObject.set(x, "CatalogConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setCatalogConfigurationUpdateUndefined: Self = StObject.set(x, "CatalogConfigurationUpdate", js.undefined)
    
    inline def setCustomArtifactsConfigurationUpdate(value: CustomArtifactsConfigurationList): Self = StObject.set(x, "CustomArtifactsConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setCustomArtifactsConfigurationUpdateUndefined: Self = StObject.set(x, "CustomArtifactsConfigurationUpdate", js.undefined)
    
    inline def setCustomArtifactsConfigurationUpdateVarargs(value: CustomArtifactConfiguration*): Self = StObject.set(x, "CustomArtifactsConfigurationUpdate", js.Array(value*))
    
    inline def setDeployAsApplicationConfigurationUpdate(value: DeployAsApplicationConfigurationUpdate): Self = StObject.set(x, "DeployAsApplicationConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setDeployAsApplicationConfigurationUpdateUndefined: Self = StObject.set(x, "DeployAsApplicationConfigurationUpdate", js.undefined)
    
    inline def setMonitoringConfigurationUpdate(value: ZeppelinMonitoringConfigurationUpdate): Self = StObject.set(x, "MonitoringConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setMonitoringConfigurationUpdateUndefined: Self = StObject.set(x, "MonitoringConfigurationUpdate", js.undefined)
  }
}
