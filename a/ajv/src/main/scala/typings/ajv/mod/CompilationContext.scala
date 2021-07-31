package typings.ajv.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.anon.Copy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilationContext extends StObject {
  
  var async: Boolean
  
  var baseId: String
  
  var compositeRule: Boolean
  
  var dataLevel: Double
  
  var dataPathArr: js.Array[String]
  
  var formats: StringDictionary[js.UndefOr[FormatDefinition]]
  
  var keywords: StringDictionary[js.UndefOr[KeywordDefinition]]
  
  var level: Double
  
  var opts: Options
  
  var schema: js.Any
  
  var schemaPath: String
  
  var self: Ajv
  
  var util: Copy
  
  def validate(schema: js.Object): Boolean
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
  implicit class CompilationContextMutableBuilder[Self <: CompilationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeRule(value: Boolean): Self = StObject.set(x, "compositeRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLevel(value: Double): Self = StObject.set(x, "dataLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPathArr(value: js.Array[String]): Self = StObject.set(x, "dataPathArr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPathArrVarargs(value: String*): Self = StObject.set(x, "dataPathArr", js.Array(value :_*))
    
    @scala.inline
    def setFormats(value: StringDictionary[js.UndefOr[FormatDefinition]]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords(value: StringDictionary[js.UndefOr[KeywordDefinition]]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: Options): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: Ajv): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtil(value: Copy): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: js.Object => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
