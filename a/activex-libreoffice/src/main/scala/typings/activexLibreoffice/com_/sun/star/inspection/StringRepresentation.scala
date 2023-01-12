package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.script.XTypeConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringRepresentation
  extends StObject
     with XStringRepresentation {
  
  def create(TypeConverter: XTypeConverter): Unit
  
  def createConstant(TypeConverter: XTypeConverter, Constant: String, Values: SeqEquiv[String]): Unit
}
object StringRepresentation {
  
  inline def apply(
    convertToControlValue: Any => String,
    convertToPropertyValue: (String, `type`) => Any,
    create: XTypeConverter => Unit,
    createConstant: (XTypeConverter, String, SeqEquiv[String]) => Unit
  ): StringRepresentation = {
    val __obj = js.Dynamic.literal(convertToControlValue = js.Any.fromFunction1(convertToControlValue), convertToPropertyValue = js.Any.fromFunction2(convertToPropertyValue), create = js.Any.fromFunction1(create), createConstant = js.Any.fromFunction3(createConstant))
    __obj.asInstanceOf[StringRepresentation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringRepresentation] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: XTypeConverter => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCreateConstant(value: (XTypeConverter, String, SeqEquiv[String]) => Unit): Self = StObject.set(x, "createConstant", js.Any.fromFunction3(value))
  }
}
