package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("agilite", "Files")
@js.native
class Files protected () extends js.Object {
  def this(config: AgiliteConfig) = this()
  
  def deleteFile(recordId: String): js.Any = js.native
  
  def getFile(recordId: String, responseType: js.Any): js.Any = js.native
  
  def getFileName(recordId: String): js.Any = js.native
  
  var responseType: typings.agilite.mod.responseType = js.native
  
  def uploadFile(fileName: String, contentType: String, data: js.Any): js.Any = js.native
}
