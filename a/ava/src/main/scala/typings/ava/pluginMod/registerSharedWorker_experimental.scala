package typings.ava.pluginMod

import typings.ava.avaStrings.experimental
import typings.ava.pluginMod.SharedWorker.Plugin.Experimental.Protocol
import typings.ava.pluginMod.SharedWorker.Plugin.RegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ava/plugin", "registerSharedWorker")
@js.native
object registerSharedWorker_experimental extends js.Object {
  
  def apply[Data](options: RegistrationOptions[experimental, Data]): Protocol[Data] = js.native
}
