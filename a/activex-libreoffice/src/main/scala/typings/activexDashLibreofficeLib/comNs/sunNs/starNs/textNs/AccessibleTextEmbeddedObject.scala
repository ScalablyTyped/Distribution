package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The accessible view of an inactive embedded object. If an embedded object gets active, the active document gets an accessible object tree of its own.
  * This tree is not a subtree of the object that supports this service but of the document service itself. The tree exist only until the object is
  * deactivated.
  * @since OOo 1.1.2
  */
trait AccessibleTextEmbeddedObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleImage
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventBroadcaster

