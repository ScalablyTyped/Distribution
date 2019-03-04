package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends {@link XRepository} with document-specific functionality.
  *
  * This subclass of {@link XRepository} provides some methods which only make sense for repositories that are attached to a document. For example, the
  * methods allow for manipulating in-content metadata, which is stored as RDFa.
  * @see XRepositorySupplier
  * @see XDocumentMetadataAccess
  * @since OOo 3.2
  */
trait XDocumentRepository extends XRepository {
  /**
    * find the RDFa statement(s) associated with an ODF element.
    * @param Element the ODF element for which RDFa statements should be found
    * @returns if the element has no RDFa meta-data attributes: the empty sequence.if the element has RDFa meta-data attributes: a sequence with the RDFa-statem
    * @see Statement
    * @throws com::sun::star::lang::IllegalArgumentException if the given Element is `NULL` , or of a type that can not have RDFa metadata attached.
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def getStatementRDFa(Element: XMetadatable): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[activexDashInteropLib.SafeArray[Statement], scala.Boolean]
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
  def getStatementsRDFa(Subject: XResource, Predicate: XURI, Object: XNode): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
  /**
    * remove the RDFa statement(s) that correspond to an ODF element from the repository.
    *
    * RDFa statements are handled specially because they are not logically part of any graph.
    * @param Element the element whose RDFa statement(s) should be removed
    * @throws com::sun::star::lang::IllegalArgumentException if the given Element is `NULL` , or of a type that can not have RDFa metadata attached.
    * @throws RepositoryException if an error occurs when accessing the repository.
    */
  def removeStatementRDFa(Element: XMetadatable): scala.Unit
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
    Predicates: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XURI],
    Object: XMetadatable,
    RDFaContent: java.lang.String,
    RDFaDatatype: XURI
  ): scala.Unit
}

object XDocumentRepository {
  @scala.inline
  def apply(
    GraphNames: activexDashInteropLib.SafeArray[XURI],
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
    getStatementRDFa: js.Function1[
      XMetadatable, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[activexDashInteropLib.SafeArray[Statement], scala.Boolean]
    ],
    getStatements: js.Function3[
      XResource, 
      XURI, 
      XNode, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
    ],
    getStatementsRDFa: js.Function3[
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
    querySelect: js.Function1[java.lang.String, XQuerySelectResult],
    removeStatementRDFa: js.Function1[XMetadatable, scala.Unit],
    setStatementRDFa: js.Function5[
      XResource, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XURI], 
      XMetadatable, 
      java.lang.String, 
      XURI, 
      scala.Unit
    ]
  ): XDocumentRepository = {
    val __obj = js.Dynamic.literal(GraphNames = GraphNames, createBlankNode = createBlankNode, createGraph = createGraph, destroyGraph = destroyGraph, exportGraph = exportGraph, getGraph = getGraph, getGraphNames = getGraphNames, getStatementRDFa = getStatementRDFa, getStatements = getStatements, getStatementsRDFa = getStatementsRDFa, importGraph = importGraph, queryAsk = queryAsk, queryConstruct = queryConstruct, querySelect = querySelect, removeStatementRDFa = removeStatementRDFa, setStatementRDFa = setStatementRDFa)
  
    __obj.asInstanceOf[XDocumentRepository]
  }
}

