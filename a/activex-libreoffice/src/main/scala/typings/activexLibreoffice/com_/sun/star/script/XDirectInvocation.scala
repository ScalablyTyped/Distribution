package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to an object's methods and properties. */
@js.native
trait XDirectInvocation extends XInterface {
  /**
    * provides access to methods and properties exposed by an object.
    * @param aName the method to invoke
    * @param aParams all parameters, out parameters are not supported
    */
  def directInvoke(aName: String, aParams: SeqEquiv[_]): js.Any = js.native
  /** returns `TRUE` if the method or property with the specified name exists, else `FALSE` . */
  def hasMember(aName: String): Boolean = js.native
}

object XDirectInvocation {
  @scala.inline
  def apply(
    acquire: () => Unit,
    directInvoke: (String, SeqEquiv[_]) => js.Any,
    hasMember: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDirectInvocation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), directInvoke = js.Any.fromFunction2(directInvoke), hasMember = js.Any.fromFunction1(hasMember), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDirectInvocation]
  }
  @scala.inline
  implicit class XDirectInvocationOps[Self <: XDirectInvocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectInvoke(value: (String, SeqEquiv[_]) => js.Any): Self = this.set("directInvoke", js.Any.fromFunction2(value))
    @scala.inline
    def setHasMember(value: String => Boolean): Self = this.set("hasMember", js.Any.fromFunction1(value))
  }
  
}

