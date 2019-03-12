package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * parses textual representations of absolute URIs.
  *
  * See [RFC   2396]{@link url="http://www.ietf.org/rfc/rfc2396.txt"} for a description of URIs and related terms.
  * @since OOo 2.0
  */
trait XUriSchemeParser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * parses the textual representation of an absolute URI.
    *
    * This method is used to parse URIs (with no fragment part), not URI references (with an optional fragment part).
    *
    * If an object is returned, the behaviour of its {@link com.sun.star.uri.XUriReference} methods must reflect the fact that the object represents an
    * absolute URI reference with the given scheme and scheme-specific part, and without a fragment part.
    * @param scheme the textual representation of the scheme part (without the delimiting "`:`" ).
    * @param schemeSpecificPart the textual representation of the scheme-specific part.
    * @returns an object that supports {@link com.sun.star.uri.XUriReference} (and possibly also additional, scheme-specific interfaces), if the given input can
    */
  def parse(scheme: java.lang.String, schemeSpecificPart: java.lang.String): XUriReference
}

object XUriSchemeParser {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    parse: (java.lang.String, java.lang.String) => XUriReference,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XUriSchemeParser = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), parse = js.Any.fromFunction2(parse), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUriSchemeParser]
  }
}

