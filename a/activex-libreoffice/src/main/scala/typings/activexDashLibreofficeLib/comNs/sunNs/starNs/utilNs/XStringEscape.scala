package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is used to encode an arbitrary String into a escaped form.
  *
  * The escaped form is chosen to be suitable for use with other interfaces of the object or service providing this interface.
  *
  * Any characters or character sequences that are not compatible with any naming rules or restrictions must be replaced by an escaped form, that complies
  * to these rules.
  *
  * The transformation should preserve all traits of the string that are generally respected by the service. For example, the case of a string may be lost
  * after encoding and then decoding, if the service generally is case insensitive.
  *
  * Other than that the encoding is one-to-one and can be reversed. The encoding should try to preserve as much as possible of the original string, to
  * keep human-readable input human-friendly where possible. Strings that already conform to the naming conventions should be left unchanged or minimally
  * modified.
  */
trait XStringEscape
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** encodes an arbitrary string into an escaped form compatible with some naming rules. */
  def escapeString(aString: java.lang.String): java.lang.String
  /** decodes an escaped string into the original form. */
  def unescapeString(aEscapedString: java.lang.String): java.lang.String
}

object XStringEscape {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    escapeString: js.Function1[java.lang.String, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    unescapeString: js.Function1[java.lang.String, java.lang.String]
  ): XStringEscape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("escapeString")(escapeString)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("unescapeString")(unescapeString)
    __obj.asInstanceOf[XStringEscape]
  }
}

