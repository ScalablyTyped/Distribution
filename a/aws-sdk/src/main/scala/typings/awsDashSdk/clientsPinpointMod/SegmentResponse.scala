package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentResponse extends js.Object {
  /**
    * The unique identifier for the application that the segment is associated with.
    */
  var ApplicationId: __string
  /**
    * The Amazon Resource Name (ARN) of the segment.
    */
  var Arn: __string
  /**
    * The date and time when the segment was created.
    */
  var CreationDate: __string
  /**
    * The dimension settings for the segment.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.undefined
  /**
    * The unique identifier for the segment.
    */
  var Id: __string
  /**
    * The settings for the import job that's associated with the segment.
    */
  var ImportDefinition: js.UndefOr[SegmentImportResource] = js.undefined
  /**
    * The date and time when the segment was last modified.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The name of the segment.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * A list of one or more segment groups that apply to the segment. Each segment group consists of zero or more base segments and the dimensions that are applied to those base segments.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined
  /**
    * The segment type. Valid values are: DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is based on endpoint data that's reported by your app. Dynamic segments can change over time. IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based on endpoint definitions that you import from a file. Imported segments are static; they don't change over time.
    */
  var SegmentType: typings.awsDashSdk.clientsPinpointMod.SegmentType
  /**
    * The version number of the segment.
    */
  var Version: js.UndefOr[__integer] = js.undefined
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the segment. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
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
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, Arn = Arn, CreationDate = CreationDate, Id = Id, SegmentType = SegmentType.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (ImportDefinition != null) __obj.updateDynamic("ImportDefinition")(ImportDefinition)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SegmentGroups != null) __obj.updateDynamic("SegmentGroups")(SegmentGroups)
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[SegmentResponse]
  }
}

