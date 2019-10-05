package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentLine
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.CommentLine
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.CommentLine")
@js.native
object CommentLine extends TopLevel[Type[CommentLine]]

