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
    convertToControlValue: js.Function1[js.Any, java.lang.String],
    convertToPropertyValue: js.Function2[java.lang.String, activexDashLibreofficeLib.`type`, js.Any],
    create: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XTypeConverter, scala.Unit],
    createConstant: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XTypeConverter, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      scala.Unit
    ]
  ): StringRepresentation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convertToControlValue")(convertToControlValue)
    __obj.updateDynamic("convertToPropertyValue")(convertToPropertyValue)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("createConstant")(createConstant)
    __obj.asInstanceOf[StringRepresentation]
  }
}

