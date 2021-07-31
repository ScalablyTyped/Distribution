package typings.activexLibreoffice.com_.sun.star.accessibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Every class has to support this service in order to be accessible.
  *
  * It provides the means to derive a {@link XAccessibleContext} object  -  which may but usually is not the same object as the object that supports the
  * {@link XAccessible} interface  -  that provides the actual information that is needed to make it accessible.
  *
  * Service `Accessible` is just a wrapper for the interface `XAccessible` . See the interface's documentation for more information.
  * @see XAccessible
  * @since OOo 1.1.2
  */
type Accessible = typings.activexLibreoffice.com_.sun.star.accessibility.XAccessible

/**
  * Indicates invalid or unavailable state information.
  *
  * This exception is thrown to indicate the an accessibility component has been queried for state information that it can not provide. Used by {@link
  * XAccessibleContext.getLocale()} .
  * @see XAccessibleContext.getLocale()
  * @since OOo 1.1.2
  */
type IllegalAccessibleComponentStateException = typings.activexLibreoffice.com_.sun.star.uno.Exception

type MSAAService = typings.activexLibreoffice.com_.sun.star.accessibility.XMSAAService
