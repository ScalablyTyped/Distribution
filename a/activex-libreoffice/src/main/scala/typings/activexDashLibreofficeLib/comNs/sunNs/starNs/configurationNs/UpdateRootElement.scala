package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides update control for a hierarchy of configuration items and information about the hierarchy as a whole as well as its root.
  *
  * Extends {@link AccessRootElement} by adding support for collecting changes and applying them to a backend store as a single batch.
  *
  * An implementation represents the root of a partial hierarchy. [See the documentation for {@link AccessRootElement} ]. The hierarchy in turn is a
  * **view** onto a fragment of persistent data tree that can be accessed through several such views, or even several processes, simultaneously.
  *
  * Elements of the hierarchy, such as descendants of this root element, may support modification by providing appropriate interfaces. Changes done this
  * way initially only affect these objects themselves and other objects within the same hierarchy, such as other descendants of this root element.
  *
  * The accumulated changes within this hierarchy can be managed using {@link com.sun.star.util.XChangesBatch} . Pending changes will become persistent
  * and visible from other overlapping hierarchies only when {@link com.sun.star.util.XChangesBatch.commitChanges()} is called. If the hierarchy is
  * disposed or discarded without committing changes, the changes will be lost.
  * @see com.sun.star.configuration.GroupUpdate
  * @see com.sun.star.configuration.SetUpdate
  */
trait UpdateRootElement
  extends AccessRootElement
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesBatch

