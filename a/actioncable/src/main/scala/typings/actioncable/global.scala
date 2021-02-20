package typings.actioncable

import typings.actioncable.ActionCable.Cable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ActionCable {
    
    @JSGlobal("ActionCable.createConsumer")
    @js.native
    def createConsumer(): Cable = js.native
    @JSGlobal("ActionCable.createConsumer")
    @js.native
    def createConsumer(url: String): Cable = js.native
  }
  
  @JSGlobal("App")
  @js.native
  def App: AppInterface = js.native
  @scala.inline
  def App_=(x: AppInterface): Unit = js.Dynamic.global.updateDynamic("App")(x.asInstanceOf[js.Any])
}
