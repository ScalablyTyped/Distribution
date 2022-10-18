package typings.awsGreengrassCoreSdk.streamManagerMod

import typings.awsGreengrassCoreSdk.streamManagerDataMod.S3ExportTaskDefinitionMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager", "S3ExportTaskDefinition")
@js.native
open class S3ExportTaskDefinition protected ()
  extends typings.awsGreengrassCoreSdk.streamManagerClientMod.S3ExportTaskDefinition {
  /**
    * @param inputUrl The URL of the file that contains the data to upload. The file should be local on the disk.
    * @param bucket The name of the S3 bucket that this file should be uploaded to.
    * @param key The key for the S3 object that this file should be uploaded to. The string can have placeholder expressions which are
    * resolved at upload time. Valid expressions are strings that are valid Java DateTimeFormatter strings.
    * See https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
    * Example: myKeyNamePrefix/!{timestamp:yyyy/MM/dd}/myKeyNameSuffix.
    * @param userMetadata User metadata. For key of a user metadata, callers should not include the internal "x-amz-meta-"
    * prefix. Keys are case insensitive and will appear as lowercase strings on S3, even if they were originally
    * specified with uppercase strings. Reserved key names start with "$aws-gg-" prefix.
    */
  def this(
    inputUrl: js.UndefOr[String | Null],
    bucket: js.UndefOr[String | Null],
    key: js.UndefOr[String | Null],
    userMetadata: js.UndefOr[(Record[String, Any]) | Null]
  ) = this()
}
/* static members */
object S3ExportTaskDefinition {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "S3ExportTaskDefinition")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromMap(d: S3ExportTaskDefinitionMap): typings.awsGreengrassCoreSdk.streamManagerDataMod.S3ExportTaskDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.streamManagerDataMod.S3ExportTaskDefinition]
}
