package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.Block
  - typings.astTypes.namedTypesMod.namedTypes.Line
  - typings.astTypes.namedTypesMod.namedTypes.CommentBlock
  - typings.astTypes.namedTypesMod.namedTypes.CommentLine
*/
trait CommentKind extends StObject
object CommentKind {
  
  @scala.inline
  def Block(value: String): typings.astTypes.namedTypesMod.namedTypes.Block = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Block")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Block]
  }
  
  @scala.inline
  def CommentBlock(value: String): typings.astTypes.namedTypesMod.namedTypes.CommentBlock = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentBlock")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.CommentBlock]
  }
  
  @scala.inline
  def CommentLine(value: String): typings.astTypes.namedTypesMod.namedTypes.CommentLine = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentLine")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.CommentLine]
  }
  
  @scala.inline
  def Line(value: String): typings.astTypes.namedTypesMod.namedTypes.Line = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Line")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Line]
  }
}
