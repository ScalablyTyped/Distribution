package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a controller which can be used to browse and modify properties of form controls.
  *
  * The controller can be plugged into an {@link com.sun.star.frame.XFrame} , and will provide a visual component for inspecting control properties. This
  * means it allows to interactively control several aspects of a {@link FormControlModel} or {@link DataAwareControlModel} , such as it's data binding,
  * it's layout, and it's event binding
  *
  * For using a {@link PropertyBrowserController} , you need to instantiate it at a service factory of your choiceattach it to an empty frame of your
  * choiceset the IntrospectedObject property to the control model which you wish to analyze
  *
  * {{program example here, see documentation}}
  * @deprecated Deprecated  Note that nowadays, this service is only a legacy wrapper using the {@link com.sun.star.inspection.ObjectInspector} and the {@link co
  * @see com.sun.star.frame.XController
  */
trait PropertyBrowserController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XFastPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XMultiPropertySet {
  /**
    * controls the actually visible page.
    *
    * The aspects of a {@link DataAwareControlModel} which can be browsed and modified using this controller can be separated into 3 groups: common aspects,
    * data-awareness related aspects, and bound events. ;  The appearance of the visual component created by the controller is that 3 tab pages, one for
    * each group, are displayed (of course if the control does not support any aspects of a given group, the group is omitted). ;  With this property, it
    * can be controller which page is currently active.
    *
    * Valid values are (this list may be extended in the future): GenericDataEvents
    */
  var CurrentPage: java.lang.String
  /**
    * contains the object to inspect.
    *
    * Changing this property from outside causes the controller to update its view with the data of the new object
    */
  var IntrospectedObject: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override val PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
}

