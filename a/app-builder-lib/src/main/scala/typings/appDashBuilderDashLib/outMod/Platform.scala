package typings.appDashBuilderDashLib.outMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out", "Platform")
@js.native
class Platform protected ()
  extends typings.appDashBuilderDashLib.outCoreMod.Platform {
  def this(name: String, buildConfigurationKey: String, nodeName: typings.node.NodeJSNs.Platform) = this()
}

/* static members */
@JSImport("app-builder-lib/out", "Platform")
@js.native
object Platform extends js.Object {
  var LINUX: typings.appDashBuilderDashLib.outCoreMod.Platform = js.native
  var MAC: typings.appDashBuilderDashLib.outCoreMod.Platform = js.native
  var WINDOWS: typings.appDashBuilderDashLib.outCoreMod.Platform = js.native
  def current(): typings.appDashBuilderDashLib.outCoreMod.Platform = js.native
  def fromString(name: String): typings.appDashBuilderDashLib.outCoreMod.Platform = js.native
}

