package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Leading
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.Block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockBuilder extends js.Object {
  def apply(value: String): Block = js.native
  def apply(value: String, leading: Boolean): Block = js.native
  def apply(value: String, leading: Boolean, trailing: Boolean): Block = js.native
  def from(params: Anon_Leading): Block = js.native
}

