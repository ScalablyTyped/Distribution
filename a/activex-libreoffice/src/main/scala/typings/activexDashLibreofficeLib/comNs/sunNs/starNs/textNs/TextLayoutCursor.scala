package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link TextLayoutCursor} is a {@link TextRange} which can travel within a layout of a {@link Text} object. */
trait TextLayoutCursor
  extends TextCursor
     with XPageCursor {
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
}

object TextLayoutCursor {
  @scala.inline
  def apply(TextCursor: TextCursor = null, XPageCursor: XPageCursor = null): TextLayoutCursor = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, TextCursor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XPageCursor)
    __obj.asInstanceOf[TextLayoutCursor]
  }
}

