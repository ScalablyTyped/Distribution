package typings.apolloProtobufjs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbjsMod {
  
  @JSImport("@apollo/protobufjs/cli/pbjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def main(args: js.Array[String]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def main(args: js.Array[String], callback: pbjsCallback): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  type pbjsCallback = js.Function2[/* err */ Error | Null, /* output */ js.UndefOr[String], Unit]
}
