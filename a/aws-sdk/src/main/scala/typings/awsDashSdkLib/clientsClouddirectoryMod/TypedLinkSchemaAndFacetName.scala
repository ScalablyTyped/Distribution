package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedLinkSchemaAndFacetName extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
  /**
    * The unique name of the typed link facet.
    */
  var TypedLinkName: awsDashSdkLib.clientsClouddirectoryMod.TypedLinkName
}

object TypedLinkSchemaAndFacetName {
  @scala.inline
  def apply(SchemaArn: Arn, TypedLinkName: TypedLinkName): TypedLinkSchemaAndFacetName = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn, TypedLinkName = TypedLinkName)
  
    __obj.asInstanceOf[TypedLinkSchemaAndFacetName]
  }
}

