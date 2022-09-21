package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.sdbc.SQLException
import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * This exception is thrown to indicate that an attempt was made to reinitialize an object that can only be initialized once.
  * @author Kai Sommerfeld
  * @version 1.0
  */
type AlreadyInitializedException = Exception

/** is a factory for {@link CachedContentResultSet} implementations. */
type CachedContentResultSetFactory = XCachedContentResultSetFactory

/** is a factory for {@link CachedContentResultSetStub} implementations. */
type CachedContentResultSetStubFactory = XCachedContentResultSetStubFactory

/** is a factory for {@link CachedDynamicResultSet} implementations. */
type CachedDynamicResultSetFactory = XCachedDynamicResultSetFactory

/** is a factory for {@link CachedDynamicResultSetStub} implementations. */
type CachedDynamicResultSetStubFactory = XCachedDynamicResultSetStubFactory

/**
  * The Cmis {@link Content} Provider implements a {@link ContentProvider} for the {@link UniversalContentBroker} (UCB).
  *
  * The served contents enable access to directories and files on a cmis-enabled server.
  * @see com.sun.star.ucb.Content
  * @since LibreOffice 3.5
  */
type CmisContentProvider = XContentProvider

/**
  * This exception is thrown to indicate that a command was aborted.
  * @author Kai Sommerfeld
  * @see XCommandProcessor
  * @version 1.0
  */
type CommandAbortedException = Exception

/** is a factory for {@link ContentProviderProxy} implementations. */
type ContentProviderProxyFactory = XContentProviderFactory

/**
  * A {@link ContentTransmitter} is a service that provides
  * @deprecated Deprecated
  */
type ContentTransmitter = XContentTransmitter

/**
  * is a concrete implementation of service {@link HierarchyDataSource} , which uses the service {@link com.sun.star.configuration.ConfigurationProvider}
  * for reading and writing hierarchy data.
  */
type DefaultHierarchyDataSource = HierarchyDataSource

/**
  * is thrown by {@link XCommandProcessor.execute()} to indicate that the same command identifier was used for two threads.
  *
  * Each thread must use its own command identifier, which must be obtained using {@link XCommandProcessor.createCommandIdentifier()} . {@link Command}
  * identifier `0` , which indicates that the command shall never be aborted by a client, can be used by any thread.
  * @author Kai Sommerfeld
  * @see XCommandProcessor
  * @version 1.0
  */
type DuplicateCommandIdentifierException = Exception

/**
  * is thrown to indicate that a content provider with the same identifier already was registered with a content provider manager.
  * @author Kai Sommerfeld
  * @see XContentProviderManager
  * @version 1.0
  */
type DuplicateProviderException = Exception

/**
  * provides read access to a static or dynamically changing {@link ContentResultSet} .
  *
  * For example, a {@link DynamicResultSet} is returned from the open-command executed by an {@link XCommandProcessor} of the service {@link Content} .
  */
type DynamicResultSet = XDynamicResultSet

/**
  * The Expand {@link Content} Provider implements a {@link ContentProvider} for the {@link UniversalContentBroker} (UCB).
  *
  * It provides access to content via macrofied URLs, e.g. vnd.sun.star.expand://$UNO_USER_PACKAGES/abc.
  *
  * Macros which will be expanded using the singleton /singletons/com. {@link sun.star.util.theMacroExpander} of the process's initial component context.
  * @see Content
  */
type ExpandContentProvider = ContentProvider

/**
  * The FTP {@link Content} Provider (FCP) implements a {@link ContentProvider} for the {@link UniversalContentBroker} (UCB).
  *
  * The served contents enable access to directories and files on a ftp-server.
  * @see com.sun.star.ucb.Content
  * @since OOo 1.1.2
  */
type FTPContentProvider = XContentProvider

type GIOContentProvider = XContentProvider

type GnomeVFSContentProvider = XContentProvider

/**
  * The Help {@link Content} Provider (HCP) implements a {@link ContentProvider} for the {@link UniversalContentBroker} (UCB).
  *
  * The served contents enable access to the help contents and to the search engine.
  * @see com.sun.star.ucb.Content
  */
type HelpContentProvider = XContentProvider

/**
  * The Hierarchy {@link Content} Provider (HCP) implements a {@link ContentProvider} for the {@link UniversalContentBroker} (UCB).
  *
  * It provides access to a persistent, customizable hierarchy of contents (folders and links).
  * @see com.sun.star.ucb.Content
  */
type HierarchyContentProvider = XContentProvider

/**
  * This exception is thrown to indicate an illegal content identifier.
  * @author Kai Sommerfeld
  * @see XContent
  * @see XContentIdentifier
  * @version 1.0
  */
type IllegalIdentifierException = Exception

/**
  * An interaction request to inform the client of a "transfer" command that the supplied source URL is not supported.
  * @see XCommandProcessor
  */
type InteractiveBadTransferURLException = Exception

/**
  * An error indicating that a lock that has been previously obtained by this OOo session has expired.
  * @since OOo 3.3
  */
type InteractiveLockingLockExpiredException = InteractiveLockingException

