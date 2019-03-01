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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementTemplateName")(ElementTemplateName)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("Properties")(Properties)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addContainerListener")(addContainerListener)
    __obj.updateDynamic("escapeString")(escapeString)
    __obj.updateDynamic("getByHierarchicalName")(getByHierarchicalName)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementTemplateName")(getElementTemplateName)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getExactName")(getExactName)
    __obj.updateDynamic("getProperties")(getProperties)
    __obj.updateDynamic("getPropertyByName")(getPropertyByName)
    __obj.updateDynamic("getPropertyDefault")(getPropertyDefault)
    __obj.updateDynamic("getPropertyDefaults")(getPropertyDefaults)
    __obj.updateDynamic("getPropertyState")(getPropertyState)
    __obj.updateDynamic("getPropertyStates")(getPropertyStates)
    __obj.updateDynamic("hasByHierarchicalName")(hasByHierarchicalName)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("hasPropertyByName")(hasPropertyByName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeContainerListener")(removeContainerListener)
    __obj.updateDynamic("setAllPropertiesToDefault")(setAllPropertiesToDefault)
    __obj.updateDynamic("setPropertiesToDefault")(setPropertiesToDefault)
    __obj.updateDynamic("setPropertyToDefault")(setPropertyToDefault)
    __obj.updateDynamic("unescapeString")(unescapeString)
    __obj.asInstanceOf[SetAccess]
  }
}

