package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFacetRequest extends js.Object {
  /**
    * The name of the facet to delete.
    */
  var Name: FacetName
  /**
    * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
    */
  var SchemaArn: Arn
}

object DeleteFacetRequest {
  @scala.inline
  def apply(Name: FacetName, SchemaArn: Arn): DeleteFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name, SchemaArn = SchemaArn)
  
    __obj.asInstanceOf[DeleteFacetRequest]
  }
}

