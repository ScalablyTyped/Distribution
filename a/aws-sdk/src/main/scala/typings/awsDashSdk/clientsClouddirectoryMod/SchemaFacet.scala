package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFacet extends js.Object {
  /**
    * The name of the facet.
    */
  var FacetName: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.FacetName] = js.native
  /**
    * The ARN of the schema that contains the facet with no minor component. See arns and In-Place Schema Upgrade for a description of when to provide minor versions.
    */
  var SchemaArn: js.UndefOr[Arn] = js.native
}

object SchemaFacet {
  @scala.inline
  def apply(FacetName: FacetName = null, SchemaArn: Arn = null): SchemaFacet = {
    val __obj = js.Dynamic.literal()
    if (FacetName != null) __obj.updateDynamic("FacetName")(FacetName.asInstanceOf[js.Any])
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFacet]
  }
}

