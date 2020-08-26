package typings.apolloCodegen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-codegen", "printSchema")
@js.native
object printSchema extends js.Object {
  def apply(schemaPath: String, outputPath: String): js.Promise[Unit] = js.native
  def apply(
    schemaPath: String,
    outputPath: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): js.Promise[Unit] = js.native
}

