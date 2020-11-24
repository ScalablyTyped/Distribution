package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("agilite", "Templates")
@js.native
class Templates protected () extends js.Object {
  def this(config: AgiliteConfig) = this()
  
  def deleteData(recordId: String): js.Any = js.native
  
  def execute(profileKey: String, data: js.Any): js.Any = js.native
  
  def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
  
  def postData(data: js.Any): js.Any = js.native
  
  def putData(recordId: String, data: js.Any): js.Any = js.native
}
