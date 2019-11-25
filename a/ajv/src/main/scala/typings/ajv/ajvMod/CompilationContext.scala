package typings.ajv.ajvMod

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.Anon_Copy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilationContext extends js.Object {
  var async: Boolean
  var baseId: String
  var compositeRule: Boolean
  var dataLevel: Double
  var formats: StringDictionary[js.UndefOr[FormatDefinition]]
  var level: Double
  var opts: Options
  var schema: js.Any
  var schemaPath: String
  var self: Ajv
  var util: Anon_Copy
  def validate(schema: js.Object): Boolean
}

object CompilationContext {
  @scala.inline
  def apply(
    async: Boolean,
    baseId: String,
    compositeRule: Boolean,
    dataLevel: Double,
    formats: StringDictionary[js.UndefOr[FormatDefinition]],
    level: Double,
    opts: Options,
    schema: js.Any,
    schemaPath: String,
    self: Ajv,
    util: Anon_Copy,
    validate: js.Object => Boolean
  ): CompilationContext = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], baseId = baseId.asInstanceOf[js.Any], compositeRule = compositeRule.asInstanceOf[js.Any], dataLevel = dataLevel.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[CompilationContext]
  }
}

