package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "S3ExportTaskExecutorConfig")
@js.native
open class S3ExportTaskExecutorConfig protected () extends StObject {
  /**
    * @param identifier A unique identifier to identify this individual upload task.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    * @param sizeThresholdForMultipartUploadBytes The size threshold in bytes for when to use multipart uploads.
    * Uploads over this size will automatically use a multipart upload strategy, while uploads equal or smaller than this threshold will use a single connection to upload the whole object.
    * @param priority Priority for this upload task. Lower values are higher priority. If not specified it will have the lowest priority.
    * @param disabled Enable or disable this export. Default is false.
    * @param statusConfig Event status configuration that specifies the target status stream and verbosity.
    */
  def this(
    identifier: js.UndefOr[String | Null],
    sizeThresholdForMultipartUploadBytes: js.UndefOr[Double | Null],
    priority: js.UndefOr[Double | Null],
    disabled: js.UndefOr[Boolean | Null],
    statusConfig: js.UndefOr[StatusConfig | Null]
  ) = this()
  
  def asMap(): S3ExportTaskDefinitionMap = js.native
  
  /**
    * Enable or disable this export. Default is false.
    * @returns
    */
  def disabled: Boolean | Null = js.native
  /**
    * @param value Enable or disable this export. Default is false.
    */
  def disabled_=(value: Boolean | Null): Unit = js.native
  
  /**
    * A unique identifier to identify this individual upload task.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    * @returns
    */
  def identifier: String | Null = js.native
  /**
    * @param value A unique identifier to identify this individual upload task.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    */
  def identifier_=(value: String | Null): Unit = js.native
  
  /**
    * Priority for this upload task. Lower values are higher priority. If not specified it will have the lowest priority.
    * @returns
    */
  def priority: Double | Null = js.native
  /**
    * @param value Priority for this upload task. Lower values are higher priority. If not specified it will have the lowest priority.
    */
  def priority_=(value: Double | Null): Unit = js.native
  
  /**
    * The size threshold in bytes for when to use multipart uploads.
    * Uploads over this size will automatically use a multipart upload strategy, while uploads equal or smaller than this threshold will use a single connection to upload the whole object.
    * @returns
    */
  def sizeThresholdForMultipartUploadBytes: Double | Null = js.native
  /**
    * @param value The size threshold in bytes for when to use multipart uploads.
    * Uploads over this size will automatically use a multipart upload strategy, while uploads equal or smaller than this threshold will use a single connection to upload the whole object.
    */
  def sizeThresholdForMultipartUploadBytes_=(value: Double | Null): Unit = js.native
  
  /**
    * Event status configuration that specifies the target status stream and verbosity.
    * @returns
    */
  def statusConfig: StatusConfig | Null = js.native
  /**
    * @param value Event status configuration that specifies the target status stream and verbosity.
    */
  def statusConfig_=(value: StatusConfig | Null): Unit = js.native
  
  /**
    * @param value Enable or disable this export. Default is false.
    * @returns
    */
  def withDisabled(): this.type = js.native
  def withDisabled(value: Boolean): this.type = js.native
  
  /**
    * @param value A unique identifier to identify this individual upload task.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    * @returns
    */
  def withIdentifier(): this.type = js.native
  def withIdentifier(value: String): this.type = js.native
  
  /**
    * @param value Priority for this upload task. Lower values are higher priority. If not specified it will have the lowest priority.
    * @returns
    */
  def withPriority(): this.type = js.native
  def withPriority(value: Double): this.type = js.native
  
  /**
    * @param value The size threshold in bytes for when to use multipart uploads.
    * Uploads over this size will automatically use a multipart upload strategy, while uploads equal or smaller than this threshold will use a single connection to upload the whole object.
    * @returns
    */
  def withSizeThresholdForMultipartUploadBytes(): this.type = js.native
  def withSizeThresholdForMultipartUploadBytes(value: Double): this.type = js.native
  
  /**
    * @param value Event status configuration that specifies the target status stream and verbosity.
    * @returns
    */
  def withStatusConfig(): this.type = js.native
  def withStatusConfig(value: StatusConfig): this.type = js.native
}
/* static members */
object S3ExportTaskExecutorConfig {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "S3ExportTaskExecutorConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "S3ExportTaskExecutorConfig.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: S3ExportTaskExecutorConfigMap): S3ExportTaskExecutorConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[S3ExportTaskExecutorConfig]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "S3ExportTaskExecutorConfig.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "S3ExportTaskExecutorConfig.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
