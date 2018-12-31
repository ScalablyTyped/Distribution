package typings
package atAngularCoreLib.srcRender3InterfacesViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootContext extends js.Object {
  /**
    * A promise which is resolved when all components are considered clean (not dirty).
    *
    * This promise is overwritten every time a first call to {@link markDirty} is invoked.
    */
  var clean: js.Promise[scala.Null]
  /**
    * RootComponents - The components that were instantiated by the call to
    * {@link renderComponent}.
    */
  var components: js.Array[js.Object]
  /**
    * What render-related operations to run once a scheduler has been set
    */
  var flags: RootContextFlags
  /**
    * The player flushing handler to kick off all animations
    */
  var playerHandler: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerHandler | scala.Null
  /**
    * A function used for scheduling change detection in the future. Usually
    * this is `requestAnimationFrame`.
    */
  def scheduler(workFn: js.Function0[scala.Unit]): scala.Unit
}

