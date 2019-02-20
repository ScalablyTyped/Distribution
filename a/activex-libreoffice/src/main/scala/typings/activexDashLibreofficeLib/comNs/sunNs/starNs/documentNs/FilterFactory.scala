package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * factory to create filter components.
  *
  * After a generic {@link TypeDetection} an internal type name will be known. Further a generic {@link com.sun.star.frame.FrameLoader} can use this
  * information, to search a suitable filter (may the default filter) at this factory and use it for loading the document into a specified frame.
  *
  * This factory implements read/write access on the underlying configuration set. and further a validate and flush mechanism for more performance and a
  * special query mode can be used here too.
  */
@js.native
trait FilterFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerQuery
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushable

