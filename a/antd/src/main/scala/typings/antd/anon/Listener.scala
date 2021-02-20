package typings.antd.anon

import typings.std.MediaQueryList
import typings.std.MediaQueryListEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listener extends StObject {
  
  var listener: (js.ThisFunction1[/* this */ MediaQueryList, /* ev */ MediaQueryListEvent, _]) | Null = js.native
  
  var mql: MediaQueryList = js.native
}
object Listener {
  
  @scala.inline
  def apply(mql: MediaQueryList): Listener = {
    val __obj = js.Dynamic.literal(mql = mql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  implicit class ListenerMutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListener(value: js.ThisFunction1[/* this */ MediaQueryList, /* ev */ MediaQueryListEvent, _]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerNull: Self = StObject.set(x, "listener", null)
    
    @scala.inline
    def setMql(value: MediaQueryList): Self = StObject.set(x, "mql", value.asInstanceOf[js.Any])
  }
}
