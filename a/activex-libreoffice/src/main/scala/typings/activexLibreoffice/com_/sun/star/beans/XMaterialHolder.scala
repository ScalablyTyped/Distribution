package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
@js.native
trait XMaterialHolder extends XInterface {
  /**
    * returns the material that is connected to this (tool-) object
    * @returns the material that is connected to this (tool-) object.
    */
  val Material: js.Any = js.native
  /**
    * returns the material that is connected to this (tool-) object
    * @returns the material that is connected to this (tool-) object.
    */
  def getMaterial(): js.Any = js.native
}

object XMaterialHolder {
  @scala.inline
  def apply(
    Material: js.Any,
    acquire: () => Unit,
    getMaterial: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMaterialHolder = {
    val __obj = js.Dynamic.literal(Material = Material.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMaterial = js.Any.fromFunction0(getMaterial), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMaterialHolder]
  }
  @scala.inline
  implicit class XMaterialHolderOps[Self <: XMaterialHolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaterial(value: js.Any): Self = this.set("Material", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetMaterial(value: () => js.Any): Self = this.set("getMaterial", js.Any.fromFunction0(value))
  }
  
}

