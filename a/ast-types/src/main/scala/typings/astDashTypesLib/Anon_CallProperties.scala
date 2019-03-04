package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallProperties extends js.Object {
  var callProperties: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.ObjectTypeCallPropertyKind]] = js.undefined
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var indexers: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.ObjectTypeIndexerKind]] = js.undefined
  var inexact: js.UndefOr[scala.Boolean] = js.undefined
  var internalSlots: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.ObjectTypeInternalSlotKind]] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var properties: js.Array[
    astDashTypesLib.genKindsMod.ObjectTypePropertyKind | astDashTypesLib.genKindsMod.ObjectTypeSpreadPropertyKind
  ]
}

object Anon_CallProperties {
  @scala.inline
  def apply(
    properties: js.Array[
      astDashTypesLib.genKindsMod.ObjectTypePropertyKind | astDashTypesLib.genKindsMod.ObjectTypeSpreadPropertyKind
    ],
    callProperties: js.Array[astDashTypesLib.genKindsMod.ObjectTypeCallPropertyKind] = null,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    indexers: js.Array[astDashTypesLib.genKindsMod.ObjectTypeIndexerKind] = null,
    inexact: js.UndefOr[scala.Boolean] = js.undefined,
    internalSlots: js.Array[astDashTypesLib.genKindsMod.ObjectTypeInternalSlotKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CallProperties = {
    val __obj = js.Dynamic.literal(properties = properties)
    if (callProperties != null) __obj.updateDynamic("callProperties")(callProperties)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (indexers != null) __obj.updateDynamic("indexers")(indexers)
    if (!js.isUndefined(inexact)) __obj.updateDynamic("inexact")(inexact)
    if (internalSlots != null) __obj.updateDynamic("internalSlots")(internalSlots)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CallProperties]
  }
}

