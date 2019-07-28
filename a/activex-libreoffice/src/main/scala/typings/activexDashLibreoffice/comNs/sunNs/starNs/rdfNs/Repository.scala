package typings.activexDashLibreoffice.comNs.sunNs.starNs.rdfNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XOutputStream
import typings.std.SafeArray
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
  def create(): Unit
}

object Repository {
  @scala.inline
  def apply(
    GraphNames: SafeArray[XURI],
    create: () => Unit,
    createBlankNode: () => XBlankNode,
    createGraph: XURI => XNamedGraph,
    destroyGraph: XURI => Unit,
    exportGraph: (Double, XOutputStream, XURI, XURI) => Unit,
    getGraph: XURI => XNamedGraph,
    getGraphNames: () => SafeArray[XURI],
    getStatements: (XResource, XURI, XNode) => XEnumeration,
    importGraph: (Double, XInputStream, XURI, XURI) => XNamedGraph,
    queryAsk: String => Boolean,
    queryConstruct: String => XEnumeration,
    querySelect: String => XQuerySelectResult
  ): Repository = {
    val __obj = js.Dynamic.literal(GraphNames = GraphNames, create = js.Any.fromFunction0(create), createBlankNode = js.Any.fromFunction0(createBlankNode), createGraph = js.Any.fromFunction1(createGraph), destroyGraph = js.Any.fromFunction1(destroyGraph), exportGraph = js.Any.fromFunction4(exportGraph), getGraph = js.Any.fromFunction1(getGraph), getGraphNames = js.Any.fromFunction0(getGraphNames), getStatements = js.Any.fromFunction3(getStatements), importGraph = js.Any.fromFunction4(importGraph), queryAsk = js.Any.fromFunction1(queryAsk), queryConstruct = js.Any.fromFunction1(queryConstruct), querySelect = js.Any.fromFunction1(querySelect))
  
    __obj.asInstanceOf[Repository]
  }
}

