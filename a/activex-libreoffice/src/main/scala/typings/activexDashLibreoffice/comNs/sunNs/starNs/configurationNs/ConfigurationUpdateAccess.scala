package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XHierarchicalPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides modifying access to a fragment of the configuration hierarchy.
  *
  * Extends {@link ConfigurationAccess} to support modifying values or inserting and removing elements.
  *
  * Descendants of this service also implement this service unless they are marked **read-only** (which is indicated by attribute {@link
  * com.sun.star.beans.PropertyAttribute.READONLY} ), in which case they only need implement {@link ConfigurationAccess} .
  *
  * The classification of implementations that is described for {@link ConfigurationAccess} applies to implementations of this service as well. Therefore
  * an implementation will support one of several alternate services describing its **Container** role and one of several alternate services describing
  * its **Element** role. These services are extensions of the respective services documented for {@link ConfigurationAccess} .
  *
  * **Container** role: A **group** permits changing child values. A **set** permits inserting and removing contained elements.**Element** role: The root
  * element of a modifiable tree provides extended functionality to control processing of changes for the entire tree (fragment) by supporting {@link
  * com.sun.star.util.XChangesBatch} . For elements of a **set** or a **group** no additional interfaces are supported.
  * @see ConfigurationProvider Root instances of this service can be requested from a ConfigurationProvider
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs.UpdateRootElement because var conflicts: Locale, Name, Parent. Inlined  */ @js.native
trait ConfigurationUpdateAccess
  extends ConfigurationAccess
     with SetUpdate
     with GroupUpdate {
  /**
    * retrieve information about the hierarchy of properties
    * @returns the {@link XHierarchicalPropertySetInfo} interface, which describes the property hierarchy of the object which supplies this interface.
    * @returns `NULL` if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XHierarchicalPropertySet
    * @see XHierarchicalPropertySet.getHierarchicalPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getHierarchicalPropertySetInfo(): XHierarchicalPropertySetInfo = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState] = js.native
}

