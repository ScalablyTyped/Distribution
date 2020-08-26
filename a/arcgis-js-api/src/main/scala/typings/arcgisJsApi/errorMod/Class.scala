package typings.arcgisJsApi.errorMod

import typings.arcgisJsApi.esri.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/core/Error", JSImport.Namespace)
@js.native
class Class protected () extends Error {
  def this(name: String) = this()
  def this(name: String, message: String) = this()
  def this(name: String, message: js.UndefOr[scala.Nothing], details: js.Any) = this()
  def this(name: String, message: String, details: js.Any) = this()
}

