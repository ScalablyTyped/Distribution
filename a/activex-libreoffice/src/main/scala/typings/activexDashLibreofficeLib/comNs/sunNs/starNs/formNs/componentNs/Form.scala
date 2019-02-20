package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies a form which is a group of {@link FormComponents} .
  *
  * A form fulfills several tasks, like storing the structure of its form components, storing the information concerning tab ordering and control
  * grouping, and last but not least, it provides the event environment for its contained elements.
  *
  * A form acts on the one hand like a container of {@link FormComponents} and on the other hand like a {@link FormComponent} . This generic construction
  * allows the definition of hierarchies of forms and their dependent subforms.
  * @see com.sun.star.form.FormControlModel
  */
@js.native
trait Form
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormComponents
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel {
  def getPropertyValues(aPropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[_] = js.native
}

