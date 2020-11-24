package typings.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object assistantMod {
  
  type AppHandler = typings.actionsOnGoogle.frameworkFrameworkMod.OmniHandler with typings.actionsOnGoogle.assistantMod.BaseApp
  
  type Plugin[TService, TPlugin] = js.Function1[
    /* app */ typings.actionsOnGoogle.assistantMod.AppHandler with TService with js.Any, 
    (typings.actionsOnGoogle.assistantMod.AppHandler with TService with js.Any with TPlugin) | scala.Unit
  ]
}
