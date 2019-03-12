package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringRepresentation extends XStringRepresentation {
  def create(TypeConverter: activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XTypeConverter): scala.Unit
  def createConstant(
    TypeConverter: activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XTypeConverter,
    Constant: java.lang.String,
    Values: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]
  ): scala.Unit
}

object StringRepresentation {
  @scala.inline
  def apply(
    convertToControlValue: js.Any => java.lang.String,
    convertToPropertyValue: (java.lang.String, activexDashLibreofficeLib.`type`) => js.Any,
    create: activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XTypeConverter => scala.Unit,
    createConstant: (activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XTypeConverter, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]) => scala.Unit
  ): StringRepresentation = {
    val __obj = js.Dynamic.literal(convertToControlValue = js.Any.fromFunction1(convertToControlValue), convertToPropertyValue = js.Any.fromFunction2(convertToPropertyValue), create = js.Any.fromFunction1(create), createConstant = js.Any.fromFunction3(createConstant))
  
    __obj.asInstanceOf[StringRepresentation]
  }
}

