package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DCP Document is a container for Document data/content.
  *
  * The data/content may be anything, a WebDAV server, like an HTTP server, does not necessarily mandate what type of data/content may be contained within
  * Documents. The type of data/content is defined by the MediaType property which is different from the content type returned from the {@link
  * XContent.getContentType()} method. The MediaType property is mapped to the equivalent WebDAV property and the WebDAV server calculates the value.
  * @see com.sun.star.ucb.WebDAVContentProvider
  * @see com.sun.star.ucb.WebDAVFolderContent
  */
trait WebDAVDocumentContent
  extends XCommandProcessor2
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XContent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeNotifier
     with XCommandInfoChangeNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild

