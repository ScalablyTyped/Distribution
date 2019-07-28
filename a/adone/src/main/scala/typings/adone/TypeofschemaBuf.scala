package typings.adone

import typings.adone.adoneNs.dataNs.protobufNs.schemaNs.INs.Schema
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofschemaBuf extends js.Object {
  val INs: js.Any = js.native
  def parse(buf: String): Schema = js.native
  def parse(buf: Buffer): Schema = js.native
  def stringify(schema: js.Object): String = js.native
}

