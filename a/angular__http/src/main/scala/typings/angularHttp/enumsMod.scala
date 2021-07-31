package typings.angularHttp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumsMod {
  
  @js.native
  sealed trait ContentType extends StObject
  @JSImport("@angular/http/src/enums", "ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContentType & Double] = js.native
    
    @js.native
    sealed trait ARRAY_BUFFER
      extends StObject
         with ContentType
    /* 6 */ val ARRAY_BUFFER: typings.angularHttp.enumsMod.ContentType.ARRAY_BUFFER & Double = js.native
    
    @js.native
    sealed trait BLOB
      extends StObject
         with ContentType
    /* 5 */ val BLOB: typings.angularHttp.enumsMod.ContentType.BLOB & Double = js.native
    
    @js.native
    sealed trait FORM
      extends StObject
         with ContentType
    /* 2 */ val FORM: typings.angularHttp.enumsMod.ContentType.FORM & Double = js.native
    
    @js.native
    sealed trait FORM_DATA
      extends StObject
         with ContentType
    /* 3 */ val FORM_DATA: typings.angularHttp.enumsMod.ContentType.FORM_DATA & Double = js.native
    
    @js.native
    sealed trait JSON
      extends StObject
         with ContentType
    /* 1 */ val JSON: typings.angularHttp.enumsMod.ContentType.JSON & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with ContentType
    /* 0 */ val NONE: typings.angularHttp.enumsMod.ContentType.NONE & Double = js.native
    
    @js.native
    sealed trait TEXT
      extends StObject
         with ContentType
    /* 4 */ val TEXT: typings.angularHttp.enumsMod.ContentType.TEXT & Double = js.native
  }
  
  @js.native
  sealed trait ReadyState extends StObject
  @JSImport("@angular/http/src/enums", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReadyState & Double] = js.native
    
    @js.native
    sealed trait Cancelled
      extends StObject
         with ReadyState
    /* 5 */ val Cancelled: typings.angularHttp.enumsMod.ReadyState.Cancelled & Double = js.native
    
    @js.native
    sealed trait Done
      extends StObject
         with ReadyState
    /* 4 */ val Done: typings.angularHttp.enumsMod.ReadyState.Done & Double = js.native
    
    @js.native
    sealed trait HeadersReceived
      extends StObject
         with ReadyState
    /* 2 */ val HeadersReceived: typings.angularHttp.enumsMod.ReadyState.HeadersReceived & Double = js.native
    
    @js.native
    sealed trait Loading
      extends StObject
         with ReadyState
    /* 3 */ val Loading: typings.angularHttp.enumsMod.ReadyState.Loading & Double = js.native
    
    @js.native
    sealed trait Open
      extends StObject
         with ReadyState
    /* 1 */ val Open: typings.angularHttp.enumsMod.ReadyState.Open & Double = js.native
    
    @js.native
    sealed trait Unsent
      extends StObject
         with ReadyState
    /* 0 */ val Unsent: typings.angularHttp.enumsMod.ReadyState.Unsent & Double = js.native
  }
  
  @js.native
  sealed trait RequestMethod extends StObject
  @JSImport("@angular/http/src/enums", "RequestMethod")
  @js.native
  object RequestMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RequestMethod & Double] = js.native
    
    @js.native
    sealed trait Delete
      extends StObject
         with RequestMethod
    /* 3 */ val Delete: typings.angularHttp.enumsMod.RequestMethod.Delete & Double = js.native
    
    @js.native
    sealed trait Get
      extends StObject
         with RequestMethod
    /* 0 */ val Get: typings.angularHttp.enumsMod.RequestMethod.Get & Double = js.native
    
    @js.native
    sealed trait Head
      extends StObject
         with RequestMethod
    /* 5 */ val Head: typings.angularHttp.enumsMod.RequestMethod.Head & Double = js.native
    
    @js.native
    sealed trait Options
      extends StObject
         with RequestMethod
    /* 4 */ val Options: typings.angularHttp.enumsMod.RequestMethod.Options & Double = js.native
    
    @js.native
    sealed trait Patch
      extends StObject
         with RequestMethod
    /* 6 */ val Patch: typings.angularHttp.enumsMod.RequestMethod.Patch & Double = js.native
    
    @js.native
    sealed trait Post
      extends StObject
         with RequestMethod
    /* 1 */ val Post: typings.angularHttp.enumsMod.RequestMethod.Post & Double = js.native
    
    @js.native
    sealed trait Put
      extends StObject
         with RequestMethod
    /* 2 */ val Put: typings.angularHttp.enumsMod.RequestMethod.Put & Double = js.native
  }
  
  @js.native
  sealed trait ResponseContentType extends StObject
  @JSImport("@angular/http/src/enums", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResponseContentType & Double] = js.native
    
    @js.native
    sealed trait ArrayBuffer
      extends StObject
         with ResponseContentType
    /* 2 */ val ArrayBuffer: typings.angularHttp.enumsMod.ResponseContentType.ArrayBuffer & Double = js.native
    
    @js.native
    sealed trait Blob
      extends StObject
         with ResponseContentType
    /* 3 */ val Blob: typings.angularHttp.enumsMod.ResponseContentType.Blob & Double = js.native
    
    @js.native
    sealed trait Json
      extends StObject
         with ResponseContentType
    /* 1 */ val Json: typings.angularHttp.enumsMod.ResponseContentType.Json & Double = js.native
    
    @js.native
    sealed trait Text
      extends StObject
         with ResponseContentType
    /* 0 */ val Text: typings.angularHttp.enumsMod.ResponseContentType.Text & Double = js.native
  }
  
  @js.native
  sealed trait ResponseType extends StObject
  @JSImport("@angular/http/src/enums", "ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResponseType & Double] = js.native
    
    @js.native
    sealed trait Basic
      extends StObject
         with ResponseType
    /* 0 */ val Basic: typings.angularHttp.enumsMod.ResponseType.Basic & Double = js.native
    
    @js.native
    sealed trait Cors
      extends StObject
         with ResponseType
    /* 1 */ val Cors: typings.angularHttp.enumsMod.ResponseType.Cors & Double = js.native
    
    @js.native
    sealed trait Default
      extends StObject
         with ResponseType
    /* 2 */ val Default: typings.angularHttp.enumsMod.ResponseType.Default & Double = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with ResponseType
    /* 3 */ val Error: typings.angularHttp.enumsMod.ResponseType.Error & Double = js.native
    
    @js.native
    sealed trait Opaque
      extends StObject
         with ResponseType
    /* 4 */ val Opaque: typings.angularHttp.enumsMod.ResponseType.Opaque & Double = js.native
  }
}
