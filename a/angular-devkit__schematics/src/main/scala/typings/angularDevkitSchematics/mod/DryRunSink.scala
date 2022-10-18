package typings.angularDevkitSchematics.mod

import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular-devkit/schematics", "DryRunSink")
@js.native
open class DryRunSink protected ()
  extends typings.angularDevkitSchematics.srcSinkDryrunMod.DryRunSink {
  /**
    * @param {host} dir The host to use to output. This should be scoped.
    * @param {boolean} force Whether to force overwriting files that already exist.
    */
  def this(host: Host[js.Object]) = this()
  def this(host: Host[js.Object], force: Boolean) = this()
}
