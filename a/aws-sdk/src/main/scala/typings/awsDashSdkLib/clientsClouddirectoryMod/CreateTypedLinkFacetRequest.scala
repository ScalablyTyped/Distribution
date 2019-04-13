package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTypedLinkFacetRequest extends js.Object {
  /**
    *  Facet structure that is associated with the typed link facet.
    */
  var Facet: TypedLinkFacet
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
}

object CreateTypedLinkFacetRequest {
  @scala.inline
  def apply(Facet: TypedLinkFacet, SchemaArn: Arn): CreateTypedLinkFacetRequest = {
    val __obj = js.Dynamic.literal(Facet = Facet, SchemaArn = SchemaArn)
  
    __obj.asInstanceOf[CreateTypedLinkFacetRequest]
  }
}

