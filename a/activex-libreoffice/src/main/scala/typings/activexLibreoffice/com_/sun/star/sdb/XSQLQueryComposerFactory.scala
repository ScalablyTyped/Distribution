package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a factory for instances of service {@link com.sun.star.sdb.SQLQueryComposer} . */
@js.native
trait XSQLQueryComposerFactory extends XInterface {
  /**
    * creates a new query composer.
    * @returns the {@link SQLQueryComposer} object
    */
  def createQueryComposer(): XSQLQueryComposer = js.native
}

object XSQLQueryComposerFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createQueryComposer: () => XSQLQueryComposer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSQLQueryComposerFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createQueryComposer = js.Any.fromFunction0(createQueryComposer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSQLQueryComposerFactory]
  }
  @scala.inline
  implicit class XSQLQueryComposerFactoryOps[Self <: XSQLQueryComposerFactory] (val x: Self) extends AnyVal {
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
    def setCreateQueryComposer(value: () => XSQLQueryComposer): Self = this.set("createQueryComposer", js.Any.fromFunction0(value))
  }
  
}

