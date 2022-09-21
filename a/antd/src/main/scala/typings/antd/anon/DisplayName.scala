package typings.antd.anon

import typings.antd.antdStrings.SHOW_CHILD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayName extends StObject {
  
  var SHOW_CHILD: typings.antd.antdStrings.SHOW_CHILD
  
  var SHOW_PARENT: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SHOW_PARENT */ Any
  
  var displayName: String
}
object DisplayName {
  
  inline def apply(
    SHOW_PARENT: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SHOW_PARENT */ Any,
    displayName: String
  ): DisplayName = {
    val __obj = js.Dynamic.literal(SHOW_CHILD = "SHOW_CHILD", SHOW_PARENT = SHOW_PARENT.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
  
  extension [Self <: DisplayName](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setSHOW_CHILD(value: SHOW_CHILD): Self = StObject.set(x, "SHOW_CHILD", value.asInstanceOf[js.Any])
    
    inline def setSHOW_PARENT(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SHOW_PARENT */ Any): Self = StObject.set(x, "SHOW_PARENT", value.asInstanceOf[js.Any])
  }
}
