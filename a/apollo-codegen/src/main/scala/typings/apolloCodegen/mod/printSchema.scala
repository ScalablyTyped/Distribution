package typings.apolloCodegen.mod

import typings.graphql.schemaPrinterMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-codegen", "printSchema")
@js.native
object printSchema extends js.Object {
  def apply(schemaPath: String, outputPath: String): js.Promise[Unit] = js.native
  def apply(schemaPath: String, outputPath: String, options: Options): js.Promise[Unit] = js.native
}

