package typings.apolloProtobufjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbtsMod {
  
  @JSImport("@apollo/protobufjs/cli/pbts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def main(args: js.Array[String]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def main(args: js.Array[String], callback: pbtsCallback): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  type pbtsCallback = js.Function2[/* err */ js.Error | Null, /* output */ js.UndefOr[String], Unit]
}
