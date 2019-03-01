package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an RDF named graph that is stored in an RDF {@link Repository} .
  *
  * Note that this interface inherits from {@link XResource} : the name of the graph is the string value of the RDF node. This is so that you can easily
  * make RDF statements about named graphs.
  *
  * Note that instances may be destroyed via {@link XRepository.destroyGraph()} . If a graph is destroyed, subsequent calls to {@link addStatement()} ,
  * {@link removeStatements()} will fail with an {@link com.sun.star.container.NoSuchElementException} .
  * @see XRepository
  * @since OOo 3.2
  */
trait XNamedGraph extends XURI {
  /**
    * returns the name of the graph.
    *
    * The name is unique within the repository.
    * @returns the name of the graph
    */
  val Name: XURI
  /**
    * adds a RDF statement to the graph.
    *
    * Note that the ODF elements that can have metadata attached all implement the interface {@link XMetadatable} , which inherits from {@link XResource} ,
    * meaning that you can simply pass them in as arguments here, and it will magically work.
    * @param Subject the subject of the RDF triple.
    * @param Predicate the predicate of the RDF triple.
    * @param Object the object of the RDF triple.
    * @throws com::sun::star::lang::IllegalArgumentException if any parameter is `NULL`
    * @throws com::sun::star::container::NoSuchElementException if this graph does not exist in the repository any more
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def addStatement(Subject: XResource, Predicate: XURI, Object: XNode): scala.Unit
  /**
    * removes all statements from the graph.
    * @throws com::sun::star::container::NoSuchElementException if this graph does not exist in the repository any more
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def clear(): scala.Unit
  /**
    * returns the name of the graph.
    *
    * The name is unique within the repository.
    * @returns the name of the graph
    */
  def getName(): XURI
  /**
    * gets matching RDF statements from a graph.
    *
    * Note that the ODF elements that can have metadata attached all implement the interface {@link XMetadatable} , which inherits from {@link XResource} ,
    * meaning that you can simply pass them in as arguments here, and it will magically work.
    *
    * Any parameter may be `NULL` , which acts as a wildcard. For example, to get all statements about myURI: `getStatements(myURI, null, null)`
    * @param Subject the subject of the RDF triple.
    * @param Predicate the predicate of the RDF triple.
    * @param Object the object of the RDF triple.
    * @returns an iterator over all RDF statements in the graph that match the parameters, represented as an enumeration of {@link Statement}
    * @see Statement
    * @throws com::sun::star::container::NoSuchElementException if this graph does not exist in the repository any more
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def getStatements(Subject: XResource, Predicate: XURI, Object: XNode): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
  /**
    * removes matching RDF statements from the graph.
    *
    * Note that the ODF elements that can have metadata attached all implement the interface {@link XMetadatable} , which inherits from {@link XResource} ,
    * meaning that you can simply pass them in as arguments here, and it will magically work.
    *
    * Any parameter may be `NULL` , which acts as a wildcard. For example, to remove all statements about myURI: `removeStatement(myURI, null, null)`
    * @param Subject the subject of the RDF triple.
    * @param Predicate the predicate of the RDF triple.
    * @param Object the object of the RDF triple.
    * @throws com::sun::star::container::NoSuchElementException if this graph does not exist in the repository any more
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def removeStatements(Subject: XResource, Predicate: XURI, Object: XNode): scala.Unit
}

object XNamedGraph {
  @scala.inline
  def apply(
    LocalName: java.lang.String,
    Name: XURI,
    Namespace: java.lang.String,
    StringValue: java.lang.String,
    addStatement: js.Function3[XResource, XURI, XNode, scala.Unit],
    clear: js.Function0[scala.Unit],
    getName: js.Function0[XURI],
    getStatements: js.Function3[
      XResource, 
      XURI, 
      XNode, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
    ],
    removeStatements: js.Function3[XResource, XURI, XNode, scala.Unit]
  ): XNamedGraph = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LocalName")(LocalName)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Namespace")(Namespace)
    __obj.updateDynamic("StringValue")(StringValue)
    __obj.updateDynamic("addStatement")(addStatement)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getStatements")(getStatements)
    __obj.updateDynamic("removeStatements")(removeStatements)
    __obj.asInstanceOf[XNamedGraph]
  }
}

