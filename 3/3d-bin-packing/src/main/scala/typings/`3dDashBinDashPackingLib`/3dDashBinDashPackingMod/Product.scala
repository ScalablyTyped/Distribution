package typings
package `3dDashBinDashPackingLib`.`3dDashBinDashPackingMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A product.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
@JSImport("3d-bin-packing", "Product")
@js.native
/**
  * Default Constructor.
  */
class Product ()
  extends `3dDashBinDashPackingLib`.bwsNs.packerNs.Product {
  /**
    * Construct from members.
    *
    * @param name Name, identifier of the Product.
    * @param width Width, length on the X-axis in 3D.
    * @param height Height, length on the Y-axis in 3D.
    * @param length Length, length on the Z-axis in 3D.
    */
  def this(name: java.lang.String, width: scala.Double, height: scala.Double, length: scala.Double) = this()
}

