package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppString extends StObject {
  
  var app: String
  
  var appArgs: js.UndefOr[String] = js.undefined
}
object AppString {
  
  @scala.inline
  def apply(app: String): AppString = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppString]
  }
  
  @scala.inline
  implicit class AppStringMutableBuilder[Self <: AppString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArgs(value: String): Self = StObject.set(x, "appArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArgsUndefined: Self = StObject.set(x, "appArgs", js.undefined)
  }
}
