package typings.activexFaxcomexlib.global.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxActivityLogging Class */
@JSGlobal("FAXCOMEXLib.FaxActivityLogging")
@js.native
/* private */ open class FaxActivityLogging ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxActivityLogging {
  
  /** Activity log database files path */
  /* CompleteClass */
  var DatabasePath: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxActivityLogging_typekey")
  var FAXCOMEXLibDotFaxActivityLogging_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxActivityLogging = js.native
  
  /** Does the server log incoming fax activity */
  /* CompleteClass */
  var LogIncoming: Boolean = js.native
  
  /** Does the server log outgoing fax activity */
  /* CompleteClass */
  var LogOutgoing: Boolean = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
}
