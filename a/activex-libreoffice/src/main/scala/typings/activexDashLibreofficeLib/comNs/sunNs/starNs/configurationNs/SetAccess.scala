package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a dynamic, homogeneous set of values or nested trees within a hierarchy.
  *
  * Also provides information about the template for elements. Allows normalizing externally generated names.
  *
  * **Sets** are dynamic containers within the hierarchy.
  *
  * The number and names of contained elements are not fixed in advance, but all elements have to be of one predetermined type.
  * @see com.sun.star.configuration.SetElement Child objects of this service generally implement SetElement. The template name returned by the child from
  * @see com.sun.star.configuration.GroupAccess A complementary service that provides for static heterogeneous groups of elements within the hierarchy.
  */
trait SetAccess
  extends HierarchyAccess
     with SimpleSetAccess {
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
}

