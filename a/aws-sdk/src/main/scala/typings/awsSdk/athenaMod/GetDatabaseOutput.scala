package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDatabaseOutput extends js.Object {
  
  /**
    * The database returned.
    */
  var Database: js.UndefOr[typings.awsSdk.athenaMod.Database] = js.native
}
object GetDatabaseOutput {
  
  @scala.inline
  def apply(): GetDatabaseOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabaseOutput]
  }
  
  @scala.inline
  implicit class GetDatabaseOutputOps[Self <: GetDatabaseOutput] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: Database): Self = this.set("Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("Database", js.undefined)
  }
}
