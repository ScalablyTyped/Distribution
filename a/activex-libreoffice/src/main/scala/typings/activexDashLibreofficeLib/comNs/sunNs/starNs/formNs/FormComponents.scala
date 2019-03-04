package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the capabilities of a collection of {@link FormComponents} .
  *
  * The collection must provide the possibility of adding and removing components by name and by index. The name of a component is not necessarily unique,
  * so the collection must be able to handle duplicate entry names.
  * @see FormComponent
  */
trait FormComponents
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XEventAttacherManager

object FormComponents {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    addScriptListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XScriptListener, scala.Unit],
    attach: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      js.Any, 
      scala.Unit
    ],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    detach: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      scala.Unit
    ],
    getByIndex: js.Function1[scala.Double, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getCount: js.Function0[scala.Double],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getScriptEvents: js.Function1[
      scala.Double, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ScriptEventDescriptor]
    ],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insertByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    insertByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    insertEntry: js.Function1[scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerScriptEvent: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ScriptEventDescriptor, 
      scala.Unit
    ],
    registerScriptEvents: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ScriptEventDescriptor], 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    removeEntry: js.Function1[scala.Double, scala.Unit],
    removeScriptListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XScriptListener, scala.Unit],
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    replaceByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    revokeScriptEvent: js.Function4[scala.Double, java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    revokeScriptEvents: js.Function1[scala.Double, scala.Unit]
  ): FormComponents = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, addContainerListener = addContainerListener, addScriptListener = addScriptListener, attach = attach, createEnumeration = createEnumeration, detach = detach, getByIndex = getByIndex, getByName = getByName, getCount = getCount, getElementNames = getElementNames, getElementType = getElementType, getScriptEvents = getScriptEvents, hasByName = hasByName, hasElements = hasElements, insertByIndex = insertByIndex, insertByName = insertByName, insertEntry = insertEntry, queryInterface = queryInterface, registerScriptEvent = registerScriptEvent, registerScriptEvents = registerScriptEvents, release = release, removeByIndex = removeByIndex, removeByName = removeByName, removeContainerListener = removeContainerListener, removeEntry = removeEntry, removeScriptListener = removeScriptListener, replaceByIndex = replaceByIndex, replaceByName = replaceByName, revokeScriptEvent = revokeScriptEvent, revokeScriptEvents = revokeScriptEvents)
  
    __obj.asInstanceOf[FormComponents]
  }
}

