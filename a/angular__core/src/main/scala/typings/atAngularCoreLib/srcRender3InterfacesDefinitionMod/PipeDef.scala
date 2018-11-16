package typings
package atAngularCoreLib.srcRender3InterfacesDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PipeDef[T] extends js.Object {
  /**
       * Pipe name.
       *
       * Used to resolve pipe in templates.
       */
  var name: java.lang.String
  var onDestroy: js.Function0[scala.Unit] | scala.Null
  /**
       * Whether or not the pipe is pure.
       *
       * Pure pipes result only depends on the pipe input and not on internal
       * state of the pipe.
       */
  var pure: scala.Boolean
  /**
       * Factory function used to create a new pipe instance.
       */
  def factory(): T
}

