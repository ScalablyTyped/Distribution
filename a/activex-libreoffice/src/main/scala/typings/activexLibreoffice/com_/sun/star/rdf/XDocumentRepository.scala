package typings.activexLibreoffice.com_.sun.star.rdf

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.beans.Pair
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends {@link XRepository} with document-specific functionality.
  *
  * This subclass of {@link XRepository} provides some methods which only make sense for repositories that are attached to a document. For example, the
  * methods allow for manipulating in-content metadata, which is stored as RDFa.
  * @see XRepositorySupplier
  * @see XDocumentMetadataAccess
  * @since OOo 3.2
  */
@js.native
trait XDocumentRepository extends XRepository {
  
  /**
    * find the RDFa statement(s) associated with an ODF element.
    * @param Element the ODF element for which RDFa statements should be found
    * @returns if the element has no RDFa meta-data attributes: the empty sequence.if the element has RDFa meta-data attributes: a sequence with the RDFa-statem
    * @see Statement
    * @throws com::sun::star::lang::IllegalArgumentException if the given Element is `NULL` , or of a type that can not have RDFa metadata attached.
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def getStatementRDFa(Element: XMetadatable): Pair[SafeArray[Statement], Boolean] = js.native
  
  /**
    * gets matching RDFa statements from the repository.
    *
    * This method exists because RDFa statements are not part of any named graph, and thus they cannot be enumerated with {@link
    * XNamedGraph.getStatements()} .
    *
    * Any parameter may be `NULL` , which acts as a wildcard. For example, to get all statements about myURI: `getStatementsRDFa(myURI, null, null)`
    * @param Subject the subject of the RDF triple.
    * @param Predicate the predicate of the RDF triple.
    * @param Object the object of the RDF triple.
    * @returns an iterator over all RDFa statements in the repository that match the parameters, represented as an enumeration of {@link Statement}
    * @see Statement
    * @see XRepository.getStatements
    * @see XNamedGraph.getStatements
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def getStatementsRDFa(Subject: XResource, Predicate: XURI, Object: XNode): XEnumeration = js.native
  
  /**
    * remove the RDFa statement(s) that correspond to an ODF element from the repository.
    *
    * RDFa statements are handled specially because they are not logically part of any graph.
    * @param Element the element whose RDFa statement(s) should be removed
    * @throws com::sun::star::lang::IllegalArgumentException if the given Element is `NULL` , or of a type that can not have RDFa metadata attached.
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def removeStatementRDFa(Element: XMetadatable): Unit = js.native
  
  /**
    * update the RDFa statement(s) that correspond to an ODF element in the repository.
    *
    * This method will do the following steps:  1. Remove all previously set RDFa statements for the Object parameter from the repository 2. If the
    * RDFaContent parameter is the empty `string` , for every Predicate in the given list of Predicates, add the following RDF statement to an unspecified
    * named graph: `Subject Predicate XLiteral(Object->getText()^^RDFaDatatype)` 3. If the RDFaContent parameter is not the empty `string` , for every
    * Predicate in the given list of Predicates, add the following RDF statement to an unspecified named graph: `Subject Predicate
    * XLiteral(RDFaContent^^RDFaDatatype)`
    *
    * RDFa statements are handled specially because they are not logically part of any named graph in the repository. Also, they have rather unusual
    * semantics; just using {@link XNamedGraph.addStatement()} would be ambiguous: if the object is a {@link XMetadatable} , do we insert the object itself
    * ( {@link URI} ) or its literal content (RDFa)?
    * @param Subject the subject of the RDF triple(s).
    * @param Predicates the predicates of the RDF triple(s).
    * @param Object the object of the RDF triple(s) is the text content of this parameter.
    * @param RDFaContent the `rdfa:content` attribute (may be the empty `string` ).
    * @param RDFaDatatype the `rdfa:datatype` attribute (may be `NULL` )
    * @throws com::sun::star::lang::IllegalArgumentException if any parameter is `NULL` , Predicates is empty, or Object is of a type that can not have RDFa me
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def setStatementRDFa(
    Subject: XResource,
    Predicates: SeqEquiv[XURI],
    Object: XMetadatable,
    RDFaContent: String,
    RDFaDatatype: XURI
  ): Unit = js.native
}
object XDocumentRepository {
  
  @scala.inline
  def apply(
    GraphNames: SafeArray[XURI],
    createBlankNode: () => XBlankNode,
    createGraph: XURI => XNamedGraph,
    destroyGraph: XURI => Unit,
    exportGraph: (Double, XOutputStream, XURI, XURI) => Unit,
    getGraph: XURI => XNamedGraph,
    getGraphNames: () => SafeArray[XURI],
    getStatementRDFa: XMetadatable => Pair[SafeArray[Statement], Boolean],
    getStatements: (XResource, XURI, XNode) => XEnumeration,
    getStatementsRDFa: (XResource, XURI, XNode) => XEnumeration,
    importGraph: (Double, XInputStream, XURI, XURI) => XNamedGraph,
    queryAsk: String => Boolean,
    queryConstruct: String => XEnumeration,
    querySelect: String => XQuerySelectResult,
    removeStatementRDFa: XMetadatable => Unit,
    setStatementRDFa: (XResource, SeqEquiv[XURI], XMetadatable, String, XURI) => Unit
  ): XDocumentRepository = {
    val __obj = js.Dynamic.literal(GraphNames = GraphNames.asInstanceOf[js.Any], createBlankNode = js.Any.fromFunction0(createBlankNode), createGraph = js.Any.fromFunction1(createGraph), destroyGraph = js.Any.fromFunction1(destroyGraph), exportGraph = js.Any.fromFunction4(exportGraph), getGraph = js.Any.fromFunction1(getGraph), getGraphNames = js.Any.fromFunction0(getGraphNames), getStatementRDFa = js.Any.fromFunction1(getStatementRDFa), getStatements = js.Any.fromFunction3(getStatements), getStatementsRDFa = js.Any.fromFunction3(getStatementsRDFa), importGraph = js.Any.fromFunction4(importGraph), queryAsk = js.Any.fromFunction1(queryAsk), queryConstruct = js.Any.fromFunction1(queryConstruct), querySelect = js.Any.fromFunction1(querySelect), removeStatementRDFa = js.Any.fromFunction1(removeStatementRDFa), setStatementRDFa = js.Any.fromFunction5(setStatementRDFa))
    __obj.asInstanceOf[XDocumentRepository]
  }
  
  @scala.inline
  implicit class XDocumentRepositoryMutableBuilder[Self <: XDocumentRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStatementRDFa(value: XMetadatable => Pair[SafeArray[Statement], Boolean]): Self = StObject.set(x, "getStatementRDFa", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStatementsRDFa(value: (XResource, XURI, XNode) => XEnumeration): Self = StObject.set(x, "getStatementsRDFa", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveStatementRDFa(value: XMetadatable => Unit): Self = StObject.set(x, "removeStatementRDFa", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStatementRDFa(value: (XResource, SeqEquiv[XURI], XMetadatable, String, XURI) => Unit): Self = StObject.set(x, "setStatementRDFa", js.Any.fromFunction5(value))
  }
}
