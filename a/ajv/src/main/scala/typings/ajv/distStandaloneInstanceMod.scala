package typings.ajv

import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.AnyValidateFunction
import typings.ajv.distTypesMod.ErrorObject
import typings.std.Parameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStandaloneInstanceMod {
  
  @JSImport("ajv/dist/standalone/instance", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AjvPack {
    def this(ajv: typings.ajv.distCoreMod.default) = this()
  }
  
  @js.native
  trait AjvPack extends StObject {
    
    def addKeyword(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof Ajv.prototype.addKeyword> is not an array type */ args: Parameters[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Ajv.prototype.addKeyword */ Any
        ]
    ): AjvPack = js.native
    
    def addSchema(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof Ajv.prototype.addSchema> is not an array type */ args: Parameters[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Ajv.prototype.addSchema */ Any
        ]
    ): AjvPack = js.native
    
    val ajv: typings.ajv.distCoreMod.default = js.native
    
    def compile[T](schema: AnySchema): AnyValidateFunction[T] = js.native
    def compile[T](schema: AnySchema, meta: Boolean): AnyValidateFunction[T] = js.native
    
    var errors: js.UndefOr[(js.Array[ErrorObject[String, Record[String, Any], Any]]) | Null] = js.native
    
    def getSchema[T](keyRef: String): js.UndefOr[AnyValidateFunction[T]] = js.native
    
    /* private */ var getStandalone: Any = js.native
    
    def validate(schemaKeyRef: String, data: Any): Boolean | js.Promise[Any] = js.native
    def validate(schemaKeyRef: AnySchema, data: Any): Boolean | js.Promise[Any] = js.native
  }
}
