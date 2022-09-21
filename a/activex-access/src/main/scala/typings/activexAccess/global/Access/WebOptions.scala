package typings.activexAccess.global.Access

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoTargetBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Access.WebOptions")
@js.native
/* private */ open class WebOptions ()
  extends StObject
     with typings.activexAccess.Access.WebOptions {
  
  /* private */ /* CompleteClass */
  @JSName("Access.WebOptions_typekey")
  var AccessDotWebOptions_typekey: typings.activexAccess.Access.WebOptions = js.native
  
  /* CompleteClass */
  override val Application: typings.activexAccess.Access.Application = js.native
  
  /* CompleteClass */
  var DownloadComponents: Boolean = js.native
  
  /* CompleteClass */
  var Encoding: MsoEncoding = js.native
  
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  
  /* CompleteClass */
  override def IsMemberSafe(dispid: Double): Boolean = js.native
  
  /* CompleteClass */
  var LocationOfComponents: String = js.native
  
  /* CompleteClass */
  var OrganizeInFolder: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var TargetBrowser: MsoTargetBrowser = js.native
  
  /* CompleteClass */
  override def UseDefaultFolderSuffix(): Unit = js.native
  
  /* CompleteClass */
  var UseLongFileNames: Boolean = js.native
}
