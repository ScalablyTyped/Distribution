package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a dynamic, homogeneous, nonhierarchical set of values or objects.
  *
  * Also provides information about the template for elements. Allows normalizing externally generated names.
  *
  * **Sets** are dynamic containers.
  *
  * The number and names of contained elements is not fixed in advance, but all elements have to be of one predetermined type.
  */
trait SimpleSetAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with XTemplateContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XStringEscape
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer

object SimpleSetAccess {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementTemplateName: java.lang.String,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    escapeString: js.Function1[java.lang.String, java.lang.String],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementTemplateName: js.Function0[java.lang.String],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    unescapeString: js.Function1[java.lang.String, java.lang.String]
  ): SimpleSetAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementTemplateName = ElementTemplateName, ElementType = ElementType, acquire = acquire, addContainerListener = addContainerListener, escapeString = escapeString, getByName = getByName, getElementNames = getElementNames, getElementTemplateName = getElementTemplateName, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, queryInterface = queryInterface, release = release, removeContainerListener = removeContainerListener, unescapeString = unescapeString)
  
    __obj.asInstanceOf[SimpleSetAccess]
  }
}

