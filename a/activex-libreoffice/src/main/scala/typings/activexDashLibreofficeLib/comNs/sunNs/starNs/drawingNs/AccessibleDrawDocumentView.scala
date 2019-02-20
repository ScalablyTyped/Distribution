package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link AccessibleDrawDocumentView} service is implemented by views of Draw and Impress documents.
  *
  * An object that implements the {@link AccessibleDrawDocumentView} service provides information about the view of a Draw or Impress document in one of
  * the various view modes. With its children it gives access to the current page and the shapes on that page.
  *
  * This service gives a simplified view on the underlying document. It tries both to keep the structure of the accessibility representation tree as
  * simple as possible and provide as much relevant information as possible. This has the following consequences:  1. Only the current draw page and only
  * the visible shapes are accessible. To switch to another page or to access shapes that lie outside the currently visible area, the user has to issue
  * these requests manually or programmatically through the usual channels, e.g. pressing keys or selecting menu entries. 2. The hierarchy exposed through
  * the {@link com.sun.star.accessibility.XAccessibleContext} interface does not necessarily correspond directly to the underlying draw page structure.
  * Internal nodes in this hierarchy are introduced by group shapes, 3D scenes, and OLE objects. 3. The view modes editing view, outline view, slides
  * view, notes view, handout view, and presentation view are not exposed explicitly. However, if there happens to be a view mode change which results in
  * a rearrangement of the visible shapes, the user gets notified of this.
  * @since OOo 1.1.2
  */
trait AccessibleDrawDocumentView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent

