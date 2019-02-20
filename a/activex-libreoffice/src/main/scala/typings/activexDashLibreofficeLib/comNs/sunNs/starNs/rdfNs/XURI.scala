package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an {@link URI} node that may occur in a RDF graph.
  *
  * Note that this is actually an IRI, but the RDF literature speaks of {@link URIs} only, so we chose to use established terminology.
  *
  * The {@link URI} is split into a Namespace and a LocalName, using the first applicable of the following criteria:  1. after the first occurrence of the
  * fragment separator: "#" 2. after the last occurrence of the path separator: "/" 3. after the last occurrence of the scheme separator: ":" An {@link
  * URI} without a ":" is invalid. This implies that the Namespace part of an {@link URI} must not be empty, while the LocalName part may be empty.
  * @see XRepository
  * @since OOo 3.0
  */
trait XURI extends XNode {
  var LocalName: java.lang.String
  var Namespace: java.lang.String
}

