package typings
package `3dDashBinDashPackingLib`.boxologicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pallet containing boxes.
  *
  * @author Bill Knechtel, <br>
  *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
  */
@JSGlobal("boxologic.Pallet")
@js.native
class Pallet protected () extends Instance {
  /**
    * Construct from a wrapper.
    *
    * @param wrapper A wrapper wrapping instances.
    */
  def this(wrapper: `3dDashBinDashPackingLib`.bwsNs.packerNs.Wrapper) = this()
  /**
    * Set placement orientation.
    */
  def set_orientation(orientation: scala.Double): scala.Unit = js.native
}

