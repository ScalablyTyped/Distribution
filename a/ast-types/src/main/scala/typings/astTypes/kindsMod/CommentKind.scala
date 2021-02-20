package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def Block(`type`: typings.astTypes.astTypesStrings.Block, value: String): typings.astTypes.namedTypesMod.namedTypes.Block = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Block]
  }
  
  @scala.inline
  def CommentBlock(`type`: typings.astTypes.astTypesStrings.CommentBlock, value: String): typings.astTypes.namedTypesMod.namedTypes.CommentBlock = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.CommentBlock]
  }
  
  @scala.inline
  def CommentLine(`type`: typings.astTypes.astTypesStrings.CommentLine, value: String): typings.astTypes.namedTypesMod.namedTypes.CommentLine = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.CommentLine]
  }
  
  @scala.inline
  def Line(`type`: typings.astTypes.astTypesStrings.Line, value: String): typings.astTypes.namedTypesMod.namedTypes.Line = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Line]
  }
}
