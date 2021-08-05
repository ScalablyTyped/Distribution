package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccounts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountSet Class */
@JSGlobal("FAXCOMEXLib.FaxAccountSet")
@js.native
/* private */ class FaxAccountSet ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccountSet {
  
  /** Adds a fax account */
  /* CompleteClass */
  override def AddAccount(bstrAccountName: String): typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxAccountSet_typekey")
  var FAXCOMEXLibDotFaxAccountSet_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccountSet = js.native
  
  /** Get fax account by name */
  /* CompleteClass */
  override def GetAccount(bstrAccountName: String): typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount = js.native
  
  /** Collection of fax accounts */
  /* CompleteClass */
  override def GetAccounts(): FaxAccounts = js.native
  
  /** Removes a fax account by name */
  /* CompleteClass */
  override def RemoveAccount(bstrAccountName: String): Unit = js.native
}
