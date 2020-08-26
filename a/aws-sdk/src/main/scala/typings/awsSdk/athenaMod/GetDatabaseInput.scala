package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDatabaseInput extends js.Object {
  /**
    * The name of the data catalog that contains the database to return.
    */
  var CatalogName: CatalogNameString = js.native
  /**
    * The name of the database to return.
    */
  var DatabaseName: NameString = js.native
}

object GetDatabaseInput {
  @scala.inline
  def apply(CatalogName: CatalogNameString, DatabaseName: NameString): GetDatabaseInput = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatabaseInput]
  }
  @scala.inline
  implicit class GetDatabaseInputOps[Self <: GetDatabaseInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCatalogName(value: CatalogNameString): Self = this.set("CatalogName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseName(value: NameString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
  }
  
}

