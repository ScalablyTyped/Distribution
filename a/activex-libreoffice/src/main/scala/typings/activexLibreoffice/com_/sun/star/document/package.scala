package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.container.XNameReplace
import typings.activexLibreoffice.com_.sun.star.io.IOException
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.FilterOptionsDialog
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.InvalidStateException
import typings.activexLibreoffice.com_.sun.star.util.XRefreshable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Is used for interaction handle to query user decision in case the document being saved was already stored by another user during the editing.
  * @since OOo 3.1
  */
type ChangedByOthersRequest = Exception

/** interface to maintain a list of document revisions */
type DocumentRevisionListPersistence = XDocumentRevisionListPersistence

/**
  * is raised when an operation is attemption at an {@link XUndoManager} which requires a non-empty stack of undo actions, and this requirement is not
  * fulfilled.
  * @since OOo 3.4
  */
type EmptyUndoStackException = InvalidStateException

/**
  * is a collection of all events supported by a document or content of a document
  *
  * Such {@link Events} will be broadcasted by a {@link XEventBroadcaster} to any {@link XEventListener} packed as EventObjects.
  */
type Events = XNameReplace

/**
  * describes a class of service which will be used for deep {@link TypeDetection} in a generic way
  *
  * Due to the registered types, flat {@link TypeDetection} is already possible, i.e. the assignment of types (e.g. to a URL) only on the basis of
  * configuration data. If, however, you imagine special cases (e.g. modifying the file extension of a Writer file from .sdw to .doc), it quickly becomes
  * clear that you cannot always get a correct result with flat detection. To be certain to get correct results, you need deep detection, i.e. the file
  * itself has to be examined. And that is exactly the function of DetectServices. They get all the information collected so far on a document and then
  * decide which type to assign it to. In the new modular model, such a detector is meant as UNO service which registers itself in the office and is
  * requested by the generic type detection if necessary. ;  Therefore you need two pieces of information: The **ServiceName** - This must be a valid UNO
  * service name. It is also an entry in the corresponding configuration list. ;  Example: "com.company.devision.DetectService" ;  Note that this really
  * means the implementation name of the service. Because it's not possible otherwise to distinguish between more than one registered detect services in
  * same office installation! But it's possible for the generic type detection to create an UNO service by its implementation name too.A list of **Types**
  * able to be recognized by this service - You can also implement and register detectors for groups of types. See service {@link TypeDetection} and its
  * configuration for further information.
  * @see TypeDetection
  */
type ExtendedTypeDetection = XExtendedFilterDetection

type FilterAdapter = XFilterAdapter

/** @since LibreOffice 4.1 */
type FilterConfigRefresh = XRefreshable

/** @since LibreOffice 4.1 */
type IndexedPropertyValues = XIndexContainer

/**
  * This service gives access to a collection of names that are child links of the parent object that supplied this service.
  *
  * The {@link com.sun.star.container.XNameAccess} returns elements of {@link com.sun.star.beans.XPropertySet} that implement the service {@link
  * LinkTarget} .
  */
type LinkTargets = XNameAccess

/**
  * Is used for interaction handle to query user decision regarding storing to a location where no lock file can be created.
  * @since OOo 3.0
  */
type LockFileIgnoreRequest = IOException

/** @since LibreOffice 4.1 */
type NamedPropertyValues = XNameContainer

/** allows to import document properties from OOXML format */
type OOXMLDocumentPropertiesImporter = XOOXMLDocumentPropertiesImporter

/**
  * registers embedded server for StarOffice documents
  *
  * This service is only used to register embedded server support for StarOffice documents.
  * @since OOo 1.1.2
  */
type OleEmbeddedServerRegistration = XInterface

/** This service is for a {@link PDFDialog} */
type PDFDialog = FilterOptionsDialog

/**
  * is thrown when an operation is attempted at an {@link XUndoManager} which requires all undo contexts to be closed, but this requirement is not
  * fulfilled.
  * @since OOo 3.4
  */
type UndoContextNotClosedException = InvalidStateException

/**
  * Filter for importing Basic macros from the OASIS Open Office file format.
  *
  * The {@link XImporter.setTargetDocument()} method must be called in order to provide the import component with the target document to which the data
  * should be imported. The {@link com.sun.star.xml.sax.XDocumentHandler} interface is used to stream the XML data into the filter.
  * @since OOo 2.0
  */
type XMLOasisBasicImporter = XXMLOasisBasicImporter
