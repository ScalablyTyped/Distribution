package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * manages one or more complete sets of hierarchy data and serves as a factory for objects that provide access to a subset of the data.
  *
  * **Note:** This is an abstract service. This means, that there should never be implementations that can be instantiated using the service name
  * `com.sun.star.ucb.HierarchyDataSource` . Each implementation must provide its own service name that can be used to create instances of that service
  * implementation. Important for those service specifications is also to specify which of the optional parts are supported by the implementation.
  */
@js.native
trait HierarchyDataSource
  extends XMultiServiceFactory
     with XComponent
