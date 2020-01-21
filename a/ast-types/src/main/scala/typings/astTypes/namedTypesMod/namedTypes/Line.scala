package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typings.astTypes.astTypesStrings.Line
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Line")
@js.native
object Line extends TopLevel[Type[Line]]

