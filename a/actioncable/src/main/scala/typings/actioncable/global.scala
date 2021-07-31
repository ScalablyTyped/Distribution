package typings.actioncable

import typings.actioncable.ActionCable.Cable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ActionCable {
    
    @JSGlobal("ActionCable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createConsumer(): Cable = ^.asInstanceOf[js.Dynamic].applyDynamic("createConsumer")().asInstanceOf[Cable]
    @scala.inline
    def createConsumer(url: String): Cable = ^.asInstanceOf[js.Dynamic].applyDynamic("createConsumer")(url.asInstanceOf[js.Any]).asInstanceOf[Cable]
  }
  
  @JSGlobal("App")
  @js.native
  def App: AppInterface = js.native
  @scala.inline
  def App_=(x: AppInterface): Unit = js.Dynamic.global.updateDynamic("App")(x.asInstanceOf[js.Any])
}
