package typings.apolloProtobufjs

import typings.apolloProtobufjs.pbjsMod.pbjsCallback
import typings.apolloProtobufjs.pbtsMod.pbtsCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/cli", JSImport.Namespace)
@js.native
object cliMod extends js.Object {
  @js.native
  object pbjs extends js.Object {
    def main(args: js.Array[String]): js.UndefOr[Double] = js.native
    def main(args: js.Array[String], callback: pbjsCallback): js.UndefOr[Double] = js.native
  }
  
  @js.native
  object pbts extends js.Object {
    def main(args: js.Array[String]): js.UndefOr[Double] = js.native
    def main(args: js.Array[String], callback: pbtsCallback): js.UndefOr[Double] = js.native
  }
  
}

