package typings.appDashBuilderDashLib

import org.scalablytyped.runtime.StringDictionary
import typings.node.childUnderscoreProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/appBuilder", JSImport.Namespace)
@js.native
object outUtilAppBuilderMod extends js.Object {
  def executeAppBuilderAndWriteJson(args: js.Array[String], data: js.Any): js.Promise[String] = js.native
  def executeAppBuilderAndWriteJson(args: js.Array[String], data: js.Any, extraOptions: SpawnOptions): js.Promise[String] = js.native
  def executeAppBuilderAsJson[T](args: js.Array[String]): js.Promise[T] = js.native
  def objectToArgs(to: js.Array[String], argNameToValue: StringDictionary[String | Null]): Unit = js.native
}

