package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * manages one, or more, complete sets of configuration data and serves as a factory for objects that provide access to a subset of the configuration.
  *
  * An implementation is usually obtained from a {@link com.sun.star.lang.ServiceManager} . The arguments passed to
  * com::sun::star::lang::XMultiComponentFactory::createInstanceWithContextAndArguments() select the configuration data source. Arguments must be provided
  * as {@link com.sun.star.beans.NamedValue} or {@link com.sun.star.beans.PropertyValue} . If the parameters given are incomplete missing values are taken
  * from the context or the environment. If an instance already exists for the given set of arguments, the existing instance may be reused. In particular,
  * instantiating a provider without explicit arguments to access the default configuration data will always yield the same {@link
  * com.sun.star.configuration.DefaultProvider} object.
  *
  * Some arguments for {@link com.sun.star.lang.XMultiServiceFactory.createInstanceWithArguments()} may be given default values during creation of this
  * service. In particular this applies to the parameters `"Locale"` and `"EnableAsync"` .
  * @deprecated DeprecatedUse theDefaultProvider instead.
  */
@js.native
trait ConfigurationProvider
  extends XMultiServiceFactory
     with XComponent
