package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the reference to a SQL structured type value in the database. A Ref can be saved to persistent storage. A Ref is dereferenced by passing it as a
  * parameter to a SQL statement and executing the statement.
  */
@js.native
trait XRef extends XInterface {
  /**
    * gets the fully-qualified SQL structured type name of the referenced item.
    * @returns the base type name
    * @throws SQLException if a database access error occurs.
    */
  val BaseTypeName: String = js.native
  /**
    * gets the fully-qualified SQL structured type name of the referenced item.
    * @returns the base type name
    * @throws SQLException if a database access error occurs.
    */
  def getBaseTypeName(): String = js.native
}

object XRef {
  @scala.inline
  def apply(
    BaseTypeName: String,
    acquire: () => Unit,
    getBaseTypeName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRef = {
    val __obj = js.Dynamic.literal(BaseTypeName = BaseTypeName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBaseTypeName = js.Any.fromFunction0(getBaseTypeName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRef]
  }
  @scala.inline
  implicit class XRefOps[Self <: XRef] (val x: Self) extends AnyVal {
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
    def setBaseTypeName(value: String): Self = this.set("BaseTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBaseTypeName(value: () => String): Self = this.set("getBaseTypeName", js.Any.fromFunction0(value))
  }
  
}

