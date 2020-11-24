package typings.activexLibreoffice.com_.sun.star.packages

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XHierarchicalNameAccess
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.ChangesSet
import typings.activexLibreoffice.com_.sun.star.util.XChangesBatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link Package} is a service that provides access to a set of files and folders contained within a {@link Package} . One instance of the {@link
  * Package} service exists for each {@link Package} file to be manipulated.
  *
  * Each instance is created with an argument which specifies the URL of the {@link Package} file to which the user requires access. If the instance is
  * created without arguments, it must be initialized with the {@link com.sun.star.lang.XInitialization} service methods before it is a valid instance of
  * the service.
  */
@js.native
trait Package
  extends XInitialization
     with XHierarchicalNameAccess
     with XSingleServiceFactory
     with XChangesBatch
object Package {
  
  @scala.inline
  def apply(
    PendingChanges: ChangesSet,
    acquire: () => Unit,
    commitChanges: () => Unit,
    createInstance: () => XInterface,
    createInstanceWithArguments: SeqEquiv[_] => XInterface,
    getByHierarchicalName: String => js.Any,
    getPendingChanges: () => ChangesSet,
    hasByHierarchicalName: String => Boolean,
    hasPendingChanges: () => Boolean,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): Package = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), commitChanges = js.Any.fromFunction0(commitChanges), createInstance = js.Any.fromFunction0(createInstance), createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getPendingChanges = js.Any.fromFunction0(getPendingChanges), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[Package]
  }
}
