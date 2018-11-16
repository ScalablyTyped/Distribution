package typings
package atAngularCoreLib.srcSanitizationBypassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BypassType extends js.Object

@JSImport("@angular/core/src/sanitization/bypass", "BypassType")
@js.native
object BypassType extends js.Object {
  @js.native
  sealed trait Html
    extends atAngularCoreLib.srcSanitizationBypassMod.BypassType
  
  @js.native
  sealed trait ResourceUrl
    extends atAngularCoreLib.srcSanitizationBypassMod.BypassType
  
  @js.native
  sealed trait Script
    extends atAngularCoreLib.srcSanitizationBypassMod.BypassType
  
  @js.native
  sealed trait Style
    extends atAngularCoreLib.srcSanitizationBypassMod.BypassType
  
  @js.native
  sealed trait Url
    extends atAngularCoreLib.srcSanitizationBypassMod.BypassType
  
  /* "Html" */ val Html: Html with java.lang.String = js.native
  /* "ResourceUrl" */ val ResourceUrl: ResourceUrl with java.lang.String = js.native
  /* "Script" */ val Script: Script with java.lang.String = js.native
  /* "Style" */ val Style: Style with java.lang.String = js.native
  /* "Url" */ val Url: Url with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atAngularCoreLib.srcSanitizationBypassMod.BypassType with java.lang.String] = js.native
}

