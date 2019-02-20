package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represent a binding to one or more nodes in the DOM tree of an {@link XModel} . */
trait Binding
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ValueBinding
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ListEntrySource
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs.XValidator {
  /**
    * among other properties, there is this one
    *
    * It is unclear to me whether this is an implementation detail or a supported interface.
    *
    * The value supports the service {@link com.sun.star.xml.NamespaceContainer}
    * @see com.sun.star.xml.NamespaceContainer
    */
  var BindingNamespaces: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
}

