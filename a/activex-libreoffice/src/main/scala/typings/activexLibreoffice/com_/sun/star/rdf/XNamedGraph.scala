package typings.activexLibreoffice.com_.sun.star.rdf

import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait XNamedGraph
  extends StObject
     with XURI {
  
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
  def addStatement(Subject: XResource, Predicate: XURI, Object: XNode): Unit
  
  /**
    * removes all statements from the graph.
    * @throws com::sun::star::container::NoSuchElementException if this graph does not exist in the repository any more
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def clear(): Unit
  
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
  def getStatements(Subject: XResource, Predicate: XURI, Object: XNode): XEnumeration
  
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
  def removeStatements(Subject: XResource, Predicate: XURI, Object: XNode): Unit
}
object XNamedGraph {
  
  inline def apply(
    LocalName: String,
    Name: XURI,
    Namespace: String,
    StringValue: String,
    addStatement: (XResource, XURI, XNode) => Unit,
    clear: () => Unit,
    getName: () => XURI,
    getStatements: (XResource, XURI, XNode) => XEnumeration,
    removeStatements: (XResource, XURI, XNode) => Unit
  ): XNamedGraph = {
    val __obj = js.Dynamic.literal(LocalName = LocalName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], addStatement = js.Any.fromFunction3(addStatement), clear = js.Any.fromFunction0(clear), getName = js.Any.fromFunction0(getName), getStatements = js.Any.fromFunction3(getStatements), removeStatements = js.Any.fromFunction3(removeStatements))
    __obj.asInstanceOf[XNamedGraph]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XNamedGraph] (val x: Self) extends AnyVal {
    
    inline def setAddStatement(value: (XResource, XURI, XNode) => Unit): Self = StObject.set(x, "addStatement", js.Any.fromFunction3(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => XURI): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetStatements(value: (XResource, XURI, XNode) => XEnumeration): Self = StObject.set(x, "getStatements", js.Any.fromFunction3(value))
    
    inline def setName(value: XURI): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRemoveStatements(value: (XResource, XURI, XNode) => Unit): Self = StObject.set(x, "removeStatements", js.Any.fromFunction3(value))
  }
}
