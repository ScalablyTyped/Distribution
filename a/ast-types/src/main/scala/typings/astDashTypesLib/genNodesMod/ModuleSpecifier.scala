package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleSpecifier extends Node {
  var id: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null
  var local: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null
  var name: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null
}

object ModuleSpecifier {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    id: astDashTypesLib.genKindsMod.IdentifierKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    local: astDashTypesLib.genKindsMod.IdentifierKind = null,
    name: astDashTypesLib.genKindsMod.IdentifierKind = null
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (local != null) __obj.updateDynamic("local")(local)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ModuleSpecifier]
  }
}

