package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_ACCESS_RIGHTS_ENUM_2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxSecurity2 Class */
@JSGlobal("FAXCOMEXLib.FaxSecurity2")
@js.native
/* private */ class FaxSecurity2 ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxSecurity2 {
  
  /** Security descriptor */
  /* CompleteClass */
  var Descriptor: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxSecurity2_typekey")
  var FAXCOMEXLibDotFaxSecurity2_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxSecurity2 = js.native
  
  /** Granted rights, a bit-wise combination */
  /* CompleteClass */
  override val GrantedRights: FAX_ACCESS_RIGHTS_ENUM_2 = js.native
  
  /** Security Information Type */
  /* CompleteClass */
  var InformationType: Double = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
}
