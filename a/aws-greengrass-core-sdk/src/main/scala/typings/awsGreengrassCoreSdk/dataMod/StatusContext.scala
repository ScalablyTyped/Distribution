package typings.awsGreengrassCoreSdk.dataMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusContext")
@js.native
open class StatusContext protected () extends StObject {
  /**
    * @param s3ExportTaskDefinition The task definition of an S3 upload task if the status is associated with it, ie, if the eventType = S3Task.
    * @param exportIdentifier The export identifier the status is associated with.
    * @param streamName The name of the stream the status is associated with.
    * @param sequenceNumber The sequence number of the message the status is associated with.
    */
  def this(
    s3ExportTaskDefinition: js.UndefOr[S3ExportTaskDefinition | Null],
    exportIdentifier: js.UndefOr[String | Null],
    streamName: js.UndefOr[String | Null],
    sequenceNumber: js.UndefOr[Double | Null]
  ) = this()
  
  def asMap(): StatusContextMap = js.native
  
  /**
    * The export identifier the status is associated with.
    * @returns
    */
  def exportIdentifier: String | Null = js.native
  /**
    * @param value The export identifier the status is associated with.
    */
  def exportIdentifier_=(value: String | Null): Unit = js.native
  
  /**
    * The task definition of an S3 upload task if the status is associated with it, ie, if the eventType = S3Task.
    * @returns
    */
  def s3ExportTaskDefinition: S3ExportTaskDefinition | Null = js.native
  /**
    * @param value The task definition of an S3 upload task if the status is associated with it, ie, if the eventType = S3Task.
    */
  def s3ExportTaskDefinition_=(value: S3ExportTaskDefinition | Null): Unit = js.native
  
  /**
    * The sequence number of the message the status is associated with.
    * @returns
    */
  def sequenceNumber: Double | Null = js.native
  /**
    * @param value The sequence number of the message the status is associated with.
    */
  def sequenceNumber_=(value: Double | Null): Unit = js.native
  
  /**
    * The name of the stream the status is associated with.
    * @returns
    */
  def streamName: String | Null = js.native
  /**
    * @param value The name of the stream the status is associated with.
    */
  def streamName_=(value: String | Null): Unit = js.native
  
  /**
    * @param value The export identifier the status is associated with.
    * @returns
    */
  def withExportIdentifier(): this.type = js.native
  def withExportIdentifier(value: String): this.type = js.native
  
  /**
    * @param value The task definition of an S3 upload task if the status is associated with it, ie, if the eventType = S3Task.
    * @returns
    */
  def withS3ExportTaskDefinition(): this.type = js.native
  def withS3ExportTaskDefinition(value: S3ExportTaskDefinition): this.type = js.native
  
  /**
    * @param value The sequence number of the message the status is associated with.
    * @returns
    */
  def withSequenceNumber(): this.type = js.native
  def withSequenceNumber(value: Double): this.type = js.native
  
  /**
    * @param value The name of the stream the status is associated with.
    * @returns
    */
  def withStreamName(): this.type = js.native
  def withStreamName(value: String): this.type = js.native
}
/* static members */
object StatusContext {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusContext")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusContext.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusContextMap): StatusContext = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[StatusContext]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusContext.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusContext.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
