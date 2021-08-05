package typings.antd.anon

import typings.std.MediaQueryList
import typings.std.MediaQueryListEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listener extends StObject {
  
  var listener: (js.ThisFunction1[/* this */ MediaQueryList, /* ev */ MediaQueryListEvent, js.Any]) | Null
  
  var mql: MediaQueryList
}
object Listener {
  
  inline def apply(mql: MediaQueryList): Listener = {
    val __obj = js.Dynamic.literal(mql = mql.asInstanceOf[js.Any], listener = null)
    __obj.asInstanceOf[Listener]
  }
  
  extension [Self <: Listener](x: Self) {
    
    inline def setListener(value: js.ThisFunction1[/* this */ MediaQueryList, /* ev */ MediaQueryListEvent, js.Any]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    inline def setListenerNull: Self = StObject.set(x, "listener", null)
    
    inline def setMql(value: MediaQueryList): Self = StObject.set(x, "mql", value.asInstanceOf[js.Any])
  }
}
