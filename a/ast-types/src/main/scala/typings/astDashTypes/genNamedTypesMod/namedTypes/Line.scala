package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.Line
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Line")
@js.native
object Line extends TopLevel[Type[Line]]

