package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CompilationContext extends js.Object {
  var async: scala.Boolean
  var baseId: java.lang.String
  var compositeRule: scala.Boolean
  var dataLevel: scala.Double
  var formats: org.scalablytyped.runtime.StringDictionary[js.UndefOr[FormatDefinition]]
  var level: scala.Double
  var opts: Options
  var schema: js.Any
  var schemaPath: java.lang.String
  var self: Ajv
  var util: ajvLib.Anon_UnescapeJsonPointer
  def validate(schema: js.Object): scala.Boolean
}

