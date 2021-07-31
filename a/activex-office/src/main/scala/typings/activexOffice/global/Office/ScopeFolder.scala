package typings.activexOffice.global.Office

import typings.activexOffice.Office.ScopeFolders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.ScopeFolder")
@js.native
class ScopeFolder protected ()
  extends StObject
     with typings.activexOffice.Office.ScopeFolder {
  
  /* CompleteClass */
  override def AddToSearchFolders(): Unit = js.native
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  @JSName("Office.ScopeFolder_typekey")
  var OfficeDotScopeFolder_typekey: typings.activexOffice.Office.ScopeFolder = js.native
  
  /* CompleteClass */
  override val Path: String = js.native
  
  /* CompleteClass */
  override def ScopeFolders(Index: Double): typings.activexOffice.Office.ScopeFolder = js.native
  /* CompleteClass */
  @JSName("ScopeFolders")
  override val ScopeFolders_Original: ScopeFolders = js.native
}
