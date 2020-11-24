package typings.actionsOnGoogle

import typings.actionsOnGoogle.basicMod.BasicCardOptions
import typings.actionsOnGoogle.buttonMod.ButtonOptions
import typings.actionsOnGoogle.richMod._RichResponseItem
import typings.actionsOnGoogle.tableMod.TableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", JSImport.Namespace)
@js.native
object cardMod extends js.Object {
  
  @js.native
  class BasicCard protected ()
    extends typings.actionsOnGoogle.basicMod.BasicCard
       with _RichResponseItem {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @js.native
  class Button protected ()
    extends typings.actionsOnGoogle.buttonMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @js.native
  class Table protected ()
    extends typings.actionsOnGoogle.tableMod.Table
       with _RichResponseItem {
    /** @public */
    def this(options: TableOptions) = this()
  }
}
