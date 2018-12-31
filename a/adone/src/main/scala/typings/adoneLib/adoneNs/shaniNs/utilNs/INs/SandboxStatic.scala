package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SandboxStatic extends js.Object {
  /**
    * Creates a sandbox object with spies, stubs, and mocks
    */
  def create(): Sandbox = js.native
  def create(config: SandboxConfig): Sandbox = js.native
}

