package typings.ajv.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.anon.Copy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilationContext extends js.Object {
  
  var async: Boolean = js.native
  
  var baseId: String = js.native
  
  var compositeRule: Boolean = js.native
  
  var dataLevel: Double = js.native
  
  var dataPathArr: js.Array[String] = js.native
  
  var formats: StringDictionary[js.UndefOr[FormatDefinition]] = js.native
  
  var keywords: StringDictionary[js.UndefOr[KeywordDefinition]] = js.native
  
  var level: Double = js.native
  
  var opts: Options = js.native
  
  var schema: js.Any = js.native
  
  var schemaPath: String = js.native
  
  var self: Ajv = js.native
  
  var util: Copy = js.native
  
  def validate(schema: js.Object): Boolean = js.native
}
object CompilationContext {
  
  @scala.inline
  def apply(
    async: Boolean,
    baseId: String,
    compositeRule: Boolean,
    dataLevel: Double,
    dataPathArr: js.Array[String],
    formats: StringDictionary[js.UndefOr[FormatDefinition]],
    keywords: StringDictionary[js.UndefOr[KeywordDefinition]],
    level: Double,
    opts: Options,
    schema: js.Any,
    schemaPath: String,
    self: Ajv,
    util: Copy,
    validate: js.Object => Boolean
  ): CompilationContext = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], baseId = baseId.asInstanceOf[js.Any], compositeRule = compositeRule.asInstanceOf[js.Any], dataLevel = dataLevel.asInstanceOf[js.Any], dataPathArr = dataPathArr.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[CompilationContext]
  }
  
  @scala.inline
  implicit class CompilationContextOps[Self <: CompilationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseId(value: String): Self = this.set("baseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeRule(value: Boolean): Self = this.set("compositeRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLevel(value: Double): Self = this.set("dataLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPathArrVarargs(value: String*): Self = this.set("dataPathArr", js.Array(value :_*))
    
    @scala.inline
    def setDataPathArr(value: js.Array[String]): Self = this.set("dataPathArr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormats(value: StringDictionary[js.UndefOr[FormatDefinition]]): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords(value: StringDictionary[js.UndefOr[KeywordDefinition]]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: Options): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: js.Any): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaPath(value: String): Self = this.set("schemaPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: Ajv): Self = this.set("self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtil(value: Copy): Self = this.set("util", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: js.Object => Boolean): Self = this.set("validate", js.Any.fromFunction1(value))
  }
}
