package typings.adone

import typings.adone.adoneNs.netNs.httpNs.clientNs.INs.FormValueOptions
import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: FormValueOptions
  var value: String | Buffer | Readable
}

object Anon_Options {
  @scala.inline
  def apply(options: FormValueOptions, value: String | Buffer | Readable): Anon_Options = {
    val __obj = js.Dynamic.literal(options = options, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Options]
  }
}

