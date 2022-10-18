package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUtilAppBuilderMod {
  
  @JSImport("app-builder-lib/out/util/appBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeAppBuilderAndWriteJson(args: js.Array[String], data: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAppBuilderAndWriteJson")(args.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def executeAppBuilderAndWriteJson(args: js.Array[String], data: Any, extraOptions: SpawnOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAppBuilderAndWriteJson")(args.asInstanceOf[js.Any], data.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def executeAppBuilderAsJson[T](args: js.Array[String]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeAppBuilderAsJson")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def objectToArgs(to: js.Array[String], argNameToValue: StringDictionary[String | Null]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectToArgs")(to.asInstanceOf[js.Any], argNameToValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
