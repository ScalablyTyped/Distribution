package typings.`3dDashBinDashPacking`.boxologicNs

import typings.`3dDashBinDashPacking`.bwsNs.packerNs.Wrapper
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
  def this(wrapper: Wrapper) = this()
  /**
    * Set placement orientation.
    */
  def set_orientation(orientation: Double): Unit = js.native
}

