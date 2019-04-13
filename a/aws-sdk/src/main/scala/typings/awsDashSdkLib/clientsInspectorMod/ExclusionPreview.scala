package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExclusionPreview extends js.Object {
  /**
    * The system-defined attributes for the exclusion preview.
    */
  var attributes: js.UndefOr[AttributeList] = js.undefined
  /**
    * The description of the exclusion preview.
    */
  var description: Text
  /**
    * The recommendation for the exclusion preview.
    */
  var recommendation: Text
  /**
    * The AWS resources for which the exclusion preview pertains.
    */
  var scopes: ScopeList
  /**
    * The name of the exclusion preview.
    */
  var title: Text
}

object ExclusionPreview {
  @scala.inline
  def apply(
    description: Text,
    recommendation: Text,
    scopes: ScopeList,
    title: Text,
    attributes: AttributeList = null
  ): ExclusionPreview = {
    val __obj = js.Dynamic.literal(description = description, recommendation = recommendation, scopes = scopes, title = title)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[ExclusionPreview]
  }
}

