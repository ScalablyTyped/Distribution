package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ObjectTypeCallPropertyKind
import typings.astDashTypes.genKindsMod.ObjectTypeIndexerKind
import typings.astDashTypes.genKindsMod.ObjectTypeInternalSlotKind
import typings.astDashTypes.genKindsMod.ObjectTypePropertyKind
import typings.astDashTypes.genKindsMod.ObjectTypeSpreadPropertyKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallProperties extends js.Object {
  var callProperties: js.UndefOr[js.Array[ObjectTypeCallPropertyKind]] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var indexers: js.UndefOr[js.Array[ObjectTypeIndexerKind]] = js.undefined
  var inexact: js.UndefOr[Boolean] = js.undefined
  var internalSlots: js.UndefOr[js.Array[ObjectTypeInternalSlotKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]
}

object Anon_CallProperties {
  @scala.inline
  def apply(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    callProperties: js.Array[ObjectTypeCallPropertyKind] = null,
    comments: js.Array[CommentKind] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    indexers: js.Array[ObjectTypeIndexerKind] = null,
    inexact: js.UndefOr[Boolean] = js.undefined,
    internalSlots: js.Array[ObjectTypeInternalSlotKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CallProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    if (callProperties != null) __obj.updateDynamic("callProperties")(callProperties.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (indexers != null) __obj.updateDynamic("indexers")(indexers.asInstanceOf[js.Any])
    if (!js.isUndefined(inexact)) __obj.updateDynamic("inexact")(inexact.asInstanceOf[js.Any])
    if (internalSlots != null) __obj.updateDynamic("internalSlots")(internalSlots.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CallProperties]
  }
}

