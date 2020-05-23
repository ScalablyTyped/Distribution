package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.linguistic2.XHyphenator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Hyphenation options passed in calls to {@link XBreakIterator.getLineBreak()} . */
trait LineBreakHyphenationOptions extends js.Object {
  /** Sequence of property values to be used by the hyphenator - can be empty if the default values (from the property set) should be used. */
  var aHyphenationOptions: PropertyValues
  /** The first character not fitting to the current line, considering an additional "-" for hyphenation */
  var hyphenIndex: Double
  var rHyphenator: XHyphenator
}

object LineBreakHyphenationOptions {
  @scala.inline
  def apply(aHyphenationOptions: PropertyValues, hyphenIndex: Double, rHyphenator: XHyphenator): LineBreakHyphenationOptions = {
    val __obj = js.Dynamic.literal(aHyphenationOptions = aHyphenationOptions.asInstanceOf[js.Any], hyphenIndex = hyphenIndex.asInstanceOf[js.Any], rHyphenator = rHyphenator.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineBreakHyphenationOptions]
  }
}

