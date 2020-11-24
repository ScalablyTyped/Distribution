package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeSetting extends js.Object {
  
  def changeSetting(key: String, value: js.Any): Unit = js.native
  def changeSetting(key: String, value: js.Any, hideLoading: Boolean): Unit = js.native
  
  var settings: PartialProSettings = js.native
}
