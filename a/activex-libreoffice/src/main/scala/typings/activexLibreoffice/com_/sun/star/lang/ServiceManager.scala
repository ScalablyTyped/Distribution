package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.container.XContentEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XSet
import typings.activexLibreoffice.com_.sun.star.uno.XComponentContext
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a collection of implementations for services. This is a singleton you commonly find in your component context under key
  * `/singletons/com.sun.star.lang.theServiceManager` .
  *
  * The factories are accessed with a service name. It is possible to access the factories with their implementation names, but you should avoid this.
  *
  * Service factories added via {@link com.sun.star.container.XSet} should support the following interfaces:
  *
  * **XServiceInfo**: supported interfaces/ implementation name;
  *
  * **XSingleComponentFactory(optional) **: is used to create instances of the implementation.;
  *
  * **XComponent (optional) **: The service manager calls the method {@link com.sun.star.lang.XComponent.dispose()} on the factory when going down (i.e.
  * it is commonly disposed by the component context).
  *
  *
  *
  * Since LibreOffice 3.6, in addition to instances of {@link XServiceInfo} et al, the {@link com.sun.star.container.XSet} of at least the default C++
  * service manager implementation now also supports sequences of {@link com.sun.star.beans.NamedValue} in `insert` and `remove` . The sequence elements
  * must each have a `Name` of `uri` and a string `Value` that is the URI of a service rdb. It is legal for there to be no such `uri` elements. For
  * `insert` , there can additionally be an optional element with a `Name` of `component-context` and a value that is a non-null reference of type {@link
  * com.sun.star.uno.XComponentContext} that shall be used instead of this service manager's default component context when loading the corresponding
  * implementations.
  * @see com.sun.star.uno.XComponentContext
  */
@js.native
trait ServiceManager
  extends MultiServiceFactory
     with XComponent
     with XSet
     with XContentEnumerationAccess
     with XPropertySet {
  
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  /* InferMemberOverrides */
  override val AvailableServiceNames: SafeArray[String] = js.native
  
  /** specifies the default component context to be used, if instanciating services via {@link XMultiServiceFactory} */
  var DefaultContext: XComponentContext = js.native
  
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  /* InferMemberOverrides */
  override def getAvailableServiceNames(): SafeArray[String] = js.native
}
