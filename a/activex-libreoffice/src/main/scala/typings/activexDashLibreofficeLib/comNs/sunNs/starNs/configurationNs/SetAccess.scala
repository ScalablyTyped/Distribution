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

object SetAccess {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementTemplateName: java.lang.String,
    ElementType: activexDashLibreofficeLib.`type`,
    Properties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    escapeString: js.Function1[java.lang.String, java.lang.String],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementTemplateName: js.Function0[java.lang.String],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getExactName: js.Function1[java.lang.String, java.lang.String],
    getProperties: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property]
    ],
    getPropertyByName: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    getPropertyDefault: js.Function1[java.lang.String, js.Any],
    getPropertyDefaults: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getPropertyState: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState
    ],
    getPropertyStates: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
    ],
    hasByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    hasPropertyByName: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    setAllPropertiesToDefault: js.Function0[scala.Unit],
    setPropertiesToDefault: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setPropertyToDefault: js.Function1[java.lang.String, scala.Unit],
    unescapeString: js.Function1[java.lang.String, java.lang.String]
  ): SetAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementTemplateName = ElementTemplateName, ElementType = ElementType, Properties = Properties, acquire = acquire, addContainerListener = addContainerListener, escapeString = escapeString, getByHierarchicalName = getByHierarchicalName, getByName = getByName, getElementNames = getElementNames, getElementTemplateName = getElementTemplateName, getElementType = getElementType, getExactName = getExactName, getProperties = getProperties, getPropertyByName = getPropertyByName, getPropertyDefault = getPropertyDefault, getPropertyDefaults = getPropertyDefaults, getPropertyState = getPropertyState, getPropertyStates = getPropertyStates, hasByHierarchicalName = hasByHierarchicalName, hasByName = hasByName, hasElements = hasElements, hasPropertyByName = hasPropertyByName, queryInterface = queryInterface, release = release, removeContainerListener = removeContainerListener, setAllPropertiesToDefault = setAllPropertiesToDefault, setPropertiesToDefault = setPropertiesToDefault, setPropertyToDefault = setPropertyToDefault, unescapeString = unescapeString)
  
    __obj.asInstanceOf[SetAccess]
  }
}

