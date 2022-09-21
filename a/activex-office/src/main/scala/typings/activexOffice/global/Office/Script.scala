package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoScriptLanguage
import typings.activexOffice.Office.MsoScriptLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.Script")
@js.native
/* private */ open class Script ()
  extends StObject
     with typings.activexOffice.Office.Script {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Extended: String = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /* CompleteClass */
  var Language: MsoScriptLanguage = js.native
  
  /* CompleteClass */
  override val Location: MsoScriptLocation = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.Script_typekey")
  var OfficeDotScript_typekey: typings.activexOffice.Office.Script = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var ScriptText: String = js.native
  
  /* CompleteClass */
  override val Shape: Any = js.native
}
