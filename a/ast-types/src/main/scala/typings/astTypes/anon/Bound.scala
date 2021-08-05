package typings.astTypes.anon

import typings.astTypes.astTypesStrings.minus
import typings.astTypes.astTypesStrings.plus
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.kindsMod.VarianceKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bound extends StObject {
  
  var default: js.UndefOr[FlowTypeKind | Null] = js.undefined
  
  var bound: js.UndefOr[TypeAnnotationKind | Null] = js.undefined
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var name: String
  
  var variance: js.UndefOr[VarianceKind | plus | minus | Null] = js.undefined
}
object Bound {
  
  inline def apply(name: String): Bound = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bound]
  }
  
  extension [Self <: Bound](x: Self) {
    
    inline def setBound(value: TypeAnnotationKind): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
    
    inline def setBoundNull: Self = StObject.set(x, "bound", null)
    
    inline def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setDefault(value: FlowTypeKind): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVariance(value: VarianceKind | plus | minus): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceNull: Self = StObject.set(x, "variance", null)
    
    inline def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
