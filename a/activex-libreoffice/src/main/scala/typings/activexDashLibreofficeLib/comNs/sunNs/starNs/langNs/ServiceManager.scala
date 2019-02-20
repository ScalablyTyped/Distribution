package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContentEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  /* InferMemberOverrides */
  override val AvailableServiceNames: activexDashInteropLib.SafeArray[java.lang.String] = js.native
  /** specifies the default component context to be used, if instanciating services via {@link XMultiServiceFactory} */
  var DefaultContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext = js.native
  /**
    * Provides the available names of the factory to be used to create instances.
    * @returns sequence of all names
    */
  /* InferMemberOverrides */
  override def getAvailableServiceNames(): activexDashInteropLib.SafeArray[java.lang.String] = js.native
}

