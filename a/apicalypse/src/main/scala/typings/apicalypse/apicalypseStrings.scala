package typings.apicalypse

import typings.apicalypse.mod.QueryMethod
import typings.apicalypse.mod.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apicalypseStrings {
  
  @js.native
  sealed trait asc
    extends StObject
       with SortDirection
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait body
    extends StObject
       with QueryMethod
  inline def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait desc
    extends StObject
       with SortDirection
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait url
    extends StObject
       with QueryMethod
  inline def url: url = "url".asInstanceOf[url]
}
