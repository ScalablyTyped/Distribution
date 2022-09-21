package typings.akuminaCore.mod.Digispace

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.UserContext")
@js.native
open class UserContext () extends StObject
object UserContext {
  
  @JSImport("akumina-core", "Digispace.UserContext")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.City")
  @js.native
  def City: String = js.native
  inline def City_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("City")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.Department")
  @js.native
  def Department: String = js.native
  inline def Department_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Department")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.FallbackLanguageId")
  @js.native
  def FallbackLanguageId: Double = js.native
  inline def FallbackLanguageId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FallbackLanguageId")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def GetAllUserGroups(): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAllUserGroups")().asInstanceOf[JQueryDeferred[Any]]
  
  /* static member */
  inline def GetPagePersona(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPagePersona")().asInstanceOf[String]
  
  /* static member */
  inline def GetUserAuthorizedPersona(): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetUserAuthorizedPersona")().asInstanceOf[JQueryDeferred[Any]]
  inline def GetUserAuthorizedPersona(objectid: String): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetUserAuthorizedPersona")(objectid.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[Any]]
  
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.GraphUserId")
  @js.native
  def GraphUserId: String = js.native
  inline def GraphUserId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GraphUserId")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.LanguageCode")
  @js.native
  def LanguageCode: String = js.native
  inline def LanguageCode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.LanguageId")
  @js.native
  def LanguageId: Double = js.native
  inline def LanguageId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LanguageId")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.LoginName")
  @js.native
  def LoginName: String = js.native
  inline def LoginName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoginName")(x.asInstanceOf[js.Any])
  
  /** Persona Based On Priority**/
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.PagePersona")
  @js.native
  def PagePersona: String = js.native
  inline def PagePersona_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PagePersona")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.PostalCode")
  @js.native
  def PostalCode: String = js.native
  inline def PostalCode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PostalCode")(x.asInstanceOf[js.Any])
  
  /** Persona Selected for CReating Page Version**/
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.SelectedPagePersona")
  @js.native
  def SelectedPagePersona: String = js.native
  inline def SelectedPagePersona_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectedPagePersona")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def SetLanguage(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetLanguage")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.State")
  @js.native
  def State: String = js.native
  inline def State_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("State")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.UserId")
  @js.native
  def UserId: String = js.native
  inline def UserId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserId")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.UserLoginName")
  @js.native
  def UserLoginName: String = js.native
  inline def UserLoginName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserLoginName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.UserContext.userPersonas")
  @js.native
  def userPersonas: js.Array[String] = js.native
  inline def userPersonas_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userPersonas")(x.asInstanceOf[js.Any])
}
