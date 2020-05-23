package typings.activexLibreoffice.com_.sun.star.resource

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a string resource represented by a {@link com.sun.star.resource.XStringResourceResolver} . */
trait XStringResourceSupplier extends XInterface {
  /**
    * Provides access to a string resource. Depending on the context the returned object may also support {@link
    * com.sun.star.resource.XStringResourceManager} or {@link com.sun.star.resource.XStringResourcePersistence} or {@link
    * com.sun.star.resource.XStringResourceWithStorage}
    * @returns an interface {@link com.sun.star.resource.XStringResourceResolver}
    */
  val StringResource: XStringResourceResolver
  /**
    * Provides access to a string resource. Depending on the context the returned object may also support {@link
    * com.sun.star.resource.XStringResourceManager} or {@link com.sun.star.resource.XStringResourcePersistence} or {@link
    * com.sun.star.resource.XStringResourceWithStorage}
    * @returns an interface {@link com.sun.star.resource.XStringResourceResolver}
    */
  def getStringResource(): XStringResourceResolver
}

object XStringResourceSupplier {
  @scala.inline
  def apply(
    StringResource: XStringResourceResolver,
    acquire: () => Unit,
    getStringResource: () => XStringResourceResolver,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStringResourceSupplier = {
    val __obj = js.Dynamic.literal(StringResource = StringResource.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStringResource = js.Any.fromFunction0(getStringResource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStringResourceSupplier]
  }
}

