package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block
  extends StObject
     with Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  
  var `type`: typings.astTypes.astTypesStrings.Block
}
object Block {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.Block")
  @js.native
  val ^ : Type[Block] = js.native
  
  extension [Self <: Block](x: Self) {
    
    inline def setType(value: typings.astTypes.astTypesStrings.Block): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
