package typings.apolloProtobufjs

import typings.apolloProtobufjs.pbjsMod.pbjsCallback
import typings.apolloProtobufjs.pbtsMod.pbtsCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliMod {
  
  object pbjs {
    
    @JSImport("@apollo/protobufjs/cli", "pbjs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def main(args: js.Array[String]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
    inline def main(args: js.Array[String], callback: pbjsCallback): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  }
  
  object pbts {
    
    @JSImport("@apollo/protobufjs/cli", "pbts")
    @js.native
    val ^ : js.Any = js.native
    
    inline def main(args: js.Array[String]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
    inline def main(args: js.Array[String], callback: pbtsCallback): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  }
}
