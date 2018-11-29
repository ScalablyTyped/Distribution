package typings
package atAngularCoreLib.srcRender3InterfacesDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeDef[T] extends js.Object {
  /**
       * Pipe name.
       *
       * Used to resolve pipe in templates.
       */
  val name: java.lang.String = js.native
  var onDestroy: js.Function0[scala.Unit] | scala.Null = js.native
  /**
       * Whether or not the pipe is pure.
       *
       * Pure pipes result only depends on the pipe input and not on internal
       * state of the pipe.
       */
  val pure: scala.Boolean = js.native
  /**
       * Factory function used to create a new pipe instance.
       */
  def factory(): T = js.native
  /**
       * Factory function used to create a new pipe instance.
       */
  def factory(t: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
}

