package typings.actionsOnGoogle.actionssdkMod

import typings.actionsOnGoogle.incomingMod._IncomingMessage
import typings.actionsOnGoogle.listMod.ListOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk", "List")
@js.native
open class List protected ()
  extends typings.actionsOnGoogle.conversationMod.List
     with _IncomingMessage {
  /**
    * @param options List options
    * @public
    */
  def this(options: ListOptions) = this()
}
