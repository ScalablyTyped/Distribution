package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesArtifactsTypesInternalMod.InternalTokenIds
import typings.atlaskitTokens.distTypesTypesMod.DeletedTokenState
import typings.atlaskitTokens.distTypesTypesMod.Groups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replacement[Group /* <: Groups */] extends StObject {
  
  var deleted: String
  
  var deprecated: String
  
  var description: String
  
  var group: Group
  
  var introduced: String
  
  var replacement: js.UndefOr[typings.atlaskitTokens.distTypesTypesMod.Replacement] = js.undefined
  
  var state: DeletedTokenState
}
object Replacement {
  
  inline def apply[Group /* <: Groups */](
    deleted: String,
    deprecated: String,
    description: String,
    group: Group,
    introduced: String,
    state: DeletedTokenState
  ): Replacement[Group] = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], introduced = introduced.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacement[Group]]
  }
  
  extension [Self <: Replacement[?], Group /* <: Groups */](x: Self & Replacement[Group]) {
    
    inline def setDeleted(value: String): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIntroduced(value: String): Self = StObject.set(x, "introduced", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: typings.atlaskitTokens.distTypesTypesMod.Replacement): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    
    inline def setReplacementVarargs(value: InternalTokenIds*): Self = StObject.set(x, "replacement", js.Array(value*))
    
    inline def setState(value: DeletedTokenState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
