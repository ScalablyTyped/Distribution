package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XFormField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  var FieldType: java.lang.String
  val Parameters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  def getFieldType(): java.lang.String
  def getParameters(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  def setFieldType(fieldType: java.lang.String): scala.Unit
}

object XFormField {
  @scala.inline
  def apply(
    FieldType: java.lang.String,
    Parameters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: js.Function0[scala.Unit],
    getFieldType: js.Function0[java.lang.String],
    getParameters: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFieldType: js.Function1[java.lang.String, scala.Unit]
  ): XFormField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FieldType")(FieldType)
    __obj.updateDynamic("Parameters")(Parameters)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getFieldType")(getFieldType)
    __obj.updateDynamic("getParameters")(getParameters)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setFieldType")(setFieldType)
    __obj.asInstanceOf[XFormField]
  }
}

