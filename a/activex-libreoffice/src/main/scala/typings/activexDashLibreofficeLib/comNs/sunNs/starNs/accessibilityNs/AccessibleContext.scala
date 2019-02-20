package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Central service of the Accessibility API that gives access to various facets of an object's content.
  *
  * This service has to be implemented by every class that represents the actual accessibility information of another UNO service. It exposes two kinds of
  * information: A tree structure in which all accessible objects are organized can be navigated in freely. It typically represents spatial relationship
  * of one object containing a set of children like a dialog box contains a set of buttons. Additionally the {@link XAccessibleContext} interface of this
  * service exposes methods that provide access to the actual object's content. This can be the object's role, name, description, and so on.
  * @see XAccessibleContext
  * @since OOo 1.1.2
  */
trait AccessibleContext
  extends XAccessibleContext
     with XAccessibleEventBroadcaster

