package typings.activexDashLibreoffice.comNs.sunNs.starNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rdfNs {
  /**
    * represents an error condition that is signaled on parsing an RDF file.
    * @see XRepository
    * @since OOo 3.0
    */
  type ParseException = Exception
  /**
    * represents an error condition that is signaled on evaluating a query against an RDF {@link Repository} .
    * @see XRepository
    * @since OOo 3.0
    */
  type QueryException = Exception
  /**
    * represents an error condition that is signaled on accessing an RDF {@link Repository} .
    * @see XRepository
    * @since OOo 3.0
    */
  type RepositoryException = Exception
  /**
    * represents a blank node that may occur in a RDF graph.
    *
    * Blank nodes are distinct, but have no {@link URI} ; in other words, they are resources that are anonymous.
    * @see XRepository
    * @since OOo 3.0
    */
  type XBlankNode = XResource
  /**
    * represents a resource node that may occur in a RDF graph.
    *
    * Note that this interface exists only to separate resources from literals.
    * @see XRepository
    * @see XBlankNode
    * @see XURI
    * @since OOo 3.0
    */
  type XResource = XNode
}
