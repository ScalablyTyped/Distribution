package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distAssistantMod {
  import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.OmniHandler

  type AppHandler = OmniHandler with BaseApp
  type Plugin[TService, TPlugin] = js.Function1[
    /* app */ AppHandler with TService with js.Any, 
    (AppHandler with TService with js.Any with TPlugin) | Unit
  ]
}
