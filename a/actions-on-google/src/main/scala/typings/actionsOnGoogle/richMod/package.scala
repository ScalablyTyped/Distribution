package typings.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object richMod {
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.actionsOnGoogle.simpleMod.SimpleResponse
    - typings.actionsOnGoogle.cardMod.BasicCard
    - typings.actionsOnGoogle.cardMod.Table
    - typings.actionsOnGoogle.browseMod.BrowseCarousel
    - typings.actionsOnGoogle.responseMediaMod.MediaResponse
    - typings.actionsOnGoogle.orderMod.OrderUpdate
    - typings.actionsOnGoogle.linkoutMod.LinkOutSuggestion
    - typings.actionsOnGoogle.htmlMod.HtmlResponse[typings.actionsOnGoogle.commonMod.JsonObject]
    - typings.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponseItem
  */
  type RichResponseItem = typings.actionsOnGoogle.richMod._RichResponseItem | typings.actionsOnGoogle.htmlMod.HtmlResponse[typings.actionsOnGoogle.commonMod.JsonObject] | java.lang.String
}
