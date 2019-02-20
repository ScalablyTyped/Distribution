package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the service of a set expression field master.
  * @see com.sun.star.text.TextFieldMaster
  */
trait SetExpression
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFieldMaster {
  /** determines the number of the chapter. This values is used if the field master is set as number sequence. */
  var ChapterNumberingLevel: scala.Double
  /** determines the numbering separator string if the field master is set as number sequence. */
  var NumberingSeparator: java.lang.String
  /** determines the type of the field as {@link com.sun.star.text.SetVariableType} */
  var SubType: scala.Double
}

