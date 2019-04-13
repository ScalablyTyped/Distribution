package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Facet extends js.Object {
  /**
    * There are two different styles that you can define on any given facet, Static and Dynamic. For static facets, all attributes must be defined in the schema. For dynamic facets, attributes can be defined during data plane operations.
    */
  var FacetStyle: js.UndefOr[FacetStyle] = js.undefined
  /**
    * The name of the Facet.
    */
  var Name: js.UndefOr[FacetName] = js.undefined
  /**
    * The object type that is associated with the facet. See CreateFacetRequest$ObjectType for more details.
    */
  var ObjectType: js.UndefOr[ObjectType] = js.undefined
}

object Facet {
  @scala.inline
  def apply(FacetStyle: FacetStyle = null, Name: FacetName = null, ObjectType: ObjectType = null): Facet = {
    val __obj = js.Dynamic.literal()
    if (FacetStyle != null) __obj.updateDynamic("FacetStyle")(FacetStyle.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ObjectType != null) __obj.updateDynamic("ObjectType")(ObjectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Facet]
  }
}

