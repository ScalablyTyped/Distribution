package typings.akamaiEdgeworkers

import org.scalablytyped.runtime.StringDictionary
import typings.akamaiEdgeworkers.akamaiEdgeworkersBooleans.`true`
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.Lax
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.None
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.Strict
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.byob
import typings.akamaiEdgeworkers.streamsMod.ReadableStream
import typings.akamaiEdgeworkers.streamsMod.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Aborted extends StObject {
    
    var aborted: Boolean = js.native
  }
  object Aborted {
    
    @scala.inline
    def apply(aborted: Boolean): Aborted = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aborted]
    }
    
    @scala.inline
    implicit class AbortedMutableBuilder[Self <: Aborted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Body extends StObject {
    
    var body: js.UndefOr[js.Object] = js.native
    
    var denyReason: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[typings.akamaiEdgeworkers.createResponseMod.Headers] = js.native
    
    var status: js.UndefOr[Double] = js.native
  }
  object Body {
    
    @scala.inline
    def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setDenyReason(value: String): Self = StObject.set(x, "denyReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenyReasonUndefined: Self = StObject.set(x, "denyReason", js.undefined)
      
      @scala.inline
      def setHeaders(value: typings.akamaiEdgeworkers.createResponseMod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait Domain extends StObject {
    
    var domain: js.UndefOr[String] = js.native
    
    var expires: js.UndefOr[ToUTCString] = js.native
    
    var httpOnly: js.UndefOr[Boolean] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var sameSite: js.UndefOr[Strict | Lax | None | `true`] = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object Domain {
    
    @scala.inline
    def apply(): Domain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setExpires(value: ToUTCString): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSameSite(value: Strict | Lax | None | `true`): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Headers extends StObject {
    
    var body: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait HighWaterMark extends StObject {
    
    var highWaterMark: Double = js.native
  }
  object HighWaterMark {
    
    @scala.inline
    def apply(highWaterMark: Double): HighWaterMark = {
      val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighWaterMark]
    }
    
    @scala.inline
    implicit class HighWaterMarkMutableBuilder[Self <: HighWaterMark] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mode extends StObject {
    
    var mode: byob = js.native
  }
  object Mode {
    
    @scala.inline
    def apply(mode: byob): Mode = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mode]
    }
    
    @scala.inline
    implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: byob): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Readable[R, T] extends StObject {
    
    var readable: ReadableStream[T] = js.native
    
    var writable: WritableStream[R] = js.native
  }
  object Readable {
    
    @scala.inline
    def apply[R, T](readable: ReadableStream[T], writable: WritableStream[R]): Readable[R, T] = {
      val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Readable[R, T]]
    }
    
    @scala.inline
    implicit class ReadableMutableBuilder[Self <: Readable[_, _], R, T] (val x: Self with (Readable[R, T])) extends AnyVal {
      
      @scala.inline
      def setReadable(value: ReadableStream[T]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritable(value: WritableStream[R]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Size extends StObject {
    
    var highWaterMark: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[scala.Nothing] = js.native
  }
  object Size {
    
    @scala.inline
    def apply(): Size = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    }
  }
  
  @js.native
  trait ToUTCString extends StObject {
    
    def toUTCString(): String = js.native
  }
  object ToUTCString {
    
    @scala.inline
    def apply(toUTCString: () => String): ToUTCString = {
      val __obj = js.Dynamic.literal(toUTCString = js.Any.fromFunction0(toUTCString))
      __obj.asInstanceOf[ToUTCString]
    }
    
    @scala.inline
    implicit class ToUTCStringMutableBuilder[Self <: ToUTCString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToUTCString(value: () => String): Self = StObject.set(x, "toUTCString", js.Any.fromFunction0(value))
    }
  }
}
