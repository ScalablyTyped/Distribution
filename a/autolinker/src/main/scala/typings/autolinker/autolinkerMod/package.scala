package typings.autolinker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object autolinkerMod {
  
  type ReplaceFn = js.Function1[
    /* match */ typings.autolinker.matchMatchMod.Match, 
    typings.autolinker.autolinkerMod.ReplaceFnReturn
  ]
  
  type ReplaceFnReturn = js.UndefOr[
    scala.Boolean | java.lang.String | typings.autolinker.htmlTagMod.HtmlTag | scala.Null | scala.Unit
  ]
  
  type StripPrefixConfig = scala.Boolean | typings.autolinker.autolinkerMod.StripPrefixConfigObj
  
  type TruncateConfig = scala.Double | typings.autolinker.autolinkerMod.TruncateConfigObj
  
  type UrlsConfig = scala.Boolean | typings.autolinker.autolinkerMod.UrlsConfigObj
}
