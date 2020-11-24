package typings.aliOss

import typings.aliOss.mod.ACLType
import typings.aliOss.mod.HTTPMethods
import typings.aliOss.mod.RuleStatusType
import typings.aliOss.mod.StorageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliOssStrings {
  
  @scala.inline
  def Archive: Archive = "Archive".asInstanceOf[Archive]
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @scala.inline
  def Disabled: Disabled = "Disabled".asInstanceOf[Disabled]
  
  @scala.inline
  def Enabled: Enabled = "Enabled".asInstanceOf[Enabled]
  
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @scala.inline
  def IA: IA = "IA".asInstanceOf[IA]
  
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @scala.inline
  def Standard: Standard = "Standard".asInstanceOf[Standard]
  
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @scala.inline
  def `public-read`: `public-read` = "public-read".asInstanceOf[`public-read`]
  
  @scala.inline
  def `public-read-write`: `public-read-write` = "public-read-write".asInstanceOf[`public-read-write`]
  
  @js.native
  sealed trait Archive extends StorageType
  
  @js.native
  sealed trait DELETE extends HTTPMethods
  
  @js.native
  sealed trait Disabled extends RuleStatusType
  
  @js.native
  sealed trait Enabled extends RuleStatusType
  
  @js.native
  sealed trait GET extends HTTPMethods
  
  @js.native
  sealed trait IA extends StorageType
  
  @js.native
  sealed trait POST extends HTTPMethods
  
  @js.native
  sealed trait PUT extends HTTPMethods
  
  @js.native
  sealed trait Standard extends StorageType
  
  @js.native
  sealed trait `private` extends ACLType
  
  @js.native
  sealed trait `public-read` extends ACLType
  
  @js.native
  sealed trait `public-read-write` extends ACLType
}
