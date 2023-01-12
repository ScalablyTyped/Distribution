package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetYargsCompletions extends StObject {
  
  var getYargsCompletions: Boolean
  
  var help: Boolean
  
  var jsonHelp: Boolean
}
object GetYargsCompletions {
  
  inline def apply(getYargsCompletions: Boolean, help: Boolean, jsonHelp: Boolean): GetYargsCompletions = {
    val __obj = js.Dynamic.literal(getYargsCompletions = getYargsCompletions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], jsonHelp = jsonHelp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetYargsCompletions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetYargsCompletions] (val x: Self) extends AnyVal {
    
    inline def setGetYargsCompletions(value: Boolean): Self = StObject.set(x, "getYargsCompletions", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setJsonHelp(value: Boolean): Self = StObject.set(x, "jsonHelp", value.asInstanceOf[js.Any])
  }
}
