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
    acquire: () => scala.Unit,
    getMaterial: () => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XMaterialHolder = {
    val __obj = js.Dynamic.literal(Material = Material, acquire = js.Any.fromFunction0(acquire), getMaterial = js.Any.fromFunction0(getMaterial), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMaterialHolder]
  }
}

