package typings.activexLibreoffice.com_.sun.star.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object provider {
  /** This service provides a means of browsing and invoking scripts in a single language. */
  type LanguageScriptProvider = typings.activexLibreoffice.com_.sun.star.script.provider.ScriptProvider
  /** This service acts as a wrapper around the various language specific ScriptProviders. */
  type MasterScriptProvider = typings.activexLibreoffice.com_.sun.star.script.provider.ScriptProvider
  /**
    * This service is used to create MasterScriptProviders. Note: You shouldn't ever instantiate the {@link MasterScriptProvider} service directly, you
    * should always use this service.
    * @deprecated Deprecatedrather use the singleton service theMasterScriptProviderFactory
    */
  type MasterScriptProviderFactory = typings.activexLibreoffice.com_.sun.star.script.provider.XScriptProviderFactory
  /** This service is a Basic-specific {@link LanguageScriptProvider} . */
  type ScriptProviderForBasic = typings.activexLibreoffice.com_.sun.star.script.provider.LanguageScriptProvider
  /** This service is a BeanShell-specific {@link LanguageScriptProvider} . */
  type ScriptProviderForBeanShell = typings.activexLibreoffice.com_.sun.star.script.provider.LanguageScriptProvider
  /** This service is a Java-specific {@link LanguageScriptProvider} . */
  type ScriptProviderForJava = typings.activexLibreoffice.com_.sun.star.script.provider.LanguageScriptProvider
  /** This service is a Java-specific {@link LanguageScriptProvider} . */
  type ScriptProviderForJavaScript = typings.activexLibreoffice.com_.sun.star.script.provider.LanguageScriptProvider
  /**
    * The one and only {@link MasterScriptProviderFactory}
    *
    * To get the singleton call getValueByName on the component context `; /singletons/com.sun.star.script.provider.theMasterScriptProviderFactory`
    */
  type theMasterScriptProviderFactory = typings.activexLibreoffice.com_.sun.star.script.provider.XScriptProviderFactory
}
