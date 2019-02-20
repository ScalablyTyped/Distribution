package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to text blocks in a group.
  * @see com.sun.star.text.AutoTextContainer
  */
trait AutoTextGroup
  extends XAutoTextGroup
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /** The path to the file containing the {@link AutoTextEntry} 's in this group */
  var FilePath: java.lang.String
  /** The title of this {@link AutoTextGroup} */
  var Title: java.lang.String
}

