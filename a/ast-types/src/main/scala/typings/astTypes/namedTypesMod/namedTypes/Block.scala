package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typings.astTypes.astTypesStrings.Block
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Block")
@js.native
object Block extends TopLevel[Type[Block]]

