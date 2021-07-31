package typings.activexAccess.global.Access

import typings.activexAccess.Access.AcColorIndex
import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoTargetBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Access.DefaultWebOptions")
@js.native
class DefaultWebOptions protected ()
  extends StObject
     with typings.activexAccess.Access.DefaultWebOptions {
  
  /* CompleteClass */
  @JSName("Access.DefaultWebOptions_typekey")
  var AccessDotDefaultWebOptions_typekey: typings.activexAccess.Access.DefaultWebOptions = js.native
  
  /* CompleteClass */
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typings.activexAccess.Access.Application = js.native
  
  /* CompleteClass */
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  
  /* CompleteClass */
  var DownloadComponents: Boolean = js.native
  
  /* CompleteClass */
  var Encoding: MsoEncoding = js.native
  
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  
  /* CompleteClass */
  var FollowedHyperlinkColor: AcColorIndex = js.native
  
  /* CompleteClass */
  var HyperlinkColor: AcColorIndex = js.native
  
  /* CompleteClass */
  override def IsMemberSafe(dispid: Double): Boolean = js.native
  
  /* CompleteClass */
  var LocationOfComponents: String = js.native
  
  /* CompleteClass */
  var OrganizeInFolder: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var TargetBrowser: MsoTargetBrowser = js.native
  
  /* CompleteClass */
  var UnderlineHyperlinks: Boolean = js.native
  
  /* CompleteClass */
  var UseLongFileNames: Boolean = js.native
}
