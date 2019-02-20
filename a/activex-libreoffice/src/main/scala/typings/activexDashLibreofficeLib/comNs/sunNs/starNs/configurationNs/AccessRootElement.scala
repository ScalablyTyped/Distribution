package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides information about the root element of a hierarchy and about the hierarchy as a whole.
  *
  * Provides information about the element and the whole hierarchy. Allows controlling the lifetime of the hierarchy. Allows observing changes in the
  * hierarchy as a whole.
  *
  * When access to a hierarchy is first obtained from a factory or provider, this is the initial object that is created by the factory. It represents the
  * **root** of the accessible part of the hierarchy.
  *
  * **NOTE: In this description "hierarchy" may actually designate a part or fragment of a larger hierarchy. It is that part that is rooted in the element
  * represented by an implementation of this service and that is accessible starting from this element.**
  *
  * Generally it is not possible to navigate the parent or siblings, if any, of this element, so {@link com.sun.star.container.XChild} is not supported.
  * @see com.sun.star.configuration.UpdateRootElement Implementations that support modifying data in the hierarchy implement service UpdateRootElement.
  * @see com.sun.star.configuration.SetElement A complementary service, for children of a dynamic homogeneous container.
  * @see com.sun.star.configuration.GroupElement A complementary service, for children of a static heterogeneous collection.
  * @see com.sun.star.configuration.ConfigurationProvider Objects provided by a ConfigurationProvider implement this service.
  */
trait AccessRootElement
  extends HierarchyElement
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XLocalizable

