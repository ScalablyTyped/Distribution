package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object backendNs {
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.WrappedTargetException
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XJob

  /**
    * Exception thrown when authentication to the underlying backend fails due to an unknown user-id or invalid credentials.
    * @since OOo 1.1.2
    */
  type AuthenticationFailedException = BackendSetupException
  /**
    * Generic exception thrown when physical access to an underlying backend fails.
    *
    * Wraps an exception that originates in the underlying access layer.
    * @since OOo 1.1.2
    */
  type BackendAccessException = WrappedTargetException
  /**
    * Exception thrown when a connection to the underlying backend cannot be established.
    *
    * Examples of this include Misconfigured backend.Communications link failure.{@link Backend} is unavailable temporarily or permanently.Internal failure
    * of the backend access layer.
    * @since OOo 1.1.2
    */
  type CannotConnectException = BackendSetupException
  /**
    * Exception thrown when the connection to the underlying backend was lost irrecoverably.
    *
    * Any future attempts to access data from the backend through this object will also fail.
    * @since OOo 1.1.2
    */
  type ConnectionLostException = BackendAccessException
  /**
    * allows importing data from one configuration repository into another.
    * @since OOo 1.1.2
    */
  type DataImporter = XJob
  /**
    * is a {@link DefaultBackend} , that is the default {@link DefaultBackend} for its {@link com.sun.star.uno.XComponentContext} .
    *
    * This object is accessible as singleton within the context
    *
    * .
    * @since OOo 1.1.2
    */
  type DefaultBackend = Backend
  /**
    * allows scanning a configuration data repository for available components .
    * @since OOo 1.1.2
    */
  type HierarchyBrowser = XJob
  /**
    * Exception thrown when access to the underlying backend fails because of insufficient access rights to some needed resource.
    *
    * Examples of this include Misconfigured anonymous access.Missing rights to get internal configuration data.Missing access to shared or default
    * data.Missing access to personal data.Missing write access when updating data.
    * @since OOo 1.1.2
    */
  type InsufficientAccessRightsException = BackendAccessException
  /**
    * Exception thrown when authentication to the underlying backend fails because the configured authentication mechanism is not supported by the backend
    * or no valid mechanism can be negotiated.
    * @since OOo 1.1.2
    */
  type InvalidAuthenticationMechanismException = BackendSetupException
  /**
    * describe the contents of a layer to an {@link XLayerHandler} object. The contents of the layer is contained in the sequence of {@link PropertyInfo}
    * structures
    * @see PropertyInfo
    */
  type LayerDescriber = XLayerContentDescriber
  /** implements {@link MultiLayerStratum} that provides access to a multiple layers of configuration data from LDAP source */
  type LdapMultiLayerStratum = MultiLayerStratum
  /**
    * implements {@link SingleBackend} that stores data in an LDAP directory.
    * @since OOo 1.1.2
    */
  type LdapSingleBackend = SingleBackend
  /** implements {@link SingleLayerStratum} that provides access to a single layer of configuration data from LDAP source */
  type LdapSingleStratum = SingleLayerStratum
  /**
    * allows importing data from a local configuration data repository or file into any {@link Backend} .
    *
    * Data to be imported can be a single layer either from a full local configuration database or from a particular OOR {@link Update} XML file.
    *
    * Data is imported into the {@link DefaultBackend} .
    * @see com.sun.star.configuration.backend.LocalHierarchyBrowser Service that can be used to locate available layer files or components.
    * @see com.sun.star.configuration.backend.LocalSingleBackend Service that can be used to access a local configuration database.
    * @since OOo 1.1.2
    */
  type LocalDataImporter = DataImporter
  /**
    * is a {@link HierarchyBrowser} , that browses a configuration database stored in the local file system.
    * @see com.sun.star.configuration.backend.LocalSingleBackend
    * @since OOo 1.1.2
    */
  type LocalHierarchyBrowser = HierarchyBrowser
  /** implements {@link SchemaSupplier} providing access to local configuration schemas */
  type LocalSchemaSupplier = SchemaSupplier
  /**
    * implements {@link SingleBackend} that stores data in the local file system using the OOR XML formats.
    * @since OOo 1.1.2
    */
  type LocalSingleBackend = SingleBackend
  /** implements {@link SingleLayerStratum} that provides access to a singe layer of configuration data from local file system */
  type LocalSingleStratum = SingleLayerStratum
  /**
    * imports data into a configuration layer by merging with existing data.
    *
    * No named arguments to {@link com.sun.star.lang.XInitialization.initialize()} are supported.
    * @since OOo 1.1.2
    */
  type MergeImporter = Importer
  /**
    * implements {@link BackendAdapter} that maintains a cache so it can operate even if the {@link SingleBackend} holding the data is inaccessible.
    * @see com.sun.star.configuration.backend.OnlineBackend
    * @since OOo 1.1.2
    */
  type OfflineBackend = BackendAdapter
  /**
    * implements a {@link BackendAdapter} that requires that the {@link SingleBackend} holding the data is continuously accessible.
    * @see com.sun.star.configuration.backend.OfflineBackend
    * @since OOo 1.1.2
    */
  type OnlineBackend = BackendAdapter
  /** implements {@link SingleLayerStratum} that provides access to a singe layer of configuration data from external data store */
  type PlatformBackend = SingleLayerStratum
  /** provides access to configuration schemas */
  type SchemaSupplier = XSchemaSupplier
  /**
    * implements a simple {@link BackendAdapter} that can be used for normal configuration operation.
    *
    * All real functionality is provided by the wrapped {@link SingleBackend} .
    * @see com.sun.star.configuration.backend.OnlineBackend
    * @since OOo 1.1.2
    */
  type SingleBackendAdapter = BackendAdapter
}
