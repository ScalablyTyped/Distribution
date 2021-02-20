package typings.apolloProtobufjs

import typings.apolloProtobufjs.pbjsMod.pbjsCallback
import typings.apolloProtobufjs.pbtsMod.pbtsCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliMod {
  
  object pbjs {
    
    @JSImport("@apollo/protobufjs/cli", "pbjs.main")
    @js.native
    def main(args: js.Array[String]): js.UndefOr[Double] = js.native
    @JSImport("@apollo/protobufjs/cli", "pbjs.main")
    @js.native
    def main(args: js.Array[String], callback: pbjsCallback): js.UndefOr[Double] = js.native
  }
  
  object pbts {
    
    @JSImport("@apollo/protobufjs/cli", "pbts.main")
    @js.native
    def main(args: js.Array[String]): js.UndefOr[Double] = js.native
    @JSImport("@apollo/protobufjs/cli", "pbts.main")
    @js.native
    def main(args: js.Array[String], callback: pbtsCallback): js.UndefOr[Double] = js.native
  }
}
