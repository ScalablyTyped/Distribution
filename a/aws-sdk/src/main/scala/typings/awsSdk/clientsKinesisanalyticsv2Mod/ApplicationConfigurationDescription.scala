package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationConfigurationDescription extends StObject {
  
  /**
    * The details about the application code for a Flink-based Kinesis Data Analytics application.
    */
  var ApplicationCodeConfigurationDescription: js.UndefOr[
    typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationCodeConfigurationDescription
  ] = js.undefined
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfigurationDescription: js.UndefOr[
    typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationSnapshotConfigurationDescription
  ] = js.undefined
  
  /**
    * Describes execution properties for a Flink-based Kinesis Data Analytics application.
    */
  var EnvironmentPropertyDescriptions: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.EnvironmentPropertyDescriptions] = js.undefined
  
  /**
    * The details about a Flink-based Kinesis Data Analytics application.
    */
  var FlinkApplicationConfigurationDescription: js.UndefOr[
    typings.awsSdk.clientsKinesisanalyticsv2Mod.FlinkApplicationConfigurationDescription
  ] = js.undefined
  
  /**
    * The details about the starting properties for a Kinesis Data Analytics application.
    */
  var RunConfigurationDescription: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.RunConfigurationDescription] = js.undefined
  
  /**
    * The details about inputs, outputs, and reference data sources for a SQL-based Kinesis Data Analytics application.
    */
  var SqlApplicationConfigurationDescription: js.UndefOr[
    typings.awsSdk.clientsKinesisanalyticsv2Mod.SqlApplicationConfigurationDescription
  ] = js.undefined
  
  /**
    * The array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurationDescriptions: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.VpcConfigurationDescriptions] = js.undefined
  
  /**
    * The configuration parameters for a Kinesis Data Analytics Studio notebook.
    */
  var ZeppelinApplicationConfigurationDescription: js.UndefOr[
    typings.awsSdk.clientsKinesisanalyticsv2Mod.ZeppelinApplicationConfigurationDescription
  ] = js.undefined
}
object ApplicationConfigurationDescription {
  
  inline def apply(): ApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationConfigurationDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationConfigurationDescription] (val x: Self) extends AnyVal {
    
    inline def setApplicationCodeConfigurationDescription(value: ApplicationCodeConfigurationDescription): Self = StObject.set(x, "ApplicationCodeConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationCodeConfigurationDescriptionUndefined: Self = StObject.set(x, "ApplicationCodeConfigurationDescription", js.undefined)
    
    inline def setApplicationSnapshotConfigurationDescription(value: ApplicationSnapshotConfigurationDescription): Self = StObject.set(x, "ApplicationSnapshotConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationSnapshotConfigurationDescriptionUndefined: Self = StObject.set(x, "ApplicationSnapshotConfigurationDescription", js.undefined)
    
    inline def setEnvironmentPropertyDescriptions(value: EnvironmentPropertyDescriptions): Self = StObject.set(x, "EnvironmentPropertyDescriptions", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentPropertyDescriptionsUndefined: Self = StObject.set(x, "EnvironmentPropertyDescriptions", js.undefined)
    
    inline def setFlinkApplicationConfigurationDescription(value: FlinkApplicationConfigurationDescription): Self = StObject.set(x, "FlinkApplicationConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setFlinkApplicationConfigurationDescriptionUndefined: Self = StObject.set(x, "FlinkApplicationConfigurationDescription", js.undefined)
    
    inline def setRunConfigurationDescription(value: RunConfigurationDescription): Self = StObject.set(x, "RunConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setRunConfigurationDescriptionUndefined: Self = StObject.set(x, "RunConfigurationDescription", js.undefined)
    
    inline def setSqlApplicationConfigurationDescription(value: SqlApplicationConfigurationDescription): Self = StObject.set(x, "SqlApplicationConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setSqlApplicationConfigurationDescriptionUndefined: Self = StObject.set(x, "SqlApplicationConfigurationDescription", js.undefined)
    
    inline def setVpcConfigurationDescriptions(value: VpcConfigurationDescriptions): Self = StObject.set(x, "VpcConfigurationDescriptions", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationDescriptionsUndefined: Self = StObject.set(x, "VpcConfigurationDescriptions", js.undefined)
    
    inline def setVpcConfigurationDescriptionsVarargs(value: VpcConfigurationDescription*): Self = StObject.set(x, "VpcConfigurationDescriptions", js.Array(value*))
    
    inline def setZeppelinApplicationConfigurationDescription(value: ZeppelinApplicationConfigurationDescription): Self = StObject.set(x, "ZeppelinApplicationConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setZeppelinApplicationConfigurationDescriptionUndefined: Self = StObject.set(x, "ZeppelinApplicationConfigurationDescription", js.undefined)
  }
}
