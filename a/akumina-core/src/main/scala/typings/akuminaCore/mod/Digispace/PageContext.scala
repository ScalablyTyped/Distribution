package typings.akuminaCore.mod.Digispace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.PageContext")
@js.native
open class PageContext () extends StObject
object PageContext {
  
  @JSImport("akumina-core", "Digispace.PageContext")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("akumina-core", "Digispace.PageContext.EditMode")
  @js.native
  def EditMode: Boolean = js.native
  inline def EditMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EditMode")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def GetHomePageUrl(siteUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetHomePageUrl")(siteUrl.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def MapPageUrl(pageUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MapPageUrl")(pageUrl.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  @JSImport("akumina-core", "Digispace.PageContext.PageId")
  @js.native
  def PageId: String = js.native
  inline def PageId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageId")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.PageContext.PagePriorityGroups")
  @js.native
  def PagePriorityGroups: js.Array[String] = js.native
  inline def PagePriorityGroups_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PagePriorityGroups")(x.asInstanceOf[js.Any])
  
  /* static member */
  object PageRouteInfo {
    
    @JSImport("akumina-core", "Digispace.PageContext.PageRouteInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("akumina-core", "Digispace.PageContext.PageRouteInfo.email")
    @js.native
    def email: String = js.native
    inline def email_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("email")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("akumina-core", "Digispace.PageContext.PageTitle")
  @js.native
  def PageTitle: String = js.native
  inline def PageTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageTitle")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.PageContext.PageVersionId")
  @js.native
  def PageVersionId: String = js.native
  inline def PageVersionId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageVersionId")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.PageContext.PageVersionName")
  @js.native
  def PageVersionName: String = js.native
  inline def PageVersionName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageVersionName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.PageContext.PageVersionsCount")
  @js.native
  def PageVersionsCount: Double = js.native
  inline def PageVersionsCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageVersionsCount")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.PageContext.PreviewPageVersionId")
  @js.native
  def PreviewPageVersionId: String = js.native
  inline def PreviewPageVersionId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PreviewPageVersionId")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def SetPageVersionsCount(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetPageVersionsCount")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
