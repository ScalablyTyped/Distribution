package typings.apolloProtobufjs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/cli/pbts", JSImport.Namespace)
@js.native
object pbtsMod extends js.Object {
  def main(args: js.Array[String]): js.UndefOr[Double] = js.native
  def main(args: js.Array[String], callback: pbtsCallback): js.UndefOr[Double] = js.native
  type pbtsCallback = js.Function2[/* err */ Error | Null, /* output */ js.UndefOr[String], Unit]
}

