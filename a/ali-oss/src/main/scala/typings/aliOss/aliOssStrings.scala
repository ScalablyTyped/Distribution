package typings.aliOss

import typings.aliOss.mod.ACLType
import typings.aliOss.mod.HTTPMethods
import typings.aliOss.mod.RuleStatusType
import typings.aliOss.mod.StorageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliOssStrings {
  
  @js.native
  sealed trait Archive extends StorageType
  @scala.inline
  def Archive: Archive = "Archive".asInstanceOf[Archive]
  
  @js.native
  sealed trait DELETE extends HTTPMethods
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait Disabled extends RuleStatusType
  @scala.inline
  def Disabled: Disabled = "Disabled".asInstanceOf[Disabled]
  
  @js.native
  sealed trait Enabled extends RuleStatusType
  @scala.inline
  def Enabled: Enabled = "Enabled".asInstanceOf[Enabled]
  
  @js.native
  sealed trait GET extends HTTPMethods
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait IA extends StorageType
  @scala.inline
  def IA: IA = "IA".asInstanceOf[IA]
  
  @js.native
  sealed trait POST extends HTTPMethods
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT extends HTTPMethods
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait Standard extends StorageType
  @scala.inline
  def Standard: Standard = "Standard".asInstanceOf[Standard]
  
  @js.native
  sealed trait `private` extends ACLType
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait `public-read` extends ACLType
  @scala.inline
  def `public-read`: `public-read` = "public-read".asInstanceOf[`public-read`]
  
  @js.native
  sealed trait `public-read-write` extends ACLType
  @scala.inline
  def `public-read-write`: `public-read-write` = "public-read-write".asInstanceOf[`public-read-write`]
}
