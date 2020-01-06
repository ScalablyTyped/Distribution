package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentResponse extends js.Object {
  /**
    * The unique identifier for the application that the segment is associated with.
    */
  var ApplicationId: __string = js.native
  /**
    * The Amazon Resource Name (ARN) of the segment.
    */
  var Arn: __string = js.native
  /**
    * The date and time when the segment was created.
    */
  var CreationDate: __string = js.native
  /**
    * The dimension settings for the segment.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.native
  /**
    * The unique identifier for the segment.
    */
  var Id: __string = js.native
  /**
    * The settings for the import job that's associated with the segment.
    */
  var ImportDefinition: js.UndefOr[SegmentImportResource] = js.native
  /**
    * The date and time when the segment was last modified.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.native
  /**
    * The name of the segment.
    */
  var Name: js.UndefOr[__string] = js.native
  /**
    * A list of one or more segment groups that apply to the segment. Each segment group consists of zero or more base segments and the dimensions that are applied to those base segments.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.native
  /**
    * The segment type. Valid values are: DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is based on endpoint data that's reported by your app. Dynamic segments can change over time. IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based on endpoint definitions that you import from a file. Imported segments are static; they don't change over time.
    */
  var SegmentType: typings.awsDashSdk.clientsPinpointMod.SegmentType = js.native
  /**
    * The version number of the segment.
    */
  var Version: js.UndefOr[__integer] = js.native
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the segment. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.native
}

object SegmentResponse {
  @scala.inline
  def apply(
    ApplicationId: __string,
    Arn: __string,
    CreationDate: __string,
    Id: __string,
    SegmentType: SegmentType,
    Dimensions: SegmentDimensions = null,
    ImportDefinition: SegmentImportResource = null,
    LastModifiedDate: __string = null,
    Name: __string = null,
    SegmentGroups: SegmentGroupList = null,
    Version: Int | Double = null,
    tags: MapOf__string = null
  ): SegmentResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (ImportDefinition != null) __obj.updateDynamic("ImportDefinition")(ImportDefinition.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SegmentGroups != null) __obj.updateDynamic("SegmentGroups")(SegmentGroups.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentResponse]
  }
}

