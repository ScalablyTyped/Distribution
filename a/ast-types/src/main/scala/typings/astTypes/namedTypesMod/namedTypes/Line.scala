package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line
  extends StObject
     with Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  
  var `type`: typings.astTypes.astTypesStrings.Line
}
object Line {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.Line")
  @js.native
  val ^ : Type[Line] = js.native
  
  extension [Self <: Line](x: Self) {
    
    inline def setType(value: typings.astTypes.astTypesStrings.Line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
