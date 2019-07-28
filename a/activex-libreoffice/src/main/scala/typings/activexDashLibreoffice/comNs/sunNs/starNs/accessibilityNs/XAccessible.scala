package typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface has to be implemented by any class that wants to be accessible.
  *
  * It is used to provide access to the {@link XAccessibleContext} interface but allows at the same time that the interface is implemented by another
  * class.
  *
  * The distinction between the interfaces {@link XAccessible} and {@link XAccessibleContext} makes it possible to split up the implementation of the
  * class that is made accessible and the actual accessibility code into two (mostly) independent parts. The only necessary dependence is the {@link
  * XAccessible.getAccessibleContext()} function that returns the accessible context. This one-way link has to be persistent in some sense: As long as
  * there is at least one reference to a specific {@link XAccessibleContext} object the {@link XAccessible} object has to return the same context for
  * every call to {@link XAccessible.getAccessibleContext()} . This is necessary to allow the use of object identity for comparing accessibility contexts
  * for being equal.
  * @see AccessibleContext
  * @since OOo 1.1.2
  */
trait XAccessible extends XInterface {
  /**
    * Returns the {@link AccessibleContext} associated with this object.
    *
    * The idea to let this interface only return an {@link XAccessibleContext} instead of directly supporting its functions is to allow the separation of
    * the implementation of the functions that make a class accessible from the implementation of that class. You may, of course, implement {@link
    * XAccessible} and {@link XAccessibleContext} in one class.
    * @returns A reference to the object that contains the actual accessibility information.
    * @see AccessibleContext
    */
  val AccessibleContext: XAccessibleContext
  /**
    * Returns the {@link AccessibleContext} associated with this object.
    *
    * The idea to let this interface only return an {@link XAccessibleContext} instead of directly supporting its functions is to allow the separation of
    * the implementation of the functions that make a class accessible from the implementation of that class. You may, of course, implement {@link
    * XAccessible} and {@link XAccessibleContext} in one class.
    * @returns A reference to the object that contains the actual accessibility information.
    * @see AccessibleContext
    */
  def getAccessibleContext(): XAccessibleContext
}

object XAccessible {
  @scala.inline
  def apply(
    AccessibleContext: XAccessibleContext,
    acquire: () => Unit,
    getAccessibleContext: () => XAccessibleContext,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessible = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, acquire = js.Any.fromFunction0(acquire), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAccessible]
  }
}

