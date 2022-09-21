package typings.awsGreengrassCoreSdk.streamManagerMod

import typings.awsGreengrassCoreSdk.dataMod.S3ExportTaskExecutorConfigMap
import typings.awsGreengrassCoreSdk.dataMod.TypesMap
import typings.awsGreengrassCoreSdk.dataMod.ValidationsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager", "S3ExportTaskExecutorConfig")
@js.native
open class S3ExportTaskExecutorConfig protected ()
  extends typings.awsGreengrassCoreSdk.clientMod.S3ExportTaskExecutorConfig {
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
    statusConfig: js.UndefOr[typings.awsGreengrassCoreSdk.dataMod.StatusConfig | Null]
  ) = this()
}
/* static members */
object S3ExportTaskExecutorConfig {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "S3ExportTaskExecutorConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "S3ExportTaskExecutorConfig.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: S3ExportTaskExecutorConfigMap): typings.awsGreengrassCoreSdk.dataMod.S3ExportTaskExecutorConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.dataMod.S3ExportTaskExecutorConfig]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "S3ExportTaskExecutorConfig.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "S3ExportTaskExecutorConfig.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
