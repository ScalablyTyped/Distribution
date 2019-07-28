package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishSchemaRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the development schema. For more information, see arns.
    */
  var DevelopmentSchemaArn: Arn
  /**
    * The minor version under which the schema will be published. This parameter is recommended. Schemas have both a major and minor version associated with them.
    */
  var MinorVersion: js.UndefOr[Version] = js.undefined
  /**
    * The new name under which the schema will be published. If this is not provided, the development schema is considered.
    */
  var Name: js.UndefOr[SchemaName] = js.undefined
  /**
    * The major version under which the schema will be published. Schemas have both a major and minor version associated with them.
    */
  var Version: typings.awsDashSdk.clientsClouddirectoryMod.Version
}

object PublishSchemaRequest {
  @scala.inline
  def apply(DevelopmentSchemaArn: Arn, Version: Version, MinorVersion: Version = null, Name: SchemaName = null): PublishSchemaRequest = {
    val __obj = js.Dynamic.literal(DevelopmentSchemaArn = DevelopmentSchemaArn, Version = Version)
    if (MinorVersion != null) __obj.updateDynamic("MinorVersion")(MinorVersion)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[PublishSchemaRequest]
  }
}

