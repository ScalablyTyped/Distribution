package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesArtifactsTypesInternalMod.InternalTokenIds
import typings.atlaskitTokens.distTypesTypesMod.ExperimentalReplacement
import typings.atlaskitTokens.distTypesTypesMod.ExperimentalTokenState
import typings.atlaskitTokens.distTypesTypesMod.Groups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionGroup[Group /* <: Groups */] extends StObject {
  
  var description: String
  
  var group: Group
  
  var introduced: String
  
  var replacement: js.UndefOr[ExperimentalReplacement] = js.undefined
  
  var state: ExperimentalTokenState
  
  var suggest: js.UndefOr[js.Array[String]] = js.undefined
}
object DescriptionGroup {
  
  inline def apply[Group /* <: Groups */](description: String, group: Group, introduced: String, state: ExperimentalTokenState): DescriptionGroup[Group] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], introduced = introduced.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionGroup[Group]]
  }
  
  extension [Self <: DescriptionGroup[?], Group /* <: Groups */](x: Self & DescriptionGroup[Group]) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIntroduced(value: String): Self = StObject.set(x, "introduced", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: ExperimentalReplacement): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    
    inline def setReplacementVarargs(value: InternalTokenIds*): Self = StObject.set(x, "replacement", js.Array(value*))
    
    inline def setState(value: ExperimentalTokenState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSuggest(value: js.Array[String]): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    
    inline def setSuggestVarargs(value: String*): Self = StObject.set(x, "suggest", js.Array(value*))
  }
}
