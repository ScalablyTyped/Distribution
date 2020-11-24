package typings.actioncable

import typings.actioncable.ActionCable.Cable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var App: AppInterface = js.native
  
  @js.native
  object ActionCable extends js.Object {
    
    def createConsumer(): Cable = js.native
    def createConsumer(url: String): Cable = js.native
  }
}
