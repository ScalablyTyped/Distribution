package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RootContext contains information which is shared for all components which
  * were bootstrapped with {@link renderComponent}.
  */
trait RootContext extends js.Object {
  /**
    * A promise which is resolved when all components are considered clean (not dirty).
    *
    * This promise is overwritten every time a first call to {@link markDirty} is invoked.
    */
  var clean: js.Promise[Null]
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
  var playerHandler: ɵPlayerHandler | Null
  /**
    * A function used for scheduling change detection in the future. Usually
    * this is `requestAnimationFrame`.
    */
  def scheduler(workFn: js.Function0[Unit]): Unit
}

object RootContext {
  @scala.inline
  def apply(
    clean: js.Promise[Null],
    components: js.Array[js.Object],
    flags: RootContextFlags,
    scheduler: js.Function0[Unit] => Unit,
    playerHandler: ɵPlayerHandler = null
  ): RootContext = {
    val __obj = js.Dynamic.literal(clean = clean.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], scheduler = js.Any.fromFunction1(scheduler))
    if (playerHandler != null) __obj.updateDynamic("playerHandler")(playerHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootContext]
  }
}

