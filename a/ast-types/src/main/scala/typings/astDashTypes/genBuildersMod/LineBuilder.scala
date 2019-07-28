package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Leading
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineBuilder extends js.Object {
  def apply(value: String): Line = js.native
  def apply(value: String, leading: Boolean): Line = js.native
  def apply(value: String, leading: Boolean, trailing: Boolean): Line = js.native
  def from(params: Anon_Leading): Line = js.native
}

