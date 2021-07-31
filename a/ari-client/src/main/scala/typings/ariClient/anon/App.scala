package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var app: String | js.Array[String]
  
  var subscribeAll: js.UndefOr[Boolean] = js.undefined
}
object App {
  
  @scala.inline
  def apply(app: String | js.Array[String]): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String | js.Array[String]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVarargs(value: String*): Self = StObject.set(x, "app", js.Array(value :_*))
    
    @scala.inline
    def setSubscribeAll(value: Boolean): Self = StObject.set(x, "subscribeAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribeAllUndefined: Self = StObject.set(x, "subscribeAll", js.undefined)
  }
}
