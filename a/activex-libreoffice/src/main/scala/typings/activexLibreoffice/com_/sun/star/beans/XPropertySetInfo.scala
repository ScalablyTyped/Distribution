package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a set of properties.
  *
  * There are three kinds of properties: bound propertiesconstrained propertiesfree properties
  *
  * The specification only describes the properties, it does not contain any values.
  */
@js.native
trait XPropertySetInfo extends XInterface {
  /** @returns a sequence with all property descriptors which are specified within this {@link XPropertySetInfo} . */
  val Properties: SafeArray[Property] = js.native
  /** @returns a sequence with all property descriptors which are specified within this {@link XPropertySetInfo} . */
  def getProperties(): SafeArray[Property] = js.native
  /**
    * @param aName specifies the name of the property.
    * @returns the property with the specified name from the object.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def getPropertyByName(aName: String): Property = js.native
  /**
    * @param Name specifies the name of the property.
    * @returns `TRUE` if a property with the specified name exist; otherwise `FALSE` is returned.
    */
  def hasPropertyByName(Name: String): Boolean = js.native
}

object XPropertySetInfo {
  @scala.inline
  def apply(
    Properties: SafeArray[Property],
    acquire: () => Unit,
    getProperties: () => SafeArray[Property],
    getPropertyByName: String => Property,
    hasPropertyByName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertySetInfo = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getProperties = js.Any.fromFunction0(getProperties), getPropertyByName = js.Any.fromFunction1(getPropertyByName), hasPropertyByName = js.Any.fromFunction1(hasPropertyByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertySetInfo]
  }
  @scala.inline
  implicit class XPropertySetInfoOps[Self <: XPropertySetInfo] (val x: Self) extends AnyVal {
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
    def setProperties(value: SafeArray[Property]): Self = this.set("Properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetProperties(value: () => SafeArray[Property]): Self = this.set("getProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPropertyByName(value: String => Property): Self = this.set("getPropertyByName", js.Any.fromFunction1(value))
    @scala.inline
    def setHasPropertyByName(value: String => Boolean): Self = this.set("hasPropertyByName", js.Any.fromFunction1(value))
  }
  
}

