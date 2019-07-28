package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeKey extends js.Object {
  /**
    * The name of the facet that the attribute exists within.
    */
  var FacetName: typings.awsDashSdk.clientsClouddirectoryMod.FacetName
  /**
    * The name of the attribute.
    */
  var Name: AttributeName
  /**
    * The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
    */
  var SchemaArn: Arn
}

object AttributeKey {
  @scala.inline
  def apply(FacetName: FacetName, Name: AttributeName, SchemaArn: Arn): AttributeKey = {
    val __obj = js.Dynamic.literal(FacetName = FacetName, Name = Name, SchemaArn = SchemaArn)
  
    __obj.asInstanceOf[AttributeKey]
  }
}

