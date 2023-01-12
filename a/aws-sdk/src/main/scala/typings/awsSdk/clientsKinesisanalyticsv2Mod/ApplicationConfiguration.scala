package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationConfiguration extends StObject {
  
  /**
    * The code location and type parameters for a Flink-based Kinesis Data Analytics application.
    */
  var ApplicationCodeConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationCodeConfiguration] = js.undefined
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationSnapshotConfiguration] = js.undefined
  
  /**
    * Describes execution properties for a Flink-based Kinesis Data Analytics application.
    */
  var EnvironmentProperties: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.EnvironmentProperties] = js.undefined
  
  /**
    * The creation and update parameters for a Flink-based Kinesis Data Analytics application.
    */
  var FlinkApplicationConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.FlinkApplicationConfiguration] = js.undefined
  
  /**
    * The creation and update parameters for a SQL-based Kinesis Data Analytics application.
    */
  var SqlApplicationConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.SqlApplicationConfiguration] = js.undefined
  
  /**
    * The array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurations: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.VpcConfigurations] = js.undefined
  
  /**
    * The configuration parameters for a Kinesis Data Analytics Studio notebook.
    */
  var ZeppelinApplicationConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ZeppelinApplicationConfiguration] = js.undefined
}
object ApplicationConfiguration {
  
  inline def apply(): ApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setApplicationCodeConfiguration(value: ApplicationCodeConfiguration): Self = StObject.set(x, "ApplicationCodeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApplicationCodeConfigurationUndefined: Self = StObject.set(x, "ApplicationCodeConfiguration", js.undefined)
    
    inline def setApplicationSnapshotConfiguration(value: ApplicationSnapshotConfiguration): Self = StObject.set(x, "ApplicationSnapshotConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApplicationSnapshotConfigurationUndefined: Self = StObject.set(x, "ApplicationSnapshotConfiguration", js.undefined)
    
    inline def setEnvironmentProperties(value: EnvironmentProperties): Self = StObject.set(x, "EnvironmentProperties", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentPropertiesUndefined: Self = StObject.set(x, "EnvironmentProperties", js.undefined)
    
    inline def setFlinkApplicationConfiguration(value: FlinkApplicationConfiguration): Self = StObject.set(x, "FlinkApplicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFlinkApplicationConfigurationUndefined: Self = StObject.set(x, "FlinkApplicationConfiguration", js.undefined)
    
    inline def setSqlApplicationConfiguration(value: SqlApplicationConfiguration): Self = StObject.set(x, "SqlApplicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSqlApplicationConfigurationUndefined: Self = StObject.set(x, "SqlApplicationConfiguration", js.undefined)
    
    inline def setVpcConfigurations(value: VpcConfigurations): Self = StObject.set(x, "VpcConfigurations", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationsUndefined: Self = StObject.set(x, "VpcConfigurations", js.undefined)
    
    inline def setVpcConfigurationsVarargs(value: VpcConfiguration*): Self = StObject.set(x, "VpcConfigurations", js.Array(value*))
    
    inline def setZeppelinApplicationConfiguration(value: ZeppelinApplicationConfiguration): Self = StObject.set(x, "ZeppelinApplicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setZeppelinApplicationConfigurationUndefined: Self = StObject.set(x, "ZeppelinApplicationConfiguration", js.undefined)
  }
}
