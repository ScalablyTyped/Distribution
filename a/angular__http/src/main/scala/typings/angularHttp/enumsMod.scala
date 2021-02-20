package typings.angularHttp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumsMod {
  
  @js.native
  sealed trait ContentType extends StObject
  @JSImport("@angular/http/src/enums", "ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
    
    @js.native
    sealed trait ARRAY_BUFFER extends ContentType
    /* 6 */ val ARRAY_BUFFER: typings.angularHttp.enumsMod.ContentType.ARRAY_BUFFER with Double = js.native
    
    @js.native
    sealed trait BLOB extends ContentType
    /* 5 */ val BLOB: typings.angularHttp.enumsMod.ContentType.BLOB with Double = js.native
    
    @js.native
    sealed trait FORM extends ContentType
    /* 2 */ val FORM: typings.angularHttp.enumsMod.ContentType.FORM with Double = js.native
    
    @js.native
    sealed trait FORM_DATA extends ContentType
    /* 3 */ val FORM_DATA: typings.angularHttp.enumsMod.ContentType.FORM_DATA with Double = js.native
    
    @js.native
    sealed trait JSON extends ContentType
    /* 1 */ val JSON: typings.angularHttp.enumsMod.ContentType.JSON with Double = js.native
    
    @js.native
    sealed trait NONE extends ContentType
    /* 0 */ val NONE: typings.angularHttp.enumsMod.ContentType.NONE with Double = js.native
    
    @js.native
    sealed trait TEXT extends ContentType
    /* 4 */ val TEXT: typings.angularHttp.enumsMod.ContentType.TEXT with Double = js.native
  }
  
  @js.native
  sealed trait ReadyState extends StObject
  @JSImport("@angular/http/src/enums", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
    
    @js.native
    sealed trait Cancelled extends ReadyState
    /* 5 */ val Cancelled: typings.angularHttp.enumsMod.ReadyState.Cancelled with Double = js.native
    
    @js.native
    sealed trait Done extends ReadyState
    /* 4 */ val Done: typings.angularHttp.enumsMod.ReadyState.Done with Double = js.native
    
    @js.native
    sealed trait HeadersReceived extends ReadyState
    /* 2 */ val HeadersReceived: typings.angularHttp.enumsMod.ReadyState.HeadersReceived with Double = js.native
    
    @js.native
    sealed trait Loading extends ReadyState
    /* 3 */ val Loading: typings.angularHttp.enumsMod.ReadyState.Loading with Double = js.native
    
    @js.native
    sealed trait Open extends ReadyState
    /* 1 */ val Open: typings.angularHttp.enumsMod.ReadyState.Open with Double = js.native
    
    @js.native
    sealed trait Unsent extends ReadyState
    /* 0 */ val Unsent: typings.angularHttp.enumsMod.ReadyState.Unsent with Double = js.native
  }
  
  @js.native
  sealed trait RequestMethod extends StObject
  @JSImport("@angular/http/src/enums", "RequestMethod")
  @js.native
  object RequestMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RequestMethod with Double] = js.native
    
    @js.native
    sealed trait Delete extends RequestMethod
    /* 3 */ val Delete: typings.angularHttp.enumsMod.RequestMethod.Delete with Double = js.native
    
    @js.native
    sealed trait Get extends RequestMethod
    /* 0 */ val Get: typings.angularHttp.enumsMod.RequestMethod.Get with Double = js.native
    
    @js.native
    sealed trait Head extends RequestMethod
    /* 5 */ val Head: typings.angularHttp.enumsMod.RequestMethod.Head with Double = js.native
    
    @js.native
    sealed trait Options extends RequestMethod
    /* 4 */ val Options: typings.angularHttp.enumsMod.RequestMethod.Options with Double = js.native
    
    @js.native
    sealed trait Patch extends RequestMethod
    /* 6 */ val Patch: typings.angularHttp.enumsMod.RequestMethod.Patch with Double = js.native
    
    @js.native
    sealed trait Post extends RequestMethod
    /* 1 */ val Post: typings.angularHttp.enumsMod.RequestMethod.Post with Double = js.native
    
    @js.native
    sealed trait Put extends RequestMethod
    /* 2 */ val Put: typings.angularHttp.enumsMod.RequestMethod.Put with Double = js.native
  }
  
  @js.native
  sealed trait ResponseContentType extends StObject
  @JSImport("@angular/http/src/enums", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResponseContentType with Double] = js.native
    
    @js.native
    sealed trait ArrayBuffer extends ResponseContentType
    /* 2 */ val ArrayBuffer: typings.angularHttp.enumsMod.ResponseContentType.ArrayBuffer with Double = js.native
    
    @js.native
    sealed trait Blob extends ResponseContentType
    /* 3 */ val Blob: typings.angularHttp.enumsMod.ResponseContentType.Blob with Double = js.native
    
    @js.native
    sealed trait Json extends ResponseContentType
    /* 1 */ val Json: typings.angularHttp.enumsMod.ResponseContentType.Json with Double = js.native
    
    @js.native
    sealed trait Text extends ResponseContentType
    /* 0 */ val Text: typings.angularHttp.enumsMod.ResponseContentType.Text with Double = js.native
  }
  
  @js.native
  sealed trait ResponseType extends StObject
  @JSImport("@angular/http/src/enums", "ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResponseType with Double] = js.native
    
    @js.native
    sealed trait Basic extends ResponseType
    /* 0 */ val Basic: typings.angularHttp.enumsMod.ResponseType.Basic with Double = js.native
    
    @js.native
    sealed trait Cors extends ResponseType
    /* 1 */ val Cors: typings.angularHttp.enumsMod.ResponseType.Cors with Double = js.native
    
    @js.native
    sealed trait Default extends ResponseType
    /* 2 */ val Default: typings.angularHttp.enumsMod.ResponseType.Default with Double = js.native
    
    @js.native
    sealed trait Error extends ResponseType
    /* 3 */ val Error: typings.angularHttp.enumsMod.ResponseType.Error with Double = js.native
    
    @js.native
    sealed trait Opaque extends ResponseType
    /* 4 */ val Opaque: typings.angularHttp.enumsMod.ResponseType.Opaque with Double = js.native
  }
}
