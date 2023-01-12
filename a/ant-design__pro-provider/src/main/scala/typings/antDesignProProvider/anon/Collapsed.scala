package typings.antDesignProProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collapsed extends StObject {
  
  var collapsed: String
  
  var expand: String
  
  var inputPlaceholder: String
  
  var reset: String
  
  var search: String
  
  var selectPlaceholder: String
  
  var submit: String
}
object Collapsed {
  
  inline def apply(
    collapsed: String,
    expand: String,
    inputPlaceholder: String,
    reset: String,
    search: String,
    selectPlaceholder: String,
    submit: String
  ): Collapsed = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], inputPlaceholder = inputPlaceholder.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], selectPlaceholder = selectPlaceholder.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collapsed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collapsed] (val x: Self) extends AnyVal {
    
    inline def setCollapsed(value: String): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setInputPlaceholder(value: String): Self = StObject.set(x, "inputPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSelectPlaceholder(value: String): Self = StObject.set(x, "selectPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: String): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
  }
}
