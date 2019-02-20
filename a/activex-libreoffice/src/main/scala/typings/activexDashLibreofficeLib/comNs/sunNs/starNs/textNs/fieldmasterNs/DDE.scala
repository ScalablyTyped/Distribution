package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a {@link DDE} field master.
  * @see com.sun.star.text.TextField
  */
trait DDE
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFieldMaster {
  /** contains the content. */
  var Content: java.lang.String
  /** contains the element string of the {@link DDE} command. */
  var DDECommandElement: java.lang.String
  /** contains the file string of the {@link DDE} command. */
  var DDECommandFile: java.lang.String
  /** contains the type string of the {@link DDE} command. */
  var DDECommandType: java.lang.String
  /** determines whether {@link DDE} link is updated automatically. */
  var IsAutomaticUpdate: scala.Boolean
}

