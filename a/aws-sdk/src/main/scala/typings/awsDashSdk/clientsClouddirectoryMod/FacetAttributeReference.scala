package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetAttributeReference extends js.Object {
  /**
    * The target attribute name that is associated with the facet reference. See Attribute References for more information.
    */
  var TargetAttributeName: AttributeName
  /**
    * The target facet name that is associated with the facet reference. See Attribute References for more information.
    */
  var TargetFacetName: FacetName
}

object FacetAttributeReference {
  @scala.inline
  def apply(TargetAttributeName: AttributeName, TargetFacetName: FacetName): FacetAttributeReference = {
    val __obj = js.Dynamic.literal(TargetAttributeName = TargetAttributeName, TargetFacetName = TargetFacetName)
  
    __obj.asInstanceOf[FacetAttributeReference]
  }
}

