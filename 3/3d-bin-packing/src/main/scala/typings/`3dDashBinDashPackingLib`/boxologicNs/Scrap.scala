package typings
package `3dDashBinDashPackingLib`.boxologicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <p> Cumulated lengths of current layer. </p>
  *
  * <p> {@link Scrapped} represents an edge of the current layer under construction. </p>
  *
  * @author Bill Knechtel, <br>
  *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
  */
@JSGlobal("boxologic.Scrap")
@js.native
/**
  * Default Constructor.
  */
class Scrap () extends js.Object {
  /**
    * Initialization Constructor.
    *
    * @param cumx Cumulated length on the x-axis.
    * @param cumz Cumulated length on the z-axis.
    */
  def this(cumx: scala.Double, cumz: scala.Double) = this()
  /**
    * Cumulated length on the X-axis in 3D.
    */
  var cumx: scala.Double = js.native
  /**
    * Cumulated length on the Z-axis in 3D.
    */
  var cumz: scala.Double = js.native
}

