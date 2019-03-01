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
    GraphNames: activexDashInteropLib.SafeArray[XURI],
    create: js.Function0[scala.Unit],
    createBlankNode: js.Function0[XBlankNode],
    createGraph: js.Function1[XURI, XNamedGraph],
    destroyGraph: js.Function1[XURI, scala.Unit],
    exportGraph: js.Function4[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream, 
      XURI, 
      XURI, 
      scala.Unit
    ],
    getGraph: js.Function1[XURI, XNamedGraph],
    getGraphNames: js.Function0[activexDashInteropLib.SafeArray[XURI]],
    getStatements: js.Function3[
      XResource, 
      XURI, 
      XNode, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
    ],
    importGraph: js.Function4[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      XURI, 
      XURI, 
      XNamedGraph
    ],
    queryAsk: js.Function1[java.lang.String, scala.Boolean],
    queryConstruct: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
    ],
    querySelect: js.Function1[java.lang.String, XQuerySelectResult]
  ): Repository = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GraphNames")(GraphNames)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("createBlankNode")(createBlankNode)
    __obj.updateDynamic("createGraph")(createGraph)
    __obj.updateDynamic("destroyGraph")(destroyGraph)
    __obj.updateDynamic("exportGraph")(exportGraph)
    __obj.updateDynamic("getGraph")(getGraph)
    __obj.updateDynamic("getGraphNames")(getGraphNames)
    __obj.updateDynamic("getStatements")(getStatements)
    __obj.updateDynamic("importGraph")(importGraph)
    __obj.updateDynamic("queryAsk")(queryAsk)
    __obj.updateDynamic("queryConstruct")(queryConstruct)
    __obj.updateDynamic("querySelect")(querySelect)
    __obj.asInstanceOf[Repository]
  }
}

