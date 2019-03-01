package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Hyphenation options passed in calls to {@link XBreakIterator.getLineBreak()} . */
trait LineBreakHyphenationOptions extends js.Object {
  /** Sequence of property values to be used by the hyphenator - can be empty if the default values (from the property set) should be used. */
  var aHyphenationOptions: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  /** The first character not fitting to the current line, considering an additional "-" for hyphenation */
  var hyphenIndex: scala.Double
  var rHyphenator: activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.XHyphenator
}

object LineBreakHyphenationOptions {
  @scala.inline
  def apply(
    aHyphenationOptions: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues,
    hyphenIndex: scala.Double,
    rHyphenator: activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.XHyphenator
  ): LineBreakHyphenationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aHyphenationOptions")(aHyphenationOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("hyphenIndex")(hyphenIndex)
    __obj.updateDynamic("rHyphenator")(rHyphenator)
    __obj.asInstanceOf[LineBreakHyphenationOptions]
  }
}

