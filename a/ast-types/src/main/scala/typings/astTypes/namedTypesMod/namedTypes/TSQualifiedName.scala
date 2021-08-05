package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait TSQualifiedName
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var left: IdentifierKind | TSQualifiedNameKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var right: IdentifierKind | TSQualifiedNameKind
  
  var `type`: typings.astTypes.astTypesStrings.TSQualifiedName
}
object TSQualifiedName {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSQualifiedName")
  @js.native
  val ^ : Type[TSQualifiedName] = js.native
  
  extension [Self <: TSQualifiedName](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setLeft(value: IdentifierKind | TSQualifiedNameKind): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setRight(value: IdentifierKind | TSQualifiedNameKind): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.astTypes.astTypesStrings.TSQualifiedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
