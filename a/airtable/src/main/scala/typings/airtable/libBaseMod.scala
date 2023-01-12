package typings.airtable

import org.scalablytyped.runtime.StringDictionary
import typings.airtable.libAirtableBaseMod.AirtableBase
import typings.airtable.libFieldSetMod.FieldSet
import typings.airtable.libRunActionMod.Body
import typings.airtable.libRunActionMod.Callback
import typings.airtable.libRunActionMod.Params
import typings.std.Headers
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseMod {
  
  @JSImport("airtable/lib/base", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Base {
    def this(airtable: typings.airtable.mod.^, baseId: String) = this()
  }
  @JSImport("airtable/lib/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createFunctor(airtable: typings.airtable.mod.^, baseId: String): AirtableBase = (^.asInstanceOf[js.Dynamic].applyDynamic("createFunctor")(airtable.asInstanceOf[js.Any], baseId.asInstanceOf[js.Any])).asInstanceOf[AirtableBase]
  
  @js.native
  trait Base extends StObject {
    
    val _airtable: typings.airtable.mod.^ = js.native
    
    def _checkStatusForError(statusCode: Double): Null | typings.airtable.libAirtableErrorMod.^ = js.native
    def _checkStatusForError(statusCode: Double, body: BaseBody): Null | typings.airtable.libAirtableErrorMod.^ = js.native
    
    def _getRequestHeaders(headers: StringDictionary[String]): StringDictionary[String] = js.native
    
    val _id: String = js.native
    
    def doCall[TFields /* <: FieldSet */](tableName: String): typings.airtable.libTableMod.^[TFields] = js.native
    
    def getId(): String = js.native
    
    def makeRequest(): js.Promise[BaseResponse] = js.native
    def makeRequest(options: BaseRequestOptions): js.Promise[BaseResponse] = js.native
    
    /**
      * @deprecated This method is deprecated.
      */
    def runAction(method: String, path: String, queryParams: Params, bodyData: Body, callback: Callback): Unit = js.native
    
    def table[TFields /* <: FieldSet */](tableName: String): typings.airtable.libTableMod.^[TFields] = js.native
  }
  
  type BaseBody = Any
  
  trait BaseRequestOptions extends StObject {
    
    var _numAttempts: js.UndefOr[Double] = js.undefined
    
    var body: js.UndefOr[BaseBody] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var qs: js.UndefOr[Record[String, BaseBody]] = js.undefined
  }
  object BaseRequestOptions {
    
    inline def apply(): BaseRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: BaseBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setQs(value: Record[String, BaseBody]): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      inline def set_numAttempts(value: Double): Self = StObject.set(x, "_numAttempts", value.asInstanceOf[js.Any])
      
      inline def set_numAttemptsUndefined: Self = StObject.set(x, "_numAttempts", js.undefined)
    }
  }
  
  trait BaseResponse extends StObject {
    
    var body: BaseBody
    
    var headers: Headers
    
    var statusCode: Double
  }
  object BaseResponse {
    
    inline def apply(body: BaseBody, headers: Headers, statusCode: Double): BaseResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseResponse] (val x: Self) extends AnyVal {
      
      inline def setBody(value: BaseBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
