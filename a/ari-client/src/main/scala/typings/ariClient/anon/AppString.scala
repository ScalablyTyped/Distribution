package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppString extends StObject {
  
  var app: String
  
  var appArgs: js.UndefOr[String] = js.undefined
}
object AppString {
  
  inline def apply(app: String): AppString = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppString] (val x: Self) extends AnyVal {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppArgs(value: String): Self = StObject.set(x, "appArgs", value.asInstanceOf[js.Any])
    
    inline def setAppArgsUndefined: Self = StObject.set(x, "appArgs", js.undefined)
  }
}
