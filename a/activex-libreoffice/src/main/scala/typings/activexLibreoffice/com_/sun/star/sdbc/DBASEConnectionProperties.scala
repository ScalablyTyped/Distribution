package typings.activexLibreoffice.com_.sun.star.sdbc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the properties for a dBase connection (session) with a specific database. These properties can be used when calling the method {@link
  * com.sun.star.sdbc.XDriver.connect()} or {@link com.sun.star.sdbc.XDriverManager.getConnectionWithInfo()} .
  *
  * The properties for a connection contain additional information about how to connect to a database and how to control the behavior of the resulting
  * connection should be.
  * @see com.sun.star.sdbc.XDriver
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.FILEConnectionProperties
  */
@js.native
trait DBASEConnectionProperties extends FILEConnectionProperties {
  /** `TRUE` when deleted rows should be shown, otherwise `FALSE` */
  var ShowDeleted: Boolean = js.native
}

object DBASEConnectionProperties {
  @scala.inline
  def apply(CharSet: String, ShowDeleted: Boolean, password: String, user: String): DBASEConnectionProperties = {
    val __obj = js.Dynamic.literal(CharSet = CharSet.asInstanceOf[js.Any], ShowDeleted = ShowDeleted.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBASEConnectionProperties]
  }
  @scala.inline
  implicit class DBASEConnectionPropertiesOps[Self <: DBASEConnectionProperties] (val x: Self) extends AnyVal {
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
    def setShowDeleted(value: Boolean): Self = this.set("ShowDeleted", value.asInstanceOf[js.Any])
  }
  
}

