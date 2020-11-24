package typings.antd.uploadInterfaceMod

import typings.antd.anon.PercentNumber
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RcCustomRequestOptions extends js.Object {
  
  var action: String = js.native
  
  var data: js.Object = js.native
  
  var file: RcFile = js.native
  
  var filename: String = js.native
  
  var headers: js.Object = js.native
  
  def onError(error: Error): Unit = js.native
  def onError(error: Error, response: js.UndefOr[scala.Nothing], file: RcFile): Unit = js.native
  def onError(error: Error, response: js.Any): Unit = js.native
  def onError(error: Error, response: js.Any, file: RcFile): Unit = js.native
  
  def onProgress(event: PercentNumber, file: RcFile): Unit = js.native
  
  def onSuccess(response: js.Object, file: RcFile): Unit = js.native
  
  var withCredentials: Boolean = js.native
}
