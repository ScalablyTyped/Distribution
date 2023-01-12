package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deprecated extends StObject {
  
  var deleted: String
  
  var deprecated: String
  
  var description: String
  
  var group: String
  
  var introduced: String
  
  var replacement: String
  
  var state: String
}
object Deprecated {
  
  inline def apply(
    deleted: String,
    deprecated: String,
    description: String,
    group: String,
    introduced: String,
    replacement: String,
    state: String
  ): Deprecated = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], introduced = introduced.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deprecated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deprecated] (val x: Self) extends AnyVal {
    
    inline def setDeleted(value: String): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIntroduced(value: String): Self = StObject.set(x, "introduced", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
