package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A OCP content is representation of a document saved in a DMS.
  *
  * The document {@link Content} corresponds to a document stored in a Document Management System.
  * @see com.sun.star.ucb.ODMAContentProvider
  * @see com.sun.star.ucb.Content
  * @since OOo 1.1.2
  */
trait ODMAContent
  extends XCommandProcessor2
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XContent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeNotifier
     with XCommandInfoChangeNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild

object ODMAContent {
  @scala.inline
  def apply(
    ContentType: java.lang.String,
    Identifier: XContentIdentifier,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    abort: js.Function1[scala.Double, scala.Unit],
    acquire: js.Function0[scala.Unit],
    addCommandInfoChangeListener: js.Function1[XCommandInfoChangeListener, scala.Unit],
    addContentEventListener: js.Function1[XContentEventListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    addProperty: js.Function3[java.lang.String, scala.Double, js.Any, scala.Unit],
    addPropertySetInfoChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeListener, 
      scala.Unit
    ],
    createCommandIdentifier: js.Function0[scala.Double],
    dispose: js.Function0[scala.Unit],
    execute: js.Function3[Command, scala.Double, XCommandEnvironment, js.Any],
    getContentType: js.Function0[java.lang.String],
    getIdentifier: js.Function0[XContentIdentifier],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    releaseCommandIdentifier: js.Function1[scala.Double, scala.Unit],
    removeCommandInfoChangeListener: js.Function1[XCommandInfoChangeListener, scala.Unit],
    removeContentEventListener: js.Function1[XContentEventListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    removeProperty: js.Function1[java.lang.String, scala.Unit],
    removePropertySetInfoChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeListener, 
      scala.Unit
    ],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): ODMAContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContentType")(ContentType)
    __obj.updateDynamic("Identifier")(Identifier)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addCommandInfoChangeListener")(addCommandInfoChangeListener)
    __obj.updateDynamic("addContentEventListener")(addContentEventListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertiesChangeListener")(addPropertiesChangeListener)
    __obj.updateDynamic("addProperty")(addProperty)
    __obj.updateDynamic("addPropertySetInfoChangeListener")(addPropertySetInfoChangeListener)
    __obj.updateDynamic("createCommandIdentifier")(createCommandIdentifier)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getContentType")(getContentType)
    __obj.updateDynamic("getIdentifier")(getIdentifier)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("releaseCommandIdentifier")(releaseCommandIdentifier)
    __obj.updateDynamic("removeCommandInfoChangeListener")(removeCommandInfoChangeListener)
    __obj.updateDynamic("removeContentEventListener")(removeContentEventListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertiesChangeListener")(removePropertiesChangeListener)
    __obj.updateDynamic("removeProperty")(removeProperty)
    __obj.updateDynamic("removePropertySetInfoChangeListener")(removePropertySetInfoChangeListener)
    __obj.updateDynamic("setParent")(setParent)
    __obj.asInstanceOf[ODMAContent]
  }
}

