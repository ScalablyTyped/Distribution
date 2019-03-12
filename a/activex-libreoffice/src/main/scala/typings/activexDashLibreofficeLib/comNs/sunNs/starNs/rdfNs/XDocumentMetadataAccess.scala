package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * document metadata functionality related to the "manifest.rdf".
  *
  * This interface contains some methods that create connections between the content and the RDF metadata of an ODF document. The main idea is to make
  * querying and manipulating the data in the metadata manifest easier.
  *
  * Note that this interface inherits from {@link XURI} : the base {@link URI} of the document is the string value of the RDF node. This is so that you
  * can easily make RDF statements about the document.
  * @see XDocumentRepository
  * @since OOo 3.2
  */
trait XDocumentMetadataAccess
  extends XURI
     with XRepositorySupplier {
  /**
    * add a content or styles file to the manifest.
    *
    * This convenience method adds the required statements declaring a content or styles file to the manifest graph. If the FileName ends in "content.xml",
    * an `odf:ContentFile` is added.If the FileName ends in "styles.xml" , an `odf:StylesFile` is added.Other FileNames are invalid.
    * @param FileName the name of the stream in the ODF storage
    * @throws com::sun::star::lang::IllegalArgumentException if the FileName is invalid
    * @throws com::sun::star::container::ElementExistException if a stream with the given FileName already exists
    */
  def addContentOrStylesFile(FileName: java.lang.String): scala.Unit
  /**
    * add a metadata file to the manifest.
    *
    * This convenience method does the following: create a new graph with the given name in the repositoryinsert statements declaring the new graph to be a
    * metadata file into the manifest graphinsert statements declaring `rdf:type` properties for the new graph into the manifest graph
    * @param FileName the name of the stream in the ODF storage where the graph will be stored
    * @param Types a list of types that will be inserted as `rdf:type` properties for the graph
    * @returns the name of the new graph
    * @throws com::sun::star::lang::IllegalArgumentException if the FileName is invalid
    * @throws com::sun::star::container::ElementExistException if a stream with the given FileName already exists
    */
  def addMetadataFile(FileName: java.lang.String, Types: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XURI]): XURI
  /**
    * get the unique ODF element with the given metadata reference.
    * @param MetadataReference a metadata reference, comprising the stream name and the XML ID For example: Pair("content.xml", "foo-element-1")
    * @returns the ODF element with the given metadata references if it exists, else `NULL`
    */
  def getElementByMetadataReference(MetadataReference: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair): XMetadatable
  /**
    * get the ODF element that corresponds to an {@link URI} .
    * @param URI an {@link URI} that may identify an ODF element
    * @returns the ODF element that corresponds to the given {@link URI} , or `NULL`
    * @throws com::sun::star::lang::IllegalArgumentException if the given {@link URI} is `NULL`
    */
  def getElementByURI(URI: XURI): XMetadatable
  /**
    * get the names of all metadata files with a given type.
    * @param Type the `rdf:type` property of the requested named graphs
    * @returns the names of all metadata graphs that have a `rdf:type` property with the given Type as object
    * @throws com::sun::star::lang::IllegalArgumentException if the given Type is `NULL`
    */
  def getMetadataGraphsWithType(Type: XURI): stdLib.SafeArray[XURI]
  /**
    * import a metadata file into the document repository, and add it to the manifest.
    *
    * This convenience method does the following:  1. import the given file into a graph with the given name in the repository 2. insert statements
    * declaring the new graph to be a metadata file into the manifest graph 3. insert statements declaring `rdf:type` properties for the new graph into the
    * manifest graph
    * @param Format the file format, see {@link FileFormat}
    * @param InStream the input stream
    * @param FileName the name of the stream in the ODF storage where the graph will be stored
    * @param BaseURI a base {@link URI} to resolve relative {@link URI} references
    * @param Types a list of types that will be inserted as `rdf:type` properties for the graph
    * @returns the name of the new graph
    * @see FileFormat
    * @throws com::sun::star::lang::IllegalArgumentException if the given stream is `NULL` , or BaseURI is `NULL` and the format requires use of a base {@link
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException if the format requested is unknown or not supported
    * @throws com::sun::star::container::ElementExistException if a stream with the given FileName already exists
    * @throws ParseException if the input does not conform to the specified file format.
    * @throws com::sun::star::io::IOException if an I/O error occurs.
    */
  def importMetadataFile(
    Format: scala.Double,
    InStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    FileName: java.lang.String,
    BaseURI: XURI,
    Types: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XURI]
  ): XURI
  /**
    * loads document metadata from a medium.
    *
    * If the Medium contains an InteractionHandler, it will be used for error reporting.
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the source
    * @see com.sun.star.document.MediaDescriptor
    * @throws com::sun::star::lang::IllegalArgumentException if the argument does not contain a URL or Stream property
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs while loading
    */
  def loadMetadataFromMedium(
    Medium: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * initialize document metadata from a storage.
    *
    * This method re-initializes the document metadata, loads the stream named "manifest.rdf" from the storage, and then loads all metadata streams
    * mentioned in the manifest.
    *
    * Note that it is not an error if the storage does not contain a manifest. In this case, the document metadata will be default initialized.
    *
    * If an InteractionHandler argument is given, it will be used for error reporting. Otherwise, errors will be reported as exceptions.
    * @param Storage a storage, representing e.g. an ODF package file, or sub-document
    * @param BaseURI a base {@link URI} to resolve relative {@link URI} references N.B.: when loading from an ODF package, the base {@link URI} is not the {@l
    * @param InteractionHandler an InteractionHandler, used for error reporting
    * @throws com::sun::star::lang::IllegalArgumentException if any argument is `NULL`
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs while loading and no InteractionHandler given
    */
  def loadMetadataFromStorage(
    Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    BaseURI: XURI,
    InteractionHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler
  ): scala.Unit
  /**
    * remove a content or styles file from the manifest.
    *
    * This convenience method removes the statements declaring a content or styles file from the manifest graph.
    * @param FileName the name of the stream in the ODF storage
    * @throws com::sun::star::lang::IllegalArgumentException if the FileName is invalid
    * @throws com::sun::star::container::NoSuchElementException if a graph with the given GraphName does not exist
    */
  def removeContentOrStylesFile(FileName: java.lang.String): scala.Unit
  /**
    * remove a metadata file from the manifest and the repository.
    *
    * This convenience method does the following:  1. delete the graph with the given GraphName in the repository 2. remove the statements declaring the
    * graph to be a metadata file from the manifest graph
    * @param GraphName the name of the graph that is to be removed
    * @throws com::sun::star::lang::IllegalArgumentException if the given GraphName is `NULL`
    * @throws com::sun::star::container::NoSuchElementException if a graph with the given GraphName does not exist
    */
  def removeMetadataFile(GraphName: XURI): scala.Unit
  /**
    * stores document metadata to a medium.
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the target
    * @see com.sun.star.document.MediaDescriptor
    * @throws com::sun::star::lang::IllegalArgumentException if the argument does not contain a URL or Stream property
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs while storing
    */
  def storeMetadataToMedium(
    Medium: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * store document metadata to a storage.
    *
    * This method stores all the graphs in the document metadata repository to the given storage.
    *
    * Note that to be stored correctly, a named graph must have a complete entry in the manifest graph.
    * @param Storage a storage, representing e.g. an ODF package file, or sub-document
    * @throws com::sun::star::lang::IllegalArgumentException if Storage argument is `NULL`
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs while loading
    */
  def storeMetadataToStorage(Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): scala.Unit
}

object XDocumentMetadataAccess {
  @scala.inline
  def apply(
    LocalName: java.lang.String,
    Namespace: java.lang.String,
    RDFRepository: XRepository,
    StringValue: java.lang.String,
    addContentOrStylesFile: java.lang.String => scala.Unit,
    addMetadataFile: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XURI]) => XURI,
    getElementByMetadataReference: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair => XMetadatable,
    getElementByURI: XURI => XMetadatable,
    getMetadataGraphsWithType: XURI => stdLib.SafeArray[XURI],
    getRDFRepository: () => XRepository,
    importMetadataFile: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, java.lang.String, XURI, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XURI]) => XURI,
    loadMetadataFromMedium: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Unit,
    loadMetadataFromStorage: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, XURI, activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler) => scala.Unit,
    removeContentOrStylesFile: java.lang.String => scala.Unit,
    removeMetadataFile: XURI => scala.Unit,
    storeMetadataToMedium: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Unit,
    storeMetadataToStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit
  ): XDocumentMetadataAccess = {
    val __obj = js.Dynamic.literal(LocalName = LocalName, Namespace = Namespace, RDFRepository = RDFRepository, StringValue = StringValue, addContentOrStylesFile = js.Any.fromFunction1(addContentOrStylesFile), addMetadataFile = js.Any.fromFunction2(addMetadataFile), getElementByMetadataReference = js.Any.fromFunction1(getElementByMetadataReference), getElementByURI = js.Any.fromFunction1(getElementByURI), getMetadataGraphsWithType = js.Any.fromFunction1(getMetadataGraphsWithType), getRDFRepository = js.Any.fromFunction0(getRDFRepository), importMetadataFile = js.Any.fromFunction5(importMetadataFile), loadMetadataFromMedium = js.Any.fromFunction1(loadMetadataFromMedium), loadMetadataFromStorage = js.Any.fromFunction3(loadMetadataFromStorage), removeContentOrStylesFile = js.Any.fromFunction1(removeContentOrStylesFile), removeMetadataFile = js.Any.fromFunction1(removeMetadataFile), storeMetadataToMedium = js.Any.fromFunction1(storeMetadataToMedium), storeMetadataToStorage = js.Any.fromFunction1(storeMetadataToStorage))
  
    __obj.asInstanceOf[XDocumentMetadataAccess]
  }
}

