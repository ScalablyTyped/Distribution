package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TDCP Root Folder is the root container for all other TDCP contents.
  *
  * There is at most one instance of a TDCP Root at a time. All other TDCP contents are children of this folder. The TDCP Root Folder can contain only
  * TDCP Documents. It has the fixed URL "vnd.sun.star.tdoc:/".
  * @see TransientDocumentsContentProvider
  * @see TransientDocumentsDocumentContent
  * @see TransientDocumentsFolderContent
  * @see TransientDocumentsStreamContent
  * @since OOo 2.0
  */
trait TransientDocumentsRootContent
  extends XCommandProcessor2
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XContent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeNotifier
     with XCommandInfoChangeNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild

