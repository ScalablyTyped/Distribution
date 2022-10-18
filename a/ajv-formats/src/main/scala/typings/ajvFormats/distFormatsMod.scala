package typings.ajvFormats

import typings.ajv.distTypesMod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormatsMod {
  
  @JSImport("ajv-formats/dist/formats", "fastFormats")
  @js.native
  val fastFormats: DefinedFormats = js.native
  
  @JSImport("ajv-formats/dist/formats", "formatNames")
  @js.native
  val formatNames: js.Array[FormatName] = js.native
  
  @JSImport("ajv-formats/dist/formats", "fullFormats")
  @js.native
  val fullFormats: DefinedFormats = js.native
  
  /* Inlined {[ key in ajv-formats.ajv-formats/dist/formats.FormatName ]: ajv.ajv.Format} */
  trait DefinedFormats extends StObject {
    
    var binary: Format
    
    var byte: Format
    
    var date: Format
    
    var `date-time`: Format
    
    var double: Format
    
    var duration: Format
    
    var email: Format
    
    var float: Format
    
    var hostname: Format
    
    var int32: Format
    
    var int64: Format
    
    var ipv4: Format
    
    var ipv6: Format
    
    var `json-pointer`: Format
    
    var `json-pointer-uri-fragment`: Format
    
    var password: Format
    
    var regex: Format
    
    var `relative-json-pointer`: Format
    
    var time: Format
    
    var uri: Format
    
    var `uri-reference`: Format
    
    var `uri-template`: Format
    
    var url: Format
    
    var uuid: Format
  }
  object DefinedFormats {
    
    inline def apply(
      binary: Format,
      byte: Format,
      date: Format,
      `date-time`: Format,
      double: Format,
      duration: Format,
      email: Format,
      float: Format,
      hostname: Format,
      int32: Format,
      int64: Format,
      ipv4: Format,
      ipv6: Format,
      `json-pointer`: Format,
      `json-pointer-uri-fragment`: Format,
      password: Format,
      regex: Format,
      `relative-json-pointer`: Format,
      time: Format,
      uri: Format,
      `uri-reference`: Format,
      `uri-template`: Format,
      url: Format,
      uuid: Format
    ): DefinedFormats = {
      val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], byte = byte.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], ipv4 = ipv4.asInstanceOf[js.Any], ipv6 = ipv6.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("date-time")(`date-time`.asInstanceOf[js.Any])
      __obj.updateDynamic("json-pointer")(`json-pointer`.asInstanceOf[js.Any])
      __obj.updateDynamic("json-pointer-uri-fragment")(`json-pointer-uri-fragment`.asInstanceOf[js.Any])
      __obj.updateDynamic("relative-json-pointer")(`relative-json-pointer`.asInstanceOf[js.Any])
      __obj.updateDynamic("uri-reference")(`uri-reference`.asInstanceOf[js.Any])
      __obj.updateDynamic("uri-template")(`uri-template`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefinedFormats]
    }
    
    extension [Self <: DefinedFormats](x: Self) {
      
      inline def setBinary(value: Format): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryFunction1(value: String => Boolean): Self = StObject.set(x, "binary", js.Any.fromFunction1(value))
      
      inline def setByte(value: Format): Self = StObject.set(x, "byte", value.asInstanceOf[js.Any])
      
      inline def setByteFunction1(value: String => Boolean): Self = StObject.set(x, "byte", js.Any.fromFunction1(value))
      
      inline def setDate(value: Format): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def `setDate-time`(value: Format): Self = StObject.set(x, "date-time", value.asInstanceOf[js.Any])
      
      inline def `setDate-timeFunction1`(value: String => Boolean): Self = StObject.set(x, "date-time", js.Any.fromFunction1(value))
      
      inline def setDateFunction1(value: String => Boolean): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
      
      inline def setDouble(value: Format): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
      
      inline def setDoubleFunction1(value: String => Boolean): Self = StObject.set(x, "double", js.Any.fromFunction1(value))
      
      inline def setDuration(value: Format): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationFunction1(value: String => Boolean): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
      
      inline def setEmail(value: Format): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailFunction1(value: String => Boolean): Self = StObject.set(x, "email", js.Any.fromFunction1(value))
      
      inline def setFloat(value: Format): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatFunction1(value: String => Boolean): Self = StObject.set(x, "float", js.Any.fromFunction1(value))
      
      inline def setHostname(value: Format): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameFunction1(value: String => Boolean): Self = StObject.set(x, "hostname", js.Any.fromFunction1(value))
      
      inline def setInt32(value: Format): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setInt32Function1(value: String => Boolean): Self = StObject.set(x, "int32", js.Any.fromFunction1(value))
      
      inline def setInt64(value: Format): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
      
      inline def setInt64Function1(value: String => Boolean): Self = StObject.set(x, "int64", js.Any.fromFunction1(value))
      
      inline def setIpv4(value: Format): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
      
      inline def setIpv4Function1(value: String => Boolean): Self = StObject.set(x, "ipv4", js.Any.fromFunction1(value))
      
      inline def setIpv6(value: Format): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      inline def setIpv6Function1(value: String => Boolean): Self = StObject.set(x, "ipv6", js.Any.fromFunction1(value))
      
      inline def `setJson-pointer`(value: Format): Self = StObject.set(x, "json-pointer", value.asInstanceOf[js.Any])
      
      inline def `setJson-pointer-uri-fragment`(value: Format): Self = StObject.set(x, "json-pointer-uri-fragment", value.asInstanceOf[js.Any])
      
      inline def `setJson-pointer-uri-fragmentFunction1`(value: String => Boolean): Self = StObject.set(x, "json-pointer-uri-fragment", js.Any.fromFunction1(value))
      
      inline def `setJson-pointerFunction1`(value: String => Boolean): Self = StObject.set(x, "json-pointer", js.Any.fromFunction1(value))
      
      inline def setPassword(value: Format): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordFunction1(value: String => Boolean): Self = StObject.set(x, "password", js.Any.fromFunction1(value))
      
      inline def setRegex(value: Format): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexFunction1(value: String => Boolean): Self = StObject.set(x, "regex", js.Any.fromFunction1(value))
      
      inline def `setRelative-json-pointer`(value: Format): Self = StObject.set(x, "relative-json-pointer", value.asInstanceOf[js.Any])
      
      inline def `setRelative-json-pointerFunction1`(value: String => Boolean): Self = StObject.set(x, "relative-json-pointer", js.Any.fromFunction1(value))
      
      inline def setTime(value: Format): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeFunction1(value: String => Boolean): Self = StObject.set(x, "time", js.Any.fromFunction1(value))
      
      inline def setUri(value: Format): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def `setUri-reference`(value: Format): Self = StObject.set(x, "uri-reference", value.asInstanceOf[js.Any])
      
      inline def `setUri-referenceFunction1`(value: String => Boolean): Self = StObject.set(x, "uri-reference", js.Any.fromFunction1(value))
      
      inline def `setUri-template`(value: Format): Self = StObject.set(x, "uri-template", value.asInstanceOf[js.Any])
      
      inline def `setUri-templateFunction1`(value: String => Boolean): Self = StObject.set(x, "uri-template", js.Any.fromFunction1(value))
      
      inline def setUriFunction1(value: String => Boolean): Self = StObject.set(x, "uri", js.Any.fromFunction1(value))
      
      inline def setUrl(value: Format): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFunction1(value: String => Boolean): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      inline def setUuid(value: Format): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidFunction1(value: String => Boolean): Self = StObject.set(x, "uuid", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajvFormats.ajvFormatsStrings.fast
    - typings.ajvFormats.ajvFormatsStrings.full
  */
  trait FormatMode extends StObject
  object FormatMode {
    
    inline def fast: typings.ajvFormats.ajvFormatsStrings.fast = "fast".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.fast]
    
    inline def full: typings.ajvFormats.ajvFormatsStrings.full = "full".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.full]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajvFormats.ajvFormatsStrings.date
    - typings.ajvFormats.ajvFormatsStrings.time
    - typings.ajvFormats.ajvFormatsStrings.`date-time`
    - typings.ajvFormats.ajvFormatsStrings.duration
    - typings.ajvFormats.ajvFormatsStrings.uri
    - typings.ajvFormats.ajvFormatsStrings.`uri-reference`
    - typings.ajvFormats.ajvFormatsStrings.`uri-template`
    - typings.ajvFormats.ajvFormatsStrings.url
    - typings.ajvFormats.ajvFormatsStrings.email
    - typings.ajvFormats.ajvFormatsStrings.hostname
    - typings.ajvFormats.ajvFormatsStrings.ipv4
    - typings.ajvFormats.ajvFormatsStrings.ipv6
    - typings.ajvFormats.ajvFormatsStrings.regex
    - typings.ajvFormats.ajvFormatsStrings.uuid
    - typings.ajvFormats.ajvFormatsStrings.`json-pointer`
    - typings.ajvFormats.ajvFormatsStrings.`json-pointer-uri-fragment`
    - typings.ajvFormats.ajvFormatsStrings.`relative-json-pointer`
    - typings.ajvFormats.ajvFormatsStrings.byte
    - typings.ajvFormats.ajvFormatsStrings.int32
    - typings.ajvFormats.ajvFormatsStrings.int64
    - typings.ajvFormats.ajvFormatsStrings.float
    - typings.ajvFormats.ajvFormatsStrings.double
    - typings.ajvFormats.ajvFormatsStrings.password
    - typings.ajvFormats.ajvFormatsStrings.binary
  */
  trait FormatName extends StObject
  object FormatName {
    
    inline def binary: typings.ajvFormats.ajvFormatsStrings.binary = "binary".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.binary]
    
    inline def byte: typings.ajvFormats.ajvFormatsStrings.byte = "byte".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.byte]
    
    inline def date: typings.ajvFormats.ajvFormatsStrings.date = "date".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.date]
    
    inline def `date-time`: typings.ajvFormats.ajvFormatsStrings.`date-time` = "date-time".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.`date-time`]
    
    inline def double: typings.ajvFormats.ajvFormatsStrings.double = "double".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.double]
    
    inline def duration: typings.ajvFormats.ajvFormatsStrings.duration = "duration".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.duration]
    
    inline def email: typings.ajvFormats.ajvFormatsStrings.email = "email".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.email]
    
    inline def float: typings.ajvFormats.ajvFormatsStrings.float = "float".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.float]
    
    inline def hostname: typings.ajvFormats.ajvFormatsStrings.hostname = "hostname".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.hostname]
    
    inline def int32: typings.ajvFormats.ajvFormatsStrings.int32 = "int32".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.int32]
    
    inline def int64: typings.ajvFormats.ajvFormatsStrings.int64 = "int64".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.int64]
    
    inline def ipv4: typings.ajvFormats.ajvFormatsStrings.ipv4 = "ipv4".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.ipv4]
    
    inline def ipv6: typings.ajvFormats.ajvFormatsStrings.ipv6 = "ipv6".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.ipv6]
    
    inline def `json-pointer`: typings.ajvFormats.ajvFormatsStrings.`json-pointer` = "json-pointer".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.`json-pointer`]
    
    inline def `json-pointer-uri-fragment`: typings.ajvFormats.ajvFormatsStrings.`json-pointer-uri-fragment` = "json-pointer-uri-fragment".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.`json-pointer-uri-fragment`]
    
    inline def password: typings.ajvFormats.ajvFormatsStrings.password = "password".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.password]
    
    inline def regex: typings.ajvFormats.ajvFormatsStrings.regex = "regex".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.regex]
    
    inline def `relative-json-pointer`: typings.ajvFormats.ajvFormatsStrings.`relative-json-pointer` = "relative-json-pointer".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.`relative-json-pointer`]
    
    inline def time: typings.ajvFormats.ajvFormatsStrings.time = "time".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.time]
    
    inline def uri: typings.ajvFormats.ajvFormatsStrings.uri = "uri".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.uri]
    
    inline def `uri-reference`: typings.ajvFormats.ajvFormatsStrings.`uri-reference` = "uri-reference".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.`uri-reference`]
    
    inline def `uri-template`: typings.ajvFormats.ajvFormatsStrings.`uri-template` = "uri-template".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.`uri-template`]
    
    inline def url: typings.ajvFormats.ajvFormatsStrings.url = "url".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.url]
    
    inline def uuid: typings.ajvFormats.ajvFormatsStrings.uuid = "uuid".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.uuid]
  }
}
