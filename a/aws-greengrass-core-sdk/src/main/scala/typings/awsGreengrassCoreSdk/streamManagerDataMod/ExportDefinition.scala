package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "ExportDefinition")
@js.native
open class ExportDefinition protected () extends StObject {
  /**
    * @param http Defines how the stream is uploaded to an HTTP endpoint.
    * @param iotAnalytics Defines how the stream is uploaded to IoT Analytics.
    * @param kinesis Defines how the stream is uploaded to Kinesis.
    * @param IotSitewise Defines how the stream is uploaded to IoT SiteWise.
    * @param s3TaskExecutor Defines the list of configs for S3 task executors.
    */
  def this(
    http: js.UndefOr[js.Array[HTTPConfig] | Null],
    iotAnalytics: js.UndefOr[js.Array[IoTAnalyticsConfig] | Null],
    kinesis: js.UndefOr[js.Array[KinesisConfig] | Null],
    IotSitewise: js.UndefOr[js.Array[IoTSiteWiseConfig] | Null],
    s3TaskExecutor: js.UndefOr[js.Array[S3ExportTaskExecutorConfig] | Null]
  ) = this()
  
  /**
    * Defines how the stream is uploaded to IoT SiteWise.
    * @returns
    */
  def IotSitewise: js.Array[IoTSiteWiseConfig] | Null = js.native
  /**
    * @param value Defines how the stream is uploaded to IoT SiteWise.
    */
  def IotSitewise_=(value: js.Array[IoTSiteWiseConfig] | Null): Unit = js.native
  
  def asMap(): ExportDefinitionMap = js.native
  
  /**
    * Defines how the stream is uploaded to an HTTP endpoint.
    * @returns
    */
  def http: js.Array[HTTPConfig] | Null = js.native
  /**
    * @param value Defines how the stream is uploaded to an HTTP endpoint.
    */
  def http_=(value: js.Array[HTTPConfig] | Null): Unit = js.native
  
  /**
    * Defines how the stream is uploaded to IoT Analytics.
    * @returns
    */
  def iotAnalytics: js.Array[IoTAnalyticsConfig] | Null = js.native
  /**
    * @param value Defines how the stream is uploaded to IoT Analytics.
    */
  def iotAnalytics_=(value: js.Array[IoTAnalyticsConfig] | Null): Unit = js.native
  
  /**
    * Defines how the stream is uploaded to Kinesis.
    * @returns
    */
  def kinesis: js.Array[KinesisConfig] | Null = js.native
  /**
    * @param value Defines how the stream is uploaded to Kinesis.
    */
  def kinesis_=(value: js.Array[KinesisConfig] | Null): Unit = js.native
  
  /**
    * Defines the list of configs for S3 task executors.
    * @returns
    */
  def s3TaskExecutor: js.Array[S3ExportTaskExecutorConfig] | Null = js.native
  /**
    * @param value Defines the list of configs for S3 task executors.
    */
  def s3TaskExecutor_=(value: js.Array[S3ExportTaskExecutorConfig] | Null): Unit = js.native
  
  /**
    * @param value Defines how the stream is uploaded to an HTTP endpoint.
    * @returns
    */
  def withHttp(): this.type = js.native
  def withHttp(value: js.Array[HTTPConfig]): this.type = js.native
  
  /**
    * @param value Defines how the stream is uploaded to IoT Analytics.
    * @returns
    */
  def withIotAnalytics(): this.type = js.native
  def withIotAnalytics(value: js.Array[IoTAnalyticsConfig]): this.type = js.native
  
  /**
    * @param value Defines how the stream is uploaded to IoT SiteWise.
    * @returns
    */
  def withIotSitewise(): this.type = js.native
  def withIotSitewise(value: js.Array[IoTSiteWiseConfig]): this.type = js.native
  
  /**
    * @param value Defines how the stream is uploaded to Kinesis.
    * @returns
    */
  def withKinesis(): this.type = js.native
  def withKinesis(value: js.Array[KinesisConfig]): this.type = js.native
  
  /**
    * @param value Defines the list of configs for S3 task executors.
    * @returns
    */
  def withS3TaskExecutor(): this.type = js.native
  def withS3TaskExecutor(value: js.Array[S3ExportTaskExecutorConfig]): this.type = js.native
}
/* static members */
object ExportDefinition {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "ExportDefinition")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "ExportDefinition.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: ExportDefinitionMap): ExportDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[ExportDefinition]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "ExportDefinition.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "ExportDefinition.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
