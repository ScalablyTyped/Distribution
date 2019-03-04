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
  var util: ajvLib.Anon_Copy
  def validate(schema: js.Object): scala.Boolean
}

object CompilationContext {
  @scala.inline
  def apply(
    async: scala.Boolean,
    baseId: java.lang.String,
    compositeRule: scala.Boolean,
    dataLevel: scala.Double,
    formats: org.scalablytyped.runtime.StringDictionary[js.UndefOr[FormatDefinition]],
    level: scala.Double,
    opts: Options,
    schema: js.Any,
    schemaPath: java.lang.String,
    self: Ajv,
    util: ajvLib.Anon_Copy,
    validate: js.Function1[js.Object, scala.Boolean]
  ): CompilationContext = {
    val __obj = js.Dynamic.literal(async = async, baseId = baseId, compositeRule = compositeRule, dataLevel = dataLevel, formats = formats, level = level, opts = opts, schema = schema, schemaPath = schemaPath, self = self, util = util, validate = validate)
  
    __obj.asInstanceOf[CompilationContext]
  }
}

