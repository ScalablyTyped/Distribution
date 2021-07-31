package typings.activexOffice.global.Office

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.SharedWorkspaceLink")
@js.native
class SharedWorkspaceLink protected ()
  extends StObject
     with typings.activexOffice.Office.SharedWorkspaceLink {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  override val CreatedBy: String = js.native
  
  /* CompleteClass */
  override val CreatedDate: VarDate = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Description: String = js.native
  
  /* CompleteClass */
  override val ModifiedBy: String = js.native
  
  /* CompleteClass */
  override val ModifiedDate: VarDate = js.native
  
  /* CompleteClass */
  var Notes: String = js.native
  
  /* CompleteClass */
  @JSName("Office.SharedWorkspaceLink_typekey")
  var OfficeDotSharedWorkspaceLink_typekey: typings.activexOffice.Office.SharedWorkspaceLink = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  var URL: String = js.native
}
