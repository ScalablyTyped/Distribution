package typings.awsGreengrassCoreSdk.clientMod

import typings.awsGreengrassCoreSdk.dataMod.ExportDefinitionMap
import typings.awsGreengrassCoreSdk.dataMod.TypesMap
import typings.awsGreengrassCoreSdk.dataMod.ValidationsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/client", "ExportDefinition")
@js.native
open class ExportDefinition protected ()
  extends typings.awsGreengrassCoreSdk.dataMod.ExportDefinition {
  /**
    * @param http Defines how the stream is uploaded to an HTTP endpoint.
    * @param iotAnalytics Defines how the stream is uploaded to IoT Analytics.
    * @param kinesis Defines how the stream is uploaded to Kinesis.
    * @param IotSitewise Defines how the stream is uploaded to IoT SiteWise.
    * @param s3TaskExecutor Defines the list of configs for S3 task executors.
    */
  def this(
    http: js.UndefOr[js.Array[typings.awsGreengrassCoreSdk.dataMod.HTTPConfig] | Null],
    iotAnalytics: js.UndefOr[js.Array[typings.awsGreengrassCoreSdk.dataMod.IoTAnalyticsConfig] | Null],
    kinesis: js.UndefOr[js.Array[typings.awsGreengrassCoreSdk.dataMod.KinesisConfig] | Null],
    IotSitewise: js.UndefOr[js.Array[typings.awsGreengrassCoreSdk.dataMod.IoTSiteWiseConfig] | Null],
    s3TaskExecutor: js.UndefOr[js.Array[typings.awsGreengrassCoreSdk.dataMod.S3ExportTaskExecutorConfig] | Null]
  ) = this()
}
/* static members */
object ExportDefinition {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "ExportDefinition")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "ExportDefinition.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: ExportDefinitionMap): typings.awsGreengrassCoreSdk.dataMod.ExportDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.dataMod.ExportDefinition]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "ExportDefinition.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "ExportDefinition.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
