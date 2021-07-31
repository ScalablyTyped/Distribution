package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAssistance extends StObject {
  
  /** ClearDefaultContext Method */
  def ClearDefaultContext(HelpId: String): Unit = js.native
  
  @JSName("Office.IAssistance_typekey")
  var OfficeDotIAssistance_typekey: IAssistance = js.native
  
  /**
    * SearchHelp Method
    * @param Scope [Scope='']
    */
  def SearchHelp(Query: String): Unit = js.native
  def SearchHelp(Query: String, Scope: String): Unit = js.native
  
  /** SetDefaultContext Method */
  def SetDefaultContext(HelpId: String): Unit = js.native
  
  /**
    * ShowHelp Method
    * @param HelpId [HelpId='']
    * @param Scope [Scope='']
    */
  def ShowHelp(): Unit = js.native
  def ShowHelp(HelpId: String): Unit = js.native
  def ShowHelp(HelpId: String, Scope: String): Unit = js.native
  def ShowHelp(HelpId: Unit, Scope: String): Unit = js.native
}
