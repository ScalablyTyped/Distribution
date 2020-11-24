package typings.apicalypse

import typings.apicalypse.mod.QueryMethod
import typings.apicalypse.mod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apicalypseStrings {
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait asc extends SortDirection
  
  @js.native
  sealed trait body extends QueryMethod
  
  @js.native
  sealed trait desc extends SortDirection
  
  @js.native
  sealed trait url extends QueryMethod
}
