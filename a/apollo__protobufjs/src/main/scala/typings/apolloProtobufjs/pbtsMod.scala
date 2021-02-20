package typings.apolloProtobufjs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbtsMod {
  
  @JSImport("@apollo/protobufjs/cli/pbts", "main")
  @js.native
  def main(args: js.Array[String]): js.UndefOr[Double] = js.native
  @JSImport("@apollo/protobufjs/cli/pbts", "main")
  @js.native
  def main(args: js.Array[String], callback: pbtsCallback): js.UndefOr[Double] = js.native
  
  type pbtsCallback = js.Function2[/* err */ Error | Null, /* output */ js.UndefOr[String], Unit]
}
