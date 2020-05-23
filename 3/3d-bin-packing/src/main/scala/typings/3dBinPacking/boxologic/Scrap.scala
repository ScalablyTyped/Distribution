package typings.`3dBinPacking`.boxologic

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
trait Scrap extends js.Object {
  /**
    * Cumulated length on the X-axis in 3D.
    */
  var cumx: Double
  /**
    * Cumulated length on the Z-axis in 3D.
    */
  var cumz: Double
}

object Scrap {
  @scala.inline
  def apply(cumx: Double, cumz: Double): Scrap = {
    val __obj = js.Dynamic.literal(cumx = cumx.asInstanceOf[js.Any], cumz = cumz.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scrap]
  }
}

