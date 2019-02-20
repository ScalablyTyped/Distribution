package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A File {@link Content} represents either a directory or a file in the local file system.
  *
  * Whether a content represents a folder or a file can be determined by inspecting its property **IsFolder** or **IsDocument** .
  * @see com.sun.star.ucb.FileContentProvider
  */
trait FileContent
  extends XCommandProcessor2
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XContent
     with XContentCreator
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeNotifier
     with XCommandInfoChangeNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild

