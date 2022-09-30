package typings.akamaiEdgeworkers

import org.scalablytyped.runtime.StringDictionary
import typings.akamaiEdgeworkers.EW.ReadableStreamEW
import typings.akamaiEdgeworkers.EW.WritableStreamEW
import typings.akamaiEdgeworkers.akamaiEdgeworkersBooleans.`true`
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.Lax
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.None
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.Strict
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.byob
import typings.akamaiEdgeworkers.httpRequestMod.RequestBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Aborted extends StObject {
    
    var aborted: Boolean
  }
  object Aborted {
    
    inline def apply(aborted: Boolean): Aborted = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aborted]
    }
    
    extension [Self <: Aborted](x: Self) {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    }
  }
  
  trait Body extends StObject {
    
    var body: js.UndefOr[js.Object] = js.undefined
    
    var denyReason: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[typings.akamaiEdgeworkers.createResponseMod.Headers] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
  }
  object Body {
    
    inline def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDenyReason(value: String): Self = StObject.set(x, "denyReason", value.asInstanceOf[js.Any])
      
      inline def setDenyReasonUndefined: Self = StObject.set(x, "denyReason", js.undefined)
      
      inline def setHeaders(value: typings.akamaiEdgeworkers.createResponseMod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait Domain extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[ToUTCString] = js.undefined
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var sameSite: js.UndefOr[Strict | Lax | None | `true`] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Domain {
    
    inline def apply(): Domain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Domain]
    }
    
    extension [Self <: Domain](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpires(value: ToUTCString): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: Strict | Lax | None | `true`): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var body: js.UndefOr[RequestBody] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Headers {
    
    inline def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait HighWaterMark extends StObject {
    
    var highWaterMark: Double
  }
  object HighWaterMark {
    
    inline def apply(highWaterMark: Double): HighWaterMark = {
      val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighWaterMark]
    }
    
    extension [Self <: HighWaterMark](x: Self) {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mode extends StObject {
    
    var mode: byob
  }
  object Mode {
    
    inline def apply(): Mode = {
      val __obj = js.Dynamic.literal(mode = "byob")
      __obj.asInstanceOf[Mode]
    }
    
    extension [Self <: Mode](x: Self) {
      
      inline def setMode(value: byob): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Readable[R, T] extends StObject {
    
    var readable: ReadableStreamEW[T]
    
    var writable: WritableStreamEW[R]
  }
  object Readable {
    
    inline def apply[R, T](readable: ReadableStreamEW[T], writable: WritableStreamEW[R]): Readable[R, T] = {
      val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Readable[R, T]]
    }
    
    extension [Self <: Readable[?, ?], R, T](x: Self & (Readable[R, T])) {
      
      inline def setReadable(value: ReadableStreamEW[T]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setWritable(value: WritableStreamEW[R]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var size: Unit
  }
  object Size {
    
    inline def apply(size: Unit): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setSize(value: Unit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToUTCString extends StObject {
    
    def toUTCString(): String
  }
  object ToUTCString {
    
    inline def apply(toUTCString: () => String): ToUTCString = {
      val __obj = js.Dynamic.literal(toUTCString = js.Any.fromFunction0(toUTCString))
      __obj.asInstanceOf[ToUTCString]
    }
    
    extension [Self <: ToUTCString](x: Self) {
      
      inline def setToUTCString(value: () => String): Self = StObject.set(x, "toUTCString", js.Any.fromFunction0(value))
    }
  }
}
