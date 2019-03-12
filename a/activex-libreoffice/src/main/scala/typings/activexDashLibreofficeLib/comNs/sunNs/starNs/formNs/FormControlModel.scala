package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a control model within a form.
  *
  * Note that the model-view-paradigm is used for form controls, too.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlModel because var conflicts: Name. Inlined DefaultControl */ @js.native
trait FormControlModel
  extends FormComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XFastPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyState {
  /**
    * specifies the ID for classification of the component.
    * @see FormComponentType
    */
  var ClassId: scala.Double = js.native
  /** specifies the service name of the default control for this model. */
  var DefaultControl: java.lang.String = js.native
  /**
    * determines the relative taborder of the control associated with the model.
    *
    * The default -1 is used to indicate that the tab-order of this control should be determined automatically.
    *
    * Each component which supports a tabstop must provide a {@link FormControlModel.TabIndex} property.
    *
    * Normally, a {@link FormController} instance is evaluating this property.
    */
  var TabIndex: scala.Double = js.native
  /**
    * used for additional information.
    *
    * No semantics is given for this property, it will usually be used by the creator of a document containing form controls.
    */
  var Tag: java.lang.String = js.native
  def getPropertyValues(aPropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): stdLib.SafeArray[_] = js.native
}

