package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentBlock
  extends StObject
     with Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  
  var `type`: typings.astTypes.astTypesStrings.CommentBlock
}
object CommentBlock {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.CommentBlock")
  @js.native
  val ^ : Type[CommentBlock] = js.native
  
  extension [Self <: CommentBlock](x: Self) {
    
    inline def setType(value: typings.astTypes.astTypesStrings.CommentBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
