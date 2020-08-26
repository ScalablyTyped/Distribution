package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to provide standard type conversions.
  * @see Converter
  */
@js.native
trait XTypeConverter extends XInterface {
  /**
    * Converts the value `aFrom` to the specified type `xDestinationType` . Throws an {@link CannotConvertException} if the conversion failed.
    * @param aFrom source value
    * @param xDestinationType destination type
    * @returns converted value (any carrying value of type `xDestinationType`
    */
  def convertTo(aFrom: js.Any, xDestinationType: `type`): js.Any = js.native
  /**
    * Converts the value `aFrom` to the specified simple type `aDestinationType` . Throws an {@link CannotConvertException} if the conversion failed and an
    * {@link com.sun.star.lang.IllegalArgumentException} if the destination {@link com.sun.star.uno.TypeClass} is not simple, e.g. not long or byte.
    * @param aFrom source value
    * @param aDestinationType destination type class
    * @returns converted value (any carrying value of type `aDestinationType`
    */
  def convertToSimpleType(aFrom: js.Any, aDestinationType: TypeClass): js.Any = js.native
}

object XTypeConverter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    convertTo: (js.Any, `type`) => js.Any,
    convertToSimpleType: (js.Any, TypeClass) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTypeConverter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertTo = js.Any.fromFunction2(convertTo), convertToSimpleType = js.Any.fromFunction2(convertToSimpleType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTypeConverter]
  }
  @scala.inline
  implicit class XTypeConverterOps[Self <: XTypeConverter] (val x: Self) extends AnyVal {
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
    def setConvertTo(value: (js.Any, `type`) => js.Any): Self = this.set("convertTo", js.Any.fromFunction2(value))
    @scala.inline
    def setConvertToSimpleType(value: (js.Any, TypeClass) => js.Any): Self = this.set("convertToSimpleType", js.Any.fromFunction2(value))
  }
  
}

