package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.Block
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Block")
@js.native
object Block extends TopLevel[Type[Block]]

