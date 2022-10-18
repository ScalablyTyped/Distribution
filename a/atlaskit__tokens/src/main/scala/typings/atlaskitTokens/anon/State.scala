package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesArtifactsTypesInternalMod.InternalTokenIds
import typings.atlaskitTokens.distTypesTypesMod.Groups
import typings.atlaskitTokens.distTypesTypesMod.TokenState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State[Group /* <: Groups */] extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var group: Group
  
  var replacement: js.UndefOr[typings.atlaskitTokens.distTypesTypesMod.Replacement] = js.undefined
  
  var state: js.UndefOr[TokenState] = js.undefined
}
object State {
  
  inline def apply[Group /* <: Groups */](group: Group): State[Group] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[Group]]
  }
  
  extension [Self <: State[?], Group /* <: Groups */](x: Self & State[Group]) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: typings.atlaskitTokens.distTypesTypesMod.Replacement): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    
    inline def setReplacementVarargs(value: InternalTokenIds*): Self = StObject.set(x, "replacement", js.Array(value*))
    
    inline def setState(value: TokenState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
