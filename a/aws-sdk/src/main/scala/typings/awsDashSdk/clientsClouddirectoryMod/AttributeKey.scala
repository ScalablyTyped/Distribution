package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeKey extends js.Object {
  /**
    * The name of the facet that the attribute exists within.
    */
  var FacetName: typings.awsDashSdk.clientsClouddirectoryMod.FacetName = js.native
  /**
    * The name of the attribute.
    */
  var Name: AttributeName = js.native
  /**
    * The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
    */
  var SchemaArn: Arn = js.native
}

object AttributeKey {
  @scala.inline
  def apply(FacetName: FacetName, Name: AttributeName, SchemaArn: Arn): AttributeKey = {
    val __obj = js.Dynamic.literal(FacetName = FacetName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttributeKey]
  }
}

