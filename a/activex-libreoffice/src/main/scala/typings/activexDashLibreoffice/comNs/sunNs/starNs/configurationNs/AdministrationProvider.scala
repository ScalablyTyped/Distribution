package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XMultiServiceFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages one, or more, complete sets of configuration data for administrative purposes and serves as a factory for objects that provide access to
  * subsets of these shared configurations.
  *
  * Shared sets of configuration data usually serve to provide defaults, which are used if no individual settings are present. Depending on the data store
  * multiple layers of defaults may be combined with a user-specific layer to make up the final configuration.
  *
  * Many aspects of the supported behavior depend strongly on the underlying data store and on the administrative structures it defines. With some data
  * stores this service also enables access to individual user's configuration data by an administrator.
  *
  * On the other hand, in the simplest model there is only a single layer of default data which is accessible through this service.
  *
  * An implementation is usually obtained from a {@link com.sun.star.lang.ServiceManager} . The arguments passed to
  * com::sun::star::lang::XMultiComponentFactory::createInstanceWithContextAndArguments() select the configuration data source. They may also define the
  * scope of administrable data or contain credentials to be used to authorize the administrative access. Missing parameters may be filled in from the
  * context or the environment.
  * @see com.sun.star.configuration.ConfigurationProvider Offers the same services and creates the same accessor objects as this service, but accesses the
  */
@js.native
trait AdministrationProvider
  extends XMultiServiceFactory
     with XComponent

