package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.script.XTypeConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringRepresentation extends XStringRepresentation {
  def create(TypeConverter: XTypeConverter): Unit = js.native
  def createConstant(TypeConverter: XTypeConverter, Constant: String, Values: SeqEquiv[String]): Unit = js.native
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
  @scala.inline
  implicit class StringRepresentationOps[Self <: StringRepresentation] (val x: Self) extends AnyVal {
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
    def setCreate(value: XTypeConverter => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateConstant(value: (XTypeConverter, String, SeqEquiv[String]) => Unit): Self = this.set("createConstant", js.Any.fromFunction3(value))
  }
  
}

