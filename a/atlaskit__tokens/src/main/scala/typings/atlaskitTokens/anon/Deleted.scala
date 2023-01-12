package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deleted extends StObject {
  
  var deleted: Unit
  
  var deprecated: Unit
  
  var description: String
  
  var group: String
  
  var introduced: String
  
  var replacement: Unit
  
  var state: String
}
object Deleted {
  
  inline def apply(
    deleted: Unit,
    deprecated: Unit,
    description: String,
    group: String,
    introduced: String,
    replacement: Unit,
    state: String
  ): Deleted = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], introduced = introduced.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deleted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deleted] (val x: Self) extends AnyVal {
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeprecated(value: Unit): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIntroduced(value: String): Self = StObject.set(x, "introduced", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: Unit): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
