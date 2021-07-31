package typings.activexLibreoffice.com_.sun.star.configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** is thrown when an application tries to create a configuration provider but the configuration can't be loaded */
type CannotLoadConfigurationException = typings.activexLibreoffice.com_.sun.star.uno.Exception

/**
  * This exception is thrown in case the global UI configuration (including menubars/toolbars and accelerators) does not exists or contains corrupted
  * data.
  * @since OOo 2.3
  */
type CorruptedUIConfigurationException = typings.activexLibreoffice.com_.sun.star.configuration.CorruptedConfigurationException

/** is thrown when creating a configuration provider fails because the user's installation for the is missing or incomplete */
type InstallationIncompleteException = typings.activexLibreoffice.com_.sun.star.configuration.CannotLoadConfigurationException

type Update = typings.activexLibreoffice.com_.sun.star.configuration.XUpdate

/**
  * The default {@link ConfigurationProvider} .
  *
  * This singleton somewhat arbitrarily makes available the {@link com.sun.star.lang.XMultiServiceFactory} interface of the (old-style) {@link
  * DefaultProvider} service, as it is the most frequently used one. See the {@link DefaultProvider} service for details.
  * @since OOo 1.1.2
  */
type theDefaultProvider = typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