/**
  * An error indicating that the resource is not locked.
  *
  * This error for instance can occur when trying to unlock a resource that is not locked.
  * @since OOo 3.3
  */
type InteractiveLockingNotLockedException = InteractiveLockingException

/**
  * An error related to network operations.
  *
  * Various meaningful errors are derived from this exception.
  */
type InteractiveNetworkException = ClassifiedInteractionRequest

/** A network error specifying a general failure. */
type InteractiveNetworkGeneralException = InteractiveNetworkException

/** A network error specifying an off line condition. */
type InteractiveNetworkOffLineException = InteractiveNetworkException

/** This exception is thrown to indicate that a Listener is already set while only one is allowed. */
type ListenerAlreadySetException = Exception

/**
  * specifies the access type of a lock.
  * @see LockEntry
  */
type LockType = `0`

/**
  * This exception is used to indicate that there is an {@link com.sun.star.io.XInputStream} missing.
  *
  * For example, the command "insert" may fail, if the implementation expects that an input stream is supplied with the given {@link
  * InsertCommandArgument} .
  * @author Kai Sommerfeld
  * @see Content
  * @version 1.0
  */
type MissingInputStreamException = Exception

/**
  * The ODMA {@link Content} Provider (OCP) implements a {@link ContentProvider} for the {@link UniversalContentBroker} (UCB).
  *
  * It provides access to a document structure stored on a Document Management System (DMS).
  * @see com.sun.star.ucb.ContentProvider
  * @see com.sun.star.ucb.Content
  * @see com.sun.star.ucb.ODMAContent
  * @since OOo 1.1.2
  */
type ODMAContentProvider = XContentProvider

/**
  * The Package {@link Content} Provider (PCP) implements a {@link ContentProvider} for the {@link UniversalContentBroker} (UCB).
  *
  * It provides access to packages ( zip / jar archive files ) containing folders and streams.
  * @see com.sun.star.ucb.Content
  */
type PackageContentProvider = XContentProvider

/**
  * This service provides access to the meta data of the well known (predefined) UCB properties.
  * @see com.sun.star.ucb.UniversalContentBroker
  * @see com.sun.star.ucb.ContentProvider
  * @see com.sun.star.ucb.Content
  */
type PropertiesManager = XPropertySetInfo

/**
  * This exception is thrown to propagate exceptions thrown by operations on ContentResultSets.
  * @author Kai Sommerfeld
  * @version 1.0
  */
type ResultSetException = SQLException

/** This exception is thrown to indicate that a needed service was not registered. */
type ServiceNotFoundException = Exception

/**
  * Offers a simple access to resources, like files and folders located in a local file system or on an WebDAV server.
  * @@author Andreas Bregas
  * @@version 1.0 07/25/2000
  */
type SimpleFileAccess = XSimpleFileAccess3

/** is a factory for {@link DynamicResultSet} implementations, which will be sorted according to the given sorting options. */
type SortedDynamicResultSetFactory = XSortedDynamicResultSetFactory

/** creates instances of the service {@link PropertySetRegistry} . */
type Store = XPropertySetRegistryFactory

/**
  * The Transient Documents {@link Content} Provider (TDCP) implements a {@link ContentProvider} for the {@link UniversalContentBroker} (UCB).
  *
  * It provides access to the hierarchical structure of the documents that are active in a running OpenOffice.org process. As long as a document was not
  * closed, the TDCP can access it. All documents that have been loaded - regardless of their persistent document format (sxw, doc, sxc, xls, ...) or that
  * have been created but not yet saved to any storage medium, are supported. The TDCP is not able to load any documents itself. This is exclusively done
  * by the OpenOffice.org document handling framework. The document contents provided by the TDCP represent live data, which may differ from any
  * persistent representation of the document, for instance, because the user modified the document after loading, but did not yet save it.
  * @see TransientDocumentsRootContent
  * @see TransientDocumentsDocumentContent
  * @see TransientDocumentsFolderContent
  * @see TransientDocumentsStreamContent
  * @since OOo 2.0
  */
type TransientDocumentsContentProvider = XContentProvider

/**
  * is thrown to indicate that the a command is not known by the implementation of an interface.
  * @author Kai Sommerfeld
  * @see XCommandProcessor
  * @version 1.0
  */
type UnsupportedCommandException = Exception

/**
  * The WebDAV {@link Content} Provider (DCP) implements a {@link ContentProvider} for the {@link UniversalContentBroker} (UCB).
  *
  * It provides access to WebDAV and standard HTTP servers. The DCP communicates with the server using the WebDAV protocol which is an extension to the
  * HTTP protocol or using the plain HTTP protocol in case the server is not WebDAV enabled.
  * @see com.sun.star.ucb.Content
  */
type WebDAVContentProvider = XContentProvider

/**
  * is an interaction continuation used to instruct the requester to replace existing data.
  *
  * For example, this continuation can be selected when handling a {@link NameClashResolveRequest} in order to instruct the requester to overwrite the
  * clashing data.
  * @author Kai Sommerfeld
  * @version 1.0
  */
type XInteractionReplaceExistingData = XInteractionContinuation
