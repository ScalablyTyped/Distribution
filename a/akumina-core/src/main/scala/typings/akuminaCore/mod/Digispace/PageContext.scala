package typings.akuminaCore.mod.Digispace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.PageContext")
@js.native
class PageContext () extends StObject
object PageContext {
  
  @JSImport("akumina-core", "Digispace.PageContext")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("akumina-core", "Digispace.PageContext.EditMode")
  @js.native
  def EditMode: Boolean = js.native
  @scala.inline
  def EditMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EditMode")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def MapPageUrl(pageUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MapPageUrl")(pageUrl.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  @JSImport("akumina-core", "Digispace.PageContext.PageId")
  @js.native
  def PageId: String = js.native
  @scala.inline
  def PageId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageId")(x.asInstanceOf[js.Any])
  
  /* static member */
  object PageRouteInfo {
    
    @JSImport("akumina-core", "Digispace.PageContext.PageRouteInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("akumina-core", "Digispace.PageContext.PageRouteInfo.email")
    @js.native
    def email: String = js.native
    @scala.inline
    def email_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("email")(x.asInstanceOf[js.Any])
  }
}
