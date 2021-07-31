package typings.antDesignIconsAngular

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconErrorMod {
  
  @JSImport("@ant-design/icons-angular/component/icon.error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def DynamicLoadingTimeoutError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("DynamicLoadingTimeoutError")().asInstanceOf[Error]
  
  @scala.inline
  def HttpModuleNotImport(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("HttpModuleNotImport")().asInstanceOf[Null]
  
  @scala.inline
  def IconNotFoundError(icon: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("IconNotFoundError")(icon.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  @scala.inline
  def NameSpaceIsNotSpecifyError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("NameSpaceIsNotSpecifyError")().asInstanceOf[Error]
  
  @scala.inline
  def SVGTagNotFoundError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("SVGTagNotFoundError")().asInstanceOf[Error]
  
  @scala.inline
  def UrlNotSafeError(url: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("UrlNotSafeError")(url.asInstanceOf[js.Any]).asInstanceOf[Error]
}
