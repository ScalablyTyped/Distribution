package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a set of named RDF graphs.
  * @see XRepository
  * @see XRepositorySupplier
  * @since OOo 3.0
  */
trait Repository extends XRepository {
  /** constructs repository with in-memory storage. */
  def create(): scala.Unit
}

object Repository {
  @scala.inline
  def apply(
    GraphNames: stdLib.SafeArray[XURI],
    create: () => scala.Unit,
    createBlankNode: () => XBlankNode,
    createGraph: XURI => XNamedGraph,
    destroyGraph: XURI => scala.Unit,
    exportGraph: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream, XURI, XURI) => scala.Unit,
    getGraph: XURI => XNamedGraph,
    getGraphNames: () => stdLib.SafeArray[XURI],
    getStatements: (XResource, XURI, XNode) => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    importGraph: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, XURI, XURI) => XNamedGraph,
    queryAsk: java.lang.String => scala.Boolean,
    queryConstruct: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    querySelect: java.lang.String => XQuerySelectResult
  ): Repository = {
    val __obj = js.Dynamic.literal(GraphNames = GraphNames, create = js.Any.fromFunction0(create), createBlankNode = js.Any.fromFunction0(createBlankNode), createGraph = js.Any.fromFunction1(createGraph), destroyGraph = js.Any.fromFunction1(destroyGraph), exportGraph = js.Any.fromFunction4(exportGraph), getGraph = js.Any.fromFunction1(getGraph), getGraphNames = js.Any.fromFunction0(getGraphNames), getStatements = js.Any.fromFunction3(getStatements), importGraph = js.Any.fromFunction4(importGraph), queryAsk = js.Any.fromFunction1(queryAsk), queryConstruct = js.Any.fromFunction1(queryConstruct), querySelect = js.Any.fromFunction1(querySelect))
  
    __obj.asInstanceOf[Repository]
  }
}

