package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies the model of a hidden control.
  *
  * The only sense of a hidden control is to store data in the form which is not visible to the user.
  *
  * Usually, hidden controls are used in com::sun::star::form::component::HTMLForms, where they contain data which is to be submitted. ;  Nevertheless,
  * you can use them in your own forms for storing any data, for instance to evaluate it in some scripting macro.
  */
@js.native
trait HiddenControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormComponent {
  /** specifies the value of the component. */
  var HiddenValue: java.lang.String = js.native
  def getPropertyValues(aPropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[_] = js.native
}

