package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typings.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides write access to a dynamic, homogeneous, non-hierarchical set of values or objects.
  *
  * Allows adding and removing elements. Helps create new elements to be added.
  *
  * This service extends {@link SimpleSetAccess} to support modifying the container. Any child objects shall in turn support modifying access.
  */
@js.native
trait SimpleSetUpdate
  extends SimpleSetAccess
     with XNameContainer
     with XSingleServiceFactory
     with XMultiServiceFactory {
  
  def createInstanceWithArguments(aArguments: String): XInterface = js.native
}
