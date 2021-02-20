package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.script.XTypeConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class StringRepresentationMutableBuilder[Self <: StringRepresentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: XTypeConverter => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateConstant(value: (XTypeConverter, String, SeqEquiv[String]) => Unit): Self = StObject.set(x, "createConstant", js.Any.fromFunction3(value))
  }
}
