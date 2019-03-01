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

object KeyValueDifferFactory {
  @scala.inline
  def apply(
    create: js.Function0[KeyValueDiffer[js.Any, js.Any]],
    supports: js.Function1[js.Any, scala.Boolean]
  ): KeyValueDifferFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("supports")(supports)
    __obj.asInstanceOf[KeyValueDifferFactory]
  }
}

