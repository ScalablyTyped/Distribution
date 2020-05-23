package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.script.XTypeConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringRepresentation extends XStringRepresentation {
  def create(TypeConverter: XTypeConverter): Unit
  def createConstant(TypeConverter: XTypeConverter, Constant: String, Values: SeqEquiv[String]): Unit
}

object StringRepresentation {
  @scala.inline
  def apply(
    convertToControlValue: js.Any => String,
    convertToPropertyValue: (String, `type`) => js.Any,
    create: XTypeConverter => Unit,
    createConstant: (XTypeConverter, String, SeqEquiv[String]) => Unit
  ): StringRepresentation = {
    val __obj = js.Dynamic.literal(convertToControlValue = js.Any.fromFunction1(convertToControlValue), convertToPropertyValue = js.Any.fromFunction2(convertToPropertyValue), create = js.Any.fromFunction1(create), createConstant = js.Any.fromFunction3(createConstant))
    __obj.asInstanceOf[StringRepresentation]
  }
}

