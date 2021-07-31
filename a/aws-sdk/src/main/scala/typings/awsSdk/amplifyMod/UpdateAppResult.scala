package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppResult extends StObject {
  
  /**
    *  Represents the updated Amplify app. 
    */
  var app: App
}
object UpdateAppResult {
  
  @scala.inline
  def apply(app: App): UpdateAppResult = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppResult]
  }
  
  @scala.inline
  implicit class UpdateAppResultMutableBuilder[Self <: UpdateAppResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
  }
}
