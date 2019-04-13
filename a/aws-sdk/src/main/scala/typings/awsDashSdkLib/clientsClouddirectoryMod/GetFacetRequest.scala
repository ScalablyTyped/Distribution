package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFacetRequest extends js.Object {
  /**
    * The name of the facet to retrieve.
    */
  var Name: FacetName
  /**
    * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
    */
  var SchemaArn: Arn
}

object GetFacetRequest {
  @scala.inline
  def apply(Name: FacetName, SchemaArn: Arn): GetFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name, SchemaArn = SchemaArn)
  
    __obj.asInstanceOf[GetFacetRequest]
  }
}

