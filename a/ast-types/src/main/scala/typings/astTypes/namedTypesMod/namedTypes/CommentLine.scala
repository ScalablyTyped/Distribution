package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentLine
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  
  var `type`: typings.astTypes.astTypesStrings.CommentLine = js.native
}
object CommentLine {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.CommentLine")
  @js.native
  val ^ : Type[CommentLine] = js.native
  
  @scala.inline
  implicit class CommentLineMutableBuilder[Self <: CommentLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.CommentLine): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
