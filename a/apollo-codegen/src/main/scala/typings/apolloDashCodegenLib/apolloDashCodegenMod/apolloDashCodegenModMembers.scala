package typings
package apolloDashCodegenLib.apolloDashCodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-codegen", JSImport.Namespace)
@js.native
object apolloDashCodegenModMembers extends js.Object {
  def downloadSchema(
    url: java.lang.String,
    outputPath: java.lang.String,
    additionalHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    insecure: scala.Boolean,
    method: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def generate(
    inputPaths: js.Array[java.lang.String],
    schemaPath: java.lang.String,
    outputPath: java.lang.String,
    only: java.lang.String,
    target: TargetType,
    tagName: java.lang.String,
    projectName: java.lang.String,
    options: apolloDashCodegenLib.Anon_AddTypename
  ): scala.Unit = js.native
  def introspectSchema(schemaPath: java.lang.String, outputPath: java.lang.String): js.Promise[scala.Unit] = js.native
  def printSchema(schemaPath: java.lang.String, outputPath: java.lang.String): js.Promise[scala.Unit] = js.native
  def printSchema(
    schemaPath: java.lang.String,
    outputPath: java.lang.String,
    options: graphqlLib.utilitiesSchemaPrinterMod.Options
  ): js.Promise[scala.Unit] = js.native
}

