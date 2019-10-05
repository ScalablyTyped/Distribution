package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentBlock
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.CommentBlock
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.CommentBlock")
@js.native
object CommentBlock extends TopLevel[Type[CommentBlock]]

