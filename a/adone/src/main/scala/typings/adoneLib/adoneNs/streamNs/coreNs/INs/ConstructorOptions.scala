package typings
package adoneLib.adoneNs.streamNs.coreNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConstructorOptions[S, T] extends js.Object {
  /**
                       * Whether the initial stream is asynchronous
                       */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /**
                       * The initial flush function
                       */
  var flush: js.UndefOr[FlushFunction[T]] = js.undefined
  /**
                       * Whether the initial stream is synchronous
                       */
  var sync: js.UndefOr[scala.Boolean] = js.undefined
  /**
                       * The initial transform (passthrough is default)
                       */
  var transform: js.UndefOr[TransformFunction[S, T]] = js.undefined
}

