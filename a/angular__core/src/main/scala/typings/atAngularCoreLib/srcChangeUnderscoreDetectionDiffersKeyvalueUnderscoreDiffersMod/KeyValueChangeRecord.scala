package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeyValueChangeRecord[K, V] extends js.Object {
  /**
       * Current value for the key or `null` if removed.
       */
  val currentValue: V | scala.Null
  /**
       * Current key in the Map.
       */
  val key: K
  /**
       * Previous value for the key or `null` if added.
       */
  val previousValue: V | scala.Null
}

