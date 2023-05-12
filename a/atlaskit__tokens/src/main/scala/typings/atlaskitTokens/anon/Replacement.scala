package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesArtifactsTypesInternalMod.InternalTokenIds
import typings.atlaskitTokens.distTypesTypesMod.ExperimentalReplacement
import typings.atlaskitTokens.distTypesTypesMod.Groups
import typings.atlaskitTokens.distTypesTypesMod.TokenState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replacement[Group /* <: Groups */] extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var group: Group
  
  var replacement: js.UndefOr[typings.atlaskitTokens.distTypesTypesMod.Replacement | ExperimentalReplacement] = js.undefined
  
  var state: js.UndefOr[TokenState] = js.undefined
}
object Replacement {
  
  inline def apply[Group /* <: Groups */](group: Group): Replacement[Group] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacement[Group]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Replacement[?], Group /* <: Groups */] (val x: Self & Replacement[Group]) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: typings.atlaskitTokens.distTypesTypesMod.Replacement | ExperimentalReplacement): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    
    inline def setReplacementVarargs(value: InternalTokenIds*): Self = StObject.set(x, "replacement", js.Array(value*))
    
    inline def setState(value: TokenState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
