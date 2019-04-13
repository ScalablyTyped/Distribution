package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /**
    * Provides additional details about the resource.
    */
  var Details: js.UndefOr[ResourceDetails] = js.undefined
  /**
    * The canonical identifier for the given resource type.
    */
  var Id: NonEmptyString
  /**
    * The canonical AWS partition name to which the region is assigned.
    */
  var Partition: js.UndefOr[Partition] = js.undefined
  /**
    * The canonical AWS external region name where this resource is located.
    */
  var Region: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * A list of AWS tags associated with a resource at the time the finding was processed.
    */
  var Tags: js.UndefOr[FieldMap] = js.undefined
  /**
    * Specifies the type of the resource for which details are provided.
    */
  var Type: NonEmptyString
}

object Resource {
  @scala.inline
  def apply(
    Id: NonEmptyString,
    Type: NonEmptyString,
    Details: ResourceDetails = null,
    Partition: Partition = null,
    Region: NonEmptyString = null,
    Tags: FieldMap = null
  ): Resource = {
    val __obj = js.Dynamic.literal(Id = Id, Type = Type)
    if (Details != null) __obj.updateDynamic("Details")(Details)
    if (Partition != null) __obj.updateDynamic("Partition")(Partition.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[Resource]
  }
}

