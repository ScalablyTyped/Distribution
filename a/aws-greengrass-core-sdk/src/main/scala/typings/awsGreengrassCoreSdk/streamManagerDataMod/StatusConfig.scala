package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusConfig")
@js.native
/**
  * @param statusLevel Defines the verbosity of status messages in a status-stream.
  * @param statusStreamName The name of the stream to which status messages are appended.
  * The status-stream should be created before associating it with another stream.
  */
open class StatusConfig () extends StObject {
  def this(statusLevel: StatusLevel) = this()
  def this(statusLevel: Null, statusStreamName: String) = this()
  def this(statusLevel: Unit, statusStreamName: String) = this()
  def this(statusLevel: StatusLevel, statusStreamName: String) = this()
  
  def asMap(): StatusConfigMap = js.native
  
  /**
    * Defines the verbosity of status messages in a status-stream.
    * @returns
    */
  def statusLevel: StatusLevel | Null = js.native
  /**
    * @param value Defines the verbosity of status messages in a status-stream.
    */
  def statusLevel_=(value: StatusLevel | Null): Unit = js.native
  
  /**
    * The name of the stream to which status messages are appended.
    * The status-stream should be created before associating it with another stream.
    * @returns
    */
  def statusStreamName: String | Null = js.native
  /**
    * @param value The name of the stream to which status messages are appended.
    * The status-stream should be created before associating it with another stream.
    */
  def statusStreamName_=(value: String | Null): Unit = js.native
  
  /**
    * @param value Defines the verbosity of status messages in a status-stream.
    * @returns
    */
  def withStatusLevel(): StatusConfig = js.native
  def withStatusLevel(value: StatusLevel): StatusConfig = js.native
  
  /**
    * @param value The name of the stream to which status messages are appended.
    * The status-stream should be created before associating it with another stream.
    * @returns
    */
  def withStatusStreamName(): StatusConfig = js.native
  def withStatusStreamName(value: String): StatusConfig = js.native
}
/* static members */
object StatusConfig {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusConfig.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusConfigMap): StatusConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[StatusConfig]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusConfig.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusConfig.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
