package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.HTML
import typings.angularCore.angularCoreStrings.ResourceURL
import typings.angularCore.angularCoreStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreStrings.URL
  - typings.angularCore.angularCoreStrings.HTML
  - typings.angularCore.angularCoreStrings.ResourceURL
  - typings.angularCore.angularCoreStrings.Script
  - typings.angularCore.angularCoreStrings.Style
*/
trait ɵBypassType extends js.Object

object ɵBypassType {
  @scala.inline
  def Html: HTML = this.cast("HTML")
  @scala.inline
  def ResourceUrl: ResourceURL = this.cast("ResourceURL")
  @scala.inline
  def Script: typings.angularCore.angularCoreStrings.Script = this.cast("Script")
  @scala.inline
  def Style: typings.angularCore.angularCoreStrings.Style = this.cast("Style")
  @scala.inline
  def Url: URL = this.cast("URL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

