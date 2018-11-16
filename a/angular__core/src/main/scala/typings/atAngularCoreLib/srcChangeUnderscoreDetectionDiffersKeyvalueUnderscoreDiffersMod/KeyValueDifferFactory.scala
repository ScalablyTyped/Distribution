package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeyValueDifferFactory extends js.Object {
  /**
       * Create a `KeyValueDiffer`.
       */
  def create[K, V](): KeyValueDiffer[K, V]
  /**
       * Test to see if the differ knows how to diff this kind of object.
       */
  def supports(objects: js.Any): scala.Boolean
}

