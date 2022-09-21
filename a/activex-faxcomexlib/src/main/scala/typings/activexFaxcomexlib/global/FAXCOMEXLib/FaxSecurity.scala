package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_ACCESS_RIGHTS_ENUM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxSecurity Class */
@JSGlobal("FAXCOMEXLib.FaxSecurity")
@js.native
/* private */ open class FaxSecurity ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxSecurity {
  
  /** Security descriptor */
  /* CompleteClass */
  var Descriptor: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxSecurity_typekey")
  var FAXCOMEXLibDotFaxSecurity_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxSecurity = js.native
  
  /** Granted rights, a bit-wise combination of FAX_ACCESS_RIGHTS values */
  /* CompleteClass */
  override val GrantedRights: FAX_ACCESS_RIGHTS_ENUM = js.native
  
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
