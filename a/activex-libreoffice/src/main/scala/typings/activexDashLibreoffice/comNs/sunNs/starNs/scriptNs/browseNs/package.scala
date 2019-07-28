package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browseNs {
  /**
    * This service is used to create Root XBrowseNodes.
    * @deprecated Deprecateduse the singleton theBrowseNodeFactory
    * @since OOo 2.0
    */
  type BrowseNodeFactory = XBrowseNodeFactory
  /**
    * The one and only {@link BrowseNodeFactory} .
    *
    * To get the singleton call getValueByName on the component context `; /singletons/com.sun.star.script.theBrowseNodeFactory; `
    * @since OOo 2.0
    */
  type theBrowseNodeFactory = XBrowseNodeFactory
}
