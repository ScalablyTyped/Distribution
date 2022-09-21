package typings.aliOss

import typings.aliOss.mod.ACLType
import typings.aliOss.mod.HTTPMethods
import typings.aliOss.mod.RedundancyType
import typings.aliOss.mod.RuleStatusType
import typings.aliOss.mod.StorageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliOssStrings {
  
  @js.native
  sealed trait Allow extends StObject
  inline def Allow: Allow = "Allow".asInstanceOf[Allow]
  
  @js.native
  sealed trait Archive
    extends StObject
       with StorageType
  inline def Archive: Archive = "Archive".asInstanceOf[Archive]
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HTTPMethods
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait Deny extends StObject
  inline def Deny: Deny = "Deny".asInstanceOf[Deny]
  
  @js.native
  sealed trait Disabled
    extends StObject
       with RuleStatusType
  inline def Disabled: Disabled = "Disabled".asInstanceOf[Disabled]
  
  @js.native
  sealed trait Enabled
    extends StObject
       with RuleStatusType
  inline def Enabled: Enabled = "Enabled".asInstanceOf[Enabled]
  
  @js.native
  sealed trait GET
    extends StObject
       with HTTPMethods
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait IA
    extends StObject
       with StorageType
  inline def IA: IA = "IA".asInstanceOf[IA]
  
  @js.native
  sealed trait LRS
    extends StObject
       with RedundancyType
  inline def LRS: LRS = "LRS".asInstanceOf[LRS]
  
  @js.native
  sealed trait POST
    extends StObject
       with HTTPMethods
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HTTPMethods
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait Standard
    extends StObject
       with StorageType
  inline def Standard: Standard = "Standard".asInstanceOf[Standard]
  
  @js.native
  sealed trait ZRS
    extends StObject
       with RedundancyType
  inline def ZRS: ZRS = "ZRS".asInstanceOf[ZRS]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait `private`
    extends StObject
       with ACLType
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait `public-read`
    extends StObject
       with ACLType
  inline def `public-read`: `public-read` = "public-read".asInstanceOf[`public-read`]
  
  @js.native
  sealed trait `public-read-write`
    extends StObject
       with ACLType
  inline def `public-read-write`: `public-read-write` = "public-read-write".asInstanceOf[`public-read-write`]
  
  @js.native
  sealed trait url extends StObject
  inline def url: url = "url".asInstanceOf[url]
}
