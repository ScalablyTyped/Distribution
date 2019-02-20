package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a RDF statement, or triple.
  * @see XRepository
  * @since OOo 3.2
  */
trait Statement extends js.Object {
  var Graph: XURI
  var Object: XNode
  var Predicate: XURI
  var Subject: XResource
}

