package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.com_.sun.star.registry.XSimpleRegistry
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a collection of implementations for services reading from a persistent registry storage.
  *
  * For usage of the service manager have a look at service description of {@link ServiceManager} .
  * @see ServiceManager
  */
@js.native
trait RegistryServiceManager
  extends ServiceManager
     with XInitialization {
  
  /** Specifies the current registry to be read from. */
  var Registry: XSimpleRegistry = js.native
  
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  /* InferMemberOverrides */
  override def getAvailableServiceNames(): SafeArray[String] = js.native
}
