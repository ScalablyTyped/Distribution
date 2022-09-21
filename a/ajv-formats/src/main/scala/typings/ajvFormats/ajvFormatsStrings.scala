package typings.ajvFormats

import typings.ajvFormats.formatsMod.FormatMode
import typings.ajvFormats.formatsMod.FormatName
import typings.ajvFormats.limitMod.Comparison
import typings.ajvFormats.limitMod.Kwd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajvFormatsStrings {
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with Comparison
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with Comparison
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with Comparison
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with Comparison
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait binary
    extends StObject
       with FormatName
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait byte
    extends StObject
       with FormatName
  inline def byte: byte = "byte".asInstanceOf[byte]
  
  @js.native
  sealed trait date
    extends StObject
       with FormatName
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait `date-time`
    extends StObject
       with FormatName
  inline def `date-time`: `date-time` = "date-time".asInstanceOf[`date-time`]
  
  @js.native
  sealed trait double
    extends StObject
       with FormatName
  inline def double: double = "double".asInstanceOf[double]
  
  @js.native
  sealed trait duration
    extends StObject
       with FormatName
  inline def duration: duration = "duration".asInstanceOf[duration]
  
  @js.native
  sealed trait email
    extends StObject
       with FormatName
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait fast
    extends StObject
       with FormatMode
  inline def fast: fast = "fast".asInstanceOf[fast]
  
  @js.native
  sealed trait float
    extends StObject
       with FormatName
  inline def float: float = "float".asInstanceOf[float]
  
  @js.native
  sealed trait formatExclusiveMaximum
    extends StObject
       with Kwd
  inline def formatExclusiveMaximum: formatExclusiveMaximum = "formatExclusiveMaximum".asInstanceOf[formatExclusiveMaximum]
  
  @js.native
  sealed trait formatExclusiveMinimum
    extends StObject
       with Kwd
  inline def formatExclusiveMinimum: formatExclusiveMinimum = "formatExclusiveMinimum".asInstanceOf[formatExclusiveMinimum]
  
  @js.native
  sealed trait formatMaximum
    extends StObject
       with Kwd
  inline def formatMaximum: formatMaximum = "formatMaximum".asInstanceOf[formatMaximum]
  
  @js.native
  sealed trait formatMinimum
    extends StObject
       with Kwd
  inline def formatMinimum: formatMinimum = "formatMinimum".asInstanceOf[formatMinimum]
  
  @js.native
  sealed trait full
    extends StObject
       with FormatMode
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait hostname
    extends StObject
       with FormatName
  inline def hostname: hostname = "hostname".asInstanceOf[hostname]
  
  @js.native
  sealed trait int32
    extends StObject
       with FormatName
  inline def int32: int32 = "int32".asInstanceOf[int32]
  
  @js.native
  sealed trait int64
    extends StObject
       with FormatName
  inline def int64: int64 = "int64".asInstanceOf[int64]
  
  @js.native
  sealed trait ipv4
    extends StObject
       with FormatName
  inline def ipv4: ipv4 = "ipv4".asInstanceOf[ipv4]
  
  @js.native
  sealed trait ipv6
    extends StObject
       with FormatName
  inline def ipv6: ipv6 = "ipv6".asInstanceOf[ipv6]
  
  @js.native
  sealed trait `json-pointer`
    extends StObject
       with FormatName
  inline def `json-pointer`: `json-pointer` = "json-pointer".asInstanceOf[`json-pointer`]
  
  @js.native
  sealed trait `json-pointer-uri-fragment`
    extends StObject
       with FormatName
  inline def `json-pointer-uri-fragment`: `json-pointer-uri-fragment` = "json-pointer-uri-fragment".asInstanceOf[`json-pointer-uri-fragment`]
  
  @js.native
  sealed trait password
    extends StObject
       with FormatName
  inline def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait regex
    extends StObject
       with FormatName
  inline def regex: regex = "regex".asInstanceOf[regex]
  
  @js.native
  sealed trait `relative-json-pointer`
    extends StObject
       with FormatName
  inline def `relative-json-pointer`: `relative-json-pointer` = "relative-json-pointer".asInstanceOf[`relative-json-pointer`]
  
  @js.native
  sealed trait time
    extends StObject
       with FormatName
  inline def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait uri
    extends StObject
       with FormatName
  inline def uri: uri = "uri".asInstanceOf[uri]
  
  @js.native
  sealed trait `uri-reference`
    extends StObject
       with FormatName
  inline def `uri-reference`: `uri-reference` = "uri-reference".asInstanceOf[`uri-reference`]
  
  @js.native
  sealed trait `uri-template`
    extends StObject
       with FormatName
  inline def `uri-template`: `uri-template` = "uri-template".asInstanceOf[`uri-template`]
  
  @js.native
  sealed trait url
    extends StObject
       with FormatName
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait uuid
    extends StObject
       with FormatName
  inline def uuid: uuid = "uuid".asInstanceOf[uuid]
}
