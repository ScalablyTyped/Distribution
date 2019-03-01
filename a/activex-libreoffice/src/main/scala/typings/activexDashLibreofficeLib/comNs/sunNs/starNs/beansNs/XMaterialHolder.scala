package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the material a (tool-) object is working on.
  *
  * Example: The introspection service allows the inspection of an object's properties and methods. The result is represented as {@link
  * XIntrospectionAccess} interface. The inspected object then is the material attached to the introspection tool and an implementation of {@link
  * XIntrospectionAccess} should also support {@link XMaterialHolder} to give access to this material.
  * @see XIntrospectionAccess
  */
trait XMaterialHolder
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the material that is connected to this (tool-) object
    * @returns the material that is connected to this (tool-) object.
    */
  val Material: js.Any
  /**
    * returns the material that is connected to this (tool-) object
    * @returns the material that is connected to this (tool-) object.
    */
  def getMaterial(): js.Any
}

object XMaterialHolder {
  @scala.inline
  def apply(
    Material: js.Any,
    acquire: js.Function0[scala.Unit],
    getMaterial: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMaterialHolder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Material")(Material)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getMaterial")(getMaterial)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XMaterialHolder]
  }
}

