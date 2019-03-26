package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a control model which supports both binding to an external value supplier, and to an external validator.
  *
  * There are two methods how the value which is represented by a control model can interact with other components (well, except the trivial ones
  * accessible by using {@link com.sun.star.beans.XPropertySet} ): binding the value to an external component via {@link
  * com.sun.star.form.binding.XBindableValue}validating the current value by an external component, via {@link XValidatable} and {@link XValidator}
  *
  * The {@link ValidatableBindableControlModel} services describes the interaction of these concepts for control models which support both of them.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
trait ValidatableBindableControlModel extends ValidatableControlModel

