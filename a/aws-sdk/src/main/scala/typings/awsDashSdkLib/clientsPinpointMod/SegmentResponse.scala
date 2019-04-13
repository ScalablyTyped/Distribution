package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentResponse extends js.Object {
  /**
    * The ID of the application that the segment applies to.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The arn for the segment.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The date and time when the segment was created.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * The segment dimensions attributes.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.undefined
  /**
    * The unique segment ID.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The import job settings.
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
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined
  /**
    * The segment type:
  DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by making a POST request to the segments resource.
  IMPORT - A static segment built from an imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a POST request to the jobs/import resource.
    */
  var SegmentType: js.UndefOr[SegmentType] = js.undefined
  /**
    * The segment version number.
    */
  var Version: js.UndefOr[__integer] = js.undefined
  /**
    * The Tags for the segment.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object SegmentResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    Arn: __string = null,
    CreationDate: __string = null,
    Dimensions: SegmentDimensions = null,
    Id: __string = null,
    ImportDefinition: SegmentImportResource = null,
    LastModifiedDate: __string = null,
    Name: __string = null,
    SegmentGroups: SegmentGroupList = null,
    SegmentType: SegmentType = null,
    Version: js.UndefOr[__integer] = js.undefined,
    tags: MapOf__string = null
  ): SegmentResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (ImportDefinition != null) __obj.updateDynamic("ImportDefinition")(ImportDefinition)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SegmentGroups != null) __obj.updateDynamic("SegmentGroups")(SegmentGroups)
    if (SegmentType != null) __obj.updateDynamic("SegmentType")(SegmentType.asInstanceOf[js.Any])
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[SegmentResponse]
  }
}

