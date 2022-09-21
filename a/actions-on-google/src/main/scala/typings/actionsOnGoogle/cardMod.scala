package typings.actionsOnGoogle

import typings.actionsOnGoogle.basicMod.BasicCardOptions
import typings.actionsOnGoogle.buttonMod.ButtonOptions
import typings.actionsOnGoogle.richMod._RichResponseItem
import typings.actionsOnGoogle.tableMod.TableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", "BasicCard")
  @js.native
  open class BasicCard protected ()
    extends typings.actionsOnGoogle.basicMod.BasicCard
       with _RichResponseItem {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", "Button")
  @js.native
  open class Button protected ()
    extends typings.actionsOnGoogle.buttonMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", "Table")
  @js.native
  open class Table protected ()
    extends typings.actionsOnGoogle.tableMod.Table
       with _RichResponseItem {
    /** @public */
    def this(options: TableOptions) = this()
  }
}
